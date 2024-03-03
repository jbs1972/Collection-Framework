package com.jbs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*	Problem
 * -- String sorting
 * 		1. Primarily sort by String size in descending order.
 * 		2. If have same length then sort alphabetically.
 */

class MySortingComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		if (o1.length() < o2.length()) {
			return 1;
		} else if (o1.length() > o2.length()){
			return -1;
		} else {
			return o1.compareTo(o2);
		}
	}
}

public class TestTreeSet_v5 {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>(new MySortingComparator());
		ts.add("A");
		ts.add("ABC");
		ts.add("AA");
		ts.add("XX");
		ts.add("ABCD");
		ts.add("A");
		System.out.println(ts);
	}
}
