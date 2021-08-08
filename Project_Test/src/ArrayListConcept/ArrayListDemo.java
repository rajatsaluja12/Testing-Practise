package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList is dynamic array
	
		// Below example is of static array
	/*	int i[] = new int[4];
		i[5]=7;
		System.out.println(i[5]); */
		
		//Arraylist default generics
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(4);
		ar.add("Testing");
		System.out.println(ar.get(1));
		//System.out.println(ar.get(-1)); // Negative index is not allowed , exception is thrown
		System.out.println(ar.size());
		//Whats is highest index - ar.size()-1
		ar.add(45);
		ar.add("Testing1");
		System.out.println(ar.size());
		

	}

}

