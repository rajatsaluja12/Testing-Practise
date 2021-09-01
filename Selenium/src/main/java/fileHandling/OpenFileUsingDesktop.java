package fileHandling;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
		
		String path = "/Users/Lenovo/Downloads/FileHandle/NewFile.txt";
		
		try {
	File file = new File(path);
	if(!Desktop.isDesktopSupported()) {
	System.out.println("desktop not supported");	
	return;
	}
	Desktop desktop = Desktop.getDesktop();
	
	if(file.exists()) {
		desktop.open(file);
	}

		}catch(Exception e) {
			
		}
		
		
		
		
	}

}
