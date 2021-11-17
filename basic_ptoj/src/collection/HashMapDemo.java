package collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 *  Hash map-> Used to store elements data or value. 
 *  We store data in a hash map in the form of key value pairs. 
 *  In hash map we cannot have duplicate keys, but we can have duplicate values.
 *   
 */
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(0, "ITC");
		map.put(10, "Infotech");
		map.put(33, "is");
		map.put(999, "where");
		map.put(423, "I");
		map.put(501, "work.");
		map.put(null, "1");
		map.put(null, null);
		map.put(501, null);
		map.put(511, "directing");
		System.out.println(map);
		
		System.out.println(map.get(511));
		System.out.println(map.size());
//		
//		int key = 991;
//		if(map.containsKey(key)) {
//			System.out.println(map.remove(key));
//		}
//		System.out.println(map.keySet());
		
//		for(int key:map.keySet()) {
//			System.out.println(key+" : "+map.get(key));
//		}
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(map.values());

	}

}
