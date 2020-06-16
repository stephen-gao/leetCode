package com.gao.solution.string;

/**
 * @Author gs
 * @Date created time 2019/5/24 15:32
 * @Description 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {

//        int num = 0;
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println("  "+toBinaryString(num));
//            System.out.println("^ "+toBinaryString(nums[i]));
//            num = num ^ nums[i];
//            System.out.println("= "+toBinaryString(num));
//            System.out.println("------------------------");
//        }
//        return num;

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
//        int[] nums = {4,1,2,1,2};
//        int i = singleNumber(nums);
//        System.out.println(i);
        change(3, 5);
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

    public static void change(int a, int b) {
        System.out.println("  " + toBinaryString(a));
        System.out.println("^ " + toBinaryString(b));
        a = a ^ b;
        System.out.println("= " + toBinaryString(a));
        System.out.println("------------------------");

        System.out.println("  " + toBinaryString(a));
        System.out.println("^ " + toBinaryString(b));
        b = a ^ b;
        System.out.println("= " + toBinaryString(b));
        System.out.println("------------------------");

        System.out.println("  " + toBinaryString(a));
        System.out.println("^ " + toBinaryString(b));
        a = a ^ b;
        System.out.println("= " + toBinaryString(a));
        System.out.println("------------------------");
    }

}
