package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class sublistconcept {

	public static void main(String[] args) {

		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

		System.out.println(arr1);

		ArrayList<Integer> sublist = new ArrayList<Integer>(arr1.subList(2,5));

		// start index inclusive
		//		end index exclusive

		System.out.println(sublist);

	}

}