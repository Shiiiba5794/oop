// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
    private char[][] grid;

    /**
     * Constructs a new CharGrid with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    /**
     * Returns the area for the given char in the grid. (see handout).
     *
     * @param ch char to look for
     * @return area for given char
     */
    public int charArea(char ch) {
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length;
        int minRow = rows, maxRow = -1;
        int minCol = cols, maxCol = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == ch) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }

        if (maxRow == -1) {
            return 0;
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);

    }

    /**
     * Returns the count of '+' figures in the grid (see handout).
     *
     * @return number of + in grid
     */
    public int countPlus() {
        return 0; // YOUR CODE HERE
    }

//    public static void main(String[] args) {
//        char[][] data = {
//                {'a', 'b', 'c', 'd'},
//                {'a', ' ', 'c', 'b'},
//                {'e', 'b', 'a', 'c'}
//        };
//        CharGrid cg = new CharGrid(data);
//        System.out.println(cg.charArea('a'));
//    }
}
