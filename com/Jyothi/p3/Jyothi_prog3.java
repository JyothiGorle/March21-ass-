package com.Jyothi.p3;
/*CustomMap Implementation: Create a class named CustomMap that implements the Map interface. Override the put() and get() methods
 *  to provide a custom implementation. The put() method should store the key-value pair in a custom data structure 
 *  (e.g., a list or an array) and the get() method should retrieve the value associated with the given key from the custom 
 *  data structure. Ensure that your implementation adheres to the contract defined by the Map interface. 
 *  Test your CustomMap implementation by creating instances of CustomMap, adding key-value pairs, and retrieving values 
 *  using the get() method. Also, ensure that your implementation handles edge cases such as handling null keys and values 
 *  appropriately. Additionally, you can write unit tests to verify the correctness of your implementation.
 */
/*
 * author:Jyothi
 */
import java.util.*;

import com.Jyothi.cls3.CustomMap;
public class Jyothi_prog3{
	public static void main(String args[]) {
		CustomMap ob=new CustomMap();
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 190);
		map.put("China", 200);
		map.put("US", 50);
		ArrayList<String> keys = ob.keySet();
		for(int i=0; i<keys.size(); i++) {
		System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
		}

		map.remove("India");
		System.out.println(map.get("India"));
}
}
