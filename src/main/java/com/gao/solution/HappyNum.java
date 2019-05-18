package com.gao.solution;

/**
 * @Author gs
 * @Date created time 2019/5/18 18:38
 * @Description 快乐数
 */
public class HappyNum {

    public static boolean isHappy(int n) {

        String s = String.valueOf(n);
        int length = s.length();
        int result = 0;
        for(int i = 0;i<length;i++){
            int c = Integer.valueOf(s.charAt(i));
            result += c*c;
        }
        if(n == result){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = isHappy(19);
        System.out.println(b);
    }
}
