package com.mphasis.gs;

import java.util.Stack;

public class LongestHistogramRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {2,1,5,6,2,3};
		System.out.println(getLongestHistogram(heights));
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
			System.out.println( "Left Small : "+ st);
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
			System.out.println( "Right Small : "+ st);
		}
		
		//leftSmal = [0,0,2,3,2,5]
	//	rightsmat = [0,5,3,3,5,5]
		
		int maxA = 0;
		for (int i = 0; i < n; i++) {
			maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
		}
		return maxA;

	}


}
