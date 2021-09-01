package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test1HashMap {

	public static void main(String[] args) {

		HashMap <String,String> map = new HashMap<String,String>();
		map.put("Testing", "ABE");
		map.put("Testing1", "ABE1");
		map.put("Testing2", "ABE2");
		map.put("Testing3", "ABE3");

		// Iterate using using lambda function

		map.forEach((k,v)->System.out.println(k+v));


		// Iterate using keySet

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);

			System.out.println("Key is" +key + "Value is" + value);
		}

		// Iterate using entrySet

		Iterator<Entry<String, String>> t1 = map.entrySet().iterator();

		while (t1.hasNext()) {

			Entry<String, String>et = t1.next();

			System.out.println(et.getKey() + et.getValue());
		}


	}

}
