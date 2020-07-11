package com.leetcode;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 输入: [-2,1,-3,4,-1,2,1,-5,4], 输出: 6 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 
 * @author win7
 *
 */
public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(maxSubArray1(nums));
		System.out.println(maxSubArray2(nums));
		
	}
	
	//暴力破解，时间复杂度：O（n^2）
	public static int maxSubArray1(int[] nums) {
		int rt = nums[0];
		for (int num : nums) {
			int sum = num;
			for (int n : nums) {
				sum += n;
				if(sum > rt) rt = sum;
			}
		}
		return rt;
	}

	/**
	 * 子序列中最后元素a(n)必须正，否则可以舍弃
	 * 子序列f(n-1)必须为正，否则可以舍弃
	 * 
	 * @param nums
	 * @return
	 */
	public static int maxSubArray2(int[] nums) {
		int rt = nums[0];//不能设置为零，如果数据中都是负数情况呢！
		int pre = 0;
		for (int num : nums) {
			//f(n) = f(n-1) + a(n);f(n)与a(n)进行比较;
			//1、f(n-1)>0,a(n)<0,对于f(n)减效果,此时f(n)最大值为起始序列
			//2、f(n-1)>0,a(n)>0,对于f(n)增效果,此时f(n)最大值为起始序列
			//3、f(n-1)<0,a(n)<0,对于f(n)减效果,此时a(n)最大值为起始序列
			//4、f(n-1)<0,a(n)>0,对于f(n)增效果,此时a(n)最大值为起始序列
			pre = Math.max(pre + num, num);//计算子序列之和
			rt = Math.max(rt, pre);//计算最大值
		}
		return rt;
	}

}
