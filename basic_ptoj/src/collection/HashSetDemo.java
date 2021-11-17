package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		set.add(66);
		System.out.println(set);
		
		set.remove(55);//Can't pass index but use value to remove
		System.out.println(set);
		
		set.add(null);//allow to add null values
		System.out.println(set);
		
		System.out.println(set.contains(22));

	}

}

/*
 * HashSet internally uses Hash Table for storing values. 
 * Elements in the HashSet are stored on the basis of Hash Code. 
 */
