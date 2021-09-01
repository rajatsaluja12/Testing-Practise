import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

public class abc {

	public static void main(String[] args) {

		/*
		 * String str = "findduplicateellementsinarray"; String strr[] = str.split("");
		 * int count= 0; for(String string : strr){ count++; StringBuffer Str = new
		 * StringBuffer(string); Str.charAt(count);
		 * 
		 * 
		 * System.out.println(count);
		 * 
		 * String sttring[] = "findduplicateellementsinarray".split(" "); int count =0;
		 * for(String words : sttring) { System.out.println(words);
		 * 
		 * HashMap<int, String> map = new HashMap<>(words); if(words.equals(sttring)) {
		 * count++ } else
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		 String a[] = {"bbb","aaa","ccc","ddd"};
		//Arrays.sort(a, Collections.reverseOrder());
		
	//System.out.println(Arrays.toString(a));
		 
		 Arrays.sort(a);
		 System.out.println("Element to be sorted"+Arrays.toString(a));

	}

}
