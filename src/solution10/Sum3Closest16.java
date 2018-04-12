package solution10;

import java.util.Arrays;

public class Sum3Closest16 {

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int res = 0;
		if (nums.length > 2)
			res = nums[0] + nums[1] + nums[2];
		else
			return 0;
		int left, right, sum;
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				left = i + 1;
				right = nums.length - 1;
				while (left < right) {
					sum = nums[i] + nums[left] + nums[right];
					if (sum == target) {
						return target;
					} else if (sum < target) {
						while (left < right && nums[left] == nums[left + 1])
							left++;
						left++;
					} else {
						while (left < right && nums[right] == nums[right - 1])
							right--;
						right--;
					}
					if (Math.abs(res - target) > Math.abs(sum - target)) {
						res = sum;
					}
				}
			}
		}
		return res;
	}

}
