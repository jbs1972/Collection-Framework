package com.jbs;

import java.util.Enumeration;
import java.util.Vector;

/*	Vector
 * -- Thread safe class more or less identical to the ArrayList.
 * -- Two important methods:
 * 		1. size() - Number of objects currently available.
 * 		2. capacity() - Total number of objects that can be accommodate.
 * 
 * -- Constructors:
 * 	A. Vector() - Created with 10 rooms and extended by the formula: newCapacity} = oldCapacity +  (oldCapacity >> 1)
 * 	B. Vector(int initialCapacity)
 * 	C. Vector(int initialCapacity, int incrementalCapacity) - Exm. new Vector(1000, 100) then extended like 1000, 1100, 1200...
 * 	D. Vector(Collection c)
 */

public class TestVector {
	public static void main(String[] args) {
		// A new vector with size = 4, increment = 2.
		// It is meant for HETEROGENEOUS objects and hence does not have any generic definition.
	    Vector myVector = new Vector(4, 2);

	    System.out.println("Initial size: " + myVector.size());
	    System.out.println("Initial capacity: " + myVector.capacity()); // Initial capacity: 4

	    myVector.addElement(new String("Java"));
	    myVector.addElement(new String("C++"));
	    myVector.addElement(new String("Python"));
	    myVector.addElement(new String("Javascript"));

	    System.out.println("Capacity after four additions: " + myVector.capacity()); // Capacity after four additions: 4
	    
	    // Since, the size, and capacity are now equal,
	    // Addition of one more element will increase the capacity by 2.
	    myVector.addElement(100);
	    
	    System.out.println(
	      "Capacity after one more addition: " + myVector.capacity()
	    ); // Capacity after one more addition : 6

	    myVector.addElement(2.0);
	    myVector.addElement(72);
	    
	    System.out.println("Capacity after two more additions: " + myVector.capacity()); // Capacity after two addition: 8

	    System.out.println("Final Vector = " + myVector);
	}
}
