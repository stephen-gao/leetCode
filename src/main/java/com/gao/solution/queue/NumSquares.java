package com.gao.solution.queue;

/**
 * 完全平方数
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 * 示例 2:
 * <p>
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/08/18 20:39
 **/
public class NumSquares {

    public static int numSquares(int n) {
        int count = 0;
        StringBuilder sb = new StringBuilder(n + " = ");
        while (n > 0){
            int maxSquares = getMaxSquares(n);
            n = n - maxSquares;
            sb.append(maxSquares + " + ");
            count++;
        }
        sb.delete(sb.length() -3,sb.length());
        System.out.println(sb.toString());
        return count;
    }

    public static int getMaxSquares(int n) {
        int i = 1;
        int max = 1;
        while (i * i <= n) {
            max = i * i;
            i++;
        }
        return max;
    }

    public static void main(String[] args) {

        int n = 12;
        int i = numSquares(n);
        System.out.println(i);
    }
}
