package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list= new LinkedList<>();
		
		list.add(25);
		list.add(12);
		list.add(9);
		list.add(35);
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		
		list.set(2, 18);
		
		System.out.println(list);
		System.out.println("Is the list empty = "+(list.isEmpty()));
		for(int i =0; i<list.size();i++)
		{
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
		list.addFirst(88);
		list.addLast(69);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		
		list2.add(35);
		list2.add(21);
		list2.add(45);
		list2.add(11);
		System.out.println(list2);
		
		list2.addAll(list);
		list2.clear();
		System.out.println(list2);

	}

}

/*
 *LinkedList internally uses a doubly headed linked list to store elements. 
 *Properties->
 *	a. It can add duplicate value.
 *	b. It maintains the insertion order.
 *	c. Values can be accessed randomly using the index.
 *	d. Faster than an array list if elements are updated. 
 *	e. More memory consuming than an array list. 
 *	
 *Scenario 1 - To store the products that a company offers. 
 *Scenario 2 - Company Database to store employee data. 
 *
 */
