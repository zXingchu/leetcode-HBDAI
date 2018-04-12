package solution20;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {

	public List<String> generateParenthesis(int n) {
		List<String> reList = new ArrayList<>();
		backtrackGenerate("", 0, 0, n, reList);
		return reList;
	}

	public void backtrackGenerate(String str, int open, int close, int n, List<String> reList) {
		if (str.length() == n * 2) {
			reList.add(str);
		} else {
			if (open < n)
				backtrackGenerate(str + "(", open + 1, close, n, reList);
			if (open > close)
				backtrackGenerate(str + ")", open, close + 1, n, reList);
		}
	}

	public List<String> generateParenthesis3(int n) {
		List<String> ans = new ArrayList<>();
		if (n == 0) {
			ans.add("");
		} else {
			for (int c = 0; c < n; ++c)
				for (String left : generateParenthesis3(c))
					for (String right : generateParenthesis3(n - 1 - c))
						ans.add("(" + left + ")" + right);
		}
		return ans;
	}

}
