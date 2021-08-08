package ArrayListConcept;

import java.util.ArrayList;

public class GenericsArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//Integer decalared is awrraper class this , arraylist will allow only integer values
		arr.add(15);
		System.out.println(arr.get(0));
	}

}