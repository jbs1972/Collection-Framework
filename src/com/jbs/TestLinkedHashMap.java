package com.jbs;

import java.util.LinkedHashMap;
import java.util.Map;

/* 	 HashMap
 * 	  	^
 * 	  	|
 * LinkedHashMap
 * 
 * -- Hash table and doubly linked list implementation of the Map interface, with predictable iteration order.
 * -- The implementation of LinkedHashMap is not synchronized. To manually make it synchronized use:
 * 		Map m = Collections.synchronizedMap(new LinkedHashMap(...));
 * -- When created using default constructor, Creates an empty LinkedHashMap with the default initial 
 * 		capacity (16) and load factor (0.75).
 * -- Just like HashMap, LinkedHashMap performs the basic Map operations of add, remove and contains in 
 * 		constant-time, as long as the hash function is well-dimensioned. It also accepts a null key as well as 
 * 		null values. However, this constant-time performance of LinkedHashMap is likely to be a little worse 
 * 		than the constant-time of HashMap due to the added overhead of maintaining a doubly-linked list.
 * -- LinkedHashMap is a great choice in scenarios where you need to maintain the order of elements in your map.
 */

public class TestLinkedHashMap {
	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        linkedHashMap.put(1, "First");
        
        System.out.println("After updating key 1:");
        
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
	}
}
