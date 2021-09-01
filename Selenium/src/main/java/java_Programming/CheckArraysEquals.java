package java_Programming;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
// approach 1		
		/*
		 * boolean status = Arrays.equals(a, b);
		 * 
		 * if(status ==true) { System.out.println("Arrays are equal"); } else {
		 * System.out.println("Arrays are not equal"); }
		 */
		
		// Approach 2 
		
		boolean status = true;
		
		if(a.length == b.length) {
			
			for(int i = 0; i<a.length;i++) {
				if(a[i] != b[i]) {
					status = false;
				}
			}
		}
		else {
			status = false; 
		}
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	
		
		int a1[]= {1,2,3,4,5,6,7};
		int a2[] = {1,2,3,4,5,6,7};
		boolean Status =  Arrays.equals(a1, a2);
		if(Status ==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		
	}
	
	

}
