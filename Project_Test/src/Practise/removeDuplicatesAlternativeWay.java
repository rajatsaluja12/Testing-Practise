package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicatesAlternativeWay {

	public static void main(String[] args) {

		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(1,2,3,44,5,5,6,2,4,9,6));

		//JDK 8 Using stream

		List<Integer> distinctList = ls.stream().distinct().collect(Collectors.toList());
		Collections.sort(distinctList);
		System.out.println(distinctList);


		// Alternative Approach - using LinkedHashSet

		LinkedHashSet<Integer> hs = new LinkedHashSet<>(ls);

		for (Integer l : hs) {
			System.out.print(l);
			System.out.print(" , ");
		}




	}

}
