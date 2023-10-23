package com.mphasis.gs;

import java.util.HashMap;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = { 1, 1, 1 };
		System.out.println(subarraySum(inputArr,2));
	}

	public static int subarraySum(int[] nums, int k) {
		int paths = 0;
		if (nums == null || nums.length == 0)
			return paths;
		HashMap<Integer, Integer> map = new HashMap<>();// n
		int total = 0;
		for (int i = 0; i < nums.length; i++) {// n
			total += nums[i];
			if (total == k) {
				paths++;
			}
			paths += map.getOrDefault(total - k, 0);
			map.put(total, map.getOrDefault(total, 0) + 1);
		}
		return paths;
	}
}
