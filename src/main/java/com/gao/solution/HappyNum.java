package com.gao.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author gs
 * @Date created time 2019/5/18 18:38
 * @Description 快乐数
 */
public class HappyNum {

    public static boolean isHappy(int n) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(n,n);
        int sum = 0;

        while (true) {
            System.out.println("n "+n);
            while (true) {
                int i = n % 10;
                if (n == 0) {
                    break;
                }
                sum = sum + i * i;
                n = n / 10;
            }
            if (sum == 1) {
                System.out.println("true "+sum);
                return true;
            }
            if (map.containsKey(sum)) {
                System.out.println("false "+sum);
                return false;
            } else {
                map.put(sum, sum);
            }
            n = sum;
            sum  = 0;
        }
    }

    public static void main(String[] args) {
        boolean b = isHappy(21);
        System.out.println(b);
    }
}
