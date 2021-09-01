package java_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListProgram_methods {

	public static void main(String[] args) {
		
		// Add two array list 
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("JavaScript");
		ar1.add("Ruby");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Dev Ops");
		
		//Adding both the arraylist
		ar1.addAll(ar2);
		System.out.println(ar1);
		
		// if you want to print/add another arraylist from a specific index no.
		
		ar1.addAll(2, ar2);
		System.out.println(ar1);
		
//to clear the arraylist or make an empty arraylist, we use clear();
		//ar1.clear();
		
		
//To print or get the clone arraylist do the following 
		
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
// contains to check that the value you are looking for is available in the arraylist of not. will return boolean value , true/false
		
		System.out.println(ar1.contains("Python"));
		
		System.out.println(ar1.indexOf("Ruby")>0); // this will also give you the boolean value , trur or false
		
// if you find the last index of any value in the arraylist then 
		
ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen","Tom", "Naveen","Lisa","Naveen"));

// if you try to find the value which is not present in the arraylist through LastIndexof , it will you -1 value but will not print any error or exception

//if you want to remove a specific value from a specific index, you can do it with remove() method

list1.remove(1);
System.out.println(list1);

//OR 

list1.remove("Lisa");
System.out.println(list1);


// RemoveIf
 // finding odd numbers 
ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
numbers.removeIf(num -> num%2==0);  // using lamba expression
System.out.println(numbers);

//finding even numbers

numbers.removeIf(num-> num%2==1);
System.out.println("Removing odd numbers"+numbers);

//RetainAll
ArrayList<String> nameslist = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Tom"));
System.out.println(nameslist);
nameslist.retainAll(Collections.singleton("Tom"));
System.out.println(nameslist);


// Sublist from the arraylist
ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));

ArrayList<Integer> sublist = new ArrayList<Integer>(numbers1.subList(2, 5));
System.out.println(sublist);

// Converting Arraylist into array 
ArrayList<String> newlist = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Robert"));

Object[] arr = newlist.toArray();
System.out.println(Arrays.toString(arr));

for(Object o : arr) {
	System.out.println(o);
	System.out.println((String)o); // if you want in string
}

	}

}
