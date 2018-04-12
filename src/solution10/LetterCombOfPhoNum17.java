package solution10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombOfPhoNum17 {

	public List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if (digits.isEmpty())
			return ans;
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		ans.add("");
		for (int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			while (ans.peek().length() == i) {
				String t = ans.remove();
				for (char s : mapping[x].toCharArray())
					ans.add(t + s);
			}
		}
		return ans;
	}

	private char[][] map = { { '_', '_', '_' }, { '-', '-', '-' }, { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
			{ 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' },
			{ 'w', 'x', 'y', 'z' } };

	List<String> reList = new ArrayList<String>();

	public List<String> myLetterCombinations(String digits) {
		if (digits.length() == 0)
			return reList;
		addCombString(0, "", digits);
		return reList;
	}

	private void addCombString(int index, String letter, String digits) {
		int mapIndex = Integer.valueOf(digits.charAt(index) - '0');
		if (index == digits.length()) {
			for (int i = 0; i < map[mapIndex].length; i++) {
				reList.add(letter + map[mapIndex][i]);
			}
		} else {
			for (int i = 0; i < map[mapIndex].length; i++) {
				addCombString(index + 1, letter + map[mapIndex][i], digits);
			}
		}
	}

}
