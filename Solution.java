package com.mphasis.gs;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Solution.runTests();
	}

	public static void runTests() {
		String[][] inputs = { { "James", "70" }, { "Mark", "80" }, { "Bash", "75" }, { "Mark", "86" } };
		int expected = 83;

		if (expected == getAverage(inputs))
			System.out.println("All cases pass successfully");
		else
			System.out.println("One or more tests failed");
	}

	public static int getAverage(String[][] scores) {
		// Complete the below method
		if (scores == null || scores.length == 0 || scores[0].length == 0) {

			return -1;
		}

		String name = "";
		int score = 0;
		int bAvg = Integer.MIN_VALUE;

		int total = 0;
		Map<String, Integer> std = new HashMap<>();

		for (int i = 0; i < scores.length; i++) {
			int count = 1;
			name = scores[i][0];
			score = Integer.parseInt(scores[i][1]);

			if (std.get(name) == null) {

				std.put(name, score);

			} else {

				total = score + std.get(name);
				count += 1;

				// currentAvg = total/count;
				total =  total / count;

				
				std.put(name, total);
			}

		}

		for (Map.Entry<String, Integer> entry : std.entrySet()) {
			
			if (bAvg < entry.getValue()) {
				bAvg = entry.getValue();

			}

		}

		return bAvg;

	}

}
