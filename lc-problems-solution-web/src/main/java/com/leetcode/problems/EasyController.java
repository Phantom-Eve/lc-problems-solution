package com.leetcode.problems;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/twoSum")
    public String twoSum(@RequestParam int[] nums, @RequestParam int target) {
        return new Gson().toJson(easyService.twoSum(nums, target));
    }
}
