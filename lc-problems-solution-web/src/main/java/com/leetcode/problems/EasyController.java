package com.leetcode.problems;

import com.google.gson.Gson;
import com.leetcode.problems.auxiliary.ListNode;
import com.leetcode.problems.vo.ReqParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简单问题解决方案 控制层
 * @author Phantom
 * Created on 2019/7/31.
 */
@RestController
public class EasyController {

    @Autowired
    private EasyService easyService;


    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name;
    }

    /**
     * 1-两数之和
     */
    @PostMapping("/twoSum")
    public String twoSumPost(@RequestBody ReqParams reqParams) {
        int[] nums = reqParams.getNums();
        int target = reqParams.getTarget();
        return new Gson().toJson(easyService.twoSum(nums, target));
    }

    @GetMapping("/twoSum")
    public String twoSumGet(int[] nums, int target) {
        return new Gson().toJson(easyService.twoSum(nums, target));
    }

    /**
     * 7-整数反转
     */
    @GetMapping("/reverse")
    public String reverse(int x) {
        return new Gson().toJson(easyService.reverse(x));
    }

    /**
     * 9-回文数
     */
    @GetMapping("/isPalindrome")
    public String isPalindrome(int x) {
        return new Gson().toJson(easyService.isPalindrome(x));
    }

    /**
     * 13-罗马数字转整数
     */
    @GetMapping("/romanToInt")
    public String romanToInt(String s) {
        return new Gson().toJson(easyService.romanToInt(s));
    }

    /**
     * 14-最长公共前缀
     */
    @GetMapping("/longestCommonPrefix")
    public String longestCommonPrefix(String[] args) {
        return new Gson().toJson(easyService.longestCommonPrefix(args));
    }

    /**
     * 20-有效的括号
     */
    @GetMapping("/isValid")
    public String isValid(String s) {
        return new Gson().toJson(easyService.isValid(s));
    }

    /**
     * 21-合并两个有序链表
     */
    @PostMapping("/mergeTwoLists")
    public String mergeTwoLists(@RequestBody ReqParams reqParams) {
        ListNode l1 = reqParams.getL1();
        ListNode l2 = reqParams.getL2();
        return new Gson().toJson(easyService.mergeTwoLists(l1, l2));
    }

    /**
     * 26-删除排序数组中的重复项
     */
    @GetMapping("/removeDuplicates")
    public String removeDuplicates(int[] nums) {
        return new Gson().toJson(easyService.removeDuplicates(nums));
    }

    /**
     * 27-移除元素
     */
    @PostMapping("/removeElement")
    public String removeElement(@RequestBody ReqParams reqParams) {
        int[] nums = reqParams.getNums();
        int val = reqParams.getTarget();
        return new Gson().toJson(easyService.removeElement(nums, val));
    }

    /**
     * 28-实现strStr()
     */
    @GetMapping("/strStr")
    public String strStr(String haystack, String needle) {
        return new Gson().toJson(easyService.strStr(haystack, needle));
    }

    /**
     * 35-搜索插入位置
     */
    @GetMapping("/searchInsert")
    public String searchInsert(int[] nums, int target) {
        return new Gson().toJson(easyService.searchInsert(nums, target));
    }

    /**
     * 38-报数
     */
    @GetMapping("/countAndSay")
    public String countAndSay(int n) {
        return new Gson().toJson(easyService.countAndSay(n));
    }

    /**
     * 53-最大子序和
     */
    @PostMapping("/maxSubArray")
    public String maxSubArray(@RequestBody ReqParams reqParams) {
        int[] nums = reqParams.getNums();
        return new Gson().toJson(easyService.maxSubArray(nums));
    }

    /**
     * 58-最后一个单词的长度
     */
    @GetMapping("/lengthOfLastWord")
    public String lengthOfLastWord(String s) {
        return new Gson().toJson(easyService.lengthOfLastWord(s));
    }

    /**
     * 66-加一
     */
    @GetMapping("/plusOne")
    public String plusOne(int[] digits) {
        return new Gson().toJson(easyService.plusOne(digits));
    }

    /**
     * 67-二进制求和
     */
    @GetMapping("/addBinary")
    public String addBinary(String a, String b) {
        return new Gson().toJson(easyService.addBinary(a, b));
    }

    /**
     * 69-x的平方根
     * @param x
     * @return
     */
    @GetMapping("/mySqrt")
    public String mySqrt(int x) {
        return new Gson().toJson(easyService.mySqrt(x));
    }

    /**
     * 70-爬楼梯
     * @param n 正整数
     * @return int
     */
    @GetMapping("/climbStairs")
    public String climbStairs(int n) {
        return new Gson().toJson(easyService.climbStairs(n));
    }
}
