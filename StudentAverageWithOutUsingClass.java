package com.mphasis.gs;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class StudentAverageWithOutUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] scores = { { "Bob", "87" }, { "Mike", "35" }, { "Bob", "52" }, { "Jason", "35" }, { "Mike", "55" },
				{ "Jessica", "99" } };

		System.out.println(getBestAverage(scores));

	}

	public static int getBestAverage(String[][] scores) {
		if (scores.length == 0 || scores == null) {
			return -1;

		}
		int heighestScore = Integer.MIN_VALUE;
		Map<String, List<Integer>> student = new HashMap<>();
		for (int i = 0; i < scores.length; i++) {

			List<Integer> scoreList = student.get(scores[i][0]);
			if (scoreList == null) {

				List<Integer> currentScore = new ArrayList<Integer>();
				currentScore.add(Integer.valueOf(scores[i][1]));
				student.put(scores[i][0], currentScore);

			} else {
				scoreList.add(Integer.valueOf(scores[i][1]));

				student.put(scores[i][0], scoreList);
			}

		}

		for (Map.Entry<String, List<Integer>> entry : student.entrySet()) {
			int averageScore = getAvgScore(entry.getValue());

			heighestScore = Math.max(averageScore, heighestScore);
		}

		return heighestScore;
	}

	private static int getAvgScore(List<Integer> scores) {

		int len = scores.size();
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		float avgScore = sum / len;

		return (int) avgScore;

	}

}
