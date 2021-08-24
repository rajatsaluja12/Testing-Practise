package Practise;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
// Duplicate words in the string
public class FindoutDuplicatesinString {

	public static void main(String[] args) {

		String test = "This sentence contains two words, one and two";

		duplicateWords(test);

		System.out.println("input" + test);
		System.out.println("duplicates are" + duplicateWords(test));





	}
	public static Set duplicateWords(String Input) {

		if(Input.isEmpty()|| Input==null) {
			return Collections.emptySet();
		}
		HashSet<String> duplicates = new HashSet<String>();
		String [] arrayString = Input.split("\\s+");
		HashSet<String> set = new HashSet<String>();

		for (String words : arrayString) {
			if (!set.add(words)){

				duplicates.add(words);


			}



		}
		return duplicates;

	}


}
