package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {
		
		String path = "/Users/Lenovo/Downloads/FileHandle/NewFile.txt";
		FileInputStream fi = null;
		
		try {
			
			File file = new File(path);
			fi = new FileInputStream(file);
			System.out.println("File content is ....");
			
			int c = 0;
			while((c=fi.read()) !=-1) {
				System.out.println((char)c);
			}
			
		}catch(Exception e) {
			
		}
		finally {
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
