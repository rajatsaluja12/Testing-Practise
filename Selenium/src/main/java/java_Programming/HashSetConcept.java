package java_Programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
	
		
		Set<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("testing");
		hs.add("Beta");
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.contains("testing"));
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		for(String e : hs) {
			System.out.println(e);
		}
		
		hs.remove("Beta");
		System.out.println(hs);
		
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,5,8,10,5,9}));
		System.out.println(first);
		
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,3,5,9,4,88,7}));
		System.out.println(second);
		
		//get the union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("--------------------------");
		
		//get the intersection
		
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		//get the difference 
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
		
	}

}
