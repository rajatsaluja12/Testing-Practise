package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingUsingFileReader {

	public static void main(String[] args) throws IOException {

		String path ="/Users/Lenovo/Downloads/FileHandle/NewFile.txt";
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			System.out.println("File content is...");
			int c = 0;
			while((c=fr.read())!=-1) {
				System.out.println((char)c);
			}
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		finally {
			fr.close();
		}


	}

}
