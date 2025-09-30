//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;
    /**
     * Constructs a new instance with the given grid.
     * Does not make a copy.
     * @param grid
     */
    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }

    private boolean isFullRow(int row) {
        for (int c = 0; c < grid[0].length; c++) {
            if (!grid[row][c]) return false;
        }
        return true;
    }


    /**
     * Does row-clearing on the grid (see handout).
     */
    public void clearRows() {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] newGrid = new boolean[rows][cols];
        int newRow = 0;
        for (int r = 0; r < rows; r++) {
            if (!isFullRow(r)) {
                for (int c = 0; c < cols; c++) {
                    newGrid[newRow][c] = grid[r][c];
                }
                newRow++;
            }
        }
        grid = newGrid;
    }

    public void print() {
        for (int r = grid.length-1; r >=0; r--) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c] ? "*" : "-");
            }
            System.out.println();
        }
        System.out.println("_____");
    }
    /**
     * Returns the internal 2d grid array.
     * @return 2d grid array
     */
    boolean[][] getGrid() {
        return grid;
    }



//    public static void main(String[] args) {
//        boolean[][] g = new boolean[5][5];
//        TetrisGrid tg = new TetrisGrid(g);
//        tg.grid[4] = new boolean[]{true, true, false, true, true};
//        tg.grid[3] = new boolean[]{true, false, true, false, true};
//        tg.grid[2] = new boolean[]{true, true, true, true, true};
//        tg.grid[1] = new boolean[]{false, false, true, false, false};
//        tg.grid[0] = new boolean[]{true, false, false, false, true};
//        tg.print();
//        tg.clearRows();
//        tg.print();
//    }

}

