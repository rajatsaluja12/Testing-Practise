package fileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	/*
	 Print all files and folders in a directory in sorted order 	 
	 */
	
	
	public static void main(String[] args) {
		
		String path = "/Users/Lenovo/Downloads";
		
		File file = new File(path);
		File downloadDir[] = file.listFiles();
		Arrays.sort(downloadDir);
		
		for(File e :downloadDir) {
			if(e.isFile()) {
				System.out.println("File: "+ e.getName()+ " "+e.getAbsolutePath());
			}
			else if(e.isDirectory()) {
				System.out.println("Directory : "+ e.getName());
			}
			else {
				System.out.println("Not known : "+ e.getName());
			}
		}

	}

}
