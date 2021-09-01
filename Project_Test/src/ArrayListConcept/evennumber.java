package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class evennumber {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,7,8,9));

		number.stream().forEach(ele-> System.out.println(ele));

		// to print only even number

		number.removeIf(ele-> !(ele%2 ==0));
		System.out.println(number);

	}

}
