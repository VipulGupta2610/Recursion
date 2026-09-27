package pkg;

public class count_zeros {
    public static void main(String[] args) {
        int zeros = count(30204, 0);
        System.out.println(zeros);
    }

    static int count(int num, int zeros) {
        if (num == 0) {
            System.out.println("Entered num ==0 first if ");
            System.out.println("num is: "+num);
            System.out.println("zeros are: "+zeros);
            return zeros;
        }
        // if (num % 10 == num) {
        //     System.out.println("Entered num % 10 == num ");
        //     System.out.println("num is: "+num);
        //     System.out.println("zeros are: "+zeros);
        //     if (num == 0) {
        //         System.out.println("Entered num == 0 in second if ");
        //     System.out.println("num is: "+num);
        //     System.out.println("zeros are: "+zeros);
        //         zeros += 1;
        //         return zeros;
        //     }
        // }
        int rem = num % 10;
        int rem_num = num / 10;
        if (rem == 0) {
            System.out.println("Entered rem == 0");
            System.out.println("num is: "+num);
            System.out.println("zeros are: "+zeros);
            zeros += 1;
        }
        return count(rem_num, zeros);
    }
}
