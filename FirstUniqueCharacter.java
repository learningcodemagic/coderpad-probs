package com.mphasis.gs;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("aabcb"));
		// System.out.println(firstUniqChar("xxdsw"));
		// System.out.println(firstUniqChar("abcd"));
		// System.out.println(firstUniqChar(""));

	}

	public static char firstUniqChar(String s) {

		if (s == null || s == "") {
			return '1';
		}

		int[] charArr = new int[26];

		for (int i = 0; i < s.length(); i++) {

			charArr[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (charArr[ch - 'a'] == 1)
				return ch;
		}

		return '0';
	}

}
