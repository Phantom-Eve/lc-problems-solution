package com.leetcode.problems.easy;

import com.leetcode.problems.auxiliary.ListNode;

/**
 * 21-合并两个有序链表
 * @author Phantom
 * Created on 2019/7/31.
 */
public class MergeTwoLists {
    /**
     * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * 示例：
     *  输入：1->2->4, 1->3->4
     *  输出：1->1->2->3->4->4
     *
     */
    public static ListNode solve(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            //如果l1当前节点小于l2,则取l1当前节点
            if (l1.val < l2.val) {
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            //如果l1当前节点不小于l2,则取l2当前节点
            else {
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur = cur.next;
        }
        //任一为空，直接连接另一条链表
        if(l1 == null) {
            cur.next = l2;
        }
        if(l2 == null) {
            cur.next = l1;
        }
        return head.next;
    }
}
