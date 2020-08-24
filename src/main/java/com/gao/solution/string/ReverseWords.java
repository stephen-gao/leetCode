package com.gao.solution.string;

/**
 * 翻转字符串里的单词
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 *
 *
 *
 * 示例 1：
 *
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 *
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 *
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *
 *
 * 说明：
 *
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *
 *
 * 进阶：
 *
 * 请选用 C 语言的用户尝试使用 O(1) 额外空间复杂度的原地解法。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/07/30 17:10
 **/
public class ReverseWords {

    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb =  new StringBuilder();
        for (int i = split.length-1; i >= 0 ; i--) {
            if("".equals(split[i])){
                continue;
            }
            sb.append(split[i]);
            sb.append(" ");
        }
        return sb.length() > 0 ? sb.substring(0,sb.length()-1) : "";
    }

    public static void main(String[] args) {
        String s = "";
        String reverseWords = reverseWords(s);
        System.out.println(reverseWords);
    }
}
