package solution20;

public class ImplementStrStr28 {

	public int strStr(String haystack, String needle) {
//		if (haystack.length() == needle.length())
//			return 0;
		int max = haystack.length() - needle.length() + 1;
		for (int i = 0; i < max; i++) {
			if (haystack.substring(i, i + needle.length()).equals(needle))
				return i;
		}
		return -1;

	}

}
