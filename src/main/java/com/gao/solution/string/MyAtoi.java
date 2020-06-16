package com.gao.solution.string;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/28 19:51
 **/
public class MyAtoi {

    public static int myAtoi(String str) {
        if ("".equals(str)) {
            return 0;
        }
        int f = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (f == 0 && c == 32) {
                continue;
            }
            if (f == 0 && c == 43) {
                f = 1;
                continue;
            }
            if (f == 0 && c == 45) {
                f = -1;
                continue;
            }
            if (f != 0 && (c == 43 || c == 45)){
                break;
            }
            if (c < 48 || c > 57) {
                break;
            }
            if (f == 0) {
                f = 1;
            }
            if ((y >= 214748364)) {
                if(y == 214748364){
                    if(f == 1 && c -48 > 7){
                        return Integer.MAX_VALUE;
                    }
                    if(f == -1 && c -48 > 8){
                        return Integer.MIN_VALUE;
                    }
                }else {
                    return f == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
            }
            y = y * 10 + (c - 48);
        }
        return f * y;
    }

    public static void main(String[] args) {
        String s = "-91283472332";
        int atoi = myAtoi(s);
        System.out.println(atoi);
    }
}
