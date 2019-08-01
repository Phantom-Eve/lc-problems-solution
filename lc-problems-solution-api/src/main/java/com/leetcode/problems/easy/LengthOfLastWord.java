package com.leetcode.problems.easy;

/**
 * 58-最后一个单词的长度
 * @author Phantom
 * Created on 2019/7/31.
 */
public class LengthOfLastWord {
    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
     * 如果不存在最后一个单词，请返回 0 。
     * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
     *
     * 示例:
     *  输入: "Hello World"
     *  输出: 5
     *
     */
    public static int solve(String s) {
        //如果不存在最后一个单词，返回0
        if ("".equals(s) || (s.trim()).length()==0) {
            return 0;
        }
        String[] wordArr = s.split(" ");
        String lastWord = "";
        if (wordArr!=null && wordArr.length>0) {
            lastWord = wordArr[wordArr.length-1];
        }
        return lastWord.length();
    }
}
