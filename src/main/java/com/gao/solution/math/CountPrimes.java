package com.gao.solution.math;

/**
 * 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/19 11:25
 **/
public class CountPrimes {

    public static int countPrimes(int n) {
        int count = 0;
        boolean[] b = new boolean[n];
        if (n > 2) {
            count++;
        }
        for (int i = 3; i < n; i += 2) {
            if (!b[i]) {
                for (int j = 3; i * j < n; j += 2) {
                    b[i * j] = true;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        int primes = countPrimes(n);
        System.out.println(primes);
    }
}
