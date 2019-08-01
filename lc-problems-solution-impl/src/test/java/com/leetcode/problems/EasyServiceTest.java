package com.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 简单问题解决方案 测试类
 * @author Phantom
 * Created on 2019/7/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EasyServiceTest {

    @Autowired
    private EasyService easyService;

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] result = easyService.twoSum(nums, target);
        Assert.assertEquals(2, result.length);
        Assert.assertEquals(target, nums[result[0]]+nums[result[1]]);
    }

    @Test
    public void reverse() {
    }

    @Test
    public void isPalindrome() {
    }

    @Test
    public void romanToInt() {
    }

    @Test
    public void longestCommonPrefix() {
    }

    @Test
    public void isValid() {
    }
}