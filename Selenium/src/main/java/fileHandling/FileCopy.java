package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	/*
	 File Handling - 1 :
	 Copy a file(pdf) and create a different file in the same location
	 @param arg
	 */
	
	
	public static void main(String[] args) {
		copyfile();

	}
	
	public static void copyfile() {
		File file = new File("/Users/Lenovo/Downloads/8309_Form 16.pdf");
		File Opfile = new File("/Users/Lenovo/Downloads/8309_Form 16-copy.pdf");

		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		try {
			 fi = new FileInputStream(file);
			 fo = new FileOutputStream(Opfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(fi.available());
		} catch (IOException e) {
			
		}
		int i = 0;
		try {
			
			while((i = fi.read()) != -1) {
			fo.write(i);		
		}
		}
			
				catch(Exception e) {
			}
		finally {
			//close the streams
			if(fi != null) {
				try {
					fo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fo !=null) {
				try {
					fo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
			
		
		
	}

}
