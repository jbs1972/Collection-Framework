package com.jbs;

import java.util.TreeSet;

import com.jbs.models.Student;

/*  TreeSet - Part 2
 *  ----------------
 *  We got the exception in the previous example because, Student class has not implemented the Comparable 
 *  interface or you have not provided a Comparator to the TreeSet during its instantiation.
 *	If you rely on default constructor, object must be homogeneous under comparable.
 *
 *-- <Comparable> - For default sorting order.
 *  Properties of Comparable interface.
 * 	1. Belong to java.lang package
 * 	2. Has only one method - compareTo()
 * 			Syntax: public int compareTo(object obj) Exm. obj1.compareTo(obj2)
 * 			Returning values -
 * 				A. return -ve iff obj1 comes before obj2
 * 					Exm. "A".compareTo("Z") => -ve
 * 				B. return +ve iff obj1 comes after obj2
 *  				Exm. "Z".compareTo("A") => +ve
 * 				A. return 0 iff obj1 and obj2 are equal
 *  				Exm. "A".compareTo("A") => 0
 *   			Extra. "A".compareTo(null) NullPointerException
 *   
 */

public class TestTreeSet_v2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(new Student("Mala Majumdar", "mala.majumdar@gmail.com"));
		ts.add(new Student("Arun Sen", "arun.sen@gmail.com"));
		ts.add(new Student("Kiran Sarkar", "kiran.sarkar@gmail.com"));
		ts.add(new Student("Barun Dutta", "barun.dutta@gmail.com"));
		
		System.out.println(ts);
	}
}