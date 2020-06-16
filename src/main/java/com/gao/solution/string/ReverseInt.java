package com.gao.solution.string;

/**
 * 翻转整数
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/28 16:34
 **/
public class ReverseInt {


    public static int reverse(int x) {
        int y = 0;
        while (x != 0) {
            y = y * 10 + x % 10;
            x = x / 10;
            if((y > 214748364 || y < -214748364) && x != 0 ) {
                return 0;
            }
        }
        return y;
    }


    public static void main(String[] args) {
        int x = -1235678998;
        int y = reverse(x);
        System.out.println(x);
        System.out.println(y);
    }
}
