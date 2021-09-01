package java_Programming;

public class secondsmallest {

		public static void main(String[] args) {
			 int a[] = {11,2,31,44,5,6,};
			 
			 System.out.println(secondsmallest.seconddsmat(a, 6));

				 
			 }

		
		
		public static int seconddsmat(int a[], int total) {
			
			for(int i = 0; i<total;i++) {
				 for(int j = i+1; j<total;j++)
				   if(a[i] > a[j]) {
					 int  temp = a[i];
					   a[i] = a[j];
					   a[j] = temp;		   
				   }
			
			
		}
			return total;

	}


}
