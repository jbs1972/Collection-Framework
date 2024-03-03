package com.jbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
* Cursors in Java collection framework.
* -- Purpose to access one by one objects from the collection.
* 
* 1. Enumeration
* --------------
* -- Enumeration is the first iterator that was introduced in Java 1.0 version. It is located in java.util package. 
* 	It is a legacy interface that is implemented to get elements one by one from the legacy collection classes 
* 	such as Vector and Properties.
* -- There are many limitations of using enumeration interface in java. They are as follows:
* 		1. Enumeration concept is applicable for only legacy class. Hence, it is not a universal cursor.
* 		2. We can get only read operation by using the enumeration. We cannot perform the remove operation.
* 		3. We can iterate using enumeration only in the forward direction.
* 		4. Java is not recommended to use enumeration in new projects.
* -- To overcome these limitations, We should go for the next level Iterator concept in Java.
* -- N. B.
* 		In Java, the Enumeration interface was part of the original java.util package, and it was used with classes 
* 	like Vector and Hashtable which are considered as legacy classes now. These classes have their own methods 
* 	to return an Enumeration of their elements.
*   	However, with the introduction of the Collections Framework in Java 1.2, newer classes like ArrayList, 
*   HashSet, etc., were introduced which do not have their own methods to return an Enumeration. Instead, 
*   they have Iterator and ListIterator which are more powerful and safer than Enumeration.
* 		But for backward compatibility, and to allow newer collection classes to interoperate with older code 
* 	that expects an Enumeration, the Collections class provides a utility method enumeration(Collection c). 
* 	This method returns an Enumeration object over the specified collection.
* 
* 2. Iterator
* -----------
* -- Iterator in Java is used in the Collections Framework to retrieve elements sequentially (one by one). 
* 	It is called universal Iterator or cursors.
* -- The Collection interface extends Iterable interface that is present at the top of the collection hierarchy.
* -- Relationship between Iterator and Iterable::
* 		An Iterable object is an object which one can get an Iterator from. The Iterator can then be used to 
* 	sequentially loop through the elements in the Iterable. The Iterable interface is part of the java.lang package 
* 	whereas the Iterator interface is part of the java.util package.
* -- We can perform both read and remove operations.
* -- Iterator has the following limitations or drawbacks. They are as:
* 		1. By using Enumeration and Iterator, we can move only towards forwarding direction. 
* 		We cannot move in the backward direction. Hence, these are called single-direction cursors.
* 		2. We can perform either read operation or remove operation.
* 		3. We cannot perform the add or replacement of new objects.
* 
* 3. ListIterator
* ---------------
* -- It is the most powerful iterator or cursor that was introduced in Java 1.2 version. It is a bi-directional cursor.
* AVAILABLE METHODS::
* A. Forward direction:
*	1. public boolean hasNext()
*	2. public Object next()
*	3. public int nextIndex()
* B. Backward direction:
*	4. public boolean hasPrevious()
*	5. public Object previous()
*	6. public int previousIndex()
* C. Other capability methods:
*	7. public void remove(): This method removes the last element returned by next() or previous() from the list.
*	8. public void set(Object o): This method replaces the last element returned by next() or previous() with the new element.
*	9. public void add(Object o): This method is used to insert a new element in the list.
*-- ListIterator is the most powerful cursor but it also has limitations as follows:
*	A. Java List Iterator is applicable only for list implemented class objects. 
*		Therefore, it is not a universal Java cursor.
*	B. ListIterator can be slower than Iterator while iterating over a list of elements 
*		in the forward direction only.
*/
public class TestCollectionCursors {
	// Enuemration on legacy class
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
        vector.add("JAVA");
        vector.add("JSP");
        vector.add("SERVLET");
        vector.add("SPRINGBOOT");

        // Create Enumeration
        Enumeration<String> enumeration = vector.elements();

        System.out.println("The Enumeration elements are: ");
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
	}
	
	// Enumeration on non-legacy classes
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//        list.add("JAVA");
//        list.add("JSP");
//        list.add("SERVLET");
//
//        // Create Enumeration
//        Enumeration<String> enumeration = Collections.enumeration(list);
//
//        System.out.println("The Enumeration elements are: ");
//        while(enumeration.hasMoreElements()) {
//            System.out.println(enumeration.nextElement());
//        }
//	}

	// Iterator
//	public static void main(String args[]) {
//		ArrayList<Integer> al = new ArrayList<Integer>(); 
//		for(int i = 1; i <= 5; i++) {  
//			al.add(i); 
//		} 
//		System.out.println(al);
//		
//		Iterator<Integer> itr = al.iterator(); 
//		while(itr.hasNext()) { 
//			Integer i = itr.next();
//			System.out.println(i); 
//			if(i % 2 != 0) {
//				itr.remove(); 
//			}
//		} 
//		System.out.println(al); 
//	} 
	
	// ListIterator
//	public static void main(String[] args) {	
//		List < String > list = new ArrayList < > ();
//		
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		System.out.println("List: " + list);
//
//		System.out.println();
//		ListIterator < String > listIterator = list.listIterator();
//
//		System.out.println("Forward Direction Iteration:");
//		while (listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
//		listIterator.add("E"); // Adds an element before the iterator position.
//		System.out.println();
//		System.out.println(list);
//		System.out.println();
//
//		System.out.println("Backward Direction Iteration:");
//		while (listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}
//		listIterator.set("J"); // It will update the last element returned by previous.
//		System.out.println();
//		System.out.println(list);
//	}
}
