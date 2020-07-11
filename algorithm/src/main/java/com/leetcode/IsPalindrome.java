package com.leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * 121 : true
 * 
 * -121 : false
 * 
 * @author win7
 *
 */
public class IsPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome1(121));
		System.out.println(isPalindrome1(-121));
		
		System.out.println(isPalindrome2(121));
		System.out.println(isPalindrome2(-121));
	}
	
	/**
	 * x长度前半部分和后半部分逆序相同：
	 * 如果长度是奇数，len/2+1 至 len逆序和前len/2 相同，中间数对于前后都是无影响的
	 * 如果长度是偶数，len/2至 len逆序和前len/2 相同
	 * @param x
	 * @return
	 */
    public static boolean isPalindrome1(int x) {
    	if(x < 0) return false;
    	if(x >= 0 && x < 10) return true;
    	
    	String s1 = new String(Integer.toString(x));
    	int len = s1.length();
    	int start = len / 2;
    	StringBuilder sb = new StringBuilder();
    	for(int i = len - 1;i >= start; i--) {
    		sb.append(s1.charAt(i));
    	}
    	if(s1.startsWith(sb.toString())) return true;
    	
    	return false;
    }
    
    public static boolean isPalindrome2(int x) {
    	if(x < 0 || x % 10 == 0) return false;
    	if(x >= 0 && x < 10) return true;
    	
    	int reverseNum = 0;
    	while(x > reverseNum) {
    		reverseNum = reverseNum * 10 + x % 10;
    		x /= 10;
    	}
    	//偶数是相等，奇数是/10相等
    	return x == reverseNum || x == reverseNum / 10;
    }

}
