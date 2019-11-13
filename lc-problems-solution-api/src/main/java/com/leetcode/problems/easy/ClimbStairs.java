package com.leetcode.problems.easy;

/**
 * 70-爬楼梯
 * @author Phantom
 * Created on 2019/11/12.
 */
public class ClimbStairs {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * 注意：给定 n 是一个正整数。
     *
     * 示例 1：
     *  输入： 2
     *  输出： 2
     *  解释： 有两种方法可以爬到楼顶。
     *  1.  1 阶 + 1 阶
     *  2.  2 阶
     *
     * 示例 2：
     *  输入： 3
     *  输出： 3
     *  解释： 有三种方法可以爬到楼顶。
     *  1.  1 阶 + 1 阶 + 1 阶
     *  2.  1 阶 + 2 阶
     *  3.  2 阶 + 1 阶
     */
    public static int solve(int n) {
        /*
          1. 记忆递归法
          把所有可能爬的阶数进行组合，也就是 1 和 2 。
          而在每一步中我们都会继续调用 climbStairs 这个函数模拟爬 1 阶和 2 阶的情形，
          然后把每一步的结果存储在 memo 数组之中，每当函数再次被调用，我们就直接从 memo 数组返回结果。
          最后计算两个函数的返回值之和
         */
        /*int[] memo = new int[n + 1];
        return climbStairs(0, n, memo);*/

        /*
          2. 动态规划
          这个问题可以被分解为一些包含最优子结构的子问题，即它的最优解可以从其子问题的最优解来有效地构建。
          第 n 阶可以由以下两种方法得到：
            1. 在第 (n-1) 阶后向上爬一阶。
            2. 在第 (n-2) 阶后向上爬 22 阶。
          所以到达第 n 阶的方法总数就是到第 (n-1) 阶和第 (n-2) 阶的方法数之和。
          令 dp[n] 表示能到达第 n 阶的方法总数：dp[n] = dp[n-1] + dp[n-2]
         */
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        // 爬1层有1种方法
        dp[1] = 1;
        // 爬2层有2种方法
        dp[2] = 2;
        // 从爬三层开始动态规划
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    /**
     * 记忆递归：模拟爬楼梯的情形
     * @param i 当前阶数
     * @param n 目标阶数
     * @return int
     */
    private static int climbStairs(int i, int n, int[] memo) {
        // 当前阶数超过目标阶数不计数
        if (i > n) {
            return 0;
        }
        // 当前阶数等于目标阶数记1种
        if (i == n) {
            return 1;
        }
        // 直接从记忆数组返回结果
        if (memo[i] > 0) {
            return memo[i];
        }
        return climbStairs(i+1, n, memo) + climbStairs(i+2, n, memo);
    }
}
