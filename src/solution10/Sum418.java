package solution10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum418 {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList<>();
		int left, right, sum;
		for (int i = 0; i < nums.length - 3; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				for (int j = i + 1; j < nums.length - 2; j++) {
					if (j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])) {
						left = j + 1;
						right = nums.length - 1;
						sum = target - nums[j] - nums[i];
						while (left < right) {
							if (nums[left] + nums[right] == sum) {
								res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
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
			}
		}
		return res;
	}

}
