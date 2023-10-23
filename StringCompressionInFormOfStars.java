package com.mphasis.gs;

public class StringCompressionInFormOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCompressedString("aaaaaaaa"));

	}

	
	// ababcababcd
	// FIS =  a
	//SEIS = b
	
	
	//res =  ab*c*d
	
	public static String getCompressedString(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}

		int n = s.length();
		String res = "";

		int totalLen = 0, half = 0;
		String firstPart = "", secondPart = "";

		int i = n - 1;  //10
		while (i >= 1) { //9 //4 // 3
			totalLen = i + 1;  //5 ///4 //2 
			half = totalLen / 2; ///2  2  // 1

			firstPart = s.substring(0, half);
			secondPart = s.substring(half, totalLen);

			if (firstPart.equals(secondPart)) {
				res = "*" + res;
				i = half - 1;
			} else {
				res = s.charAt(i) + res; // d
				i -= 1;
			}
		}

		res = s.charAt(0) + res;
		return res;
	}
}
