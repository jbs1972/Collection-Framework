package com.jbs;

import java.util.LinkedList;

import com.jbs.models.Student;

/* LinkedList
 * -- Implemented by Doubly Linked List.
 * -- Best choice when insertion and deletion is required in an intermediate position of the List. 
 * 	Because if we do the same operation on an ArrayList, several shift operation will take place 
 * 	to adjust rest of the elements after the element being inserted or deleted - which increases 
 * 	the time complexity.
 * -- When LinkedList not to use?
 * 	LinkedList do not have index for its elements and hence always start searching form the first 
 * 	node, but with ArrayList indexed search can be performed in constant time. Then if there is 
 * 	requirement of frequent searching the Linked is not the suitable option.
 * -- Preserve the insertion order.
 * -- Capable to hold heterogeneous objects.
 * -- null insertion is allowed.
 * -- Allow duplicates.
 * -- Serializable and Clonable.
 * 
 * -- Extra methods are available to support Stack and Queue data structures.
 * 	1. void addFirst(Object obj)
 * 	2. void addLast(Object obj)
 * 	3. Object getFirst()
 * 	4. Object getLast()
 * 	5. Object removeFirst()
 * 	6. Object removeLast()
 * 
 * -- Important constructors:
 * 	1. LinkedList()
 * 	2. LinkedList(Collection c)
 */

public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("s1", "s1@gmail.com"));
        students.add(new Student("s2", "s2@gmail.com"));
        students.add(new Student("s3", "s3@gmail.com"));

        System.out.println("Initial ArrayList: " + students);

        Student s1 = students.get(1);
        System.out.println("\n2nd student is: " + s1);
        
        students.addFirst(new Student("s4", "s4@gmail.com"));;

        // Change an element
        students.set(3, new Student("s5", "s5@gmail.com"));
        System.out.println("\nUpdated ArrayList: " + students);

        // Remove an element
        students.removeLast();
        System.out.println("\nArrayList after removing last student: " + students);
	}
}
