//package sudokuSwing;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class SudokuPuzzleTest {
//
//    private SudokuPuzzle puzzle;
//
//    @Before
//    public void setUp(){
//        String [][] plansza = new String[][]{
//                {"0", "0", "8", "3", "4", "2", "9", "0", "0" },
//                {"0", "0", "9", "0", "0", "0", "7", "0", "0" },
//                {"4", "0", "0", "0", "0", "0", "0", "0", "3" },
//                {"0", "0", "6", "4", "7", "3", "2", "0", "0" },
//                {"0", "3", "0", "0", "0", "0", "0", "1", "0" },
//                {"0", "0", "2", "8", "5", "1", "6", "0", "0" },
//                {"7", "0", "0", "0", "0", "0", "0", "0", "8" },
//                {"0", "0", "4", "0", "0", "0", "1", "0", "0" },
//                {"0", "0", "3", "6", "9", "7", "5", "0", "0" }
//        };
//
//        puzzle = new SudokuPuzzleForTesting(plansza);
//
//
//    }
//
//    @Test
//    public void testNumInRow(){
//        Assert.assertTrue(puzzle.numInRow(0, "9"));
//        Assert.assertTrue(puzzle.numInRow(1, "7"));
//        Assert.assertTrue(puzzle.numInRow(8, "2"));
//
//
//
//    }
//
//
//    private class SudokuPuzzleForTesting extends SudokuPuzzle{
//
//        public SudokuPuzzleForTesting(String[][] plansza) {
//            super(9, 9, 3, 3,  new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9" });
//            this.plansza = plansza;
//
//
//        }
//    }
//
//
//    @Test
//    public void testNumInColumns(){
//        Assert.assertTrue(puzzle.numInCol(1, "3"));
//        Assert.assertTrue(puzzle.numInCol(1, "0"));
//        Assert.assertTrue(puzzle.numInCol(8, "3"));
//    }
//
//    @Test
//    public void testNumInBox(){
//        Assert.assertTrue(puzzle.numInBox(6, 1,"9"));
////        Assert.assertTrue(puzzle.numInCol(1, "0"));
////        Assert.assertTrue(puzzle.numInCol(8, "3"));
//    }
//
//}
