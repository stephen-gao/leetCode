package com.gao.solution.dynamic;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * <p>
 * 示例 1：
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * <p>
 * 示例 2：
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/17 15:01
 *
 * 0 p 1
 * 1 c max(1,2) = 2
 * 2 t = c
 * c max(p+3,c) = 4,
 * p = t
 * 4 t = c
 * c = max(p+1,c)
 * p = t
 **/
public class Rob {

    public static int rob(int[] nums) {
        if (nums.length <= 1) {
            return nums.length == 0? 0: nums[0];
        }
        int pre = nums[0];
        int current = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = current;
            current = Math.max(pre + nums[i], current);
            pre = temp;
        }
        return current;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int rob = rob(nums);
        System.out.println(rob);
    }
}
