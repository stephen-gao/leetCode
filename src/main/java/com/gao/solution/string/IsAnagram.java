package com.gao.solution.string;

/**
 * 有效的字母异位词
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/28 17:58
 **/
public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        int l = s.length();
        for (int i = 0; i < l; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
//        for (int i = 0; i < l; i++) {
//            if(count[s.charAt(i) - 'a'] != 0){
//                return false;
//            }
//        }
        for (int i = 0; i < 26; i++) {
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaaba";
        String t = "aabaa";
        boolean b = isAnagram(s, t);
        System.out.println(b);
    }
}
