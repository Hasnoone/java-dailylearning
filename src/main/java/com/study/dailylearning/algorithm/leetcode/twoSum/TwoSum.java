package com.study.dailylearning.algorithm.leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: dailylearning
 * @description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1]
 * @author: XuHang
 * @create: 2020-01-11
 **/
public class TwoSum {

    public static void main(String[] args) {

    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }




    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int temp = target - num1;
            for (int j = i+1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


}

