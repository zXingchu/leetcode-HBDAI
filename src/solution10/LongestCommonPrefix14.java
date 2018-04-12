package solution10;

public class LongestCommonPrefix14 {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		return prefix;

		// if (strs.length == 0)
		// return "";
		// String prefix = strs[0];
		// for (int i = 1; i < strs.length; i++) {
		// prefix = prefix.substring(0, Math.min(prefix.length(), strs[i].length()));
		// if (strs[i].length() == 0)
		// return "";
		// for (int j = 0; j < prefix.length(); j++) {
		// if (prefix.charAt(j) != strs[i].charAt(j)) {
		// if (j != 0) {
		// prefix = prefix.substring(0, j);
		// break;
		// } else
		// return "";
		// }
		// }
		// }
		// return prefix;
	}

}
