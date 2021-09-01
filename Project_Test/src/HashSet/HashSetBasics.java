package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {


		Set<Integer> s = new HashSet<Integer>();
		s.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10}));

		Set<Integer> s2 = new HashSet<Integer>();

		s2.addAll(Arrays.asList(1,14,15,20));

		// to get the union
		Set<Integer> union = new HashSet<Integer>(s);

		union.addAll(s2);
		System.out.println(union);


		// to get the intersection
		Set<Integer> intersection = new HashSet<Integer>(s);
		intersection.retainAll(s2);
		System.out.println(intersection);


		// to get the missing element
		Set<Integer> diff = new HashSet<Integer>(s);
		diff.addAll(s2);
		diff.removeAll(s2);
		System.out.println(diff);



	}

}
