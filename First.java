package pkg;

public class First {

    public static void main(String[] args) {
        fib(5);
    }
    static int fib(int num){
        if (num == 0){
            return 0;
        }
        else if (num == 1){
            return 1;
        }
        System.out.print(fib(num-1)+fib(num-2)+" ");
        return fib(num-1)+fib(num-2);
    }
}