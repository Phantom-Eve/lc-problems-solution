package com.leetcode.problems.easy;

/**
 * 35-搜索插入位置
 * @author Phantom
 * Created on 2019/7/31.
 */
public class SearchInsert {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 你可以假设数组中无重复元素。
     *
     * 示例 1:
     *  输入: [1,3,5,6], 5
     *  输出: 2
     *
     * 示例 2:
     *  输入: [1,3,5,6], 2
     *  输出: 1
     *
     * 示例 3:
     *  输入: [1,3,5,6], 7
     *  输出: 4
     *
     * 示例 4:
     *  输入: [1,3,5,6], 0
     *  输出: 0
     *
     */
    public static int solve(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            //如果当前元素大于等于目标值，则下标所在位置是目标值或者目标值应插入的位置
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
