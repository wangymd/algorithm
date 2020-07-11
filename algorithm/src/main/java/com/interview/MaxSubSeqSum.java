package com.interview;

/**
 * 求和最大子序列的和
 * @author win7
 *
 */
public class MaxSubSeqSum {

    public static void main(String[] args) {
        int[] nums = { -5, 20, -4, 10, -18 };
        System.out.println(maxSubSum1(nums));
        System.out.println(maxSubSum2(nums));
        System.out.println(maxSubSum3(nums));
        System.out.println(maxSubSum4(nums));
        System.out.println(maxSubSum5(nums));
    }

    public static int maxSubSum1(int[] nums) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {//从第一个元素开始
            for (int j = i; j < nums.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += nums[k];
                }
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }
    
    public static int maxSubSum2(int[] nums) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {//从第一个元素开始
        	int thisSum = 0;
            for (int j = i; j < nums.length; j++) {
            	thisSum += nums[j];
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }
    
    private static int maxSubSum3(int[] a) {
        // 递归初始化参数
        return maxSumRec(a, 0, a.length - 1);
    }

    private static int maxSumRec(int[] nums, int left, int right) {
        // 判断是否只有一个元素
        if (left == right) {
            if (nums[left] > 0) {
                return nums[left];
            } else {
                return 0;
            }
        }
        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(nums, left, center);
        int maxRightSum = maxSumRec(nums, center + 1, right);

        // 左端处理
        int maxLeftBorderSum = 0;
        int leftBoarderSum = 0;
        for (int i = center; i >= left; i--) {
            leftBoarderSum += nums[i];
            if (leftBoarderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBoarderSum;
            }
        }

        // 右端处理
        int maxRightBoarderSum = 0;
        int rightBoarderSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBoarderSum += nums[i];
            if (rightBoarderSum > maxRightBoarderSum) {
                maxRightBoarderSum = rightBoarderSum;
            }
        }
        // 返回最大值
        return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorderSum + maxRightBoarderSum);
    }
    
    private static int maxSubSum4(int[] nums) {
        int maxSum = 0;
        int thisSum = 0;
        for (int i = 0; i < nums.length; i++) {
            thisSum += nums[i];
            if (thisSum > maxSum) {
                maxSum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;
            }
            return maxSum;
        }
        return 0;
    }
    

    //如果a[i]是负的，那么它不可能代表最优序列的起点，因为任何包含a[i]作为起点的子序列都可以通过a[i+1]作起点而得到改进。
    //任何负的子序列不可能是最优子序列的前缀。
    //时间复杂度O(N)的解法：
    public static int maxSubSum5(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int currSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            currSum = (currSum < 0) ? array[i] : currSum + array[i];
            if (currSum > maxSum) maxSum = currSum;
        }
        return maxSum;
    }

}
