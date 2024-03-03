package com.jbs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* Comparable & Comparator
 * -----------------------
 * 
 * -- Comparable meant for default sorting order.
 * -- Comparator meant for customized sorting order.
 * 
 * -- 		Comparable is basically used to compare instance of the classes which implements 
 * 		Comparable interface.
 * --		Comparator object is capable to compare two instances of classes which are not 
 * 		its own instance.
 * 
 * -- Comparator allows customized sorting on multiple data members of a class.
 * -- Comparator resides in java.util package.
 * -- Methods in Comparator:
 * 		A. public int compare(Object obj1, Object obj2)
 * 			Most important. 
 * 				i) returns -ve if obj1 comes before obj2.
 * 				ii) returns +ve if obj1 comes after obj2.
 * 				iii) returns 0 if obj1 and obj2 are equal. 
 * 		B. public boolean equals(Object obj)
 * 			Dummy method. If not implemented then, the default version is used from the Object class. 
 * 
 */

class DecendingIntegerComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
//		return i1.compareTo(i2); // Ascending order
//		return -i1.compareTo(i2); // Descending order
//		return i2.compareTo(i1); // Descending order
//		return -i1.compareTo(i2); // Ascending order
//		return 1; // Insertion order preserved, and duplicate detection logic not available. 
		return -1; // Reverse of insertion order, and duplicate detection logic not available.
//		return 0; // Only the first element will be inserted, remaining items will be considered as duplicate.
	}
}

public class TestTreeSet_v3 {
	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<>(new DecendingIntegerComparator());
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(20);
		ts.add(20);
		System.out.println(ts); // Display the elements in descending order.
	}
}