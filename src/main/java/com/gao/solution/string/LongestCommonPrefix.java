package com.gao.solution.string;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/06 20:52
 **/
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String s = "";
        int h = 0;
        while (true) {
            char temp = 0;
            for (int i = 0; i < strs.length; i++) {
                if (h < strs[i].length()) {
                    if (i == 0) {
                        temp = strs[i].charAt(h);
                    } else {
                        if (temp != strs[i].charAt(h)) {
                            return s;
                        }
                    }
                } else {
                    return s;
                }
            }
            s += temp;
            h++;
        }
    }


    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"dog","racecar","car"};
        String[] strs = {};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);

    }
}
