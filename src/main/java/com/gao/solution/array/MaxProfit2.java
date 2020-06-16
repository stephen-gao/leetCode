package com.gao.solution.array;

/**
 * 最大收益2
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/28 16:50
 **/
public class MaxProfit2 {

    public static int maxProfit(int[] nums) {
        int profit = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > nums[j - 1]) {
                profit += nums[j] - nums[j-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums = {6,1,3,2,4,7};
        System.out.println(maxProfit(nums));
    }
}
