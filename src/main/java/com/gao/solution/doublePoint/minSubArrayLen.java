package com.gao.solution.doublePoint;

/**
 * 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 *  
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/08/12 20:43
 **/
public class minSubArrayLen {

    public static int minSubArrayLen(int s, int[] nums) {
        if (s <= 0) {
            return 1;
        }
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        int slow = 0;
        int fast = 0;
        while (slow < length) {
            int sum = sum(nums, slow, fast);
            if (sum >= s) {
                int current = fast - slow + 1;
                min = current < min ? current : min;
                if (slow == fast && fast < length - 1) {
                    fast++;
                } else {
                    slow++;
                }
            } else {
                if (fast < length - 1) {
                    fast++;
                } else {
                    slow++;
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static int sum(int[] nums, int start, int end) {
        int n = end - start;
        int sum = nums[start];
        for (int i = 1; i <= n; i++) {
            sum += nums[start + i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1};
        int s = 3;
        int i = minSubArrayLen(s, nums);
        System.out.println(i);
//        int sum = sum(nums, 1, 1);
//        System.out.println(sum);
    }
}
