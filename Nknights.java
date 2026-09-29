package pkg;

public class Nknights {
    public static void main(String[] args) {
        
    }
    static void knight(boolean[][]board , int r , int c , int k){
        if (k==0){
            display(board);
            return ;
        }
        if (r==board.length-1 && c==board.length){
            return ;
        }
        if (c==board.length){
            knight(board, r+1, 0, k);
        }
        if (isSafe(board,r,c)){
            board[r][c]=true;
            knight(board, r, c+1, k-1);
            board[r][c]=false;
        }
        knight(board, r, c+1, k);
    }

    static boolean isSafe(boolean[][]board,int r , int c ){
        return true;
    }

    static boolean isValid(boolean[][]board,int r , int c ){
        if (r>=0&&r<board.length && c>=0&&c<board.length){
            return true;
        }return false;
    }

    static void display(boolean[][]board){
        for (boolean[]row:board){
            for (boolean element:row){
                if (element){
                    System.out.print("K");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
