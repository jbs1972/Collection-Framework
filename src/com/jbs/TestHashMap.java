package com.jbs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* 	<Map>
 * 	  ^
 * 	  |
 * HashMap
 * 
 * About <Map>
 * ---------
 * -- Key-Value pair: Can map the key to a value.
 * -- A map cannot contain duplicate keys.
 * -- Do not guarantee any ordering on key-value pair.
 * -- Map utilize hashCode and equals methods on Key for get and put operations. 
 * 		So mutable classes are not a good fit for Map keys. If the values of hashCode 
 * 		or equals change after put, you won’t get the correct value in get operation.
 * 
 * -- Methods of Map
 * 	A. Object put(Object key, Object value) : is used to insert an entry in this map.
 * 	B. void putAll(Map map) : is used to insert the specified map in this map.
 * 	C. Object remove(Object key) : is used to delete an entry for the specified key.
 * 	D. Object get(Object key) : is used to return the value for the specified key.
 * 	E. boolean containsKey(Object key) : is used to search the specified key from this map.
 * 	F. boolean containsValue(Object value): returns true if there are at least 
 * 		one key mapped to the specified value, otherwise false.
 * 	G. Set keySet() : returns the Set view containing all the keys.
 * 	H. int size(): returns the number of key-value mappings in this Map.
 *  I. boolean isEmpty(): returns true if there are no mappings present, otherwise false.
 *  J. void clear(): removes all the mappings from the Map.
 *  K. Set<Map.Entry<K, V>> entrySet(): returns the Set view of the mappings in the Map. 
 *  	This Set is backed by Map, so any modifications in Map will be reflected in the 
 *  	entry set and vice versa.
 *  
 * -- HashMap and HashTable do not maintain any order.
 * -- TreeMap sort the entries in ascending order of keys.
 * -- LinkedHashMap maintains the insertion order.
 * 
 * -- First, the HashMap is initialized with an initial capacity of 16 and a load factor of 0.75.
 *
 * -- It is similar to the HashTable class except that it is unsynchronized and permits nulls
 * -- It may have one null key and multiple null values.
 */

class Product {
    private String productName;
    private double price;
    private int quantity;
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

public class TestHashMap {

	public static void main(String[] args) {
		// Creating a HashMap to store product information
        Map<String, Product> productMap = new HashMap<>();

        // Adding products to the inventory
        productMap.put("P101", new Product("Laptop", 899.99, 10));
        productMap.put("P102", new Product("Smartphone", 599.99, 20));
        productMap.put("P103", new Product("Headphones", 79.99, 50));
		
		System.out.println("HashMap size= " + productMap.size());

        // Retrieving and displaying product information
        String productId = "P102";
        if (productMap.containsKey(productId)) {
            Product product = productMap.get(productId);
            System.out.println("Product Information for ID " + productId + ":");
            System.out.println(product);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }

        // Updating product quantity
        if (productMap.containsKey("P101")) {
            Product laptop = productMap.get("P101");
            laptop.setQuantity(8);
        }

        // Displaying updated inventory
        System.out.println("\nUpdated Inventory:");
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Product: " + entry.getValue());
        }
		
		// Remove the content of the hashMap
		productMap.clear();

		// Check if the hashMap empty
		if (productMap.isEmpty()) {
			System.out.println("The hashMap is empty");
		}
	}
}
