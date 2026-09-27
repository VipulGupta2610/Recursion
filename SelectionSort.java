package pkg;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,7,8,6,1,2,4,6,8,9,0,3,6};
        System.out.println(Arrays.toString(arr));
        sort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col, int maxIdx) {
        if (row == 0){
            return;
        }
        if (col < row ){
            if (arr[col]>arr[maxIdx]){
                maxIdx = col;
            }
            sort(arr, row, col+1, maxIdx);
        }
        else{
            int temp = arr[row];
            arr[row] = arr[maxIdx];
            arr[maxIdx] = temp;
            sort(arr, row-1, 0, 0);
        }
    }

}