package pkg;
import java.util.*;
import java.math.*;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][]board = new boolean[4][4];
       int c = Nqueens(board,0);
       System.out.println(c);
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
                count+=Nqueens(board,r+1);
                board[r][col]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][]board,int r,int c ){
        for(int i=0;i<r;i++){
            if (board[i][c]){
                return  false;
            }
        }
        int maxLeft = Math.min(r,c);
        for (int i = 1; i<=maxLeft; i++){
            if (board[r-i][c-i]){
                return false;
            }
        }
        int maxRight = Math.min(r,board.length-c-1);
        for (int i = 1; i<=maxRight; i++){
            if (board[r-i][c+i]){
                return false;
            }
        }
        return true;
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
