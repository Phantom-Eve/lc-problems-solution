package com.leetcode.problems.easy;

/**
 * 20-有效的括号
 * @author Phantom
 * Created on 2019/7/31.
 */
public class IsValid {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 有效字符串需满足：
     *  1.左括号必须用相同类型的右括号闭合。
     *  2.左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * 示例 1:
     *  输入: "()"
     *  输出: true
     *
     * 示例 2:
     *  输入: "()[]{}"
     *  输出: true
     *
     * 示例 3:
     *  输入: "(]"
     *  输出: false
     * 示例 4:
     *  输入: "([)]"
     *  输出: false
     *
     * 示例 5:
     *  输入: "{[]}"
     *  输出: true
     *
     */
    public static boolean solve(String s) {
        if (s==null) {
            return false;
        }
        String[] strArr = s.split("");
        for (String str : strArr) {
            if (!"".equals(str) && "()[]{}".contains(str)) {

            }
        }
        // 循环替换闭合括号，如果可以全部替换，则返回true
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }
        return "".equals(s);
    }
}
