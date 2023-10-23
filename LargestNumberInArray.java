package com.mphasis.gs;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1,2,3 };
		System.out.println(largestNumber(input));

	}

	public static String largestNumber(int[] nums) {
		int n = nums.length;
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = String.valueOf(nums[i]);
		}
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String a = s1 + s2;
				String b = s2 + s1;
				System.out.println("a = " + a + " & b = " + b);
				return b.compareTo(a);
			}
		};

		Arrays.sort(str, comp);
		System.out.println(Arrays.toString(str));
		StringBuilder ans = new StringBuilder("");
		for (String s : str)
			ans.append(s);

		if (ans.charAt(0) == '0')
			return "0";

		return ans.toString();
	}
}
