package com.mphasis.gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostVistedIPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("10.0.0.1 satish");
		list.add("10.0.0.2 Vinay");
		list.add("10.0.0.1 Deepa");
		list.add("10.0.0.4 ram");
		list.add("10.0.0.4 sita");
		list.add("10.0.0.3 sita");
		list.add("10.0.0.1 sita");

		System.out.println(countMostVisited(list));

	}

	public static String countMostVisited(ArrayList<String> list) {

		String result = null;
		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String element : list) {
			String[] ipArray = element.split(" ");
			Integer occurence = hm.get(ipArray[0]);
			hm.put(ipArray[0], (occurence == null) ? 1 : occurence + 1);
		}
		int max = Integer.MIN_VALUE;
		for (String ips : hm.keySet()) {
			if (max < hm.get(ips)) {
				max = hm.get(ips);
				result = ips;
			}

		}
		return result;

	}

}
