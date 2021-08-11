package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> arr1 = new ArrayList<String>(20);
		arr1.add("Testing1");
		arr1.add("Testing2");
		arr1.add("Testing3");
		arr1.add("Testing4");
		arr1.add("Testing5");


		ArrayList<String> arr2 = new ArrayList<String>(20);
		arr1.add("Java1");
		arr1.add("Java2");
		arr1.add("Java3");
		arr1.add("Java4");
		arr1.add("Java5");

		//arr1.addAll(arr2);
		//System.out.println(arr1);

		// To clear the arraylist
		//arr1.clear();
		//System.out.println(arr1);

		// Clone new arraylist
		System.out.println("---Testing Clone--");

		ArrayList<String> Newclonelist=(ArrayList<String>)arr1.clone();
		System.out.println(Newclonelist);

		System.out.println(arr1.contains("Testing1"));
		System.out.println(arr1.contains("testing1"));

		//This checks the index of the element added and hence returns boolean value
		System.out.println(arr1.indexOf("Testing4")>0);



		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("LIZA","Rajat","CHECK","BABY","Rajat"));
		System.out.println(list1);
		System.out.println(list1.lastIndexOf("LIZA"));
		System.out.println(list1.lastIndexOf("BABY"));
		System.out.println(list1.lastIndexOf("Rajat"));
		System.out.println(list1.lastIndexOf("Rajat1")); // When no element is present and user tries to find the last of in the array it returns -1

		//Remove value on basis of index
		list1.remove(2);
		System.out.println(list1);

		list1.remove("LIZA");
		System.out.println(list1);

		// To print the only the odd number from the arraylist using remove if and lambda function
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(111,222,333,444,555));
		list2.removeIf(ele -> ele%2 == 0);
		System.out.println(list2);

		// To print only the even numberfrom the arraylist using remove if and lambda function
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		number.removeIf(ele -> !(ele%2 == 0));
		System.out.println(number);

		ArrayList<String> list11 = new ArrayList<String>(Arrays.asList("LIZA1","Rajat1","CHECK1","BABY1","Rajat1"));
		System.out.println(list11);


		// This will only print the selected in Collections.singleton
		ArrayList<String> list12 = new ArrayList<String>(Arrays.asList("Test1","teST2","Test3","Test1"));
		list12.retainAll(Collections.singleton("Test1"));
		System.out.println(list12);

		// How to get the sublist from the main list - end index is exclusive
		ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> sublist1 = new ArrayList<Integer>(number1.subList(2, 6));
		System.out.println(sublist1);

		ArrayList<String> list114 = new ArrayList<String>(Arrays.asList("LIZA1","Rajat1","CHECK1","BABY1","Rajat1"));
		Object arr14[] = list114.toArray();

		//Converting object array to String
		Arrays.toString(arr14);
		System.out.println(Arrays.toString(arr14));
		

		for (Object str : arr14) {
			System.out.println("Testing Object"+str);
		}


	}


}