package com.leetcode.problems;

import com.leetcode.problems.auxiliary.ListNode;

/**
 * 简单问题解决方案 Service
 * @author Phantom
 * Created on 2019/7/31.
 */
public interface EasyService {
    /**
     * 1-两数之和
     * @param nums 备选整数数组
     * @param target 目标值
     * @return int[]
     */
    int[] twoSum(int[] nums, int target);

    /**
     * 7-整数反转
     * @param x 用于反转的整数
     * @return int
     */
    int reverse(int x);

    /**
     * 9-回文数
     * @param x 判断是否是回文数的整数
     * @return boolean
     */
    boolean isPalindrome(int x);

    /**
     * 13-罗马数字转整数
     * @param s 罗马数字字符串
     * @return int
     */
    int romanToInt(String s);

    /**
     * 14-最长公共前缀
     * @param args 给定字符串数组
     * @return java.lang.String
     */
    String longestCommonPrefix(String[] args);

    /**
     * 20-有效的括号
     * @param s 给定字符串
     * @return boolean
     */
    boolean isValid(String s);

    /**
     * 21-合并两个有序链表
     * @param l1 有序链表1
     * @param l2 有序链表2
     * @return com.leetcode.problems.auxiliary.ListNode
     */
    ListNode mergeTwoLists(ListNode l1, ListNode l2);

    /**
     * 26-删除排序数组中的重复项
     * @param nums 排序数组
     * @return int
     */
    int removeDuplicates(int[] nums);

    /**
     * 27-移除元素
     * @param nums 数组
     * @param val 移除值
     * @return int
     */
    int removeElement(int[] nums, int val);

    /**
     * 28-实现strStr()
     * @param haystack 字符串
     * @param needle 字符串
     * @return int
     */
    int strStr(String haystack, String needle);

    /**
     * 35-搜索插入位置
     * @param nums 排序数组
     * @param target 目标值
     * @return int
     */
    int searchInsert(int[] nums, int target);

    /**
     * 38-报数
     * @param n 报数序列
     * @return java.lang.String
     */
    String countAndSay(int n);

    /**
     * 53-最大子序和
     * @param nums 整数数组
     * @return int
     */
    int maxSubArray(int[] nums);

    /**
     * 58-最后一个单词的长度
     * @param s 给定字符串
     * @return int
     */
    int lengthOfLastWord(String s);

    /**
     * 66-加一
     * @param digits 非负整数数组
     * @return int[]
     */
    int[] plusOne(int[] digits);

    /**
     * 67-二进制求和
     * @param a 二进制字符a
     * @param b 二进制字符b
     * @return java.lang.String
     */
    String addBinary(String a, String b);

    /**
     * 69-x的平方根
     * @param x 非负整数
     * @return int
     */
    int mySqrt(int x);
}
