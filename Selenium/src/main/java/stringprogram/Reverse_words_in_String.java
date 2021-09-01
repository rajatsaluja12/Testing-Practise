package stringprogram;

import org.testng.annotations.Test;

public class Reverse_words_in_String {
	
	@Test
	public void reverse_string() {
		
		String s[] = "Rakshit is a smart boy".split(" ");
		String ans ="";
		for(int i =s.length-1;i>=0;i--)
		{
			ans = ans+ s[i]+" ";
		}
		System.out.println("Reversed the string :"+ans);
	}

}
