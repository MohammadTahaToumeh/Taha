package Alo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AnwendungssytemModel {
	public void schreibeInDatei(String text) throws IOException{
		
		    BufferedWriter aus 
	 			= new BufferedWriter(new FileWriter("Text.txt"));
	       	aus.write(text);
	       	aus.close();
	       	
		
	
}
}