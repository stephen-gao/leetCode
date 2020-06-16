package com.gao.solution.math;

/**
 * 3的幂
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/31 14:49
 **/
public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        int n = 1;
        boolean b = isPowerOfThree(n);
        System.out.println(b);
    }
}
