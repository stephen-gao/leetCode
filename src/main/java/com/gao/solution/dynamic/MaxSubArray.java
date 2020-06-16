package com.gao.solution.dynamic;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4], 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/31 14:36
 **/
public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
           sum += num;
           sum = Math.max(sum,num);
           max = Math.max(sum,max);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }
}
