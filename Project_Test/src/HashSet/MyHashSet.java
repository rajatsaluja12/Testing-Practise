package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {


		Set<String> hs = new LinkedHashSet<String>();

		hs.add("Test1");
		hs.add("Test2");
		hs.add("Test3");
		hs.add("Test4");
		hs.add("Test1");

		List<String> list = new ArrayList<>(hs);
		Collections.reverse(list);

		System.out.println(list);









	}

}
