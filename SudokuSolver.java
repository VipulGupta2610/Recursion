package pkg;

public class SudokuSolver {
    public static void main(String[] args) {

    }

    static boolean solveSudoku(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (emptyLeft == false) {
                break;
            }
        }
        if (emptyLeft) {
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solveSudoku(board)) {
                    display(board);
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static void display(int[][] board) {
        for (int []row:board){
            for (int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
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
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = r - r % sqrt;
        int colStart = c - c % sqrt;
        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
