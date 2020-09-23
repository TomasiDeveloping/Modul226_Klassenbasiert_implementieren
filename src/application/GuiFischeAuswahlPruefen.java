package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class GuiFischeAuswahlPruefen {
	
	private Main main;
	public GuiFischeAuswahlPruefen(Main main) {
		this.main = main;
	}
String string;
	public Pane startGuiFischeAuswahl() {
		
		// Die Hauptbox wird erstellt
		VBox root = new VBox(20); 
		// Ein Transparentes Bild wird erstellt und dem Hintergrund übergeben
		Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm());// Image wird erstellt und das Bild übergeben
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Background wird erstellt und das Image mit dem Bild übergeben
		root.setBackground(background); // Im root wird der Background gesetzt und das Background mit dem Bild übergeben
		
		//
		// // Boxen für Bild und Text im GUI
		//
				
		// HBox für die erste Spalte
		HBox hBoxSpalte1 = new HBox(100);
		// 2mal VBox um Button und Text anzuzeigen 
		VBox vBox1Spalte1 = new VBox();
		VBox vBox2Spalte1 = new VBox();
				
		// HBox für 2. Spalte
		HBox hBoxSpalte2 = new HBox(100);
		// 2 VBoxen für Bild und Text
		VBox vbox1Spalte2 = new VBox();
		VBox vbox2Spalte2 = new VBox();
				
		// HBox für die 3.Spalte
		HBox hboxSpalte3 = new HBox(100);
		// 2mal VBox für Bild und Text
		VBox vbox1Spalte3 = new VBox();
		VBox vbox2Spalte3 = new VBox();
				
		// HBox für die 4 Spalte
		HBox hboxSpalte4 = new HBox(100);
		// 2mal VBox für Bild und Text
		VBox vbox1Spalte4 = new VBox();
		VBox vbox2Spalte4 = new VBox();
				
		// Die Zoom In und Zoom Out wird über die Klaase Handling aufgerufen
		ButtonHandling zoomHandling = new ButtonHandling();
		
		//
		// Button für die Fische
		//
				
		//Button für Hecht
		Button hechtbButton = new Button(); // Button wird erstellt
		hechtbButton.setId("Hecht"); // Eine ID für den Button wird gestezt um damit später den Button einedeutig zu identifizieren
		Image hechtimage = new Image(getClass().getResource("Hecht.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		hechtbButton.setGraphic(new ImageView(hechtimage)); // Das Bild wird dem Button übergeben
		hechtbButton.setTranslateX(100); // X-Achse des Butons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(hechtbButton);
		zoomHandling.zoomOut(hechtbButton);
		// Funktion zur Prüfung
		startFischePruefen(hechtbButton);
				
		// Button Zander
		Button zanderButton = new Button(); // Button wird erstellt
		zanderButton.setId("Zander"); // Eine ID für den Button wird gestezt um damit später den Button einedeutig zu identifizieren
		Image zanderImage = new Image(getClass().getResource("Zander.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		zanderButton.setGraphic(new ImageView(zanderImage)); // Das Bild wird dem Button übergeben
		zanderButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(zanderButton);
		zoomHandling.zoomOut(zanderButton);
		// Funktion zur Prüfung
		startFischePruefen(zanderButton);
				
		// Button Aal
		Button aalButton = new Button(); // Button wird erstellt
		aalButton.setId("Aal"); // Eine ID für den Button wird gestezt um damit später den Button einedeutig zu identifizieren
		Image aalImage = new Image(getClass().getResource("Aal.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		aalButton.setGraphic(new ImageView(aalImage)); // Das Bild wird dem Button übergeben
		aalButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Zoom Out werden aufgerufen
		zoomHandling.zoomIn(aalButton);
		zoomHandling.zoomOut(zanderButton);
		// Funktion zur Prüfung
		startFischePruefen(aalButton);
				
		// Button Aesche
		Button aescheButton = new Button(); // Button wird erstellt
		aescheButton.setId("Äsche"); // Eine ID für den Button wird gestezt um damit später den Button einedeutig zu identifizieren
		Image aescheImage = new Image(getClass().getResource("Aesche.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		aescheButton.setGraphic(new ImageView(aescheImage)); // Das Bild wird dem Button übergeben
		aescheButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(aescheButton);
		zoomHandling.zoomOut(aescheButton);
		// Funktion zur Prüfung
		startFischePruefen(aescheButton);
				
		// Button Barsch
		Button barschButton = new Button(); // Button wird erstellt
		barschButton.setId("Flussbarsch"); // Eine ID für den Button wird gestezt um damit später den Button einedeutig zu identifizieren
		Image barschImage = new Image(getClass().getResource("Barsch.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		barschButton.setGraphic(new ImageView(barschImage)); // Das Bild wird dem Button übergeben
		barschButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(barschButton);
		zoomHandling.zoomOut(barschButton);
		// Funktion zur Prüfung
		startFischePruefen(barschButton);
				
		// Button Forelle
		Button forelleButton = new Button(); // Button wird erstellt
		forelleButton.setId("Forelle"); // Eine ID für den Button wird gestezt um damit später den Button einedeutig zu identifizieren
		Image forelleImage = new Image(getClass().getResource("Regenbogenforelle.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		forelleButton.setGraphic(new ImageView(forelleImage)); // Das Bild wird dem Button übergeben
		forelleButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(forelleButton);
		zoomHandling.zoomOut(forelleButton);
		// Funktion zur Prüfung
		startFischePruefen(forelleButton);

		// Button Schleie
		Button schleieButton = new Button(); // Button wird erstellt
		schleieButton.setId("Schleie"); // Eine ID für den Button wird gestezt um damit später den Button einedeutig zu identifizieren
		Image schleieImage = new Image(getClass().getResource("Schleie.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		schleieButton.setGraphic(new ImageView(schleieImage)); // Das Bild wird dem Button übergeben
		schleieButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(schleieButton);
		zoomHandling.zoomOut(schleieButton);
		// Funktion zur Prüfung
		startFischePruefen(schleieButton);
				
		// Button Karpfe
		Button karpfenButton = new Button(); // Button wird erstellt
		karpfenButton.setId("Karpfe"); // Eine ID für den Button wird gestezt um damit später den Button einedeutig zu identifizieren
		Image karpfenImage = new Image(getClass().getResource("Schuppenkarpfen.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		karpfenButton.setGraphic(new ImageView(karpfenImage)); // Das Bild wird dem Button übergeben
		karpfenButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(karpfenButton);
		zoomHandling.zoomOut(karpfenButton);
		// Funktion zur Prüfung
		startFischePruefen(karpfenButton);
				
		// Button für das Hauptmenu wird erstellt
		Button hauptmenuButton = new Button("Hauptmenü"); // Button wird erstellt und Initialisiert
		hauptmenuButton.setFont(new Font(20)); // Schriftgrösse
		hauptmenuButton.setScaleX(1.2); // Button wird mal 1.2 in der X Achse vergrössert
		hauptmenuButton.setScaleX(1.2); // Button wird mal 1.2 in der Y Achse vergrössert
		hauptmenuButton.setTranslateX(350); // X-Achse des Buttons
		// Zoom in und Out werden aufgerufen
		zoomHandling.zoomIn(hauptmenuButton);
		zoomHandling.zoomOut(hauptmenuButton);
		// Funktion für zurück zum Hauptmenu
		hauptmenuStart(hauptmenuButton);
		
		//
		// Label für die Fische
		//
				
		// Label Hecht
		Label hechtlabel = new Label("Hecht"); // Das Label mit dem Namen wird erstellt
		hechtlabel.setFont(new Font(40)); // Die Schriftgrösse
		hechtlabel.setTranslateX(180); // X-Achse des Labels
				
		//Label Zander
		Label zanderLabel = new Label("Zander"); // DAs LAabel mit dem Namen wird erstellt
		zanderLabel.setFont(new Font(40)); // Schriftgrösse
		zanderLabel.setTranslateX(160); // X-Achse des Labels
				
		// Label Aal
		Label aaLabel = new Label("Aal"); // Das Label mit dem Namen wird erstellt
		aaLabel.setFont(new Font(40)); // Schriftgrösse
		aaLabel.setTranslateX(200); // X-Achse des Labels
				
		// Label Aesche
		Label aescheLabel = new Label("Äsche"); // Das Label mit dem Namen wird erstellt
		aescheLabel.setFont(new Font(40)); // Schriftgrösse
		aescheLabel.setTranslateX(180); // X-Achse des Labels
				
		// Label Barsch
		Label barschLabel = new Label("Flussbarsch"); // Das Label mit dem Namen wird erstellt
		barschLabel.setFont(new Font(40)); // Schriftgrösse
		barschLabel.setTranslateX(130); // X-Achse des Labels
				
		// Label Forelle
		Label forelleLabel = new Label("Forelle"); // Das Label mit dem Namen wird erstellt
		forelleLabel.setFont(new Font(40)); // Schriftgrösse
		forelleLabel.setTranslateX(180); // X-Achse des Labels
				
		// Label Schleie
		Label schleieLabel = new Label("Schleie"); // Das Label mit dem Namen wird erstellt
		schleieLabel.setFont(new Font(40)); // Schriftgrösse
		schleieLabel.setTranslateX(170); // X-Achse des Labels
				
		// Label Karpfe
		Label karpfeLabel = new Label("Karpfe"); // Das Label mit dem Namen wird erstellt
		karpfeLabel.setFont(new Font(40)); // Schriftgrösse
		karpfeLabel.setTranslateX(170); // X-Achse des Labels
				
		// Das Label für die überschrift
		Label fischeAuswahlLabel = new Label("Welche Fischart möchten Sie überprüfen ?"); // Das Label wird mit dem Namen erstellt
		fischeAuswahlLabel.setFont(new Font(40)); // Schriftgrösse
		fischeAuswahlLabel.setTranslateX(10); // X-Achse des Labels
				
		//		
		// // Die einzelnen VBoxen für die Fische werden gefüllt
		// 
		
		// Erste Spalte
		vBox1Spalte1.getChildren().addAll(hechtlabel,hechtbButton); // Erste Linie und erste Spalte mit Bild und Text
		vBox2Spalte1.getChildren().addAll(zanderLabel,zanderButton); // Erste Linie und zweite Spalte mit Bild und Text
		// Zweite Spalte
		vbox1Spalte2.getChildren().addAll(aaLabel,aalButton); // Zweite Linie erste Spalte mit Bild und Text
		vbox2Spalte2.getChildren().addAll(aescheLabel,aescheButton); // Zweite Linie zweite Spalte mit Bild und Text
		// Dritte Spalte
		vbox1Spalte3.getChildren().addAll(barschLabel,barschButton); // Dritte Linie erste Spalte mit Bild und Text
		vbox2Spalte3.getChildren().addAll(forelleLabel,forelleButton); // Dritte Linie zweite Spalte mit Bild und Text
		// vierte Spalte
		vbox1Spalte4.getChildren().addAll(schleieLabel,schleieButton); // Vierte Linie erste Spalte mit Bild und Text
		vbox2Spalte4.getChildren().addAll(karpfeLabel,karpfenButton); // Vierte Linie zweite Spalte mit Bild und Text
						
		//
		// // Die einzelnen HBoxen werden gefüllt für die Spalten in der Root
		//
		hBoxSpalte1.getChildren().addAll(vBox1Spalte1,vBox2Spalte1); // Die erste Spalte wird mit den zwei Boxen gefüllt
		// HBox Spalte 2
		hBoxSpalte2.getChildren().addAll(vbox1Spalte2,vbox2Spalte2); // Die zweite Spalte wird mit den zwei Boxen gefüllt
		// Hbox Spalte 3
		hboxSpalte3.getChildren().addAll(vbox1Spalte3,vbox2Spalte3); // Die dritte Spalte wird mit den zwei Boxen gefüllt
		// Hbox Spalte 4
		hboxSpalte4.getChildren().addAll(vbox1Spalte4,vbox2Spalte4); // Die vierte Spalte wird mit den zwei Boxen gefüllt
		//		
		// // Elemente werden der HauptVBox root hinzugefügt
		//
		root.getChildren().addAll(fischeAuswahlLabel,hBoxSpalte1,hBoxSpalte2,hboxSpalte3,hboxSpalte4,hauptmenuButton); // Alle gefüllten Boxen werden der Hauptbox übergeben
		
		// Das root wird zurückgegeben um Angezeigt zu werden
		return root;
		
	}
	
	//
	// Funktion für Button
	//
	
	// Funktion um das Hauptmenu aufzurufen und zu starten
	public void hauptmenuStart(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this.main);
		main.getScene().setRoot(startGuiHauptmenu.buildHauptmenu());
		});
	}
	// Funktion um das GUI mit dem gewählten Fisch zur überprüfung aufzurufen und starten
	public void startFischePruefen(Button button) {
		button.setOnAction((event) -> {
		// String wird erstellt und mit der Button ID Initialisiert um eine idendifizierung des gewählten Fisch herauszufinden
		String string = button.getId();
		GuiFischeAufGroessePruefen startGuiFischeAuswahlPruefen = new GuiFischeAufGroessePruefen(this.main);
		main.getScene().setRoot(startGuiFischeAuswahlPruefen.startGuiFischeAufGroessePruefen(string)); // Der String wird übergeben
		});
	}

}
