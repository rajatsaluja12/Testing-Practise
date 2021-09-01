package Practise;

import java.text.DecimalFormat;

public class PercentageofDigitUpcaseLowerCaseSpecialCharINString {


	public static void getPercentage(String str) {


		int len = str.length();
		int UpperCaseCount= 0;
		int LowerCaseCount= 0;
		int DigitCount= 0;
		int SpecialCharacterCount= 0;

		for (int i =0 ; i <len; i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				UpperCaseCount++;

			}
			else if (Character.isLowerCase(ch)) {
				LowerCaseCount++;

			}

			else if (Character.isDigit(ch)) {
				DigitCount++;

			}
			else {
				SpecialCharacterCount++;

			}


		}

		DecimalFormat formatter = new DecimalFormat("##.##");
		double percentageUpcase = (UpperCaseCount*100.0) / len;
		double percentageLwcase = (LowerCaseCount*100.0) / len;
		double percentageDigit = (DigitCount*100.0) / len;
		double percentageSpecial= (SpecialCharacterCount*100.0) / len;



		System.out.println("Stirng is " + str);
		System.out.println("Percentage of UpperCase Character are " + formatter.format(percentageUpcase));
		System.out.println("Percentage of LowerCase Character are " + formatter.format(percentageLwcase));
		System.out.println("Percentage of Digit Character are " + formatter.format(percentageDigit));
		System.out.println("Percentage of Special Character are " + formatter.format(percentageSpecial));

		System.out.println("--------");

	}







	public static void main(String[] args) {

		getPercentage("Rajat");
		getPercentage("Rajat 12 &&");


	}

}
