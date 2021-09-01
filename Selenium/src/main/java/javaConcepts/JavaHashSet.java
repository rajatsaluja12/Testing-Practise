package javaConcepts;

import java.util.HashSet;

public class JavaHashSet {

	public static void main(String[] args) {

/*
A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
Create a HashSet object called cars that will store strings: 
		
 */
		 HashSet<String> cars = new HashSet<String>();		
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    System.out.println(cars);
//Check If an Item Exists : To check whether an item exists in a HashSet, use the contains() method:
		    
		    cars.contains("Mazda");
		    
//Remove an Item : To remove an item, use the remove() method:
		    cars.remove("Volvo");
		    
//To remove all items, use the clear() method:
		    cars.clear();
		    
//To find out how many items there are, use the size method:
		    
		    cars.size();
		    
//Loop Through a HashSet
		    
		    for (String i : cars) {
		    	  System.out.println(i);
		    	}	    
		    
	}

}
