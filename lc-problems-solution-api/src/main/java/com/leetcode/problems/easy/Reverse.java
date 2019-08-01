package com.leetcode.problems.easy;

/**
 * 7-整数反转
 * @author Phantom
 * Created on 2019/7/31.
 */
public class Reverse {
    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     *
     * 示例 1:
     *  输入: 123
     *  输出: 321
     *
     * 示例 2:
     *  输入: -123
     *  输出: -321
     *
     * 示例 3:
     *  输入: 120
     *  输出: 21
     *
     * 注意:
     *  假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
     * 0。
     *
     */
    public static int solve(int x) {
        //输出数字
        int r = 0;
        //记录正负号
        int sign = 1;
        if (x < 0) {
            sign = -1;
        }
        //输入数字转化Long，避免取不到绝对值
        String xstr = String.valueOf(Math.abs(Long.valueOf(x)));
        StringBuffer rsb = new StringBuffer(xstr);
        //反转字符串
        rsb.reverse();
        //加上符号
        Long l = sign * Long.parseLong(rsb.toString());
        if (l > 2147483647 || l < -2147483648) {
            return r;
        } else {
            r = l.intValue();
        }
        return r;
    }
}
