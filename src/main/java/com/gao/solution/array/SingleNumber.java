package com.gao.solution.array;

/**
 * 只出现一次的数
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/30 20:24
 **/
public class SingleNumber {


    public static int singleNumber(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }


    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int number = singleNumber(nums);
        System.out.println(number);
    }
}
