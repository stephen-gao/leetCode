package com.gao.solution.array;

/**
 * 移除相同元素
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/28 15:59
 **/
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,2,3,3};
        int length = removeDuplicates(nums);
        System.out.println(length);
    }
}
