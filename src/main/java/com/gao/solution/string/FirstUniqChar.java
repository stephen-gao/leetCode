package com.gao.solution.string;

/**
 * 首个单独出现字母
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/28 17:03
 **/
public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabaa";
        int i = firstUniqChar(s);
        System.out.println(i);
//        long s = System.currentTimeMillis();
//
//        long l = System.nanoTime();
//
//        for (int i = 0; i < 5000000 ; i ++){
//
//        }
//        long e = System.currentTimeMillis();
//        long n = System.nanoTime();
//        System.out.println(e-s);
//        System.out.println(n-l);
    }




}
