package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicatesfromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,4,5,1,2,4,7,9));
		
		//Remove Duplciates Using LinekedHashSet
		
		LinkedHashSet l1 = new LinkedHashSet(arr1);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>(l1);
		
		System.out.println(arr2);
		
		System.out.println("Approach JDK 8 Using Steam");
		
		ArrayList<Integer> arr11 = new ArrayList<Integer>(Arrays.asList(1,2,4,5,1,2,4,7,9));
		
		List<Integer> JDK8Aapproach = arr11.stream().distinct().collect(Collectors.toList());
		
		System.out.println(JDK8Aapproach);
		

	}

}
