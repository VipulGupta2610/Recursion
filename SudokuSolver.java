package pkg;

public class SudokuSolver {
    public static void main(String[] args) {

    }

    static void solveSudoku(int[][] board) {

    }

    static boolean isSafe(int[][] board, int r, int c, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == num) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == num) {
                return false;
            }
        }

    }
}
