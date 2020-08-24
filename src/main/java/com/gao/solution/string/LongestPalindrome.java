package com.gao.solution.string;

/**
 * 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/07/25 16:59
 **/
public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        int length = s.length();
        if(length < 1){
            return s;
        }
        String max = "" + s.charAt(0);
        String current = "";
        String s2 = "";
        for (int i = 1; i < length; i++) {
            if(s.charAt(i-1) == s.charAt(i)){
                current = getCurrent(s,i-1,i);
            }
            if(i+1 < length){
                s2 = getCurrent(s,i-1,i+1);
            }
            if(s2.length() >1 && s2.length() > current.length()){
                current = s2;
            }
            if(current.length() >1 && current.length() >max.length()){
                max = current;
            }
        }

        return max;
    }

    public static String getCurrent(String s, int start,int end) {
        int length = s.length();
        String current = s.substring(start+1,end);
        boolean testFlg = true;
        while (testFlg && start >= 0 && end < length) {
            if (s.charAt(start) == s.charAt(end)) {
                current = s.charAt(start) + current + s.charAt(end);
            } else {
                testFlg = false;
            }
            start--;
            end++;
        }
        return current;
    }


    public static void main(String[] args) {
        String str = "";
//        String s = str.substring(2, 2);
        String s = longestPalindrome(str);
        System.out.println(s);
    }
}
