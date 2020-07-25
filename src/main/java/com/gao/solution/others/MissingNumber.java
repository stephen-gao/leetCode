package com.gao.solution.others;

/**
 * 缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/23 20:54
 **/
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = 1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {0,2};
        int i = missingNumber(nums);
        System.out.println(i);
    }
}
