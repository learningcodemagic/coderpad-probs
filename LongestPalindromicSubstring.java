package com.mphasis.gs;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindromSubString("abab"));

	}

	public static String longestPalindromSubString(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		int start = 0;
		int end = 0;

		for (int i = 0; i < str.length(); i++) {
			int lengthSingleCharacter = exploreFromCenter(str, i, i); // Single character in the middle.
			int lengthTwoCharacters = exploreFromCenter(str, i, i + 1); // Two characters in the middle .

			int length = Math.max(lengthSingleCharacter, lengthTwoCharacters);

			if (length > end - start ) {
				start = i - ((length - 1) / 2);
				end = i + (length / 2);
			}
		}
		return str.substring(start, end + 1);
	}

	private static int exploreFromCenter(String s, int left, int right) {

		if (s == null || left > right)
			return 0;

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
			System.out.println(" value for right and left  :  " + (right +" :  "+ left ));
		}
		System.out.println(" lenght :  " + (right - left - 1));
		return right - left - 1;
	}

}
