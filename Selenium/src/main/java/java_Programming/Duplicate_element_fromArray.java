package java_Programming;

public class Duplicate_element_fromArray {

	public static void main(String[] args) {
		int aa[] =  {1,2,3,2,3,4,5,6}; 
		
		System.out.println("Print the duplicate element from the array");
		
		for(int i =0; i<aa.length;i++) {
			for(int j=i+1;j<aa.length;j++) {
				if(aa[i] == aa[j]) {
					System.out.println(aa[j]);
				}
			}
		}

	}

}
