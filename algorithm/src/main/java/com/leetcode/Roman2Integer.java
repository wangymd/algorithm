package com.leetcode;

import java.util.HashMap;

/**
 * 
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 
 * 字符          		数值
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/roman-to-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author win7
 *
 */
public class Roman2Integer {
	
//	public static HashMap<Character, Integer> hashMap = new HashMap<>();
//	static {
//    	hashMap.put('I', 1);
//    	hashMap.put('V', 5);
//    	hashMap.put('X', 10);
//    	hashMap.put('L', 50);
//    	hashMap.put('C', 100);
//    	hashMap.put('D', 500);
//    	hashMap.put('M', 1000);
//	}

	public static void main(String[] args) {
		System.out.println(romanToInt1("III"));//3
		System.out.println(romanToInt1("IV"));//4
		System.out.println(romanToInt1("IX"));//9
		System.out.println(romanToInt1("LVIII"));//58
		System.out.println(romanToInt1("MCMXCIV"));//1994
		System.out.println(romanToInt1("MCMXCIIV"));//1993
	}
	
	/**
	 * 时间复杂度O(n^2)
	 * @param s
	 * @return
	 */
    public static int romanToInt1(String s) {
    	HashMap<Character, Integer> hashMap = new HashMap<>();
    	hashMap.put('I', 1);
    	hashMap.put('V', 5);
    	hashMap.put('X', 10);
    	hashMap.put('L', 50);
    	hashMap.put('C', 100);
    	hashMap.put('D', 500);
    	hashMap.put('M', 1000);
    	
    	int sum = 0;
    	char[] charArray = s.toCharArray();
    	for(int i = charArray.length - 1; i >= 0; i--) {
    		int n1 = hashMap.get(charArray[i]);
    		if(i == 0) {
    			sum += n1;
    			break;
    		}
    		
    		int toMinus = 0;//减去左侧合计
    		for(int j = i - 1; j >= 0; j--) {
    			int n2 = hashMap.get(charArray[j]);
				if(n1 > n2) {//如果发现小于i,遍历元素前移1位
					toMinus += n2;
					i -= 1;
				}
    		}
    		sum += n1 - toMinus;//加上当前i元素，减去左侧合计值
    	}
    	return sum;
    }
    
    //TODO?
    public static int romanToInt2(String s) {
    	HashMap<Character, Integer> hashMap = new HashMap<>();
    	hashMap.put('I', 1);
    	hashMap.put('V', 5);
    	hashMap.put('X', 10);
    	hashMap.put('L', 50);
    	hashMap.put('C', 100);
    	hashMap.put('D', 500);
    	hashMap.put('M', 1000);
    	
    	int sum = 0;
    	char[] charArray = s.toCharArray();
    	for(int i = charArray.length - 1; i >= 0; i--) {
    		int n1 = hashMap.get(charArray[i]);
    		if(i == 0) {
    			sum += n1;
    			break;
    		}
    		
    		int toMinus = 0;//减去左侧合计
    		for(int j = i - 1; j >= 0; j--) {
    			int n2 = hashMap.get(charArray[j]);
				if(n1 > n2) {//如果发现小于i,遍历元素前移1位
					toMinus += n2;
					i -= 1;
				}
    		}
    		sum += n1 - toMinus;//加上当前i元素，减去左侧合计值
    	}
    	return sum;
    }

}
