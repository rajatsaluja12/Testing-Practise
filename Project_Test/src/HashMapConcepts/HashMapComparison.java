package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparison {

	public static void main(String[] args) {

		HashMap<Integer , String> map1 = new HashMap<Integer , String>();

		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");


		HashMap<Integer , String> map2 = new HashMap<Integer , String>();

		map2.put(2, "B");
		map2.put(1, "A");
		map2.put(3, "C");


		HashMap<Integer , String> map3 = new HashMap<Integer , String>();

		map3.put(2, "B");
		map3.put(1, "A");
		map3.put(3, "C");
		map3.put(3,"D");



		HashMap<Integer , String> map4 = new HashMap<Integer , String>();

		map4.put(2, "B");
		map4.put(1, "A");
		map4.put(3, "C");
		map4.put(4,"E");

		// To find out the extra key b/w map 1 & map 4 using Hashset

		HashSet<Integer> hs1 = new HashSet<Integer>(map1.keySet());
		hs1.addAll(map4.keySet());
		hs1.removeAll(map1.keySet());
		System.out.println("Extra key is " + hs1);


		// Compare HashMap using Values

		//Duplicates are not allowed

		HashMap<Integer,String> map5 = new HashMap<Integer,String>();
		map5.put(7, "Ramesh");
		map5.put(8, "Harish");
		map5.put(9, "JJ");

		HashMap<Integer,String> map6 = new HashMap<Integer,String>();
		map6.put(10, "Ramesh");
		map6.put(11, "Harish");
		map6.put(12, "JJ");


		HashMap<Integer,String> map7 = new HashMap<Integer,String>();
		map7.put(10, "Ramesh");
		map7.put(11, "Harish");
		map7.put(12, "JJ");
		map7.put(13, "JJ");

       System.out.println(new HashSet<String> (map5.values()).equals(new HashSet<String> (map7.values())));

       System.out.println(new ArrayList<String> (map5.values()).equals(new ArrayList<String> (map7.values())));


	}

}
