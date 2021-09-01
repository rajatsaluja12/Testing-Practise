package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSyncronized {

	public static void main(String[] args) {


		List<String> syncronizedlist= Collections.synchronizedList(new ArrayList<String>());
		syncronizedlist.add("Java");
		syncronizedlist.add("Java1");
		syncronizedlist.add("Java2");

		// add and remove does not require syncronization
		// traverse the values



		synchronized (syncronizedlist) {

			Iterator<String> it = syncronizedlist.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}

		}

	}

}


