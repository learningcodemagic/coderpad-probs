package com.mphasis.gs;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = { 1, 3 };
		int[] num2 = { 2};
		System.out.println(findMedianSortedArrays(num1,num2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int arr[] = new int[nums1.length + nums2.length];
		int i = 0, n1 = 0, n2 = 0;
		while (i < arr.length) {
			if (n1 < nums1.length && n2 < nums2.length) {
				if (nums1[n1] < nums2[n2]) {
					arr[i++] = nums1[n1++];
				} else {
					arr[i++] = nums2[n2++];
				}
			} else {
				if (n1 < nums1.length) {
					arr[i++] = nums1[n1++];
				} else if (n2 < nums2.length) {
					arr[i++] = nums2[n2++];
				}
			}
		}
		if ((nums1.length + nums2.length) % 2 == 0) {

			double a = arr[(nums1.length + nums2.length) / 2] + arr[((nums1.length + nums2.length) / 2) - 1];
			return a / 2;
		} else {
			double a = arr[(nums1.length + nums2.length) / 2];
			return a;
		}
	}

}
