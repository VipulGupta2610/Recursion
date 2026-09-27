package pkg;

public class Product_ofO1ton {
    public static void main(String[] args) {
       int ans = factorial(5);
       System.out.println(ans);
       int sum = sum_of_n(5);
       System.out.println("Sum of n number is: "+sum);
    }
    static int factorial(int n ){
        if (n <= 1){
            return 1;
        }
        int product = factorial(n-1);
        System.out.println(n*product);
        return n*product;
    }
    static int sum_of_n(int n ){
        if (n <= 1){
            return n;
        }
        int sum = sum_of_n(n-1);
        // System.out.println(n+sum);
        return n+sum;
    }
}
