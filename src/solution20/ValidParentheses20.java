package solution20;

import java.util.Stack;

public class ValidParentheses20 {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
				if (stack.isEmpty())
					return false;
				char c = stack.pop();
				if (c == '(' && s.charAt(i) == ')')
					continue;
				else if (c == '[' && s.charAt(i) == ']')
					continue;
				else if (c == '{' && s.charAt(i) == '}')
					continue;
				else
					return false;
			}
		}
		if (stack.isEmpty())
			return true;
		return false;
	}

}
