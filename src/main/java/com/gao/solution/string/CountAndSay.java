package com.gao.solution.string;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/06 16:29
 **/
public class CountAndSay {


    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            String temp = "";
            int k = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(k) == s.charAt(j)) {
                    continue;
                }
                temp += j-k;
                temp += s.charAt(k);
                k = j;
            }
            s = temp;
            System.out.println(s);
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 7;
        String s = countAndSay(n);

        System.out.println(s);
    }
}
