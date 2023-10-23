package com.mphasis.gs;

public class ProductSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4 };
		System.out.println(getProductResult(input));
		for (int element : getProductResult(input)) {
			System.out.println(element);
		}
	}

	public static int[] getProductResult(int[] input) {
		int[] result = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			int pro = 1;
			for (int j = 0; j < input.length; j++) {
				if (i != j) {
					pro = pro * input[j];

				}
			}
			result[i] = pro;
		}

		return result;

	}

	public static int[] OptimalSolution() {
		
		//int[] leftArray = 
		return new int[] {};
	}

}
