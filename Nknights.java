package pkg;

public class Nknights {
    public static void main(String[] args) {
        
    }
    static void knight(boolean[][]board , int r , int c , int k){
        if (k==0){
            display(board);
            return ;
        }
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
