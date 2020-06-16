package com.gao.solution.string;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/06 16:02
 **/
public class StrStr {

    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        if(needle.length() == 0){
            return 0;
        }
        for(int i = 0;i <= haystack.length() - needle.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j = 0; j< needle.length(); j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                    if(j == needle.length() -1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }
}
