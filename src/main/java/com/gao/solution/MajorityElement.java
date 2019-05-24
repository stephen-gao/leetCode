package com.gao.solution;

/**
 * @Author gs
 * @Date created time 2019/5/24 18:28
 * @Description
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                num = nums[i];
            }
            if(num == nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,1,3,2,2,2};
        int element = majorityElement(nums);
        System.out.println(element);
    }
}
