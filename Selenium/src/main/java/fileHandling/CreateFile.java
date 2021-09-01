package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

	/*
	 Create a File in Java using :
	 1. File
	 2. FileOutputStream
	 3. Java NIO utils 

	 */
	
	
	public static void main(String[] args) throws IOException  {
		
		String path = "/Users/Lenovo/Downloads/FileHandle/sample.txt";
		
		File file = new File(path);
		try {
		boolean flag = 	file.createNewFile();
		if(flag) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file is already present ....");
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
// 2nd approach 
	
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name with location path: ");
			String fileName = sc.nextLine();
			FileOutputStream fos = new FileOutputStream(fileName, true);
			System.out.println("Enter the file content: ");
			String content = sc.nextLine();
			byte b[] = content.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("File is saved on the given location path");
			
		} catch (FileNotFoundException e) {
			System.out.println("Some exception is coming....");
			e.printStackTrace();
		}
		System.out.println("-------------------------------------");
		
		
//3. Java nio package :
		
		Path pathlocation = Paths.get("/Users/Lenovo/Downloads/FileHandle/NewFile.txt");
		Path newPath = Files.createFile(pathlocation);
		System.out.println("New file created at :"+newPath);
		
		
	}

}
