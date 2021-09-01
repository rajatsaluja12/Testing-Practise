package java_Programming;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		//Extracting even numbers......
		
		System.out.println("Even no. in array....");
		
		//for(int i=0;i<a.length;i++) 
		for(int value :a ){
			if(value%2==0) 
				System.out.println(value);
			
		}
			System.out.println("odd from array");
			
			for(int value :a) {
				if(value%2 !=0)
					System.out.println(value);
			}
		}

	}


