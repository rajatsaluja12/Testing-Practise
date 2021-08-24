package Practise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class howtoRemoveDuplicates {

	public static void main(String[] args) {

		int [] arrnew = new int[] {1,2,7,8,4,4,6,5,7,10,44,12};

		int[] sortedR = sortingduplicate(arrnew);

		for (int c : sortedR) {
			System.out.println(c);

		}

	}

	public static  int[] sortingduplicate(int []arr) {

		Arrays.sort(arr);

		int [] noDuplicate=IntStream.of(arr).distinct().toArray();
		return noDuplicate;




	}

}
