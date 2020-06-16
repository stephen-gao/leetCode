package com.gao.solution.dynamic;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/31 14:03
 **/
public class MaxProfit {

    public static int maxProfit(int[] nums) {
        int profit = 0;
        int min =0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[min]){
                min = i;
            }else {
                int p = nums[i] - nums[min];
                if(p > profit){
                    profit = p;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
//        int[] nums = {1, 2, 3, 4, 5, 6};
        int profit = maxProfit(nums);
        System.out.println(profit);
    }
}
