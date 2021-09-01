package LinekdList;

import java.util.Comparator;
import java.util.TreeMap;

public class ReverseinTreeMap {

	public static void main(String[] args) {

		TreeMap< String, Integer> ts = new TreeMap<>(Comparator.reverseOrder());
		ts.put("test", 100);
		ts.put("test2", 200);

		System.out.println(ts);


	}

}
