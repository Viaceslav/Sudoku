public class sudokusolver {

    private static int GRID_SIZE = 9;
    public static void main(String[] args) {

        int [][] board = {
                {8, 0, 0, 0, 0, 0, 0, 0, 0 },
                {0, 0, 3, 6, 0, 0, 0, 0, 0 },
                {0, 7, 0, 0, 9, 0, 2, 0, 0 },
                {0, 5, 0, 0, 0, 7, 0, 0, 0 },
                {0, 0, 0, 0, 4, 5, 7, 0, 0 },
                {0, 0, 0, 1, 0, 0, 0, 3, 0 },
                {0, 0, 1, 0, 0, 0, 0, 6, 8 },
                {0, 0, 8, 5, 0, 0, 0, 1, 0 },
                {0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };

        if (rozwiazSudoku(board)){
            System.out.println("Sudoku rozwiazane");
        } else {
            System.out.println("nie da sie rozwiazac Sudoku");
        }

        printBoard(board);


    }




    private static void printBoard(int[][] board) {
        for (int row = 0; row< GRID_SIZE; row++ ){
            for (int column = 0; column < GRID_SIZE ; column++) {
                System.out.println(board[row][column]);
            }
            System.out.println("");
        }
    }

    private static boolean znajdzLiczbewWierszu(int[][] board,int number, int row){

        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean znajdzLiczbewKolumnie(int[][] board,int number, int column){

        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number){
                return true;
            }
        }
        return false;
    }


    private static boolean znajdzLiczbewKwadracie(int[][] board,int number, int row, int column){
        int localBoxRow = row - row % 3;  // otrzymujemy tu reszte (jeli jest to ->1)
        int localBoxColumn = column -column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number){
                    return true;
                }
            }

        }
        return false;
    }


    private static boolean czyPoprawne(int[][] board, int number, int row, int col){
        return !znajdzLiczbewWierszu(board, number, row) &&
                !znajdzLiczbewKolumnie(board, number, col) &&
                !znajdzLiczbewKwadracie(board, number,row, col);
    }

    private static boolean rozwiazSudoku(int[][] board){
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (board[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <GRID_SIZE ; numberToTry++) {
                        if (czyPoprawne(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;

                            if (rozwiazSudoku(board)){
                                return true;
                            } else {
                                board[row][column] =0;
                            }
                            
                        }
                        
                    }

                    return false;
                    
                }
            }
        }

        return true;
    }


}
