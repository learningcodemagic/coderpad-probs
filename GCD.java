package com.mphasis.gs;

public class GCD {

	public static void main(String[] args) {
		System.out.println(getGCD(0, 12));

	}

	public static int getGCD(int num1, int num2) {
		if (num1 == 0 || num2 == 0)
			return 0;

		if (num1 == num2)
			return num1;
		if (num1 > num2)
			return getGCD(num1 - num2, num2);
		else
			return getGCD(num1, num2 - num1);

	}
// try with another approach..
}
