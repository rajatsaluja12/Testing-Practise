package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {

		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("TEST1", "baby1");
		map1.put("TEST2", "baby2");
		map1.put("TEST3", "baby3");

		// create syncronized map
		Map<String,String> map4 = Collections.synchronizedMap(map1);
		System.out.println(map4);

		map4.forEach((k ,v) -> System.out.println(k + v));

		//Concurrent HashMap Class : It does not throw any ConcurrentModificationException

		ConcurrentHashMap<String,String> cmap = new ConcurrentHashMap<String,String>();
		cmap.put("B1", "L1");
		cmap.put("B2", "L2");
		cmap.put("B3", "L3");

		System.out.println(cmap.get("B1"));
		
		




	}

}
