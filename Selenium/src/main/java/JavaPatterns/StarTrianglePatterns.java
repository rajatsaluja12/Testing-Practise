package JavaPatterns;

public class StarTrianglePatterns {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****

		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("----------------------------------");
	
	//Now printing it in reverse order 
	

//	*****
//	****
//	***
//	**
//	*
	
	for(int i= 0;i<=4;i++ ) {
		for(int j=4;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("----------------------------------");	
// now printing both the triangles together to get below pattern 

//	*
//	**
//	***
//	****
//	*****
//	*****
//	****
//	***
//	**
//	*
	
	for(int i=0;i<=4;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i= 0;i<=4;i++ ) {
		for(int j=4;j>i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
//uncommenting both the patterns -- But there will be a small issue. the fifth line will be printed twice. 
//	to avoid this issue, in the reverse wala code, make j>i rather than j>=i -- line no. 32

	// a seperate code is written to make it less chaos
	
}
}
