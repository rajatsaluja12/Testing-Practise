package javaConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class JavaHashmap {

	public static void main(String[] args) {
		
/*Java HashMap
  A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
  One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
  
  HashMap<String, String> capitalCities = new HashMap<String, String>();
 Add Items
The HashMap class has many useful methods. For example, to add items to it, use the put() method:
 		
 		
 */
		
		HashMap<String, String> capitalClass = new HashMap<String, String>();		
		capitalClass.put("England", "London");
		capitalClass.put("Germany", "Berlin");
		capitalClass.put("Norway", "Oslo");
		capitalClass.put("USA", "Washington DC");
		System.out.println(capitalClass);
//To access a value in the HashMap, use the get() method and refer to its key:	
		System.out.println(capitalClass.get("England"));
		
//To remove an item, use the remove() method and refer to the key:	
		System.out.println(capitalClass.remove("England"));
		
//To remove all items, use the clear() method:
	capitalClass.clear();

//To find out how many items there are, use the size() method:
	
	HashMap<String, String> Details = new HashMap<String, String>();		
	Details.put("Fname", "Rakshit");
	Details.put("L_name", "Saluja");
	Details.put("Address", "Kanpur");
	Details.put("Hobbies", "Travelling");
	System.out.println(Details);
	System.out.println(Details.size());
// Loop through hashmap
	for(Entry<String, String> personalDetail : Details.entrySet()) {
		System.out.println(personalDetail);
	}
	for(String personalDKey : Details.keySet()) {
		System.out.println(personalDKey);
	}
	for(String personalDValue : Details.values()) {
		System.out.println(personalDValue);
	}
	
	for(String personalsse:Details.keySet()) {
		System.out.println("key: "+personalsse+ " value: "+Details.get(personalsse) );
	}
	}

}
