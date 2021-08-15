package HashMapConcepts;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BasicsHashMap {

	public static void main(String[] args) {
		// HashMap - No order , stores values in key and value pair
		// Key cannot be duplicate
		//Allows storing multiple null values BUT ONLY 1 NULL KEY
		//HashMap is non Syncronized - NOT THREAD SAFE


		HashMap<String , String> map = new HashMap<String , String>();

		map.put("TEST1", "P1");
		map.put("TEST2", "P2");
		map.put("TEST3", "P3");
		map.put("TEST1", "P4");

		map.put(null, "P5");

		map.put(null, "P6");

		System.out.println(map.get("TEST1")); // iF THE KEY IS DUPLICATE THEN IT GIVES THE LATEST VALUE

		System.out.println(map.get("TEST2"));

		System.out.println(map.get(null)); // As only 1 null key can be stored in the HashMap hence it gives the latest value against the null key


		//Iterator over the keys : using keySet();
		System.out.println("Iterator Test for keys");
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key +" " +  value);

		}

		// Iterator over the set pair :using entrySet()

		Iterator<java.util.Map.Entry<String, String>> t1 = map.entrySet().iterator();

		while(t1.hasNext()) {

			java.util.Map.Entry<String, String> et =t1.next();
			System.out.println("Key is" + et.getKey() + "Value is " + et.getValue());

		}

		// Iterator usinG Java 8 and lambda

		System.out.println("USING LAMBDA");

		map.forEach((k,v) -> System.out.println( k + v));

	}


}


