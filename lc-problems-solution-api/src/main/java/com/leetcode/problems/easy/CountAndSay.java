package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 38-报数
 * @author Phantom
 * Created on 2019/7/31.
 */
public class CountAndSay {
    /**
     * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
     *  1.     1
     *  2.     11
     *  3.     21
     *  4.     1211
     *  5.     111221
     * 1 被读作  "one 1"  ("一个一") , 即 11。
     * 11 被读作 "two 1s" ("两个一"）, 即 21。
     * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
     *
     * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
     * 注意：整数顺序将表示为一个字符串。
     *
     * 示例 1:
     *  输入: 1
     *  输出: "1"
     *
     * 示例 2:
     *  输入: 4
     *  输出: "1211"
     *
     */
    public static String solve(int n) {
        // 如果输入1，直接返回
        if (n==1) {
            return "1";
        }
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "1");
        // 从2开始循环
        for (int i = 2; i <= n; i++) {
            char[] say = map.get(i-1).toCharArray();
            char pre = say[0]; //前一个字符
            int count = 1; //重复个数
            StringBuilder builder = new StringBuilder();
            for (int j = 1; j < say.length; j++) {
                if (say[j] == pre) { //当前字符与前一个字符相等，计数+1
                    count++;
                } else { //当前字符与前一个字符不等，拼接字符串并重新开始计数
                    builder.append(count).append(pre);
                    pre = say[j];
                    count = 1;
                }
            }
            //最后一个字符串拼接
            builder.append(count).append(pre);
            map.put(i, builder.toString());
        }
        return map.get(n);
    }
}
