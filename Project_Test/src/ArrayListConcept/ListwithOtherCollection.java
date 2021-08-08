package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ListwithOtherCollection {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10,20,30,50));
		System.out.println(arr);
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("Python","Java"));
		System.out.println(arr1);
		System.out.println(arr1.size());
	}

}
