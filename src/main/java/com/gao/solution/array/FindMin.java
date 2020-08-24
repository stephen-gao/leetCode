package com.gao.solution.array;

/**
 * 寻找旋转排序数组中的最小值
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 请找出其中最小的元素。
 * <p>
 * 你可以假设数组中不存在重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/08/14 11:54
 **/
public class FindMin {

    public static int findMin(int[] nums) {
        if(nums[0] <= nums[nums.length -1]){
            return nums[0];
        }
        int left = 0;
        int right = nums.length;
        int half = 0;
        while (left < right) {
            half = (left + right) / 2;
            if (nums[left] < nums[half]) {
                left = half;
            } else {
                right = half;
            }
        }
        return nums[half+1];
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int min = findMin(nums);
        System.out.println(min);
    }
}
