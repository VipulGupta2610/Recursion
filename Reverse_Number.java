package pkg;

public class Reverse_Number {
    public static void main(String[] args) {
        reverse(1234);
        System.out.println(sum);
        reverse1(sum, 0);
        String name = "vipul";

        System.out.println(name);
    }

    static int sum = 0;

    static void reverse(int n) {
        if (n % 10 == n) {
            sum = sum * 10 + n;
            return;
        }
        int rem = n % 10;
        int rem_num = n / 10;
        sum = sum * 10 + rem;
        reverse(rem_num);
    }

    static void reverse1(int n, int sum) {
        if (n % 10 == n) {
            sum = sum * 10 + n;
            return;
        }
        int rem = n % 10;
        int rem_num = n / 10;
        sum = sum * 10 + rem;
        reverse1(rem_num, sum);
    }
}
