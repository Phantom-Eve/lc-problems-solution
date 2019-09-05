package com.leetcode.problems.easy;

/**
 * 67-二进制求和
 * @author Phantom
 * Created on 2019/9/5.
 */
public class AddBinary {
    /**
     * 给定两个二进制字符串，返回他们的和（用二进制表示）。
     * 输入为非空字符串且只包含数字 1 和 0。
     *
     * 示例 1:
     *  输入: a = "11", b = "1"
     *  输出: "100"
     *
     * 示例 2:
     * 输入: a = "1010", b = "1011"
     * 输出: "10101"
     */
    public static String solve(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for (int i=a.length()-1,j=b.length()-1; i>=0||j>=0; i--,j--) {
            int sum = ca;
            // += 优先级最低，判断i>=0（j>=0）的含义是当两个数字长度不一致时，短的数字当做0来处理
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            // sum % 2是在做二进制取模运算，如sum=2，这时候将sum % 2=0放入结果集中
            ans.append(sum % 2);
            // 这里是计算进位，如sum=2，则ca=1，ca表示进位的意思，满2进1
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }
}
