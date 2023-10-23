package com.mphasis.gs;

public class LongestPalindromSubstringCount {

	public static void main(String[] args) {
		System.out.println(getLongestPalindromSubstringCount("anitinc"));

	}

	public static int getLongestPalindromSubstringCount(String str) {
		boolean[][] dp = new boolean[str.length()][str.length()];
		int len = 0;
		for (int gap = 0; gap < str.length(); gap++) {
			for (int i = 0, j = gap; j < str.length(); i++, j++) {
				if (gap == 0) {
					dp[i][j] = true;

				} else if (gap == 1) {
					if (str.charAt(i) == str.charAt(j)) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
					}

				} else {

					if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1] == true) {

						dp[i][j] = true;
					} else {
						dp[i][j] = false;

					}
				}
				if (dp[i][j]) {
					len = gap + 1;
					//System.out.println("SubString : " +  str.substring(j,len));
				}
			}
		}
		
		return len;
	}

}
