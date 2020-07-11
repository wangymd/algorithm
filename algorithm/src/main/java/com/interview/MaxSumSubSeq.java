package com.interview;

/**
 * 子序列和最大的子序列
 * @author win7
 *
 */
public class MaxSumSubSeq {

    public static void main(String[] args) {
        int[] a = { -5, 20, -4, 10, -18 };
        int max = maxSubSum1(a);
        System.out.println(max);
        // 21
    }

    public static int maxSubSum1(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += a[k];
                }
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

}
