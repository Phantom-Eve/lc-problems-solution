package com.leetcode.problems.easy;

import com.leetcode.problems.auxiliary.TreeNode;

/**
 * 100-相同的树
 * @author Phantom
 * Created on 2019/12/3.
 */
public class IsSameTree {
    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     *
     * 示例 1:

     *  输入:       1         1
     *            / \       / \
     *           2   3     2   3
     *
     *          [1,2,3],   [1,2,3]
     *  输出: true
     *
     * 示例 2:
     *
     *  输入:      1          1
     *            /           \
     *           2             2
     *
     *          [1,2],     [1,null,2]
     *  输出: false
     *
     * 示例 3:
     *
     *  输入:       1         1
     *            / \       / \
     *           2   1     1   2
     *
     *          [1,2,1],   [1,1,2]
     *  输出: false
     */
    public static boolean solve(TreeNode p, TreeNode q) {
        // 如果两个二叉树都为null，直接返回true
        if (p == null && q == null) {
            return true;
        }
        // 如果两个二叉树，有且只有一个为null，它们一定不相同
        else if (p == null || q == null) {
            return false;
        }
        // 判断当前节点
        if (p.val != q.val) {
            return false;
        }
        // 判断左子节点
        boolean leftSame = solve(p.left, q.left);
        // 判断右子节点
        boolean rightSame = solve(p.right, q.right);
        return leftSame && rightSame;
    }
}
