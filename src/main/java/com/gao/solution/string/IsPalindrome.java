package com.gao.solution.string;

/**
 * 验证回文
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/28 19:11
 **/
public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char l = s.charAt(i);
            if (l >= 65 && l <= 90) {
                l += 32;
            }
            if (l< 48 || (l> 57 && l < 97) || l > 122) {
                i++;
                continue;
            }
            char r = s.charAt(j);
            if (r >= 65 && r <= 90) {
                r += 32;
            }
            if (r< 48 || (r> 57 && r < 97)  || r > 122) {
                j--;
                continue;
            }
            if (l != r) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean b = isPalindrome(s);
        System.out.println(b);
    }
}
