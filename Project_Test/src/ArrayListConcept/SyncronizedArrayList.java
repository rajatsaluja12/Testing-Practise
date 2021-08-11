package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;



public class SyncronizedArrayList {

	public static void main(String[] args) {
		List<String> testing = Collections.synchronizedList(new ArrayList<String>(Arrays.asList("Test1","Test2","Test3")));

		// Note - while we add , remove - we don't need Explicit syncronization
		// Note - while fetch/traverse the value - we need Explicit syncronization

		synchronized (testing) {
			Iterator<String> itr = testing.iterator();

			while (itr.hasNext()) {
				System.out.println(itr.next());

			}

		}

		// copyOnWriteArrayList - Option 2
		//No explict syncronization is required
		CopyOnWriteArraySet<String> testing2 = new CopyOnWriteArraySet<String>(Arrays.asList("Testing1","Testing2"));

		Iterator itr1 =testing2.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}




	}

}