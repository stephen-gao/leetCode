package com.gao.solution;

public class Add {

    public static int add(int a,int b) {
        while (b!=0) {
            System.out.println(toBinaryString(a) + " "+ toBinaryString(b));
            int temp = a^b;
            b = (a&b)<<1;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int sum = add(-10, -5);
        System.out.println(sum);
    }

    public static String toBinaryString(int num1){
        String s = Integer.toBinaryString(num1);
        int bit = s.length()%8 == 0? 0 : 8 - s.length()%8;
//        System.out.println(bit);
        if(bit >0){
            for(int i =0;i<bit;i++){
                s = "0"+s;
            }
        }
        return s;
    }
}
