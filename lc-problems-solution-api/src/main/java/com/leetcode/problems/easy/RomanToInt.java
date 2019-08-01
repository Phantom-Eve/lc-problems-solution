package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 13-罗马数字转整数
 * @author Phantom
 * Created on 2019/7/31.
 */
public class RomanToInt {
    /**
     * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
     *
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V +
     * II 。
     *
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数
     * 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     *
     *
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     *
     *
     * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
     *
     * 示例 1:
     *  输入: "III"
     *  输出: 3
     *
     * 示例 2:
     *  输入: "IV"
     *  输出: 4
     *
     * 示例 3:
     *  输入: "IX"
     *  输出: 9
     *
     * 示例 4:
     *  输入: "LVIII"
     *  输出: 58
     * 解释: L = 50, V= 5, III = 3.
     *
     * 示例 5:
     *  输入: "MCMXCIV"
     *  输出: 1994
     * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
     *
     */

    /**
     * 设置map存放罗马数字与阿拉伯数字映射关系
     */
    static final Map<String, Integer> singleMap = new HashMap<String, Integer>();
    static {
        singleMap.put("I", 1);
        singleMap.put("V", 5);
        singleMap.put("X", 10);
        singleMap.put("L", 50);
        singleMap.put("C", 100);
        singleMap.put("D", 500);
        singleMap.put("M", 1000);
    }
    static final Map<String, Integer> doubleMap = new HashMap<String, Integer>();
    static {
        doubleMap.put("IV", 4);
        doubleMap.put("IX", 9);
        doubleMap.put("XL", 40);
        doubleMap.put("XC", 90);
        doubleMap.put("CD", 400);
        doubleMap.put("CM", 900);
    }
    public static int solve(String s) {
        // 用于存放转化后的结果
        int num = 0;
        int len = s.length();
        for (int i=0; i<len; i++) {
            String key = null;
            // 特殊情况按两个字符拆分
            if ((i+2 <= len) && doubleMap.containsKey(s.substring(i, i+2))) {
                key = s.substring(i, i+2);
                num += doubleMap.get(key);
                i++;
            }
            // 一般情况按一个字符拆分
            else if (i+1 <= len){
                key = s.substring(i, i+1);
                num += singleMap.get(key);
            }

        }
        return num;
    }
}
