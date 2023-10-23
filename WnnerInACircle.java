package com.mphasis.gs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WnnerInACircle {

	public static void main(String[] args) {
		System.out.println(getWinnerNew(6, 4));

	}
	
	
	
	

	public static int getWinner(int n, int k) {

		Queue<Integer> qu = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {

			qu.offer(i);
		}
		System.out.println(qu);
		while (qu.size() != 1) {
			for (int j = 1; j <= k - 1; j++) {
				qu.offer(qu.poll());
				System.out.println(qu);
			}
			qu.poll();
		}
		System.out.println(qu);
		return qu.poll();
	}

	public static int getWinnerNew(int n, int k) {

		List<Integer> qu = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {

			qu.add(i);
		}
		System.out.println(qu);
		int index = 0;
		while (qu.size() != 1) {

			int rem = (index + k) % qu.size();
			index = rem - 1;
			if (rem == 0) {

				index = qu.size() - 1;
			}
			System.out.println(index);
			if (index >= 0) {
				qu.remove(index);
			}
//            0 1 2 3 4 5 
			//1 2 3 4 5 6
			//1 2 3 5 6
			//1 3 5 6
			//3 5 6
			//5 6
			/*
			 * for (int j = 1; j <= k - 1; j++) { qu.offer(qu.poll());
			 * System.out.println(qu); } qu.poll();
			 */

		}
		System.out.println(qu);
		return qu.get(0);
	}

}
