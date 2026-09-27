package pkg;

import java.util.ArrayList;

public class NumberOfDiceRollsWithTarget {
    public static void main(String[] args) {
        dice("", 4);
        ArrayList<String> ans = discRet("", 4);
        System.out.println();
        System.out.println(ans);
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.print(p + "->");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> discRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> outer = new ArrayList<>();

        for (int i = 1; i <= 6 && i<=target; i++) {
            ArrayList<String> inner = discRet(p + i, target - i);
            outer.addAll(inner);
        }
        return outer;
    }

}
