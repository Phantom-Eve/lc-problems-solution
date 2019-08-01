package com.leetcode.problems.easy;

/**
 * 14-最长公共前缀
 * @author Phantom
 * Created on 2019/7/31.
 */
public class LongestCommonPrefix {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     * 示例 1:
     *  输入: ["flower","flow","flight"]
     *  输出: "fl"
     *
     * 示例 2:
     *  输入: ["dog","racecar","car"]
     *  输出: ""
     *  解释: 输入不存在公共前缀。
     *
     * 说明:
     * 所有输入只包含小写字母 a-z 。
     *
     */
    public static String solve(String[] strs) {
        String prefix = "";
        // 数组长度为空，直接返回
        if (strs.length == 0) {
            return prefix;
        }
        prefix = strs[0];
        // 数组长度大于1，查找第一个元素与第二个元素的公共前缀
        for (int i=1; i<strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) {
                    return prefix;
                }
            }
        }
        return prefix;
    }
}
