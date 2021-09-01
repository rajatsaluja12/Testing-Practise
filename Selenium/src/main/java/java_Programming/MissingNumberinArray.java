package java_Programming;

public class MissingNumberinArray {

	public static void main(String[] args) {
		//Array should not have 
		
		int a[] = {1,2,4,5};
		//1+2+4+5 = 12 sum1
		//1+2+3+4+5 = 15 sum2
		
		int sum1 =0;
		for(int i =0; i<a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of element in array: "+sum1);

		int sum2 =0;
		for(int i=1;i<=5;i++) {
			sum2 = sum2+ i;
		}
		System.out.println("Sum of range of element in array:"+sum2);
	
	System.out.println("Missing no:"+(sum2-sum1));
	}
}
