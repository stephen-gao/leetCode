package com.gao.solution.string;


/**
 * @Author gs
 * @Date created time 2019/5/20 10:20
 * @Description 两整数之和
 * 不使用运算符 + 和 -，计算两整数​a 、b之和。
 */
public class Add {

    public static int add(int a, int b) {
        while (b != 0) {
            System.out.println(toBinaryString(a) + " " + toBinaryString(b));
            int temp = a ^ b;
            int t = a & b;
            b = t << 1;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int sum = add(4, 5);
        System.out.println(sum);
    }

    public static String toBinaryString(int num1) {
        String s = Integer.toBinaryString(num1);
        int bit = s.length() % 8 == 0 ? 0 : 8 - s.length() % 8;
//        System.out.println(bit);
        if (bit > 0) {
            for (int i = 0; i < bit; i++) {
                s = "0" + s;
            }
        }
        return s;
    }
}
