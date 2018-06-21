package solution30;

public class NextPermutation31 {
	
	
	public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

	public static void nextPermutationMy(int[] nums) {
		int temp = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				for (int j = nums.length - 1; j >= i; j--) {
					if (nums[j] > nums[i - 1]) {
						temp = nums[i - 1];
						nums[i - 1] = nums[j];
						nums[j] = temp;
						for (int k = i; k < (nums.length + i) / 2; k++) {
							temp = nums[k];
							nums[k] = nums[nums.length - k + i - 1];
							nums[nums.length - k + i - 1] = temp;
						}
						return;
					} else {
						continue;
					}

				}
			} else {
				continue;
			}
		}
		for (int i = 0; i < nums.length / 2; i++) {
			temp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1] = temp;
		}

	}

}
