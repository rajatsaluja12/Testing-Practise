package javaConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {
		
/*Java Iterator
 
 An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
 It is called an "iterator" because "iterating" is the technical term for looping.
 
 To use an Iterator, you must import it from the java.util package.

Getting an Iterator
The iterator() method can be used to get an Iterator for any collection:
	  
		  
*/
ArrayList<String> Detailslist = new ArrayList<String>();
Detailslist.add("Volvo");
Detailslist.add("BMW");
Detailslist.add("Ford");
Detailslist.add("Mazda");
Iterator<String> it = Detailslist.iterator();
System.out.println(it.next());
while(it.hasNext()) {
	System.out.println(it.next());
}

/*Removing Items from a Collection
 
 Iterators are designed to easily change the collections that they loop through. The remove() method can remove items from a collection while looping.

 */

ArrayList<Integer> number = new ArrayList<Integer>();
number.add(12);
number.add(18);
number.add(25);
number.add(24);
number.add(26);
Iterator<Integer> itt = number.iterator();
while(itt.hasNext()) {
	Integer ii = itt.next();
	if(ii<10) {
		itt.remove();
	}
}

System.out.println(number);
	}

}
