package fareye;

public class MyFirst {

	public static void main(String[] args) {
		MyFirst obj = new MyFirst(n);
	}

	static int a = 10;
	static int n ;
	int b = 5;
	int c;
	public MyFirst(int m) {
		System.out.println(a+","+b+","+c+","+n+","+m);
	}
	//instance block
	{
		b=30;
		n = 20;
	}
	//static block
	static {
		a=60;
	}
}
