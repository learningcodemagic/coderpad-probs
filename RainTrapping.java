package com.mphasis.gs;

import java.util.Stack;

public class RainTrapping {

	public static void main(String[] args) {

		//int[] heights = { 3, 1, 2, 4, 0, 1, 3, 2 };
		int[] heights = {0,1,2,4,6,8,0};

		System.out.println(getLongestHistogram(heights));
	}

	public static int getLongestHistogram(int[] heights) {
		int n = heights.length;
		Stack<Integer> st = new Stack<>();
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = heights[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], heights[i]);

		}
		right[n - 1] = heights[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], heights[i]);
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += Math.min(left[i], right[i]) - heights[i];
		}
		return res;

	}

}
