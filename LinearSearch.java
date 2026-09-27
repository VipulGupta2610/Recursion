package pkg;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 4, 9, 3, 6, 44, 20, 4, 5, 4, 15 ,4};
        // int idx = search(arr, 5, 0);
        // System.out.println(idx);
        // System.out.println(list);
        ArrayList<Integer> ans = findAllOccurances_newlist(arr, 4, 0);
        System.out.println(ans);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static int search(int[] arr, int target, int index) {
        if (index > arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        index++;
        return search(arr, target, index);
    }

    static void findAllOccurances(int[] arr, int target, int index) {
        if (index > arr.length - 1) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllOccurances(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllOccurances_newlist(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index > arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> answersFromBelow =  findAllOccurances_newlist(arr, target, index + 1);
        list.addAll(answersFromBelow);
        return list;
    }

}
