package ArrayListConcept;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizationwithCopyonWriteArrayList {

	public static void main(String[] args) {
		//threadsafe

		CopyOnWriteArrayList<String> ls = new CopyOnWriteArrayList<String>(Arrays.asList("Test1","Testing2"));

		ls.stream().forEach(ele-> System.out.println(ele));


		// second way
		Iterator<String> test= ls.iterator();
		while (test.hasNext()) {
			System.out.println(test.next());
		}

	}

}
