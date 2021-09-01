package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
/*
LinkedList is a default class in Java
It can be used as list, static, Queue
It allows the null entry
Dynamic collection
hence insertion and detection can be easily implemented 
it can contain duplicate elements 
it is not synchronized(not thread safe)	
In LinkedList, Manipulation is fast because we don't need any shifting 

LinkedList Constructor :

//LinkedList();
//LinkedList(Collection c);

*/

		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size());
		names.add("Tom");
		names.add("Naveen");
		names.add("Robby");
		names.add("Robby");
		names.add("Lisa");
		
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(1));
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		names.add(4,"Steve");
		System.out.println(names);
		
		names.add(2,"Ram");
		System.out.println(names);
		
		LinkedList<String> users = new LinkedList<String>();
		
		users.add("Peter");
		users.add("Trump");
		
		names.addAll(users);
		System.out.println(names);
		
		
		
		
		

	}

}
