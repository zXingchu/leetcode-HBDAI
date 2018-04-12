package solution10;

public class ContainerWithMostWater11 {

	public int maxArea(int[] height) {
		int maxArea = 0;
		int i = 0, j = height.length - 1;
		while (i < j) {
			if (height[i] < height[j]) {
				maxArea = Math.max(maxArea, height[i] * (j - i));
				i++;
			} else {
				maxArea = Math.max(maxArea, height[j] * (j - i));
				j--;
			}
		}
		return maxArea;
	}

	public int maxArea2(int[] height) {
		int maxArea = 0;
		int temp = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				temp = height[i] > height[j] ? height[j] : height[i];
				temp *= (j - i);
				if (temp > maxArea) {
					maxArea = temp;
				}
			}
		}
		return maxArea;
	}

}
