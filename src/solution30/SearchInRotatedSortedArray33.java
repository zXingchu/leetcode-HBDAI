package solution30;

public class SearchInRotatedSortedArray33 {

	public static int searchLowFirst(int[] nums, int target) {
		int lo = 0, hi = nums.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] > nums[hi])
				lo = mid + 1;
			else
				hi = mid;
		}
		int rot = lo;
		lo = 0;
		hi = nums.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			int realmid = (mid + rot) % nums.length;
			if (nums[realmid] == target)
				return realmid;
			if (nums[realmid] < target)
				lo = mid + 1;
			else
				hi = mid - 1;
		}
		return -1;
	}

	public static int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			long num = (nums[mid] < nums[0]) == (target < nums[0]) ? nums[mid]
					: target < nums[0] ? Long.MIN_VALUE : Long.MAX_VALUE;
			if (num > target) {
				right = mid - 1;
			} else if (num < target) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 8, 1, 2, 3 };
		int target = 8;
		System.out.println(search(nums, target));
	}

}
