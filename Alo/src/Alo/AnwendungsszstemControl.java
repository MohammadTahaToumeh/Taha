package Alo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javafx.stage.Stage;

public class AnwendungsszstemControl {
	private AnwendungssytemModel anwModel;
	private AnwendungsszsteView anwView;
	public AnwendungsszstemControl(Stage primaryStage) {
		this.anwModel=new AnwendungssytemModel();
		this.anwView=new AnwendungsszsteView(this,primaryStage,anwModel);
		
	}
	public void schreibeInDatei(String text){
		try{
		    BufferedWriter aus 
	 			= new BufferedWriter(new FileWriter("Text.txt"));
	       	aus.write(text);
	       	aus.close();
	       	anwView.zeigeInformationsfensterAn("Der Text wurde in die Datei geschrieben.");
		}
		catch(Exception exc){	   
			anwView.zeigeFehlermeldungAn("Fehler beim Schreiben in die Datei.");
		}
	}
	
}