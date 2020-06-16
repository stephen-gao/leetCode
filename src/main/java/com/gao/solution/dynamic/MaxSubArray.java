package com.gao.solution.dynamic;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/31 14:36
 **/
public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int start = 0;
        if (nums.length == 1) {
            return max;
        }
        for (int i = 1; i < nums.length; i++) {
            int p = nums[i] + max;
            if(p < max){

            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }
}
