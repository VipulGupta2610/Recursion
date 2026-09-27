package pkg;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int ans = search(arr, target);
        System.err.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakIndex(arr, 0, arr.length - 1);
        if (peak == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[peak] == target) {
            return peak;
        } else if (target > arr[0]) {
            return binarySearch(arr, target, 0, peak - 1);
        } else {
            return binarySearch(arr, target, peak + 1, arr.length-1);
        }

    }

    static int peakIndex(int[] arr, int start, int end) {
        if (end < start) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (mid > start && arr[mid - 1] > arr[mid]) {
            return mid - 1;
        } else if (arr[mid] > arr[start]) {
            return peakIndex(arr, mid, end);
        } else {
            return peakIndex(arr, start, mid - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (end < start) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        } else {
            return binarySearch(arr, target, start, mid - 1);
        }
    }
}
