package com.leetcode.problems.easy;

/**
 * 1-两数之和
 * @author Phantom
 * Created on 2019/7/31.
 */
public class TwoSum {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 示例:
     *  给定 nums = [2, 7, 11, 15], target = 9
     *  因为 nums[0] + nums[1] = 2 + 7 = 9
     *  所以返回 [0, 1]
     *
     */
    public static int[] solve(int[] nums, int target) {
        int[] arr = new int[2];
        // 第一次循环nums
        for (int i = 0; i < nums.length; i++) {
            // 第二次循环nums
            for (int j=0; j < nums.length; j++) {
                // 不能重复利用数组中的元素
                if (i == j) {
                    continue;
                }
                // 如果两数下标不相等，且相加等于target,返回对应的下标
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}
