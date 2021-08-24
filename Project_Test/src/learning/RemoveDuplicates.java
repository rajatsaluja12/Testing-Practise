package learning;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] r = new int[] {1,3,3,4,6,4,3,4,5,7,5,8};
		int[] sortedArr = sorting(r);
		for(int cc: sortedArr){
			System.out.println(cc+"");
		}
	}
	public static int[] sorting(int[] arr) {
		Arrays.sort(arr);
		int[] noDuplicates = IntStream.of(arr).distinct().toArray();
		return noDuplicates;
	}
}

