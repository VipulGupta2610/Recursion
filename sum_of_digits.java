package pkg;

public class sum_of_digits {
    public static void main(String[] args) {
        int num = 1342;
        int ans = sum(num);
        System.out.println(ans);
    }
    static int sum(int n){
        if (n <= 0){
            return 0;
        }
        int rem = n%10;
        int num = n/10;
        return rem + sum(num);
    }
}
