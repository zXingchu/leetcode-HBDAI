package solution10;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {

	public int romanToInt(String s) {
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {
				if (i + 1 < s.length() && romanMap.get(s.charAt(i + 1)) > romanMap.get(s.charAt(i))) {
					result = result + romanMap.get(s.charAt(i + 1)) - romanMap.get(s.charAt(i));
					i++;
				} else
					result = result + romanMap.get(s.charAt(i));
			} else
				result = result + romanMap.get(s.charAt(i));
		}
		return result;
	}

	public int romanToInt2(String s) {
		int res = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			switch (c) {
			case 'I':
				res += (res >= 5 ? -1 : 1);
				break;
			case 'V':
				res += 5;
				break;
			case 'X':
				res += 10 * (res >= 50 ? -1 : 1);
				break;
			case 'L':
				res += 50;
				break;
			case 'C':
				res += 100 * (res >= 500 ? -1 : 1);
				break;
			case 'D':
				res += 500;
				break;
			case 'M':
				res += 1000;
				break;
			}
		}
		return res;
	}
}
