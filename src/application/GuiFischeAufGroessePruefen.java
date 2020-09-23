package application;
import java.util.Calendar;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GuiFischeAufGroessePruefen {
	private Main main;
	public GuiFischeAufGroessePruefen(Main main) {
		this.main = main;
	}
	
	double groesse; // double für die Prüfung der Grösse wird mit der Switch Case initialisiert

	public Pane startGuiFischeAufGroessePruefen(String string) {
		
		
		String fischNameString = string; // String wird durch den gewählten Button übergeben
					
		String fischString = ""; // In diesen String kommt der Link zum Bild
					
		Boolean schonzeitBoolean = false; // Wen der Fisch schonzeit hat wird auf True gesetzt um den Verlauf des GUI zu steuern
		
		//	Aktueller Monat wird in der Variablen datumAktuell gespeichert.
		Calendar dateNow = Calendar.getInstance();
		int datumAktuell = dateNow.get(Calendar.MONTH) +1;
								
		// Datum wird manuell übergeben für Test und debbuging
		//int datumAktuell = 3;
		
		// Switch Case für die Auswahl des Bildes und Name des Fisches
		switch (fischNameString) {
					
			case "Hecht":		fischString = "Hecht.png"; // Das Bild für den Hecht wird dem String übergeben
								groesse = 50.0; // Schonmass für den Hecht wird festgelegt
								if (datumAktuell >= 1 && datumAktuell <= 4 ) { // Es wird die Schonzeit überprüft
									schonzeitBoolean = true; // Der Fisch hat Schonzeit = true
								}else {
									schonzeitBoolean = false; // Der Fisch hat keine Schonzeit = false
								}
								break;
										
			case "Zander":  	fischString = "Zander.png"; // Bild für den Zander wird übergeben
								groesse = 50.0; // Schonmass Zander
								if (datumAktuell >= 1 && datumAktuell <= 4) { // Schonzeit Zander wird geprüft
									schonzeitBoolean = true; // Hat Schonzeit
								}else {
									schonzeitBoolean = false; // Hat keine Schonzeit
								}
								break;
										
			case "Aal":			fischString = "Aal.png"; // Bild für den Aal wird übergeben
								groesse = 50.0; // Schonmass Aal
								schonzeitBoolean = false; // Der Aal hat keine Schonzeit
								break;
								
			case "Äsche":		fischString = "Aesche.png"; // Bild für die Äsche wird übergeben
								groesse = 35.0; // Schonmass Äsche
								if (datumAktuell >= 2 && datumAktuell <= 4) { // Schonzeit Äsche wird geprüft
									schonzeitBoolean = true; // Hat Schonzeit
								}else {
									schonzeitBoolean = false; // Hat keine Schonzeit
								}
								break;
										
			case "Flussbarsch":	fischString = "Barsch.png"; // Bild für den Egli wird übergeben
								groesse = 18.0; // Schonmass Egli
								schonzeitBoolean = false; // Der Barsch hat keine Schonzeit
								break;
										
			case "Forelle":		fischString = "Regenbogenforelle.png"; // Bild für die Forelle wird übergeben
								groesse = 28.0; // Schonmass Forelle
								if (datumAktuell >= 3 && datumAktuell <= 9) { // Schonzeit Forelle wird geprüft
										schonzeitBoolean = false; // Hat keien Schonzeit
								}else {
										schonzeitBoolean = true; // Hat Schonzeit
								}
								break;
										
			case "Schleie":		fischString = "Schleie.png"; // Bild für die Schleie wird übergeben
								groesse = 35.0; // Schonmass Schleie
								schonzeitBoolean = false; // Die Schleie hat keine Schonzeit
								break;
										
			case "Karpfe":		fischString = "Schuppenkarpfen.png"; // Bild für den Karpfen wird übergeben
								groesse = 40.0; // Schonmass Karpfe
								schonzeitBoolean = false; // Der Karpfe hat keine Schonzeit
								break;
					}
			// Button Handling für Zoom In und Out
			ButtonHandling zoomHandling = new ButtonHandling();		
			// Hauptbox für das Gui
			AnchorPane root = new AnchorPane();
			Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm());
			BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
			Background background = new Background(backgroundImage);
			root.setBackground(background);
					
			//
			// Die Label werden erstellt
			//
			
			// Das Label für den Titel		
			Label ueberSchriftLabel = new Label("Fisch auf Schonzeit und Schonmass prüfen"); // Label wird erstellt und Inizialisiert
			ueberSchriftLabel.setFont(new Font(40)); // Schriftgrösse
			ueberSchriftLabel.setTranslateX(40); // X-Achse im Fenster
			
			// Label für das Fischbild
			Label fischbildLabel = new Label(); // Label wird erstellt und Inizialisiert
			Image fischImage = new Image(getClass().getResource(fischString).toExternalForm());// Das bild wird über die Switch Case initialisiert
			fischbildLabel.setGraphic(new ImageView(fischImage)); // Bild wird dem Label hinzugefügt
			fischbildLabel.setTranslateX(300); // X-Achse im Fenster
			fischbildLabel.setTranslateY(250); // Y-Aschse
			fischbildLabel.setScaleX(1.8); // Das Label wird vergrössert in der X-Achse
			fischbildLabel.setScaleY(1.8); // Das Label wird vergrössert in der Y-Achse
			
			// Label für den Fischnamen		
			Label fischnameLabel = new Label(fischNameString); // Der Name wird mir der Button ID aus dem Gui FischeAuswahlPrüfen übergeben
			fischnameLabel.setFont(new Font(40)); // Schriftgrösse
			fischnameLabel.setTranslateX(350); // X-Achse
			fischnameLabel.setTranslateY(150); // Y-Achse
			
			// Label für die Anzeige hat Schonzeit
			Label schonzeitLabel1 = new Label("Der Fisch hat Schonzeit. Bitte Schonend zurücksetzen"); // Label wird erstellt und Inizialisiert
			schonzeitLabel1.setFont(new Font(35)); // Schriftgrösse
			schonzeitLabel1.setTranslateX(10); // X-Achse
			schonzeitLabel1.setTranslateY(530); // Y-Achse
			schonzeitLabel1.setTextFill(Color.RED); // Schriftfarbe
			
			// Label für die Anzeige keine Schonzeit
			Label schonzeitLabel2 = new Label("Der Fisch hat keine Schonzeit. Bitte auf grösse Prüfen"); // Label wird erstellt und Inizialisiert
			schonzeitLabel2.setFont(new Font(30)); // Schriftgrösse
			schonzeitLabel2.setTranslateX(50); // X-Achse
			schonzeitLabel2.setTranslateY(420); // Y-Achse
			schonzeitLabel2.setTextFill(Color.GREEN); // Schriftfarbe
					
			// Label für die grössen Eingabe		
			Label fischgroesseLabel = new Label("Bitte Fischgrösse in cm eingeben"); // Label wird erstellt und Inizialisiert
			fischgroesseLabel.setFont(new Font(25)); // Schriftgrösse
			fischgroesseLabel.setTranslateX(250); // X-Achse
			fischgroesseLabel.setTranslateY(500); // Y-Achse
			
			// Textfeld für die User Eingabe
			TextField eingabecmTextField = new TextField(); // Das TextFeld wird erstellt
			eingabecmTextField.setFont(new Font(20)); // Grösse 
			eingabecmTextField.setTranslateX(280); // X-Asche
			eingabecmTextField.setTranslateY(550); // Y-Achse
			eingabecmTextField.setMaxWidth(200); // Max Grösse des Eingabefeldes
			
			// Label für Fischgrösse OK
			Label groesseOkLabel = new Label("Der Fisch hat die richtige grösse und darf entnommen werden." // Label wird erstellt und Inizialisiert
							+ "Petri Heil");
			groesseOkLabel.setFont(new Font(25)); // Schriftgrösse
			groesseOkLabel.setTranslateX(30); // X-Achse
			groesseOkLabel.setTranslateY(630); // Y-Achse
			groesseOkLabel.setTextFill(Color.GREEN); // Text Farbe
			
			// LAbel für Fischgrösse ZU KLEIN
			Label groesseNoLabel = new Label("Der Fisch ist zu klein und muss Schonend zurück gesetzt werden. Danke"); // Label wird erstellt und Inizialisiert
			groesseNoLabel.setFont(new Font(25)); // Schriftgrösse
			groesseNoLabel.setTranslateX(20); // X-Achse
			groesseNoLabel.setTranslateY(630); // Y-Achse
			groesseNoLabel.setTextFill(Color.RED); // Text Farbe
			
			// Label für Eingabe nur Zahlen
			Label bitteEingabeLabel = new Label("Es sind nur Zahlen erlaubt"); // Label wird erstellt und Inizialisiert
			bitteEingabeLabel.setFont(new Font(40)); // Schriftgrösse
			bitteEingabeLabel.setTranslateX(100); // X-Achse
			bitteEingabeLabel.setTranslateY(630); // Y-Achse
			bitteEingabeLabel.setTextFill(Color.RED); // Text Farbe
			
			// Label für Eingabe keine KOMMA
			Label kommaLabel = new Label("Es sind nur Punkte erlaubt keine Kommas"); // Label wird erstellt und Inizialisiert
			kommaLabel.setFont(new Font(30)); // Schriftgrösse
			kommaLabel.setTranslateX(100); // X-Achse
			kommaLabel.setTranslateY(630); // Y-Achse
			kommaLabel.setTextFill(Color.RED); // Text Farbe
			
			// 
			// Button werden erstellt
			//
			// Button zum Grösse Prüfen
			Button okButton = new Button("Prüfen"); // Button wird erstellt und Inizialisiert
			okButton.setFont(new Font(20)); // Schriftgrösse
			okButton.setTranslateX(500); // X-Achse
			okButton.setTranslateY(550); // Y-Achse
			okButton.setMinWidth(100); // Minimum Grösse
			// Zoom In und Out werden aufgerufen
			zoomHandling.zoomIn(okButton);
			zoomHandling.zoomOut(okButton);
					
			// Button für Zurück zum Hauptmenu		
			Button zurueckButton = new Button("Hauptmenü"); // Button wird erstellt und Inizialisiert
			zurueckButton.setTranslateX(100); // X-Achse
			zurueckButton.setTranslateY(750); // Y-Achse
			zurueckButton.setFont(new Font(30)); // Grösse des Buttons
			// Zoom In und Out werden aufgerufen
			zoomHandling.zoomIn(zurueckButton);
			zoomHandling.zoomOut(zurueckButton);
			// Funktion wird dem Button übergeben 
			hauptmenuStart(zurueckButton);
			
			// Button für neuen Fisch Prüfen
			Button neuepruefungButton = new Button("Neuer Fisch Prüfen"); // Button wird erstellt und Inizialisiert
			neuepruefungButton.setTranslateX(500); // X-Achse
			neuepruefungButton.setTranslateY(750); // Y-Achse
			neuepruefungButton.setFont(new Font(30));
			//Zoom In und Out werden aufgerufen
			zoomHandling.zoomIn(neuepruefungButton);
			zoomHandling.zoomOut(neuepruefungButton);
			// Funktion für zurück zur Fische Auswahl
			fischeAuswahlStart(neuepruefungButton);
			
			// 
			// Das GUI wird zusammengesetzt mit if und else abfragen
			//
			root.getChildren().add(ueberSchriftLabel); // Titel wird der Box übergeben
			root.getChildren().add(fischnameLabel); // Fischname wird der Box übergeben
			root.getChildren().add(fischbildLabel); // Bild wird der Box übergeben
			
			// Es wird abgefragt ob der Fisch in der Schonzeit ist. True = Hat Schonzeit/ False = Keine Schonzeit. Wird in der Switch bestimmt
			if (schonzeitBoolean == true) { // Fisch hat Schonzeit
				root.getChildren().add(schonzeitLabel1); // Hat der Fisch Schonzeit wird das Label eingefügt und die restliche Auswahl nicht
			}else if (schonzeitBoolean == false) { // Fisch hat keine Schonzeit
				root.getChildren().add(schonzeitLabel2); // Text für keine Schonzeit
				root.getChildren().add(fischgroesseLabel); // Text für die Eingabe
				root.getChildren().add(eingabecmTextField); // Textfeld für die Eingabe
				root.getChildren().add(okButton); // Button um die Grösse zu prüfen
				root.getChildren().add(bitteEingabeLabel); // Label es sind nur Zahlen erlaubt
				root.getChildren().add(groesseNoLabel); // Label für Grösse zu Klein
				root.getChildren().add(groesseOkLabel); // Label füt Grösse OK
				root.getChildren().add(kommaLabel); // Label für keine KOMMA erlaubt
				kommaLabel.setVisible(false); // nur Punkte erlaubt wird unsichtbar gemacht
				bitteEingabeLabel.setVisible(false); // Nur Zahlen eingeben wird unsichtbar
				groesseNoLabel.setVisible(false); // Grösse zu Klein wird unsichtbar gemacht
				groesseOkLabel.setVisible(false); // Grösse OK wird unsichtbar gemacht
			} 
						
			root.getChildren().add(zurueckButton); // Hauptmenü Butto wird hinzugefügt egal ob Schonzeit oder nicht
			root.getChildren().add(neuepruefungButton); // Neuer Fisch Prüfen Button wird hinzugefügt egal ob Schonzeit oder nicht
					
			//
			// Alle Eventhandler werden erstellt
			//
			
			// Eventhandler für die übeprüfung der Eingabe durch den User
			EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// Es wird geprüft ob die Eingabe leer ist oder ein Buchstaben im TextFeld steht
				if (eingabecmTextField.getText().isEmpty() || eingabecmTextField.getText().matches("[A-Za-z,]")) {
						bitteEingabeLabel.setVisible(true); // Nur Zahlen eingeben wird aktiviert
						groesseNoLabel.setVisible(false); // 
						groesseOkLabel.setVisible(false); // Die anderen Label bleiben unsichtbar
						kommaLabel.setVisible(false);     //
						eingabecmTextField.clear(); // Das TextFeld wird gelöscht
				}else {
				// Ist eine Grösse Eingegben wird nun geprüft
						String userEingabe = eingabecmTextField.getText(); // Die Usereingabe wird in ein String gespeichert
						double groesseFisch = new Double(userEingabe).doubleValue(); // Der String wird in ein double gewandelt
							if (groesseFisch >= groesse) { // Die Prüfung findet Statt. Die Fischgrösse wurde durch die Switch festgelegt
									groesseOkLabel.setVisible(true); // Hat der Fisch die richtige Grösse wird das Label angezeigt
									bitteEingabeLabel.setVisible(false); //
									groesseNoLabel.setVisible(false);    // Die anderen Label werden unsichtbar gemacht
									kommaLabel.setVisible(false);        //
							}else if (groesseFisch < groesse) { // Der Fisch hat nicht die Richtige Grösse
									groesseNoLabel.setVisible(true); // Das Label für der Fisch ist zu klein wird sichtbar
									bitteEingabeLabel.setVisible(false); //
									groesseOkLabel.setVisible(false);    // Die anderen Label werden unsichtbar gemacht 
									kommaLabel.setVisible(false);        //
							}
						}
							
					}
				};
				
				// Das TextFeld bekommt ein Keybord Released (Losgelassen) Event
				eingabecmTextField.setOnKeyReleased(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					if (event.getText().matches("[A-Za-z]") ) { // Es wird geprüft ob ein Buchstaben gedrückt wurde
						bitteEingabeLabel.setVisible(true); // Wurde ein Buchstaben gedrückt wird das Label sichtbar
						groesseNoLabel.setVisible(false); //
						groesseOkLabel.setVisible(false); // Die anderen Label werden unsichtbar gemacht
						kommaLabel.setVisible(false);     //
						eingabecmTextField.clear(); // Das Textfeld wird geleert
					}else {
						bitteEingabeLabel.setVisible(false); // wurden nur zahlen gewählt wird das Label unsichtbar
						kommaLabel.setVisible(false);
						// Der Eventhandler für die grössen Prüfung wird dem Textfeld übergeben
						eingabecmTextField.addEventHandler(ActionEvent.ACTION, eventHandler) ;	
					}
					if (event.getCode() == KeyCode.COMMA) { // Es wird geprüft ob ein Komma gedrückt wurde
						kommaLabel.setVisible(true); // Wurde ein Komma gedrückt wird das Label sichtbar das man nur Punkte verwenden darf
						eingabecmTextField.clear(); // TextFeld wird geleert
					}
					
					}
				});
				
				// Der Prüf Button für die Grösse Prüffen wir der Eventhandler übergeben
				okButton.addEventHandler(ActionEvent.ACTION, eventHandler);
				
				// Das root mit dem GUI wird zurückgegeben um Angezeigt zu werden 
				return root;
			}
	// Eventhandler für den Hauptmenüm Button um das Hauptmenü zu laden
	public void hauptmenuStart(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this.main);
		main.getScene().setRoot(startGuiHauptmenu.buildHauptmenu());
		});
	}
	// Eventhandler für den neue Prüfung Button um das Gui für die Fische Auswahl zu laden	
	public void fischeAuswahlStart(Button button) {
		button.setOnAction((event) -> {
		GuiFischeAuswahlPruefen startGuifischeAuswahl = new GuiFischeAuswahlPruefen(this.main);
		main.getScene().setRoot(startGuifischeAuswahl.startGuiFischeAuswahl());
		});
	}
		
}
