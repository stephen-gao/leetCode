package com.gao.solution.string;

import java.util.List;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/21 16:25
 **/
public class WordBreak {


    public static void wordBreak(String s, List<String> wordDict){
        int b = 0;

        for(String word: wordDict){
            int length = word.length();
            int end =s.length() - length;
            for(int i = 0;i<end;i++){
                if(s.substring(i,i+length).equals(word)){

                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String[] wordDict = {"leet", "code"};

    }
}
