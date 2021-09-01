package java_Programming;

public class DupCharINStr {

	public static void main(String[] args) {
		
		String str = "w3school";
		int count = 0;
		char[] ch = str.toCharArray();
		System.out.println("Duplicate char: ");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate in string :"+ch[j]);
					count++;
					break;
				}
			}
		}

	}

}
