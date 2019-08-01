package com.leetcode.problems.easy;

/**
 * 53-最大子序和
 * @author Phantom
 * Created on 2019/7/31.
 */
public class MaxSubArray {
    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     *
     * 示例:
     *  输入: [-2,1,-3,4,-1,2,1,-5,4],
     *  输出: 6
     *  解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     *
     * 进阶:
     * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
     *
     */
    public static int solve(int[] nums) {
        // 记录连续子数组的和
        int sum = 0;
        // 记录连续子数组最大和
        int res = nums[0];
        for (int num : nums) {
            // 如果前一连续子数组和>=0则累加
            if (sum > 0) {
                sum += num;
            }
            // 如果前一连续子数组和<0则舍弃
            else {
                sum = num;
            }
            // 获取前一个子序和与当前子序和中较大的那个
            res = Math.max(res, sum);
        }
        return res;
    }
}
