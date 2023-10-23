package com.mphasis.gs;

public class FirstUniqueCharacterInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("loveleetcode"));
	}

	public static int firstUniqChar(String s) {
		if (s == null) {

			return -1;
		}
		int ans = Integer.MAX_VALUE;
		for (char i = 'a'; i <= 'z'; i++) {
			int ind = s.indexOf(i);
			System.out.println(s.lastIndexOf(i));
			if (ind != -1 && ind == s.lastIndexOf(i))
				ans = Math.min(ans, ind);
		}
		if (ans == Integer.MAX_VALUE)
			return -1;
		return ans;
	}

}
