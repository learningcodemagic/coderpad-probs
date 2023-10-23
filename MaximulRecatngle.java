package com.mphasis.gs;

import java.util.Stack;

public class MaximulRecatngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
		System.out.println(maximalRectangle(matrix));
	}

	public static int maximalRectangle(char[][] matrix) {
		if (matrix.length == 0)
			return 0;
		int maxArea = 0;
		int row = matrix.length;
		int col = matrix[0].length;
		int[] dp = new int[col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				dp[j] = matrix[i][j] == '1' ? dp[j] + 1 : 0;
			}
			// treating dp[j] as histogram, solving max area problem there and updating the
			// max area
			maxArea = Math.max(maxArea, getLongestHistogram(dp));
		}
		return maxArea;
	}

	public static int getLongestHistogram(int[] heights) {
		int n = heights.length;
		Stack<Integer> st = new Stack<>();
		int[] leftSmall = new int[n];
		int[] rightSmall = new int[n];
		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
				st.pop();
			}

			if (st.isEmpty())
				leftSmall[i] = 0;
			else
				leftSmall[i] = st.peek() + 1;
			st.push(i);
			System.out.println("Left Small : " + st);
		}

		while (!st.isEmpty())
			st.pop();

		for (int i = n - 1; i >= 0; i--) {
			while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
				st.pop();
			}

			if (st.isEmpty())
				rightSmall[i] = n - 1;
			else
				rightSmall[i] = st.peek() - 1;

			st.push(i);
			System.out.println("Right Small : " + st);
		}
		int maxA = 0;
		for (int i = 0; i < n; i++) {
			maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
		}
		return maxA;

	}

}
