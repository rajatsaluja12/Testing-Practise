package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ODDNUMBER {

	public static void main(String[] args) {

		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

		arr1.stream().forEach(ele->System.out.println(ele));

		arr1.removeIf(ele-> ele%2==0);
		System.out.println(arr1);

	}

}
