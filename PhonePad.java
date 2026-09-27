package pkg;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        // int digit = "123".charAt(0) - '0';
        // System.out.println(digit);
        // System.out.println('a' + 0);
        // pad("", "12");
        ArrayList<String> ans = padRet("", "12");
        System.out.println(ans);
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + "->");
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ArrayList<String> ans = padRet(p + ch, up.substring(1));
            list.addAll(ans);
        }
        return list;
    }

}
