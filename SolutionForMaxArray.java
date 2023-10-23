package com.mphasis.gs;

public class SolutionForMaxArray {

	public static void main(String[] args) {
		SolutionForMaxArray.runTests();
	}

	public static void runTests() {
		int[][] inputs = { { 1, 2, 3 }, { 6, 2, 9 }, {}, { 1 }, { 1, 2, 2 } };
		int[] expected = { 2, 40, -1, -1, 1 };
		boolean result = true;
		for (int i = 0; i < inputs.length; i++) {
			result &= expected[i] == maxProduct(inputs[i]);
		}
		if (result)
			System.out.println("All cases pass successfully");
		else
			System.out.println("One or more tests failed");
	}

	public static int maxProduct(int[] nums) {

		if (nums.length == 0 || nums.length == 1) {
			return -1;
		}
		int res = 0;
		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {
				int max_val = ((nums[i] - 1) * (nums[j] - 1));

				res = Math.max(res, max_val);

			}

		}

		return res;

	}
}