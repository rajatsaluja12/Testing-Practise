package java_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;


public class SynchronizedArrayList {

	public static void main(String[] args) {

//1. Collections.synchronizedList		
		List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());
		nameslist.add("Java");
		nameslist.add("Python");
		nameslist.add("Ruby");
		
		// add , remove - we dont need explicit synchronization 
		
		// to fetch/traverse the values from the list - we have to use explicit synchronisation 
		
		synchronized (nameslist) {
			Iterator<String> it = nameslist.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		
// CopyonWriteArrayList -- it is a class: Thread Safe / synchronized alrady
	//	CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();
	//	emplist.add("Tom");
	//	emplist.add("Steve");
	//	emplist.add("Naveen");
		
// We dont need explicit synchronization for any operation : add/remove/traverse		
	//	Iterator<String> it = emplist.Iterator();
	//	while(it.hasNext()) {
	//		System.out.println(it.next());
		}
		
		
	}
	


