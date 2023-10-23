package com.mphasis.gs;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 540;
		System.out.println(primeFactors(n));
	}

	public static ArrayList<Integer> primeFactors(int n) {
		List<Integer> list = new ArrayList<Integer>();
		// Print the number of 2s that divide n
		while (n % 2 == 0) {
			//System.out.print(2 + " ");
			list.add(2);
			n /= 2;
		}

		// n must be odd at this point. So we can
		// skip one element (Note i = i +2)
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			// While i divides n, print i and divide n
			while (n % i == 0) {
				list.add(i);
				//System.out.print(i + " ");
				n /= i;
			}
		}

		// This condition is to handle the case when
		// n is a prime number greater than 2
		if (n > 2)
			list.add(n);
		
		return (ArrayList<Integer>) list;
	}
}
