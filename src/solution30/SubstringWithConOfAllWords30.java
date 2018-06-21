package solution30;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SubstringWithConOfAllWords30 {

	public List<Integer> findSubstring(String s, String[] words) {
		
		List<Integer> ans = new LinkedList<Integer>();
		if (words.length == 0)
			return ans;
		
		Map<String, Integer> counts = new HashMap<>();
        for (final String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        int n = s.length(), num = words.length, len = words[0].length();
        for (int i = 0; i < n - num * len + 1; i++) {
            final Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < num) {
                String word = s.substring(i + j * len, i + (j + 1) * len);
                if (counts.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) > counts.getOrDefault(word, 0)) {
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }
            if (j == num) {
            	ans.add(i);
            }
        }
        
		return ans;
	}

	public List<Integer> findSubstringExceeded(String s, String[] words) {
		List<Integer> ans = new LinkedList<Integer>();
		if (words.length == 0)
			return ans;
		int wordLen = words[0].length();
		int conLen = wordLen * words.length;
		int[] isCon = new int[words.length];
		for (int i = 0; i < isCon.length; i++) {
			isCon[i] = -1;
		}
		for (int i = 0; i < s.length() - conLen + 1; i++) {
			String sub = s.substring(i, i + conLen);
			int len = 0;
			for (int j = 0; j < sub.length(); j = j + wordLen) {
				for (int k = 0; k < words.length; k++) {
					if (isCon[k] != i && words[k].equals(sub.substring(j, j + wordLen))) {
						isCon[k] = i;
						len += k + 1;
						break;
					}
					if (k == words.length - 1)
						break;
				}
			}
			if (len * 2 == (words.length + 1) * words.length)
				ans.add(i);

		}

		return ans;
	}

}
