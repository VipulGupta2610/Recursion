package pkg;

public class Check_Sorated {
    public static void main(String[] args) {
        int[] arr = { 1 };
        boolean isSorted = chechSort(arr, 0);
        System.out.println("Is array sorted: "+isSorted);
    }

    static boolean chechSort(int[] arr, int start) {
        if (start < arr.length - 1) {
            if (arr[start] > arr[start + 1]) {
                return false;
            } else {
                start++;
                return chechSort(arr, start);
            }
        }
        return true;
    }
}
