package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList_Important {

	public static void main(String[] args) {
		//1 Sorting and Equals way

		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5));

		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1,22,4,5,6,7,33,50));

		System.out.println(arr1);

		System.out.println(arr2);

		Collections.sort(arr1);
		Collections.sort(arr2);

		System.out.println(arr1);

		System.out.println(arr2);
		
		System.out.println(arr1.equals(arr2));

		//2 Compare 2 list and find out the additional element present in arr3 which is not present in arr4
		
		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5));

		ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(1,22,4,5,6,7,33,50));
		
		arr3.removeAll(arr4);
		
		System.out.println(arr3);
		
		// Compare 2 list and find out the missing element in arr5 when compared with arr6
		
		ArrayList<Integer> arr5 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5));

		ArrayList<Integer> arr6 = new ArrayList<Integer>(Arrays.asList(1,22,4,5,6,7,33,50));
		
		arr6.removeAll(arr5);
		System.out.println(arr6);
		
		
		// Find out the common elements - Intersection of 2 arraylist
		
		ArrayList<Integer> arr7 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5));

		ArrayList<Integer> arr8 = new ArrayList<Integer>(Arrays.asList(1,22,4,5,6,7,33,50));
		
		arr7.retainAll(arr8);
		System.out.println(arr7);
		
		

		
		
		

	}

}