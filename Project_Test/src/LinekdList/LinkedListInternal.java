package LinekdList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInternal {

	public static void main(String[] args) {
		//LL is the default class in the Java
		//It can be used as List , Stack , Queue
		// it allows null values
		// dynamic collection
		// insertion and deletion is easily possible due to pointers
		// it can contain duplicate elements
		// it is not syncronized
		// it is fast as it does not require shifting like static arrays
		// it maintains doubly linked list internally

		LinkedList<String> ls1 = new LinkedList<>();
		System.out.println(ls1.size());


		ls1.add("Tom");
		ls1.add("Rajat");

		System.out.println(ls1.size());
		System.out.println(ls1);

		ls1.addFirst("CHECK");
		System.out.println(ls1);

		ls1.addLast("test1");
		System.out.println(ls1);


		ls1.remove(2);
		System.out.println(ls1);

		ls1.removeFirst();
		System.out.println(ls1);

		ls1.removeLast();
		System.out.println(ls1);

		ls1.clear();
		System.out.println(ls1);

		LinkedList<String> ls2 = new LinkedList<>();
		ls2.add("Test1");
		ls2.add("Test2");
		ls2.add("Test3");
		ls2.add("Test4");

		// Print the list in reverse order


		Iterator<String> it = ls2.descendingIterator();

		while (it.hasNext()) {
			String s = it.next();

			System.out.println(s);
		}

		Collections.sort(ls2);
		System.out.println(ls2);



	}

}
