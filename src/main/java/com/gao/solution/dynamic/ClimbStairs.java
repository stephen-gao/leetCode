package com.gao.solution.dynamic;

/**
 * 爬楼梯算法
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/31 13:54
 **/
public class ClimbStairs {

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int t1 = 1,t2 = 2, temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = t2 + t1;
            t1 = t2;
            t2 = temp;
        }
        return temp;
    }


    public static void main(String[] args) {
        int n = 45;
        int stairs = climbStairs(n);
        System.out.println(stairs);
    }
}
