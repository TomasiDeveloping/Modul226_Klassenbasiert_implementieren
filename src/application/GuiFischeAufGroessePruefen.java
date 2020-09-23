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
	
	double groesse; // double f�r die Pr�fung der Gr�sse wird mit der Switch Case initialisiert

	public Pane startGuiFischeAufGroessePruefen(String string) {
		
		
		String fischNameString = string; // String wird durch den gew�hlten Button �bergeben
					
		String fischString = ""; // In diesen String kommt der Link zum Bild
					
		Boolean schonzeitBoolean = false; // Wen der Fisch schonzeit hat wird auf True gesetzt um den Verlauf des GUI zu steuern
		
		//	Aktueller Monat wird in der Variablen datumAktuell gespeichert.
		Calendar dateNow = Calendar.getInstance();
		int datumAktuell = dateNow.get(Calendar.MONTH) +1;
								
		// Datum wird manuell �bergeben f�r Test und debbuging
		//int datumAktuell = 3;
		
		// Switch Case f�r die Auswahl des Bildes und Name des Fisches
		switch (fischNameString) {
					
			case "Hecht":		fischString = "Hecht.png"; // Das Bild f�r den Hecht wird dem String �bergeben
								groesse = 50.0; // Schonmass f�r den Hecht wird festgelegt
								if (datumAktuell >= 1 && datumAktuell <= 4 ) { // Es wird die Schonzeit �berpr�ft
									schonzeitBoolean = true; // Der Fisch hat Schonzeit = true
								}else {
									schonzeitBoolean = false; // Der Fisch hat keine Schonzeit = false
								}
								break;
										
			case "Zander":  	fischString = "Zander.png"; // Bild f�r den Zander wird �bergeben
								groesse = 50.0; // Schonmass Zander
								if (datumAktuell >= 1 && datumAktuell <= 4) { // Schonzeit Zander wird gepr�ft
									schonzeitBoolean = true; // Hat Schonzeit
								}else {
									schonzeitBoolean = false; // Hat keine Schonzeit
								}
								break;
										
			case "Aal":			fischString = "Aal.png"; // Bild f�r den Aal wird �bergeben
								groesse = 50.0; // Schonmass Aal
								schonzeitBoolean = false; // Der Aal hat keine Schonzeit
								break;
								
			case "�sche":		fischString = "Aesche.png"; // Bild f�r die �sche wird �bergeben
								groesse = 35.0; // Schonmass �sche
								if (datumAktuell >= 2 && datumAktuell <= 4) { // Schonzeit �sche wird gepr�ft
									schonzeitBoolean = true; // Hat Schonzeit
								}else {
									schonzeitBoolean = false; // Hat keine Schonzeit
								}
								break;
										
			case "Flussbarsch":	fischString = "Barsch.png"; // Bild f�r den Egli wird �bergeben
								groesse = 18.0; // Schonmass Egli
								schonzeitBoolean = false; // Der Barsch hat keine Schonzeit
								break;
										
			case "Forelle":		fischString = "Regenbogenforelle.png"; // Bild f�r die Forelle wird �bergeben
								groesse = 28.0; // Schonmass Forelle
								if (datumAktuell >= 3 && datumAktuell <= 9) { // Schonzeit Forelle wird gepr�ft
										schonzeitBoolean = false; // Hat keien Schonzeit
								}else {
										schonzeitBoolean = true; // Hat Schonzeit
								}
								break;
										
			case "Schleie":		fischString = "Schleie.png"; // Bild f�r die Schleie wird �bergeben
								groesse = 35.0; // Schonmass Schleie
								schonzeitBoolean = false; // Die Schleie hat keine Schonzeit
								break;
										
			case "Karpfe":		fischString = "Schuppenkarpfen.png"; // Bild f�r den Karpfen wird �bergeben
								groesse = 40.0; // Schonmass Karpfe
								schonzeitBoolean = false; // Der Karpfe hat keine Schonzeit
								break;
					}
			// Button Handling f�r Zoom In und Out
			ButtonHandling zoomHandling = new ButtonHandling();		
			// Hauptbox f�r das Gui
			AnchorPane root = new AnchorPane();
			Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm());
			BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
			Background background = new Background(backgroundImage);
			root.setBackground(background);
					
			//
			// Die Label werden erstellt
			//
			
			// Das Label f�r den Titel		
			Label ueberSchriftLabel = new Label("Fisch auf Schonzeit und Schonmass pr�fen"); // Label wird erstellt und Inizialisiert
			ueberSchriftLabel.setFont(new Font(40)); // Schriftgr�sse
			ueberSchriftLabel.setTranslateX(40); // X-Achse im Fenster
			
			// Label f�r das Fischbild
			Label fischbildLabel = new Label(); // Label wird erstellt und Inizialisiert
			Image fischImage = new Image(getClass().getResource(fischString).toExternalForm());// Das bild wird �ber die Switch Case initialisiert
			fischbildLabel.setGraphic(new ImageView(fischImage)); // Bild wird dem Label hinzugef�gt
			fischbildLabel.setTranslateX(300); // X-Achse im Fenster
			fischbildLabel.setTranslateY(250); // Y-Aschse
			fischbildLabel.setScaleX(1.8); // Das Label wird vergr�ssert in der X-Achse
			fischbildLabel.setScaleY(1.8); // Das Label wird vergr�ssert in der Y-Achse
			
			// Label f�r den Fischnamen		
			Label fischnameLabel = new Label(fischNameString); // Der Name wird mir der Button ID aus dem Gui FischeAuswahlPr�fen �bergeben
			fischnameLabel.setFont(new Font(40)); // Schriftgr�sse
			fischnameLabel.setTranslateX(350); // X-Achse
			fischnameLabel.setTranslateY(150); // Y-Achse
			
			// Label f�r die Anzeige hat Schonzeit
			Label schonzeitLabel1 = new Label("Der Fisch hat Schonzeit. Bitte Schonend zur�cksetzen"); // Label wird erstellt und Inizialisiert
			schonzeitLabel1.setFont(new Font(35)); // Schriftgr�sse
			schonzeitLabel1.setTranslateX(10); // X-Achse
			schonzeitLabel1.setTranslateY(530); // Y-Achse
			schonzeitLabel1.setTextFill(Color.RED); // Schriftfarbe
			
			// Label f�r die Anzeige keine Schonzeit
			Label schonzeitLabel2 = new Label("Der Fisch hat keine Schonzeit. Bitte auf gr�sse Pr�fen"); // Label wird erstellt und Inizialisiert
			schonzeitLabel2.setFont(new Font(30)); // Schriftgr�sse
			schonzeitLabel2.setTranslateX(50); // X-Achse
			schonzeitLabel2.setTranslateY(420); // Y-Achse
			schonzeitLabel2.setTextFill(Color.GREEN); // Schriftfarbe
					
			// Label f�r die gr�ssen Eingabe		
			Label fischgroesseLabel = new Label("Bitte Fischgr�sse in cm eingeben"); // Label wird erstellt und Inizialisiert
			fischgroesseLabel.setFont(new Font(25)); // Schriftgr�sse
			fischgroesseLabel.setTranslateX(250); // X-Achse
			fischgroesseLabel.setTranslateY(500); // Y-Achse
			
			// Textfeld f�r die User Eingabe
			TextField eingabecmTextField = new TextField(); // Das TextFeld wird erstellt
			eingabecmTextField.setFont(new Font(20)); // Gr�sse 
			eingabecmTextField.setTranslateX(280); // X-Asche
			eingabecmTextField.setTranslateY(550); // Y-Achse
			eingabecmTextField.setMaxWidth(200); // Max Gr�sse des Eingabefeldes
			
			// Label f�r Fischgr�sse OK
			Label groesseOkLabel = new Label("Der Fisch hat die richtige gr�sse und darf entnommen werden." // Label wird erstellt und Inizialisiert
							+ "Petri Heil");
			groesseOkLabel.setFont(new Font(25)); // Schriftgr�sse
			groesseOkLabel.setTranslateX(30); // X-Achse
			groesseOkLabel.setTranslateY(630); // Y-Achse
			groesseOkLabel.setTextFill(Color.GREEN); // Text Farbe
			
			// LAbel f�r Fischgr�sse ZU KLEIN
			Label groesseNoLabel = new Label("Der Fisch ist zu klein und muss Schonend zur�ck gesetzt werden. Danke"); // Label wird erstellt und Inizialisiert
			groesseNoLabel.setFont(new Font(25)); // Schriftgr�sse
			groesseNoLabel.setTranslateX(20); // X-Achse
			groesseNoLabel.setTranslateY(630); // Y-Achse
			groesseNoLabel.setTextFill(Color.RED); // Text Farbe
			
			// Label f�r Eingabe nur Zahlen
			Label bitteEingabeLabel = new Label("Es sind nur Zahlen erlaubt"); // Label wird erstellt und Inizialisiert
			bitteEingabeLabel.setFont(new Font(40)); // Schriftgr�sse
			bitteEingabeLabel.setTranslateX(100); // X-Achse
			bitteEingabeLabel.setTranslateY(630); // Y-Achse
			bitteEingabeLabel.setTextFill(Color.RED); // Text Farbe
			
			// Label f�r Eingabe keine KOMMA
			Label kommaLabel = new Label("Es sind nur Punkte erlaubt keine Kommas"); // Label wird erstellt und Inizialisiert
			kommaLabel.setFont(new Font(30)); // Schriftgr�sse
			kommaLabel.setTranslateX(100); // X-Achse
			kommaLabel.setTranslateY(630); // Y-Achse
			kommaLabel.setTextFill(Color.RED); // Text Farbe
			
			// 
			// Button werden erstellt
			//
			// Button zum Gr�sse Pr�fen
			Button okButton = new Button("Pr�fen"); // Button wird erstellt und Inizialisiert
			okButton.setFont(new Font(20)); // Schriftgr�sse
			okButton.setTranslateX(500); // X-Achse
			okButton.setTranslateY(550); // Y-Achse
			okButton.setMinWidth(100); // Minimum Gr�sse
			// Zoom In und Out werden aufgerufen
			zoomHandling.zoomIn(okButton);
			zoomHandling.zoomOut(okButton);
					
			// Button f�r Zur�ck zum Hauptmenu		
			Button zurueckButton = new Button("Hauptmen�"); // Button wird erstellt und Inizialisiert
			zurueckButton.setTranslateX(100); // X-Achse
			zurueckButton.setTranslateY(750); // Y-Achse
			zurueckButton.setFont(new Font(30)); // Gr�sse des Buttons
			// Zoom In und Out werden aufgerufen
			zoomHandling.zoomIn(zurueckButton);
			zoomHandling.zoomOut(zurueckButton);
			// Funktion wird dem Button �bergeben 
			hauptmenuStart(zurueckButton);
			
			// Button f�r neuen Fisch Pr�fen
			Button neuepruefungButton = new Button("Neuer Fisch Pr�fen"); // Button wird erstellt und Inizialisiert
			neuepruefungButton.setTranslateX(500); // X-Achse
			neuepruefungButton.setTranslateY(750); // Y-Achse
			neuepruefungButton.setFont(new Font(30));
			//Zoom In und Out werden aufgerufen
			zoomHandling.zoomIn(neuepruefungButton);
			zoomHandling.zoomOut(neuepruefungButton);
			// Funktion f�r zur�ck zur Fische Auswahl
			fischeAuswahlStart(neuepruefungButton);
			
			// 
			// Das GUI wird zusammengesetzt mit if und else abfragen
			//
			root.getChildren().add(ueberSchriftLabel); // Titel wird der Box �bergeben
			root.getChildren().add(fischnameLabel); // Fischname wird der Box �bergeben
			root.getChildren().add(fischbildLabel); // Bild wird der Box �bergeben
			
			// Es wird abgefragt ob der Fisch in der Schonzeit ist. True = Hat Schonzeit/ False = Keine Schonzeit. Wird in der Switch bestimmt
			if (schonzeitBoolean == true) { // Fisch hat Schonzeit
				root.getChildren().add(schonzeitLabel1); // Hat der Fisch Schonzeit wird das Label eingef�gt und die restliche Auswahl nicht
			}else if (schonzeitBoolean == false) { // Fisch hat keine Schonzeit
				root.getChildren().add(schonzeitLabel2); // Text f�r keine Schonzeit
				root.getChildren().add(fischgroesseLabel); // Text f�r die Eingabe
				root.getChildren().add(eingabecmTextField); // Textfeld f�r die Eingabe
				root.getChildren().add(okButton); // Button um die Gr�sse zu pr�fen
				root.getChildren().add(bitteEingabeLabel); // Label es sind nur Zahlen erlaubt
				root.getChildren().add(groesseNoLabel); // Label f�r Gr�sse zu Klein
				root.getChildren().add(groesseOkLabel); // Label f�t Gr�sse OK
				root.getChildren().add(kommaLabel); // Label f�r keine KOMMA erlaubt
				kommaLabel.setVisible(false); // nur Punkte erlaubt wird unsichtbar gemacht
				bitteEingabeLabel.setVisible(false); // Nur Zahlen eingeben wird unsichtbar
				groesseNoLabel.setVisible(false); // Gr�sse zu Klein wird unsichtbar gemacht
				groesseOkLabel.setVisible(false); // Gr�sse OK wird unsichtbar gemacht
			} 
						
			root.getChildren().add(zurueckButton); // Hauptmen� Butto wird hinzugef�gt egal ob Schonzeit oder nicht
			root.getChildren().add(neuepruefungButton); // Neuer Fisch Pr�fen Button wird hinzugef�gt egal ob Schonzeit oder nicht
					
			//
			// Alle Eventhandler werden erstellt
			//
			
			// Eventhandler f�r die �bepr�fung der Eingabe durch den User
			EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// Es wird gepr�ft ob die Eingabe leer ist oder ein Buchstaben im TextFeld steht
				if (eingabecmTextField.getText().isEmpty() || eingabecmTextField.getText().matches("[A-Za-z,]")) {
						bitteEingabeLabel.setVisible(true); // Nur Zahlen eingeben wird aktiviert
						groesseNoLabel.setVisible(false); // 
						groesseOkLabel.setVisible(false); // Die anderen Label bleiben unsichtbar
						kommaLabel.setVisible(false);     //
						eingabecmTextField.clear(); // Das TextFeld wird gel�scht
				}else {
				// Ist eine Gr�sse Eingegben wird nun gepr�ft
						String userEingabe = eingabecmTextField.getText(); // Die Usereingabe wird in ein String gespeichert
						double groesseFisch = new Double(userEingabe).doubleValue(); // Der String wird in ein double gewandelt
							if (groesseFisch >= groesse) { // Die Pr�fung findet Statt. Die Fischgr�sse wurde durch die Switch festgelegt
									groesseOkLabel.setVisible(true); // Hat der Fisch die richtige Gr�sse wird das Label angezeigt
									bitteEingabeLabel.setVisible(false); //
									groesseNoLabel.setVisible(false);    // Die anderen Label werden unsichtbar gemacht
									kommaLabel.setVisible(false);        //
							}else if (groesseFisch < groesse) { // Der Fisch hat nicht die Richtige Gr�sse
									groesseNoLabel.setVisible(true); // Das Label f�r der Fisch ist zu klein wird sichtbar
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
					if (event.getText().matches("[A-Za-z]") ) { // Es wird gepr�ft ob ein Buchstaben gedr�ckt wurde
						bitteEingabeLabel.setVisible(true); // Wurde ein Buchstaben gedr�ckt wird das Label sichtbar
						groesseNoLabel.setVisible(false); //
						groesseOkLabel.setVisible(false); // Die anderen Label werden unsichtbar gemacht
						kommaLabel.setVisible(false);     //
						eingabecmTextField.clear(); // Das Textfeld wird geleert
					}else {
						bitteEingabeLabel.setVisible(false); // wurden nur zahlen gew�hlt wird das Label unsichtbar
						kommaLabel.setVisible(false);
						// Der Eventhandler f�r die gr�ssen Pr�fung wird dem Textfeld �bergeben
						eingabecmTextField.addEventHandler(ActionEvent.ACTION, eventHandler) ;	
					}
					if (event.getCode() == KeyCode.COMMA) { // Es wird gepr�ft ob ein Komma gedr�ckt wurde
						kommaLabel.setVisible(true); // Wurde ein Komma gedr�ckt wird das Label sichtbar das man nur Punkte verwenden darf
						eingabecmTextField.clear(); // TextFeld wird geleert
					}
					
					}
				});
				
				// Der Pr�f Button f�r die Gr�sse Pr�ffen wir der Eventhandler �bergeben
				okButton.addEventHandler(ActionEvent.ACTION, eventHandler);
				
				// Das root mit dem GUI wird zur�ckgegeben um Angezeigt zu werden 
				return root;
			}
	// Eventhandler f�r den Hauptmen�m Button um das Hauptmen� zu laden
	public void hauptmenuStart(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this.main);
		main.getScene().setRoot(startGuiHauptmenu.buildHauptmenu());
		});
	}
	// Eventhandler f�r den neue Pr�fung Button um das Gui f�r die Fische Auswahl zu laden	
	public void fischeAuswahlStart(Button button) {
		button.setOnAction((event) -> {
		GuiFischeAuswahlPruefen startGuifischeAuswahl = new GuiFischeAuswahlPruefen(this.main);
		main.getScene().setRoot(startGuifischeAuswahl.startGuiFischeAuswahl());
		});
	}
		
}
