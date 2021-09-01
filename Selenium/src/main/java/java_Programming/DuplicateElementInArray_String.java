package java_Programming;

import java.util.HashSet;

import org.testng.annotations.Test;

public class DuplicateElementInArray_String {

@Test	
public void DupElemInArray() {
		
		
		int a[] = {1,2,3,4,4,5,5,6,4,6,3,7,8,2};
		for(int i=0;i<a.length;i++) {
			for(int j = i+i;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Found the duplicate element :"+a[j]);
					
				}
			}
		}
	}
	
@Test
public void duplicateStElementinArray() {
	String arr[] = {"nakul","sehdev","arjun","krishna", "nakul"};
	HashSet<String> name = new HashSet<String>();
	for(String Value : arr) {
		if(name.add(Value) == false) {
			System.out.println("Found duplicate element "+Value);
		}
		
	}
}

	public static void main(String[] args) {
	//Approach 1 
		
		  String arr[] = {"Java","C","C++","Python","Java"};
		  
		  for(int i =0; i<arr.length; i++)
		  { 
			  for(int j =i+1; j<arr.length;j++){
		  if(arr[i] == arr[j]) {
		  System.out.println("Found the duplicate element :"+arr[j]); } } }
		 
		
		
		//Approach : HashSet
		String arr11[] = {"Java","C","C++","Python","Java"};
		HashSet<String> Langs = new HashSet<String>();
		/*System.out.println(Langs.add("Java"));
		System.out.println(Langs.add("Java"));
		System.out.println(Langs.add("python"));
		System.out.println(Langs.add("C++"));
		System.out.println(Langs.add("C"));*/
		
		for(String Value : arr11) {
			if(Langs.add(Value) == false) {
				System.out.println("Found Duplicate Element"+Value);
			}
		}
	}

}
