package solution30;

import java.util.Stack;

public class LongestValidParentheses32 {

	public static int longestValidParentheses(String s) {
		int longest = 0;

		for (int i = 0; i < s.length(); i++) {
			int leftNum = 0;
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(j) == '(') {
					leftNum++;
				} else if (s.charAt(j) == ')') {
					leftNum--;
					if (leftNum == 0) {
						longest = longest > (j - i + 1) ? longest : (j - i + 1);
						if (j == s.length() - 1) {
							return longest;
						}
					} else if (leftNum < 0) {
						break;
					}
				} else {
					continue;
				}
			}

		}

		return longest;

	}

	public static void main(String[] args) {
		System.out.println(longestValidParentheses(")()())"));
	}

}
