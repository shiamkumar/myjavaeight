package com.java.eight.programs.strings.words;

import java.util.Stack;

public class StringValidParantheses {
	public static void main(String[] args) {
		String str = "{}"; // postive case
		// String str = "{]"; //negative case
		System.out.println(isValidString(str));
	}
	
	public static boolean isValidString(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}

			else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}
	
}
