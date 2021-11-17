package collection;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		/*
		 * ArrayList is a class implementing list interface. 
		 * Used to store and manipulate elements and data. 
		 * ArrayList is just a dynamic array (no need to worry on size).
		 * 
		 * Operations on ArrayList
		 * 	a. Add or remove elements
		 * 	b. Inserting elements at specific index. 
		 * 	c. Get the elements at specific index. 
		 * 
		 * Properties of ArrayList
		 * 	a. It can add/store duplicate values.
		 * 	b. The order of insertion is maintained.
		 * 	c. Size is not fixed it is dynamic.
		 * 	d. If an element is removed all elements after that are shifted to left by one index.  
		 * */
		
		ArrayList<Integer> arr = new ArrayList<>(); 
		arr.add(25);
		arr.add(5);
		arr.add(66);
		arr.add(33);
		System.out.println(arr);
		
		System.out.println(arr.remove(2));
		System.out.println(arr);
		
		arr.set(1, 11);
		System.out.println(arr);
		
		
		System.out.println(arr.get(1));
		
		ArrayList<String> arrString = new ArrayList<>();
		arrString.add("Hello");
		arrString.add("my");
		arrString.add("name");
		arrString.add("is");
		arrString.add("Java");
		System.out.println(arrString);
		
	}

}
