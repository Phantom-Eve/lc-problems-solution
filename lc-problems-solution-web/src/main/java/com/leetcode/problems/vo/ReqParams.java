package com.leetcode.problems.vo;

import com.leetcode.problems.auxiliary.ListNode;
import java.util.List;

/**
 * 请求参数VO
 * @author Phantom
 * Created on 2019/9/4.
 */
public class ReqParams {
    private int[] nums;

    private int target;

    private String[] args;

    private String str;

    private ListNode l1;

    private ListNode l2;

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ListNode getL1() {
        return l1;
    }

    public void setL1(ListNode l1) {
        this.l1 = l1;
    }

    public ListNode getL2() {
        return l2;
    }

    public void setL2(ListNode l2) {
        this.l2 = l2;
    }
}
