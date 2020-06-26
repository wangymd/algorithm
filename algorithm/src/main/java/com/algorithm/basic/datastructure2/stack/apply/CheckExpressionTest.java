package com.algorithm.basic.datastructure2.stack.apply;

import com.algorithm.basic.datastructure2.stack.MyDefException;
import com.algorithm.basic.datastructure2.stack.MyLinkedStack;
import com.algorithm.basic.datastructure2.stack.Stack;

/**
 * 表达式检测
 */
public class CheckExpressionTest {

	public static String isValid(String expstr) throws MyDefException{
		// 创建栈
		Stack<String> stack = new MyLinkedStack<String>();
		int i = 0;
		while (i < expstr.length()) {
			char ch = expstr.charAt(i);
			i++;
			switch (ch) {
			case '(':
				stack.push(ch + "");// 左括号直接入栈
				break;
			case ')':
				if (stack.isEmpty() || !stack.pop().equals("(")) // 遇见右括号左括号直接出栈
					return "(";
			}
		}
		// 最后检测是否为空,为空则检测通过
		if (stack.isEmpty())
			return "check pass!";
		else
			return "check exception!";
	}

	public static void main(String args[]) throws MyDefException{
		String expstr = "((5-3)*8-2)";
		System.out.println(expstr + "  " + isValid(expstr));
	}
}