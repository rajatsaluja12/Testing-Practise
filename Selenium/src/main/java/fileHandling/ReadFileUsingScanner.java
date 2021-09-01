package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {
		
		String path = "/Users/Lenovo/Downloads/FileHandle/NewFile.txt";
		Scanner sc = null;
		try {
			File file = new File(path);
			sc = new Scanner(file);
			System.out.println("File content is ...");
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}		
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		finally {
			sc.close();
		}
	}

}
