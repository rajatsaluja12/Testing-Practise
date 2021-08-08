package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacityofArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		System.out.println(arr.size()); // arr.size method give physical capacity
		
		System.out.println(arr.size()); 
		arr.add(100);
		arr.add(200);
		arr.add(600);
		System.out.println(arr.size()); 
		//Default virtual capacity is 10
		
		//To increase the virtual capcacity at the time of declaration
		ArrayList<Object>arr1 = new ArrayList<Object>(20);
		arr1.add(500);
		System.out.println(arr1.size());
		
	}

}
