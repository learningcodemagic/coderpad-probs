package com.mphasis.gs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondMinimumNumberInArray {

	public static void main(String[] args) {

		Integer[] arr = {};

		System.out.println(getSecMinimumNub(arr));

	}

	public static String getSecMinimumNub(Integer[] arr) {

		if (arr.length < 1 || arr.length == 0) {
			return "INVALID INPUT";
		}
		List<Integer> arrayList = Arrays.asList(arr);
		Collections.sort(arrayList);

		if (arrayList.size() > 1)
			return String.valueOf(arrayList.get(1));

		return "INVALID INPUT";
	}
}
