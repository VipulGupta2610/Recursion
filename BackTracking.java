public class BackTracking {
    public static void main(String[] args) {

    }

    static int Nqueens(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col<board.length; col++){
            if (isSafe(board,r,col)){
                board[r][col]=true;
                count+=Nqueens(board,r++);
                board[r][col]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][]board,int r,int c ){
        
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
