package JavaPatterns;

public class StarPyramidPattern {

	
//	    *
//	   * *
//	  * * *
//   * * * *
public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j =3;j>=i;j--) {
			System.out.print(" ");
			}
			for(int k= 1;k<=i;k++) {
				System.out.print(" *"); // you just have to add one space and then the character 
			}
			System.out.println();
		}

	}

}
