package arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int target = 8;
		twoSum(nums, target);
	}

	public static int[] twoSum(int[] nums, int target) {

		int a = 0;
		int b = 0;
		for (int n = 0; n < nums.length; n++) {
			int diffOfTarget = nums[n] - target;
			diffOfTarget = Math.abs(diffOfTarget);
			for (int j = n + 1; j < nums.length; j++) {
				if (nums[j] == diffOfTarget) {
					a = n;
					b = j;
					break;
				}
			}
		}
		System.out.println(a + "" + b);
		return new int[] { a, b };

	}

}
