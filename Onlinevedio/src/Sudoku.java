public class Sudoku {
    private int[][] board= {{1,2,3,4,5,6,7,8,9},
    		{2,3,4,5,6,7,8,9,1},
    		{3,4,5,6,7,8,9,1,2},
    		{4,5,6,7,8,9,1,2,3},
    		{5,6,7,8,9,1,2,3,4},
    		{6,7,8,9,1,2,3,4,5},
    		{7,8,9,1,2,3,4,5,6},
    		{8,9,1,2,3,4,5,6,7},
    		{9,1,2,3,4,5,6,7,8}};
    

    public Sudoku(int[][] board) {
        this.board = board;
    }

    public boolean solve() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(row, col, num)) {
                            board[row][col] = num;
                            if (solve()) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, int num) {
        // Check row
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == num) {
                return false;
            }
        }

        // Check column
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }

        // Check 3x3 region
        int regionRow = row - row % 3;
        int regionCol = col - col % 3;
        for (int r = regionRow; r < regionRow + 3; r++) {
            for (int c = regionCol; c < regionCol + 3; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
