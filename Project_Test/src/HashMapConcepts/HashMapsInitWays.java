package HashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapsInitWays {

	public static Map<String,Integer> marks;

	static {

		marks = new HashMap<String,Integer>();

		marks.put("Test", 1);

		marks.put("Test2", 2);

		marks.put("Test3", 3);

	}

	public static void main(String[] args) {

		//1. Case Using HashMap Class

		HashMap<Integer,String> map1 = new HashMap<>();
		Map<Integer,String> map2 = new HashMap<>();


		// 2. Using static method
		System.out.println(HashMapsInitWays.marks.get("Test"));

		//3 Create a immutable map with only 1 single entry
		Map<String,Integer> map3 =Collections.singletonMap("Test1", 1);
		System.out.println(map3.get("Test1"));

		//map3.put("Baby", 2); // java.lang.UnsupportedOperationException


		// JDK 8 :

		//Creating 2D Array of Strings using stream and collecting in form map

		Map<String,String> map4 = Stream.of( new String [] [] {

			{"Test112","Baby112"},
			{"Test114","Baby114"}
		}).collect(Collectors.toMap(ele->ele[0], ele->ele[1]));
		System.out.println(map4.get("Test112"));

		Map <String , String> map5 = Stream.of(new String [] []

				{
			{"ABC","1"},
			{"PQR","2"}
				}

				).collect(Collectors.toMap(ele -> ele[0], ele ->ele[1]));
		System.out.println(map5.get("PQR"));


		// Using SimpleEntry Method  - Mutable map using streams
		// in this case once the map is initialize i can add more values like adding liza
		Map<String, String>  map6 = Stream.of(

				new AbstractMap.SimpleImmutableEntry<>("A","165"),
				new AbstractMap.SimpleImmutableEntry<>("B","2")

				).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));

		System.out.println(map6.get("A"));
		map6.put("LIZA", "3");
		System.out.println(map6.get("LIZA"));

		// JDK 1.9

		// EMPTY MAP gets created using Map.of(); method

		Map<String, String> emptyMap = Map.of();  // This returns empty map

		//emptyMap.put("1","pqr"); // Empty map cannot be initialised and this gives java.lang.UnsupportedOperationException
		System.out.println("1");


		//Creating map with multiple values
		//max 10 key value pair can be done only - using map.of() - this also creates immutable maps

		Map<String , Integer> map7 = Map.of("T1", 100, "T2", 2);
		System.out.println(map7.get("T1"));

		map7.put("TEST", 9);
		System.out.println(map7.get("TEST"));

		// Map.ofEnteries method - no limitations on the pair (key-value)
		//Map.ofEntries() - We can only create a immutable maps , once created we cannot cahnge

		Map<String,String> map8 = Map.ofEntries(

				new AbstractMap.SimpleEntry<>("100","K1"),
				new AbstractMap.SimpleEntry<>("200","K2"),
				new AbstractMap.SimpleEntry<>("300","K3")

				);

		System.out.println(map8.get("100"));
		//map8.put("900", "check");

		// Using guava library  FROM GOOGLE
		// Map<String,String> map9  = ImmutableMap.of("1","TEST");





	}

}
