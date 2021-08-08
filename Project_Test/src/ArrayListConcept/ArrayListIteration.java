package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Testing");
		arr.add("Testing2");
		arr.add("Testing3");
		arr.add("Testing4");
		// typical for loop

		for (int i=0; i<arr.size(); i ++) {
			System.out.println(arr.get(i));
		}

		//
		System.out.println("Approach 2");
		for (String s : arr) {
			System.out.println(s);
		}

		//
		System.out.println("Approach 3");

		arr.stream().forEach(ele->System.out.println(ele));

		//
		System.out.println("Approach 4");

		Iterator<String>s2=arr.iterator();
		while (s2.hasNext()) {
			System.out.println(s2.next());
		}

	}

}
