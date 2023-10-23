package com.mphasis.gs;

public class Testing {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub char[] input = {'h','e','l','l','o'};
		 * System.out.println(reverseString(input));
		 */
		
		System.out.println("Hello World");
		float f = 22.0f;
		float f2 = 7.0f;
		float f3 = 3.142858f;
		double d = 22.0;
		double d2 = 7.0;
		double d3 = d/d2;
		//double d = 98.9;
		System.out.println(f3 + " ---- " +d3);
			System.out.println(d);
		System.out.println((f3 > d3)  + " ====== "+(d3 > f3) + "---- " +(f3==d3) );
		
	}

	
	//98.9000009900 ---- 98.987987983749874
	
	
	public static char[] reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		while (left <= right) {
			char c = s[left];
			s[left] = s[right];
			s[right] = c;
			left++;
			right--;
		}
		return s;

	}
	

}
