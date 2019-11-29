package com.leetcode.problems.easy;

import com.leetcode.problems.auxiliary.ListNode;

/**
 * 83-删除排序链表中的重复元素
 * @author Phantom
 * Created on 2019/11/29.
 */
public class DeleteDuplicates {
    /**
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     *
     * 示例 1:
     * 输入: 1->1->2
     * 输出: 1->2
     *
     * 示例 2:
     * 输入: 1->1->2->3->3
     * 输出: 1->2->3
     */
    public static ListNode solve(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            // 如果相等，next指向下一个
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }
            // 如果不等，当前指向下一个
            else {
                cur = cur.next;
            }
        }
        return head;
    }
}
