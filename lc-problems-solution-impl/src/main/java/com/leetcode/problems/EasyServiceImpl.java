package com.leetcode.problems;

import com.leetcode.problems.auxiliary.ListNode;
import com.leetcode.problems.auxiliary.TreeNode;
import com.leetcode.problems.easy.AddBinary;
import com.leetcode.problems.easy.ClimbStairs;
import com.leetcode.problems.easy.CountAndSay;
import com.leetcode.problems.easy.DeleteDuplicates;
import com.leetcode.problems.easy.IsPalindrome;
import com.leetcode.problems.easy.IsSameTree;
import com.leetcode.problems.easy.IsSymmetric;
import com.leetcode.problems.easy.IsValid;
import com.leetcode.problems.easy.LengthOfLastWord;
import com.leetcode.problems.easy.LongestCommonPrefix;
import com.leetcode.problems.easy.MaxSubArray;
import com.leetcode.problems.easy.Merge;
import com.leetcode.problems.easy.MergeTwoLists;
import com.leetcode.problems.easy.MySqrt;
import com.leetcode.problems.easy.PlusOne;
import com.leetcode.problems.easy.RemoveDuplicates;
import com.leetcode.problems.easy.RemoveElement;
import com.leetcode.problems.easy.Reverse;
import com.leetcode.problems.easy.RomanToInt;
import com.leetcode.problems.easy.SearchInsert;
import com.leetcode.problems.easy.StrStr;
import com.leetcode.problems.easy.TwoSum;
import org.springframework.stereotype.Service;

/**
 * 简单问题解决方案 实现类
 * @author Phantom
 * Created on 2019/7/31.
 */
@Service
public class EasyServiceImpl implements EasyService {

    /**
     * 1-两数之和
     * @param nums 备选整数数组
     * @param target 目标值
     * @return int[]
     */
    @Override
    public int[] twoSum(int[] nums, int target) {
        return TwoSum.solve(nums, target);
    }

    /**
     * 7-整数反转
     * @param x 用于反转的整数
     * @return int
     */
    @Override
    public int reverse(int x) {
        return Reverse.solve(x);
    }

    /**
     * 9-回文数
     * @param x 判断是否是回文数的整数
     * @return boolean
     */
    @Override
    public boolean isPalindrome(int x) {
        return IsPalindrome.solve(x);
    }

    /**
     * 13-罗马数字转整数
     * @param s 罗马数字字符串
     * @return int
     */
    @Override
    public int romanToInt(String s) {
        return RomanToInt.solve(s);
    }

    /**
     * 14-最长公共前缀
     * @param args 给定字符串数组
     * @return java.lang.String
     */
    @Override
    public String longestCommonPrefix(String[] args) {
        return LongestCommonPrefix.solve(args);
    }

    /**
     * 20-有效的括号
     * @param s 给定字符串
     * @return boolean
     */
    @Override
    public boolean isValid(String s) {
        return IsValid.solve(s);
    }

    /**
     * 21-合并两个有序链表
     * @param l1 有序链表1
     * @param l2 有序链表2
     * @return com.leetcode.problems.auxiliary.ListNode
     */
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return MergeTwoLists.solve(l1, l2);
    }

    /**
     * 26-删除排序数组中的重复项
     * @param nums 排序数组
     * @return int
     */
    @Override
    public int removeDuplicates(int[] nums) {
        return RemoveDuplicates.solve(nums);
    }

    /**
     * 27-移除元素
     * @param nums 数组
     * @param val 移除值
     * @return int
     */
    @Override
    public int removeElement(int[] nums, int val) {
        return RemoveElement.solve(nums, val);
    }

    /**
     * 28-实现strStr()
     * @param haystack 字符串
     * @param needle 字符串
     * @return int
     */
    @Override
    public int strStr(String haystack, String needle) {
        return StrStr.solve(haystack, needle);
    }

    /**
     * 35-搜索插入位置
     * @param nums 排序数组
     * @param target 目标值
     * @return int
     */
    @Override
    public int searchInsert(int[] nums, int target) {
        return SearchInsert.solve(nums, target);
    }

    /**
     * 38-报数
     * @param n 报数序列
     * @return java.lang.String
     */
    @Override
    public String countAndSay(int n) {
        return CountAndSay.solve(n);
    }

    /**
     * 53-最大子序和
     * @param nums 整数数组
     * @return int
     */
    @Override
    public int maxSubArray(int[] nums) {
        return MaxSubArray.solve(nums);
    }

    /**
     * 58-最后一个单词的长度
     * @param s 给定字符串
     * @return int
     */
    @Override
    public int lengthOfLastWord(String s) {
        return LengthOfLastWord.solve(s);
    }

    /**
     * 66-加一
     * @param digits 非负整数数组
     * @return int[]
     */
    @Override
    public int[] plusOne(int[] digits) {
        return PlusOne.solve(digits);
    }

    /**
     * 67-二进制求和
     * @param a 二进制字符a
     * @param b 二进制字符b
     * @return java.lang.String
     */
    @Override
    public String addBinary(String a, String b) {
        return AddBinary.solve(a, b);
    }

    /**
     * 69-x的平方根
     * @param x 非负整数
     * @return int
     */
    @Override
    public int mySqrt(int x) {
        return MySqrt.solve(x);
    }

    /**
     * 70-爬楼梯
     * @param n 正整数
     * @return int
     */
    @Override
    public int climbStairs(int n) {
        return ClimbStairs.solve(n);
    }

    /**
     * 83-删除排序链表中的重复元素
     * @param head 排序链表
     * @return ListNode 去重后的链表
     */
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        return DeleteDuplicates.solve(head);
    }

    /**
     * 88-合并两个有序数组
     * @param nums1 数组1
     * @param m 数组1长度
     * @param nums2 数组2
     * @param n 数组2长度
     * @return int[] 合并后数组
     */
    @Override
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        Merge.solve(nums1, m, nums2, n);
        return nums1;
    }

    /**
     * 100-相同的树
     * @param p 树p
     * @param q 树q
     * @return boolean 判断结果
     */
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return IsSameTree.solve(p, q);
    }

    /**
     * 101-对称二叉树
     * @param root 待判断是否对称的二叉树
     * @return boolean 判断结果
     */
    @Override
    public boolean isSymmetric(TreeNode root) {
        return IsSymmetric.solve(root);
    }
}
