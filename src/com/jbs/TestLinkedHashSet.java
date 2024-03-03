package com.jbs;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.jbs.models.Student;

/* LinkedHashSet
 * -------------
 * -- Duplicates are not allowed
 * -- Insertion order is preserved
 * -- Best fit for cache based application
 */

public class TestLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Student> students = new LinkedHashSet<>();
		
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
