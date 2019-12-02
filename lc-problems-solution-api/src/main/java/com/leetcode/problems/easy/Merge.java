package com.leetcode.problems.easy;

/**
 * 88-合并两个有序数组
 * @author Phantom
 * Created on 2019/12/2.
 */
public class Merge {
    /**
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     *
     * 说明:
     *  初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
     *  你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *
     * 示例:
     *  输入:
     *  nums1 = [1,2,3,0,0,0], m = 3
     *  nums2 = [2,5,6],       n = 3
     *
     *  输出: [1,2,2,3,5,6]
     */
    public static void solve(int[] nums1, int m, int[] nums2, int n) {
        // 数组1最后一个元素下标
        int len1 = m - 1;
        // 数组2最后一个元素下标
        int len2 = n - 1;
        // 合并后数组最后一个元素下标
        int len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            // 取最大元素放在数组最后
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        // 将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }
}
