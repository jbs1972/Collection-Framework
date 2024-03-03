package com.jbs;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*    <Map>
 * 		^
 *      |
 *  <SortedMap>
 *      ^
 *      |
 * <NevigableMap>
 *      ^
 *      |
 * 	 TreeMap
 * 
 * -- Implemented using red-black tree data structure.
 * -- A red-black tree is a self-balancing binary search tree. Basic operations like search, 
 * 		get, put and remove take logarithmic time O(log n).
 * -- Like HashMap and LinkedHashMap, a TreeMap is not synchronized.
 * -- Unlike HashMap, TreeMap does not allow duplicate keys.
 * -- Compared to HashMap, TreeMap has slower insertion and retrieval times due to the sorting overhead.
 * -- 
 */

class Contact {
    private String name;
    private String phoneNumber;
    
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return "Contact{name='" + name + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

public class TestTreeMap {
	public static void main(String[] args) {
        // Creating a TreeMap to store contacts (sorted by name in ascending order)
        TreeMap<String, Contact> addressBookAsc = new TreeMap<>(Comparator.naturalOrder());
        
        addContacts(addressBookAsc);
        // Displaying contacts in ascending order
        System.out.println("Address Book (Sorted by Name in Ascending Order):");
        displayContacts(addressBookAsc);

        // Creating a TreeMap to store contacts (sorted by name in descending order)
        TreeMap<String, Contact> addressBookDesc = new TreeMap<>(Comparator.reverseOrder());
        addContacts(addressBookDesc);
        // Displaying contacts in descending order
        System.out.println("\nAddress Book (Sorted by Name in Descending Order):");
        displayContacts(addressBookDesc);
    }
    private static void addContacts(TreeMap<String, Contact> addressBook) {
        addressBook.put("John Doe", new Contact("John Doe", "123-456-7890"));
        addressBook.put("Alice Smith", new Contact("Alice Smith", "987-654-3210"));
        addressBook.put("Bob Johnson", new Contact("Bob Johnson", "555-123-4567"));
    }
    private static void displayContacts(TreeMap<String, Contact> addressBook) {
        for (Map.Entry<String, Contact> entry : addressBook.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
