package pkg;

public class Nknights {

    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];

        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int r, int c, int k) {

        // All knights placed
        if (k == 0) {
            display(board);
            System.out.println();
            return;
        }

        // All rows finished
        if (r == board.length) {
            return;
        }

        // Current row finished -> move to next row
        if (c == board.length) {
            knight(board, r + 1, 0, k);
            return;
        }

        // Choice 1: place knight
        if (isSafe(board, r, c)) {

            board[r][c] = true;

            knight(board, r, c + 1, k - 1);

            // Backtrack
            board[r][c] = false;
        }

        // Choice 2: don't place knight
        knight(board, r, c + 1, k);
    }

    static boolean isSafe(boolean[][] board, int r, int c) {

        // (-2, -1)
        if (isValid(board, r - 2, c - 1)
                && board[r - 2][c - 1]) {
            return false;
        }

        // (-2, +1)
        if (isValid(board, r - 2, c + 1)
                && board[r - 2][c + 1]) {
            return false;
        }

        // (-1, -2)
        if (isValid(board, r - 1, c - 2)
                && board[r - 1][c - 2]) {
            return false;
        }

        // (-1, +2)
        if (isValid(board, r - 1, c + 2)
                && board[r - 1][c + 2]) {
            return false;
        }

        return true;
    }

    static boolean isValid(boolean[][] board, int r, int c) {

        return r >= 0 &&
               r < board.length &&
               c >= 0 &&
               c < board.length;
    }

    static void display(boolean[][] board) {

        for (boolean[] row : board) {

            for (boolean element : row) {

                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }

            System.out.println();
        }
    }
}