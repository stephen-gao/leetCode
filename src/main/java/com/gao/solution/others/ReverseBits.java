package com.gao.solution.others;

/**
 * 颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: 00000010100101000001111010011100
 * 输出: 00111001011110000010100101000000
 * 解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 * 因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
 * 示例 2：
 * <p>
 * 输入：11111111111111111111111111111101
 * 输出：10111111111111111111111111111111
 * 解释：输入的二进制串 11111111111111111111111111111101 表示无符号整数 4294967293，
 * 因此返回 3221225471 其二进制表示形式为 10111111111111111111111111111111 。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 2 中，输入表示有符号整数 -3，输出表示有符号整数 -1073741825。
 * <p>
 * <p>
 * 进阶:
 * 如果多次调用这个函数，你将如何优化你的算法？
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/23 19:57
 **/
public class ReverseBits {

    public static int reverseBits(int n) {
        System.out.println("n-p:" + Integer.toBinaryString(n));
        int m = n;
        int r = 0;
        for (int i = 0; i < 32; i++) {
            r = r * 2 + m % 2;
            m = m >> 1;
        }
        r *= n > 0 ? 1 : -1;
        System.out.println("r-p:" + Integer.toBinaryString(r));
        return r;
    }

    public static void main(String[] args) {
        int n = -3;
        int r = reverseBits(n);
        System.out.println(r);
    }

//    public static void main(String[] args) {
//
//        int n = 11;
//        int r = 0;
//        System.out.println("n-p:"+Integer.toBinaryString(n));
//        for (int i = 0;i<32;i++) {
//            r = r*2 + n%2;
//            n = n >> 1;
//        }
//        System.out.println("r-p:"+Integer.toBinaryString(r));
//        System.out.println(r);
//
//    }


}
