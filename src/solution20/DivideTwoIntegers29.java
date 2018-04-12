package solution20;

public class DivideTwoIntegers29 {

	public int divide(int dividend, int divisor) {

		if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
			return Integer.MAX_VALUE;

		boolean sign = true;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
			sign = false;
		long dvd = Math.abs((long) dividend);
		long dvs = Math.abs((long) divisor);

		int ans = 0;
		while (dvd >= dvs) {
			long temp = dvs, multiple = 1;
			while (dvd >= (temp << 1)) {
				temp <<= 1;
				multiple <<= 1;
			}
			dvd -= temp;
			ans += multiple;
		}
		return sign ? ans : -ans;
	}

}
