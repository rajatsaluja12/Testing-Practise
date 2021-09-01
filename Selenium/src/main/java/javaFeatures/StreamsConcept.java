package javaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsConcept {

	public static void main(String[] args) {
		
		
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e-> e%2 == 0).forEach(e->System.out.println(e));
		
		Stream.of("hello","java").map(e->e+" world").forEach(System.out::println);
		
		//optional class 
		
		String s[] = new String[5];
	//	System.out.println(s[2].length()); // this will give you nullpointer exception, to handle this situation we are using optional class
		s[2] = "Naveen"; // Now this will come in If block 
		Optional<String> isNull = Optional.ofNullable(s[2]);
		
		if(isNull.isPresent()) {
			System.out.println(s[2]+" "+s[2].length());
			
		}else {
			System.out.println("value is not available");
		}
		
		isNull.ifPresent(e-> System.out.println(e.length()));
		
		Optional<String> nothing = Optional.empty();
		nothing.ifPresent(e-> System.out.println("Bye...."));
		
		
		// Jshell JDK 9.0
		// factory method for immutable collections
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<String> lang = List.of("java","Ruby","python","JS");
		lang.stream().forEach(e->System.out.println(e));
		
		
		//JDK 10 : var keyword
		var x = 10;
		System.out.println(x+10);
		var h = new HashSet<String>();
		h.add("naveen");
		var h1 = new ArrayList<String>();
		h1.add("tom");
		System.out.println(h1.get(0));
		
		//new switch case in JDK 12 
		
		String browser = "chrome";
		switch(browser) {
		case "chrome":
		break;
		case "ff":
			break;
		case "ie":
			break;
			default:
				break;
		}
		
		/*
		 * var response = """{" "name":"tom", "age": "20", "place":"LA" }""";
		 */
	
	}
	

		
	/*
	 * //new one var n = 3; var m = switch(n) { case 1 -> "one"; case 2 -> "two";
	 * case 3-> "three"; case 4 -> "four"; default -> "number not found..."; };
	 */
	
		

}
