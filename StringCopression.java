package com.mphasis.gs;

public class StringCopression {

	public static void main(String[] args) {
		String str = "ab";
		// System.out.println(compression1(str));

		System.out.println("------------------");
		System.out.println(compression2(str));

	}

	public static String compression2(String strInput) {
		String firstCharcterOfString = strInput.charAt(0) + "";
		int count = 1;
		for (int i = 1; i < strInput.length(); i++) {
			char current = strInput.charAt(i);
			char previous = strInput.charAt(i - 1);
			if (current == previous) {
				count++;
			} else {

				if (count > 0) {
					firstCharcterOfString += count;

					count = 1;
				}
				firstCharcterOfString += current;
			}
		}

		if (count > 0) {
			firstCharcterOfString += count;

			count = 1;
		}
		return firstCharcterOfString;
	}
}
