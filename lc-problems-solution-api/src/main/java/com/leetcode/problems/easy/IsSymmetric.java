package com.leetcode.problems.easy;

import com.leetcode.problems.auxiliary.TreeNode;

/**
 * 101-对称二叉树
 * @author Phantom
 * Created on 2019/12/5.
 */
public class IsSymmetric {
    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     *
     * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
     *
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
     *
     *     1
     *    / \
     *   2   2
     *    \   \
     *    3    3
     */
    public static boolean solve(TreeNode root) {
        return isMirror(root, root);
    }

    private static boolean isMirror(TreeNode p, TreeNode q) {
        // 如果左右子树都为null，直接返回true
        if (p == null && q == null) {
            return true;
        }
        // 如果左右子树有且只有一个为null，它们一定不相同
        else if (p == null || q == null) {
            return false;
        }
        // 如果左右子树根节点不相等，一定不是镜像
        if (p.val != q.val) {
            return false;
        }
        // p的左子树和q的右子树相同 且 p的右子树和q的左子树相同 即为镜像
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
