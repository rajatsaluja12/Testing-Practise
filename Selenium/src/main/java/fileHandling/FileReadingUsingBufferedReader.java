package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingUsingBufferedReader {

	public static void main(String[] args) {
		
		String path = "/Users/Lenovo/Downloads/FileHandle/NewFile.txt";
		
		BufferedReader br = null;
		try {
			
			File file = new File(path);
			 br = new BufferedReader(new FileReader(file));
			 System.out.println("File Content is .....");
			 
			 int c = 0;
			 while((c=br.read())!=-1) {
				 System.out.print((char)c);
			 }
			
			
		}catch(Exception e) {
			
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
