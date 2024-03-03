package com.jbs;

import java.util.TreeSet;

import com.jbs.models.Student;

/* 			<Set>
 * 			  ^
 * 			  |
 * 		  <sortedSet>
 * 
 * -- Duplicates are not allowed, and some sorting order will there.
 * -- Default sorting order for numbers - ascending.
 * -- Default sorting order for String - dictionary order.
 * 
 * 		100, 101, 103, 104, 107, 110, 115
 * 
 * -- Methods:
 * 		A. first() => 100
 * 		B. last() => 115
 * 		C. headSet(104) => [100, 101, 103] i.e. the elements that are less than 104
 * 		D. tailSet(104) => [104, 107, 110, 115] i.e. the elements that are greater than or equals to 104
 * 		E. subSet(103, 110) => [103, 104, 107, 110] i.e. returns the elements which are >=103 and <=110
 * 		F. comparator() => Returns the comparator used to order the elements in this set, 
 * 							or null if this set uses the natural ordering of its elements.
 * 
 * 	TreeSet Part-1
 *  --------------
 *  -- Underlying data structure is balanced tree.
 *  -- Duplicates are not allowed.
 *  -- Insertion order is not preserved but elements are listed in some sorted order.
 *  -- Do not allow heterogeneous objects, when encountered throws ClassCastException.
 *  -- null is accepted but only once.
 *  N. B. If you try to insert null in a non-empty TreeSet, it will confuse the TreeSet where to palce 
 *  	the null and for that reason gives NullPointerException. But if the tree is empty, the null 
 *  	value will be accepted happily as its first member. But there after if you try to insert 
 *  	some other elements to the TreeSet, then the same problem will come up again and will give us 
 *  	NullPointerException again.
 *  
 *  -- Constructors:
 *  	A. TreeSet() - In this case elements will be inserted in default natural sorting order.
 *  	B. TreeSet(Comparator c) - In this case elements will be inserted in some custom sorting order.
 *  	C. TreeSet(Collection c)
 *  	D. TreeSet(SortedSet ss)
 *  
 *  -- Comparator Interface
 *  If you try to run the following code segment::
 */

public class TestTreeSet_v1 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Student("Arun Sen", "arun.sen@gmail.com"));
		ts.add(new Student("Barun Dutta", "barun.dutta@gmail.com"));
		ts.add(new Student("Kiran Sarkar", "kiran.sarkar@gmail.com"));
		System.out.println(ts);

	}
}

/*
 * You will get the following exception
 * Exception in thread "main" java.lang.ClassCastException
 * Clarification and solution on the next part
*/