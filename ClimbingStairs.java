package com.mphasis.gs;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(4));

	}

	public static long climbStairs(int n) {
		long[] dp = new long[n];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 4;
		for (int i = 3; i < n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

		}
		return dp[n - 1];
	}

	/*
	
	Ways for calculating..
	1st steps  -->  1 no of ways
	2nd steps --->  2 no of ways
	3rd steps ---> 4 no no of ways
	*/
}
