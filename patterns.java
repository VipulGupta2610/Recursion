package pkg;

public class patterns {
    public static void main(String[] args) {
        pattern1(4, 0);
    }

    static void pattern1(int row, int cols) {
        if (row == 0) {
            return;
        }
        if (cols < row) {
            System.out.print("*");
            pattern1(row, cols+1);
        }else{
            System.out.println();
            pattern1(row-1, 0);
        }
    }

}
