package a_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class Practice23062021 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b[] = {2,1,3,4,5,6};
	boolean status = Arrays.equals(a, b);
	
	if(status == true) {
		System.out.println("Arrays are equal");
	}
	else {
		System.out.println("Arrays are not equal");
	}
	
	
	// even and odd count in the integer 
	int num = 78185;
	int even_count = 0;
	int odd_count = 0;
	while(num>0) {
		int rem = num%10;
		if(rem%2==0) {
			even_count++;
		}
		else {
			odd_count++;
		}
		num = num/10;
	}
	System.out.println("Even count is : "+even_count);
	System.out.println("Even count is : "+odd_count);
	
	
	//Count Character_occurence 
	String str = "Rakshith";
	int org_length = str.length();
	int hreplaceLeng= str.replace("h", "").length();
	int newlength = org_length - hreplaceLeng;
	System.out.println("NUmber of occurance of h word : "+newlength);
	
	//Count number of digits 
	
	int number = 787185;
	int count = 0;
	while(number>0) {
		number = number/10;
		count++;
	}
	System.out.println("Number of digits are "+ count);


	
	//Duplicate element from the array 
	
		int a1[] = {1,1,2,3,4,5,6,6,2,56,5,4,1};
		for(int i = 0; i<a1.length;i++) {
			for(int j= i+1; j<a1.length;j++) {
				if(a1[i]==a1[j]) {
					System.out.println("value from the array is duplicate "+a1[j]);
				}
			}

		
		}
		Practice23062021.DupCharString("Rakshitt");
	
	}
	
	
	public static void DupCharString(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for(char c :charArray ) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
				
			}
			for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
		
			}
			
		}
		
	}
	
}
