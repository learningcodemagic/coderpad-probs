package com.mphasis.gs;



public class SumOfTwoFractions {

	public static void main(String[] args) {
		int[] input1 = { 1, 4 };
		int[] input2 = { 3, 10};

		System.out.println(getSumOfTwoFractions(input1, input2));

	}
	
	public static boolean doTestsPass() {
		SumOfTwoFractions sumOfTwoFractions  =  new SumOfTwoFractions();
		
	
		return sumOfTwoFractions.equals(getSumOfTwoFractions(new int[] {1,8},new int[] {1,4}));
	  }

	public static int[] getSumOfTwoFractions(int[] fraction1, int[] fraction2) {
		int numerator = 0, denominator = 0;
		if (fraction1.length <= 0 || fraction2.length <= 0) {
			return new int[] { numerator, denominator };
		}
		if (fraction1[1] == 0 || fraction2[1] == 0) {
			
			return new int[] { numerator, denominator };
		}
		if (fraction1[1] == fraction2[1]) {
			numerator = fraction1[0] + fraction2[0];
			denominator = fraction1[1];
		}

		else {
			numerator = fraction1[0] * fraction2[1] + fraction1[1] * fraction2[0];
			denominator = fraction1[1] * fraction2[1];

		}

		int greatestFactors = getGCD(numerator, denominator);

		System.out.println("(" + numerator / greatestFactors + " / " + denominator / greatestFactors + ")");
		return new int[] { numerator / greatestFactors, denominator / greatestFactors };
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
}
