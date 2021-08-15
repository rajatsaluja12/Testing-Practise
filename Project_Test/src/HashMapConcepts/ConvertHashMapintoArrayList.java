package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ConvertHashMapintoArrayList {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();

		map1.put("1", "B1");
		map1.put("2", "B2");
		map1.put("3", "B3");

		map1.forEach((k, v) -> System.out.println(k + "=" + v));

		Iterator it = map1.entrySet().iterator();

		while (it.hasNext()) {

			Map.Entry<String, String> entry = (Entry<String, String>) it.next();

			String key1 = entry.getKey();
			String value1 = entry.getValue();
			System.out.println("Key is " + key1 + "=" + "Value is" + value1);

			// Converting the HashMap into ArrayList to get the keys list

			List<String> arr1 = new ArrayList<String>(map1.keySet());

			for (String str : arr1) {

				System.out.println("List of the Keys are" + str);

			}

			// Converting the HashMap into ArrayList to get the values list

			List<String> arr2 = new ArrayList<String>(map1.values());

			for (String str1 : arr2) {

				System.out.println("List of the VALUES are" + str1);

			}

		}

	}

}
