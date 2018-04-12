package solution10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum315 {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList<>();
		int left, right, sum;
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				left = i + 1;
				right = nums.length - 1;
				sum = 0 - nums[i];
				while (left < right) {
					if (nums[left] + nums[right] == sum) {
						res.add(Arrays.asList(nums[i], nums[left], nums[right]));
						while (left < right && nums[left] == nums[left + 1])
							left++;
						while (left < right && nums[right] == nums[right - 1])
							right--;
						left++;
						right--;
					} else if (nums[left] + nums[right] < sum)
						left++;
					else
						right--;
				}
			}
		}
		return res;
	}

	public List<List<Integer>> threeSum2(int[] nums) {
		if (nums.length < 3)
			return null;
		List<List<Integer>> re = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						// TODO repeat
						re.add(Arrays.asList(nums[i], nums[j], nums[k]));
					}
				}
			}
		}
		return re;
	}

}
