package com.gao.solution.string;

/**
 * 翻转字符串
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/28 16:19
 **/
public class ReverseString {


    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[s.length - i - 1];
            s[s.length - i - 1] = s[i];
            s[i] = temp;
        }
    }


    public static void main(String[] args) {
//        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
    }
}
