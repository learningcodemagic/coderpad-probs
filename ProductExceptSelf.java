package com.mphasis.gs;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 3, 4 };
		System.out.println(productExceptSelf(input).toString());
	}
//24,12,8,6
	// 1,1,2,6
	//24,12,4,1
	
	public static int[] productExceptSelf(int[] nums) {

		int[] prodLeft = new int[nums.length];
		int[] prodRight = new int[nums.length];
		int[] answer = new int[nums.length];

		prodLeft[0] = 1;
		prodRight[nums.length - 1] = 1;

		for (int i = 1; i < nums.length; i++) {
			prodLeft[i] = prodLeft[i - 1] * nums[i - 1];
			prodRight[nums.length - 1 - i] = prodRight[nums.length - i] * nums[nums.length - i];
		}
		for (int k = 0; k < nums.length; k++) {
			answer[k] = prodLeft[k] * prodRight[k];
		}
		return answer;
	}
}
