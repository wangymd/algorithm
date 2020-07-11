package com.leetcode;

/**
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
321 -> 123
 *
 */
class ReverseInteger {
	
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
	
    public static int reverse(int num) {
    	int rt = 0;
    	while(num != 0) {
    		int x = num % 10;//余数
    		int y = rt * 10 + x;
    		//溢出
    		if((y - x) / 10 != rt) return 0;
    		rt = y;
    		num = num / 10;
    	}
    	return rt;
    }
}