package com.leetcode.problems.easy;

/**
 * 9-回文数
 * @author Phantom
 * Created on 2019/7/31.
 */
public class IsPalindrome {
    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * 示例 1:
     *  输入: 121
     *  输出: true
     *
     * 示例 2:
     *  输入: -121
     *  输出: false
     * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     *
     * 示例 3:
     *  输入: 10
     *  输出: false
     * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
     *
     * 进阶:
     *  你能不将整数转为字符串来解决这个问题吗？
     *
     */
    public static boolean solve(int x) {
        /*********** 1.使用字符串方式 ************/
        /*
        boolean flag = false;
        String x_str = String.valueOf(x);
        //将x转化为StringBuffer
        StringBuffer sb = new StringBuffer(x_str);
        //反转后的x字符串
        String r_str = sb.reverse().toString();
        //如果反转前的x与反转后相等，则x是回文数
        if (x_str.equals(r_str)) {
            flag = true;
        }
        return flag;
        */

        /*********** 2.不使用字符串方式 ************/
        // 负数不可能是回文数
        // 如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0，只有 0 满足这一属性
        if (x < 0 || x%10==0 && x!=0) {
            return false;
        }
        int reverted = 0;
        // 将原始数字除以 10，然后给反转后的数字乘上 10，
        // 当原始数字小于反转后的数字时，就意味着已经处理了一半位数的数字
        while (x > reverted) {
            // 对于数字 1221，如果执行 x % 10，我们将得到最后一位数字 1，
            // 将最后一位作为反转数的第一位（reverted = x % 10），
            // 执行 x/10 获取去掉最后一位的新数字 122，
            // 重复执行x % 10，获取x的最后一位向反转数个位追加（reverted = reverted * 10 + x % 10）
            // 同时执行 x/10 去掉最后一位
            // 循环以上步骤得到x和reverted
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }
        // 当数字长度为奇数时，我们可以通过 reverted/10 去除处于中位的数字。
        // 当输入为 12321 时，在 while 循环的末尾我们可以得到 x =12, reverted = 123，
        // 而跳出循环的条件是x <= reverted，
        // 且由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == reverted || x == reverted/10;
    }
}
