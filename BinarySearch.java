package pkg;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,6,7,9,10};
        int target = 9;
        System.out.println(findingPos(arr, 0, arr.length-1, target));
    }
    static int findingPos(int [] arr , int start , int end , int target){
        if (end < start ){
            return -1;
        }
        int mid = start + (end - start)/2;
        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] < target){
            return findingPos(arr, mid+1, end, target);
        }
        else{
            return findingPos(arr, start, mid-1, target);
        }
    }
}
