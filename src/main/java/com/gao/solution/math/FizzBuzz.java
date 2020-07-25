package com.gao.solution.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * <p>
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * <p>
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * <p>
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 * <p>
 * 示例：
 * <p>
 * n = 15,
 * <p>
 * 返回:
 * [
 * "1",
 * "2",
 * "Fizz",
 * "4",
 * "Buzz",
 * "Fizz",
 * "7",
 * "8",
 * "Fizz",
 * "Buzz",
 * "11",
 * "Fizz",
 * "13",
 * "14",
 * "FizzBuzz"
 * ]
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/19 11:09
 **/
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean fizz = i%3 == 0;
            boolean buzz = i%5 == 0;
            if(fizz && buzz){
                list.add("FizzBuzz");
                System.out.println("FizzBuzz");
                continue;
            }
            if(fizz){
                list.add("Fizz");
                System.out.println("Fizz");
                continue;
            }
            if(buzz){
                list.add("Buzz");
                System.out.println("Buzz");
                continue;
            }
            list.add(String.valueOf(i));
            System.out.println(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> list = fizzBuzz(n);
    }
}
