package com.mphasis.gs;

public class PowerOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTen(5));
		System.out.println(isPowerOfTen(100));
	}

	public static boolean isPowerOfTen(int num) {
		//System.out.println(100/10);
		if (num == 1 || num == 10) {
			return true;
		}
		if (num == 0 || num % 10 != 0) {

			return false;
		}

		return isPowerOfTen(num / 10);

	}

}
