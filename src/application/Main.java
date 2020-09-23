package application;
//**********************************************************************
// Projekt:			Projekt Modul 226a
// Copyright:		Patrick Tomasi
// Author:			Patrick Tomasi
// Datum:			07.04.2019
// Programmname:	Fischer Club Tool
// Version:			v.1.0
//**********************************************************************

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	private Scene scene;
	 

	@Override
	public void start(Stage primaryStage) {
		
		try {
			  
			
			// Baut den Startbildschirm auf
			GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this);
			
			// Fenstertitel
			primaryStage.setTitle("Fischer Club Dättwiler Weiher");
			
			
			
			// Das Hauptmenu GUI wird aufgerufen und als return wird der root in der Szene gespeichert
			this.scene = new Scene(startGuiHauptmenu.buildHauptmenu(), 900, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// Der Stage wird die Szene übergeben
			primaryStage.setScene(scene);
			// Das GUI kann nicht vergrössert oder verkleinert werden.
			primaryStage.setResizable(false);
			// Die Stage wird angezeigt
	        primaryStage.show();
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// Startet die Main
		launch(args);

	}
	// Funktion um die Szene der anderen GUI's in this.szene zu speichern
	public Scene getScene() {
		return this.scene;
		
	}
	// Funktion um die return Szene der Szene zu übergeben die dann aktuelll angezeigt wird
	public void setScene(Scene scene) {
		this.scene = scene;
	}

}
