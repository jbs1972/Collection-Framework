package com.jbs;

import java.util.Enumeration;
import java.util.Hashtable;

/* Dictionary<K,V>		Map<K,V>
 *        ^                ^
 *        |	               |
 *        ------------------
 *        		   |
 * 			Hashtable<K,V>
 * 
 * -- Uses a hash function to compute an index into an array of buckets, where the corresponding 
 * 		value can be found.
 * -- Hashtable is synchronized.
 * -- Hashtable was part of the original Java Collections framework and was introduced in Java 1.0. 
 * 		However, if a thread-safe implementation is not needed, it is recommended to use HashMap 
 * 		in place of Hashtable.
 * -- Doesn't allow null keys, unlike HashMap.
 * 
 * -- Constructors
 * 	A. Hashtable() - Constructs a new, empty Hashtable with a default initial capacity (11) 
 * 		and load factor (0.75).
 * 	B. Hashtable(int initialCapacity) - Constructs a new, empty Hashtable with the specified 
 * 		initial capacity and default load factor (0.75).
 * 	C. Hashtable(int initialCapacity, float loadFactor) - Constructs a new, empty Hashtable 
 * 		with the specified initial capacity and the specified load factor.
 * 	D. Hashtable(Map<? extends K,? extends V> t) - Constructs a new Hashtable with the same 
 * 		mappings as the given Map.
 * 
 * -- Most Important Methods:
 * 	A. put(K key, V value) - Adds a key-value pair to the Hashtable.
 * 	B. get(Object key) - Retrieves the value associated with the specified key.
 * 	C. remove(Object key) - Removes the key-value pair associated with the specified key.
 * 	D. containsKey(Object key) - Checks if the Hashtable contains the specified key.
 * 	E. containsValue(Object value) - Checks if the Hashtable contains the specified value.
 * 	F. keySet() - Returns a Set view of the keys contained in the Hashtable.
 * 	G. values() - Returns a Collection view of the values contained in the Hashtable.
 * 	H. entrySet() - Returns a Set view of the key-value mappings contained in the Hashtable.
 * 	I. isEmpty() - Checks if the hashtable is empty.
 * 	J. size() - Returns the number of key-value mappings in the Hashtable.
 * 	K. clear() - Removes all key-value mappings from the Hashtable.
 */

public class TestHashtable {
	public static void main(String[] args) {
		// Creating a HashTable
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();

		// Adding Key-Value pairs
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);

		// Displaying the HashTable
		System.out.println("Hashtable: " + numbers);

		// Checking for a specific key
		System.out.println("Does Hashtable contain 'Two'? " + numbers.containsKey("Two"));

		// Checking for a specific value
		System.out.println("Does Hashtable contain value '3'? " + numbers.contains(3));

		// Getting a value associated with a key
		System.out.println("Value associated with key 'Three': " + numbers.get("Three"));

		// Removing a Key-Value pair
		numbers.remove("Two");
		System.out.println("After removing 'Two': " + numbers);

		// Iterating over HashTable
		System.out.println("Iterating over Hashtable using Enumeration:");
		Enumeration<String> keys = numbers.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println("Key: " + key + ", Value: " + numbers.get(key));
		}

		// Checking size of HashTable
		System.out.println("Size of Hashtable: " + numbers.size());

		// Clearing the HashTable
		numbers.clear();
		System.out.println("After clearing: " + numbers);
	}
}
