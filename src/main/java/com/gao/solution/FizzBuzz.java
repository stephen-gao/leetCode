package com.gao.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author gs
 * @Date created time 2019/5/20 10:21
 * @Description
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”
 */

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for (int i=1;i<=n;i++){
            String s = "";
            if(i % 3 == 0){
                s = s + "Fizz";
            }
            if(i % 5 == 0 ){
                s = s + "Buzz";
            }
            if("".equals(s)){
                s = s + i;
            }
            list.add(s);
        }

        return list;
    }

    public static void main(String[] args) {
        List<String> list = fizzBuzz(32);

        for(int i = 0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
