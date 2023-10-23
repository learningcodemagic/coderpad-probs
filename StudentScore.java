package com.mphasis.gs;

import java.util.HashMap;
import java.util.Map;

public class StudentScore {

	/*
	 * public static void main(String[] str) { String[][] tc1 = { { "Bobby", "2" },
	 * { "Syam", "5" }, { "Bobby", "5" } };
	 * System.out.println(getBestAverageScore(tc1)); }
	 */

	public static int getBestAverageScore(String[][] scores) {

		// String [][] str= {{}};
		if (scores == null || scores.length == 0 || scores[0].length == 0) {
			return 0;
		}

		Map<String, Student> students = new HashMap<>();
		String name = "";
		double score = 0;
		int bestAvg = Integer.MIN_VALUE;
		int curAvg = 0;

		for (int i = 0; i < scores.length; i++) {
			name = scores[i][0];
			score = Integer.parseInt(scores[i][1]);
			//adding student record..
			Student stud = students.get(name);
			if (stud == null) {
				stud = new Student(0, 0);
				students.put(name, stud);
			}

			// logic for find average
			stud.count += 1;   //0+1
			stud.avg = (((stud.count - 1) * stud.avg) + score) / stud.count;

		}

		for (Map.Entry<String, Student> entry : students.entrySet()) {
			Student stud = entry.getValue();
			curAvg = (int) Math.floor(stud.avg);
			if (curAvg > bestAvg) {
				bestAvg = curAvg;
			}
		}
		return (int) bestAvg;
	}
}