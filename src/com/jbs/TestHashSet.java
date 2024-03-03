package com.jbs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.jbs.models.Student;

/*	HashSet
 *  -------
 * 					<Collection> 1.2v
 * 						 ^
 * 						 |
 * 					   <Set> 1.2v
 * 						 |
 * 			-----------------------------
 * 			^							^
 * 			|							|
 * 		 HashSet 1.2v              <SortedSet> 1.2v
 * 			^							^
 * 			|							|
 * 	  LinkedHashSet 1.4v		  <NevigableSet> 1.6v
 * 										^
 * 										|
 * 									 TreeSet
 * 
 * -- Underlying data structure is hashtable.
 * -- If duplicate added add(Object obj) returns false.
 * -- As the object are stored based on hashcode, hence search is in O(1).
 * -- If we use searching frequently then, HashSet is the best option.
 * 
 * -- Constructor:
 * 		1. HashSent() - Initial capacity = 16 and Fill ratio / Load factor = 0.75f
 * 				meaning: after filling 75% of its available rooms, then a new HashSet will be created.
 * 		2. HashSet(int initialCapacity)
 * 		3. HashSet(int initialCapacity, float loadFactor)
 * 		4. HashSet(Collection c)
 * 
 * -- Methods: same as Collection.
 * -- null allowed
 */

public class TestHashSet {
	public static void main(String args[]) {
		Set<Student> students = new HashSet<>();
		
		students.add(new Student("s1", "s1@gmail.com"));
		students.add(new Student("s2", "s2@gmail.com"));
		students.add(new Student("s3", "s3@gmail.com"));
		students.add(new Student("s4", "s4@gmail.com"));
		
		System.out.println();
		System.out.println("Initial elements:");
		for(Student std : students) {
			System.out.print(std);
		}
		
		students.add(new Student("s3", "s3@gmail.com"));
		students.add(null);
		students.add(null);
		students.add(new Student("s5", "s5@gmail.com"));
		
		System.out.println("\n");
		System.out.print("Modified elements:");
		Iterator<Student> itr = students.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		students.remove(new Student("s2", "s2@gmail.com"));
		
		System.out.println("\n");
		System.out.print("After removing elements:");
		for(Student std : students) {
			System.out.print(std);
		}
	}
}
