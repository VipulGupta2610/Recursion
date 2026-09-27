package pkg;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        System.out.println("Now in ascending order");
        // funca(1 , 5);
        funca(5);
    }

    static void fun(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
    static void funca(int n ){
     if (n == 1){
        System.out.println("1");
        return;
     }
     funca(n-1);
     System.out.println(n);
    }
    // static void funca(int start , int end ){
    //     if (start == end){
    //         System.out.println("5");
    //         return;
    //     }
    //     System.out.println(start);
    //     funca(start+1, end);
    // }
}
