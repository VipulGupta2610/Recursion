package pkg;

public class Number_of_steps {
    public static void main(String[] args) {
        int num = steps(14, 0);
        System.out.println(num);
    }
    static int steps(int n , int step){
        if (n == 0){
            return step;
        }
        if (n%2 != 0){
            return steps(n-1 , step+=1);
        }
        else{
            return steps(n/2, step+=1);
        }

    }
}
