package com.leetcode;

import java.util.HashMap;
import java.util.Map;
/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
	你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * @author win7
 *
 */
class TwoNumSum {
	
	public static void main(String[] args) {
		 int[] nums = {2, 7, 11, 15};
		 int target = 9;
		 System.out.println(twoSum(nums, target));
	}
	
	/**
	 * 1、
	 * @param nums
	 * @param target
	 * @return
	 */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	int other = target - nums[i];//判断当前遍历元素的值，是否在map中存在
        	if(numsMap.containsKey(other)) {
        		return new int[] { numsMap.get(other), i };
        	}
        	numsMap.put(nums[i], i);//值为键，下标为value值
        }
        return null;
    }
}