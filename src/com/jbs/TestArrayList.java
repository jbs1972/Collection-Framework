package com.jbs;

import java.util.ArrayList;
import java.util.List;

import com.jbs.models.Student;

/* <Collection>
 * -- Available methods:
 * 1. add
 * 2. addAll
 * 3. remove
 * 4. removeAll
 * 5. retainAll
 * 6. contains
 * 7. containsAll
 * 8. clear
 * 9. isEmpty
 * 10. size
 * 11. toArray
 * 12. iterator
 * -- Collection interface does not contain any method to retrieve object.
 * -- There is no concrete class which implements Collection interface directly.
 * 						^
 * 						|
 * <List>
 * -- Can use index.
 * -- Index oriented methods are:
 * 1. add(int index, Object obj)
 * 2. addAll(int index, Collection c)
 * 3. remove(int index)
 * 4. indexOf(Object obj)
 * 5. lastIndexOf(Object obj)
 * 6. get(int index)
 * 7. set(int index, Object obj)
 * 8. listIterator()
 * 
 * -- Implemented Classes: ArrayList, LinkedList, Vector, Stack
 * 
 * ArrayList
 * -- Autogrowable array
 * -- Duplicate allowed
 * -- Insersion order is preserved
 * -- Heteogeneous objects are allowed
 * -- null insersion is possible
 * 
 * N. B. Within collection framework there exists 2 classes that do not allow heterogeneous objects:
 * 				1. TreeSet
 * 				2. TreeMap
 * 			It is because the above 2 classes store the objects in sorted order. And to maintain the sorting 
 * 			algorithm, objects must be of same type or homogeneous.
 * 
 * Most important constructors of ArrayList:
 * 1. ArrayList() - 10 is the default initial capacity. In JDK 7 and above, newCapacity = oldCapacity + (oldCapacity >> 1) => 15
 * 2. ArrayList(int intialCapacity)
 * 3. ArrayList(Collection c)
 * 
 * -- The ArrayList and Vector class only implements RandomAccess maker interface and capable to handle their elements 
 * 	randomly. Hence If there is a chance of frequently access random elements then ArrayList is the best choice.
 * 
 * -- When ArrayList is the worst choice? - When frequently using add(int index, Object obj), as this method requires to shift 
 * 	the rest elements one room right to adjust the new element in specific index. This increases the time complexity. Similarly 
 * 	it is true for remove(int index).
 */
public class TestArrayList {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Arun Sen", "arun.sen@gmail.com"));
        students.add(new Student("Barun Dutta", "barun.dutta@gmail.com"));
        students.add(new Student("Kiran Sarkar", "kiran.sarkar@gmail.com"));

        System.out.println("Initial ArrayList: " + students);

        Student s1 = students.get(1);
        System.out.println("\n2nd student is: " + s1);

        // Change an element
        students.set(0, new Student("Mala Majumdar", "mala.majumdar@gmail.com"));
        System.out.println("\nUpdated ArrayList: " + students);

        // Remove an element
        students.remove(1);
        System.out.println("\nArrayList after removing 'Barun Dutta': " + students);
	}
}
