package java_Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsinString {

	
	public static void findDuplicatewords(String str) {
		//split
		String words[] = str.split(" ");
		
		//create one hashmap
		Map<String, Integer> map = new HashMap<String, Integer>();
		// to check each word in the given array 
		
		for(String Wordd : words) {
			if(map.containsKey(Wordd)) {
				map.put(Wordd, map.get(Wordd)+1);
			}
			else {
				map.put(Wordd, 1);
			}	
		}
		//extracting all keyx of map - map :
		Set<String> wordsInString = map.keySet();
		//loop through all the words in map;
		for(String Wordd : wordsInString ) {
			if(map.get(Wordd)>1) {
				System.out.println(Wordd+ " "+map.get(Wordd));
			}
		}
		
		
	}
	
	public static void main(String[] args) {
	
		findDuplicatewords("This is so fascinating and this is so amazing");
		

	}
	

}
