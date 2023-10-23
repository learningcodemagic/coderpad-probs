package com.mphasis.gs;

public class ArrayRotaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInput =  {1,2,3,4,5,6,7};
		//System.out.println(rotate(arrInput,3));
		
		for(int i: arrInput) {
			System.out.print(i+",");
		}
		//System.out.println();

	}

	public void rotate(int[] arr, int k) {
		if (k > arr.length) {
			k = k % arr.length;
		}
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k, arr.length - 1);
	}

	public static int[] reverseArray(int[] arrInput, int startIndex, int endIndex) {

		while (startIndex < endIndex) {

			int temp = arrInput[startIndex];
			arrInput[startIndex] = arrInput[endIndex];
			arrInput[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		return arrInput;

	}
}
