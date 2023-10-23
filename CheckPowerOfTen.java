package com.mphasis.gs;

public class CheckPowerOfTen {

	public static void main(String[] args) {
		System.out.println("1 " + isPowerOfTen(9));
	}

	public static boolean isPowerOfTen(long number) {

		double val = Math.log10(number); // O(1)
		System.out.println(val);
		System.out.println((int) val);
		if (val ==(int) val) //3.0
			return true;
		return false;
	}

	/*
	 * if (number == 10) { return true; } if (number % 10 != 0 || number == 0) {
	 * return false; } return isPowerOfTen(number/10); }
	 */

}
