package com.leetcode;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素）。
 * 
 * 输入: [-2,1,-3,4,-1,2,1,-5,4], 输出: [4,-1,2,1]  解释: 连续子数组[4,-1,2,1]的和最大，为 6。
 * 
 * @author win7
 *
 */
public class MaxSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(maxSubArray1(nums));
		System.out.println(maxSubArray2(nums));
		System.out.println(maxSubArray3(nums));
	}
	
	//暴力破解，时间复杂度：O（n^2）
	public static int[] maxSubArray1(int[] nums) {
		int maxSubSum = nums[0];
		int subStart = 0;
		int subEnd = 0;
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			int sum = x;
			for (int j = 0; j < nums.length; j++) {
				int y = nums[j];
				sum += y;
				if(sum > maxSubSum) {
					subStart = i;
					subEnd = j;
					maxSubSum = sum;
				}
			}
		}
		return Arrays.copyOfRange(nums, subStart, subEnd+1);//包含左边界，不包含右边界
	}

	/**
	 * 子序列中最后元素a(n)必须正，否则可以舍弃
	 * 子序列f(n-1)必须为正，否则可以舍弃
	 * 
	 * @param nums
	 * @return
	 */
	public static int[] maxSubArray2(int[] nums) {
		int rt = nums[0];//不能设置为零，如果数据中都是负数情况呢！
		int preSub = 0;
		int subEnd = 0;
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			//计算子序列之和
			preSub = Math.max(preSub + x, x);
			//计算最大值和子序列最后索引
			if(preSub > rt) {
				rt = preSub;
				subEnd = i;
			}
		}
		//计算起始位置
		int subStart = 0;
		for (int i = subEnd; i >= 0; i--) {
			rt = rt - nums[i];
			if(rt == 0) {
				subStart = i;
				break;
			}
		}
		return Arrays.copyOfRange(nums, subStart, subEnd+1);
	}
	
	public static int[] maxSubArray3(int[] nums) {
		int rt = nums[0];//不能设置为零，如果数据中都是负数情况呢！
		int preSub = 0;
		int subEnd = 0;
		int subStart = 0;
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			//计算子序列之和
			int fn = preSub + x;
			if(fn > x) {
				preSub = fn;
			}else {
				preSub = x;
				subStart = i;//重新记录开始位置
			}
			//计算最大值和子序列最后索引
			if(preSub > rt) {
				rt = preSub;
				subEnd = i;
			}
		}
		return Arrays.copyOfRange(nums, subStart, subEnd + 1);
	}

}
