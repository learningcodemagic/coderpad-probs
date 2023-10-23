package com.mphasis.gs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestUniformSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "aaabbccddd";
		System.out.println(getLongestUniformSubString(inputString).toString());

		for (int str : getLongestUniformSubString(inputString)) {
			System.out.println(str);
		}

	}

	public static int[] getLongestUniformSubString(String strInput) {

		int longestStart = -1;
		int longestLength = 0;
		if (strInput == null || strInput.length() == 0) {
			return new int[] { longestStart, longestLength };
		}

		int stringLength = strInput.length();
		int count = 0;
		int charIndex = -1;
		int invalidIndex = -1;
		for (int i = 0; i < stringLength; i++) {

			if (strInput.charAt(i) == invalidIndex) {
				count++;
			} else {

				invalidIndex = strInput.charAt(i);
				charIndex = i;
				count = 1;
			}

			if (count > longestLength) {
				longestLength = count;

				longestStart = charIndex;
			}
		}
		System.out.println(strInput.substring(longestStart, longestLength));
		return new int[] { longestStart, longestLength };
	}

}
