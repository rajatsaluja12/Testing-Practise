package java_Programming;

public class secondHighestnfromlist {

	
	public static int getSecondlargest(int[]a, int total) {
		int temp;
		for(int i =0;i<total;i++)
		{
			for(int j = i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-2];
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,5,6,3,2};
		int b[] = {44,69,99,77,33,22,55};
		System.out.println("Second Largest:"+getSecondlargest(a,6));
		System.out.println("Second Largest:"+getSecondlargest(b,7));
	

	}
	/*
	 * int a[] = {1,2,3,4,5,6} a.sort() b= set(list(a)) b[-2];
	 */
}
