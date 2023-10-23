package com.mphasis.gs;

public class RoboticProblem {

	public static void main(String[] args) {
		System.out.println(getFinalPositionofRobot("UU1R"));
		System.out.println(getFinalPositionofRobot("URL"));
		System.out.println(getFinalPositionofRobot("LUR"));
		System.out.println(getFinalPositionofRobot("LR"));

	}

	public static String getFinalPositionofRobot(String directions) {
		int len = directions.length();
		if (len <= 0 || directions == null) {
			return "(0,0)";
		}
		int countUp = 0, countDown = 0, countLeft = 0, countRight = 0;
		for (int i = 0; i < len; i++) {
			if (directions.charAt(i) == 'U' || directions.charAt(i) == 'u') {
				countUp++;
			} else if (directions.charAt(i) == 'D' || directions.charAt(i) == 'd') {
				countDown++;
			} else if (directions.charAt(i) == 'R' || directions.charAt(i) == 'r') {
				countRight++;
			} else if (directions.charAt(i) == 'L' || directions.charAt(i) == 'l') {
				countLeft++;
			}

			else {
				return "Please provide the valid Positions Input..";
			}

		}
		return "(" + (countRight - countLeft) + ", " + (countUp - countDown) + ")";
	}

}
