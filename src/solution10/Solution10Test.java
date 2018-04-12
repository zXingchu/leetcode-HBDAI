package solution10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution10Test {

	@Test
	void testIsMatch() {
		String s = "ab";
		String p = ".*C";

		assertEquals(false, new RegularExpressionMatching10().isMatch(s, p));
	}

	@Test
	void testMaxArea() {
		int[] height = { 1, 1 };
		assertEquals(1, new ContainerWithMostWater11().maxArea(height));
	}

	@Test
	void testRomanToInt() {
		String s = "DCXXI";
		String p = "CXIM";

		assertEquals(621, new RomanToInteger13().romanToInt(s));
		assertEquals(1109, new RomanToInteger13().romanToInt(p));
	}
	
	@Test
	void testLongestCommonPrefix() {
		String[] s = {"ac","ac","a","a"};

		assertEquals("a", new LongestCommonPrefix14().longestCommonPrefix(s));
	}

}
