package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

//		ArrayList<Integer> arr = new ArrayList<>(); 
//		arr.add(25);
//		arr.add(5);
//		arr.add(66);
//		arr.add(33);
//		System.out.println(arr);
//		
//		Iterator it = arr.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		set.add(66);                   
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
	}

}
