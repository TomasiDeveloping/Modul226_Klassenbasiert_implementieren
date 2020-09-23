package application;

import java.util.Calendar;

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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GuiFischeInDerSchonzeit {

	
	private Main main;
	public GuiFischeInDerSchonzeit(Main main) {
		this.main = main;
	}
	
	public Pane buildGuiInDerSchonzeit() {
		

		// Die Hauptbox wird erstellt
		VBox root = new VBox(10); 
		// Der Hintergrund des GUI wird mit einem Transparenten Bild erstellt
		Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm()); // Ein Image wird erstellt und das Bild übergeben
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Ein Background wird ertsellt und das Bild übergeben
		root.setBackground(background); // Der Hintergrund mit dem Bild wird dem root übergeben
		
		//
		// // Allse verschiedenen Boxen werden erstellt
		//
		
		// HBox für die erste Spalte
		HBox hBoxSpalte1 = new HBox(190);
		// 2mal VBox um Button und Text anzuzeigen 
		VBox vBox1Spalte1 = new VBox();
		VBox vBox2Spalte1 = new VBox();
		
		// HBox für 2. Spalte
		HBox hBoxSpalte2 = new HBox(190);
		// 2 VBoxen für Bild und Text
		VBox vbox1Spalte2 = new VBox();
		VBox vbox2Spalte2 = new VBox();
		
		// HBox für die 3.Spalte
		HBox hboxSpalte3 = new HBox(190);
		// 2mal VBox für Bild und Text
		VBox vbox1Spalte3 = new VBox();
		VBox vbox2Spalte3 = new VBox();
		
		// HBox für die 4 Spalte
		HBox hboxSpalte4 = new HBox(190);
		// 2mal VBox für Bild und Text
		VBox vbox1Spalte4 = new VBox();
		VBox vbox2Spalte4 = new VBox();
		
		//
		// Button für die Fische
		//
		
		//Label Bild für Hecht
		Label hechtbildLabel = new Label(); // Das Label wird erstellt
		Image hechtimage = new Image(getClass().getResource("Hecht.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		hechtbildLabel.setGraphic(new ImageView(hechtimage)); // Das Bild wird dem Label übergeben
		hechtbildLabel.setTranslateX(100); // X-Achse des Labels
		
		// Label Bild Zander
		Label zanderbildLabel = new Label(); // Das Label wird erstellt
		Image zanderImage = new Image(getClass().getResource("Zander.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		zanderbildLabel.setGraphic(new ImageView(zanderImage)); // Das Bild wird dem Label übergeben
		zanderbildLabel.setTranslateX(100); // X-Achse des Labels
		
		// Label Bild Aal
		Label aalbildLabel = new Label(); // Das Label wird erstellt
		Image aalImage = new Image(getClass().getResource("Aal.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		aalbildLabel.setGraphic(new ImageView(aalImage)); // Das Bild wird dem Label übergeben
		aalbildLabel.setTranslateX(100); // X-Achse des Labels
		
		// Label Bild Aesche
		Label aeschebildLabel = new Label(); // Das Label wird erstellt
		Image aescheImage = new Image(getClass().getResource("Aesche.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		aeschebildLabel.setGraphic(new ImageView(aescheImage)); // Das Bild wird dem Label übergeben
		aeschebildLabel.setTranslateX(100); // X-Achse des Labels
		
		// Label Bild Barsch
		Label barschbildLabel = new Label(); // Das Label wird erstellt
		Image barschImage = new Image(getClass().getResource("Barsch.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		barschbildLabel.setGraphic(new ImageView(barschImage)); // Das Bild wird dem Label übergeben
		barschbildLabel.setTranslateX(100); // X-Achse des Labels
		
		// Label Bild Forelle
		Label forellebildLabel = new Label(); // Das Label wird erstellt
		Image forelleImage = new Image(getClass().getResource("Regenbogenforelle.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		forellebildLabel.setGraphic(new ImageView(forelleImage)); // Das Bild wird dem Label übergeben
		forellebildLabel.setTranslateX(100); // X-Achse des Labels
		
		// Label Bild Schleie
		Label schleiebildLabel = new Label(); // Das Label wird erstellt
		Image schleieImage = new Image(getClass().getResource("Schleie.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		schleiebildLabel.setGraphic(new ImageView(schleieImage)); // Das Bild wird dem Label übergeben
		schleiebildLabel.setTranslateX(100); // X-Achse des Labels
		
		// Label Bild Karpfe
		Label karpfenbildLabel = new Label(); // Das Label wird erstellt
		Image karpfenImage = new Image(getClass().getResource("Schuppenkarpfen.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		karpfenbildLabel.setGraphic(new ImageView(karpfenImage)); // Das Bild wird dem Label übergeben
		karpfenbildLabel.setTranslateX(100); // X-Achse des Labels
		
		//
		// Label für die Titel der Fische
		//
		
		// Label Hecht
		Label hechtlabel = new Label("Hecht"); // Das Label mit dem Namen wird erstellt
		hechtlabel.setFont(new Font(30)); // Die Schriftgrösse
		hechtlabel.setTranslateX(180); // X-Achse des Labels
		
		//Label Zander
		Label zanderLabel = new Label("Zander"); // DAs LAabel mit dem Namen wird erstellt
		zanderLabel.setFont(new Font(30)); // Schriftgrösse
		zanderLabel.setTranslateX(160); // X-Achse des Labels
		
		// Label Aal
		Label aaLabel = new Label("Aal"); // Das Label mit dem Namen wird erstellt
		aaLabel.setFont(new Font(30)); // Schriftgrösse
		aaLabel.setTranslateX(200); // X-Achse des Labels
		
		// Label Aesche
		Label aescheLabel = new Label("Äsche"); // Das Label mit dem Namen wird erstellt
		aescheLabel.setFont(new Font(30)); // Schriftgrösse
		aescheLabel.setTranslateX(180); // X-Achse des Labels
		
		// Label Barsch
		Label barschLabel = new Label("Flussbarsch"); // Das Label mit dem Namen wird erstellt
		barschLabel.setFont(new Font(30)); // Schriftgrösse
		barschLabel.setTranslateX(130); // X-Achse des Labels
		
		// Label Forelle
		Label forelleLabel = new Label("Forelle"); // Das Label mit dem Namen wird erstellt
		forelleLabel.setFont(new Font(30)); // Schriftgrösse
		forelleLabel.setTranslateX(180); // X-Achse des Labels
		
		// Label Schleie
		Label schleieLabel = new Label("Schleie"); // Das Label mit dem Namen wird erstellt
		schleieLabel.setFont(new Font(30)); // Schriftgrösse
		schleieLabel.setTranslateX(170); // X-Achse des Labels
		
		// Label Karpfe
		Label karpfeLabel = new Label("Karpfe"); // Das Label mit dem Namen wird erstellt
		karpfeLabel.setFont(new Font(30)); // Schriftgrösse
		karpfeLabel.setTranslateX(170); // X-Achse des Labels
		
		//
		// Label für die Anzeige in der Schonzeit
		//
		
		// Label Schonzeit für Hecht
		Label schonzeitHechtLabel = new Label(); // Das Label wird erstellt
		schonzeitHechtLabel.setFont(new Font(25)); // Schriftgrösse
		schonzeitHechtLabel.setTranslateX(140); // X-Achse im root
		
		// Label Schonzeit für Zander
		Label schonzeitZanderLabel = new Label(); // Das Label wird erstellt
		schonzeitZanderLabel.setFont(new Font(25)); // Schriftgrösse
		schonzeitZanderLabel.setTranslateX(140); // X-Achse im root
		
		// Label Schonzeit für Aal
		Label schonzeitaaLabel = new Label(); // Das Label wird erstellt
		schonzeitaaLabel.setFont(new Font(25)); // Schriftgrösse
		schonzeitaaLabel.setTranslateX(140); // X-Achse im root
		
		// Label Schonzeit für Aesche
		Label schonzeitaescheLabel = new Label(); // Das Label wird erstellt
		schonzeitaescheLabel.setFont(new Font(25)); // Schriftgrösse
		schonzeitaescheLabel.setTranslateX(140); // X-Achse im root
		
		// Label Schonzeit Barsch
		Label schonzeitbarschLabel = new Label(); // Das Label wird erstellt
		schonzeitbarschLabel.setFont(new Font(25)); // Schriftgrösse
		schonzeitbarschLabel.setTranslateX(140); // X-Achse im root
		
		// Label Schonzeit für Forelle
		Label schonzeitforelleLabel = new Label(); // Das Label wird erstellt
		schonzeitforelleLabel.setFont(new Font(25)); // Schriftgrösse
		schonzeitforelleLabel.setTranslateX(140); // X-Achse im root
		
		// Label Schonzeit Schleie
		Label schonzeitschleieLabel = new Label(); // Das Label wird erstellt
		schonzeitschleieLabel.setFont(new Font(25)); // Schriftgrösse
		schonzeitschleieLabel.setTranslateX(140); // X-Achse im root
		
		// Label Schonzeit Karpfe
		Label schonzeitkarpfeLabel = new Label(); // Das Label wird erstellt
		schonzeitkarpfeLabel.setFont(new Font(25)); // Schriftgrösse
		schonzeitkarpfeLabel.setTranslateX(140); // X-Achse im root

		
		// Das Label für die überschrift
		Label fischeAuswahlLabel = new Label("Fische und Ihre Schonzeit"); // Das Label wird mit dem Namen erstellt
		fischeAuswahlLabel.setFont(new Font(40)); // Schriftgrösse
		fischeAuswahlLabel.setTranslateX(10); // X-Achse des Labels
		
		//
		// // Buttons werden erstellt
		//
		
		// Button zurück Hauptmenu
		Button hauptmenuButton = new Button("Hauptmenü"); // Button wird erstellt und Initialisiert
		hauptmenuButton.setMinSize(200, 50); // Die Minimumgrösse wird gesetzt
		hauptmenuButton.setTranslateX(345); // X- Achse des Buttons im root
		hauptmenuButton.setFont(new Font(25)); // Schriftgrösse des Buttons
		// Zoom in und out wird hinzugefügt
		ButtonHandling zoomButtonHandling = new ButtonHandling();
		zoomButtonHandling.zoomIn(hauptmenuButton);
		zoomButtonHandling.zoomOut(hauptmenuButton);
		// Funktion zurück ins Hauptmenü
		hauptMenuAufrufen(hauptmenuButton);
		
		//
		// // Aktuelles Datum wird eingelesen um die Fische auf Ihre Schonzeit zu prüfen
		//
		
		// Aktueller Monat wird in der Variablen datumAktuell gespeichert.
		Calendar dateNow = Calendar.getInstance(); // Kalender wird erstellt
		int datum = dateNow.get(Calendar.MONTH) +1; // Der aktuelle Monat wird im Int Initialisiert. +1 Da die Monate ab 0 Beginnen
		// Datum Manuell setzten für Test und Debbug 
		//int datum = 1;
		
		//
		// // Die einzelnen VBoxen für die Fische werden je nach Schonzeit gefüllt
		//
		
		// 1. Spalte und 1 Box
		vBox1Spalte1.getChildren().addAll(hechtlabel,hechtbildLabel);// Erste Linie und erste Spalte mit Bild und Text wird dem root übergeben
		if (datum >=1 && datum <= 4) { // Die Schonzeit wird geprüft
			schonzeitHechtLabel.setText("hat Schonzeit !"); // Trifft die IF zu wird dieser Text gesetzt
			schonzeitHechtLabel.setTextFill(Color.RED); // Die Schrifftfarbe wird auf Rot gesetzt
		}else { // Wen die IF nicht erfüllt ist
			schonzeitHechtLabel.setText("keine Schonzeit"); // Trift due IF nicht zu wird dieser Text gesetzt
			schonzeitHechtLabel.setTextFill(Color.GREEN); // Die Schriftfarbe wird auf Grün gesetzt
		}
		// Der VBox wird das Label mit den entsprecheneden Einstellungen übergeben
		vBox1Spalte1.getChildren().add(schonzeitHechtLabel);
		
		// 1. Spalte und 2. Box
		vBox2Spalte1.getChildren().addAll(zanderLabel,zanderbildLabel); // Erste Linie und zweite Spalte mit Bild und Text wird dem root übergeben
		if (datum >= 1 && datum <= 4) { // Die Schonzeit wird geprüft
			schonzeitZanderLabel.setText("hat Schonzeit !"); // Trifft die IF zu wird dieser Text gesetzt
			schonzeitZanderLabel.setTextFill(Color.RED); // Die Schrifftfarbe wird auf Rot gesetzt
		}else { // Wen die IF nicht erfüllt ist
			schonzeitZanderLabel.setText("keine Schonzeit"); // Trift due IF nicht zu wird dieser Text gesetzt
			schonzeitZanderLabel.setTextFill(Color.GREEN); // Die Schriftfarbe wird auf Grün gesetzt
		}
		// Der VBox wird das Label mit den entsprechenden Einstellungen übergeben
		vBox2Spalte1.getChildren().add(schonzeitZanderLabel);
		
		// 2. Spalte und 1. Box
		vbox1Spalte2.getChildren().addAll(aaLabel,aalbildLabel); // Zweite Linie erste Spalte mit Bild und Text
		// Der Aal hat keine Schonzeit
			schonzeitaaLabel.setText("keine Schonzeit"); // Text wird gesetzt
			schonzeitaaLabel.setTextFill(Color.GREEN); // Die Schriftfarbe wird auf Grün gesetzt
		// Der VBox wird das Label mit den einstellungen übergeben	
		vbox1Spalte2.getChildren().add(schonzeitaaLabel);
		
		// 2. Spalte und 2. Box
		vbox2Spalte2.getChildren().addAll(aescheLabel,aeschebildLabel); // Zweite Linie zweite Spalte mit Bild und Text
		if (datum >= 2 && datum <= 4) { // Die Schonzeit wird geprüft
			schonzeitaescheLabel.setText("hat Schonzeit !"); // Trifft die IF zu wird dieser Text gesetzt
			schonzeitaescheLabel.setTextFill(Color.RED); // Die Schrifftfarbe wird auf Rot gesetzt
		}else { // Wen die IF nicht erfüllt ist
			schonzeitaescheLabel.setText("keine Schonzeit"); // Trift due IF nicht zu wird dieser Text gesetzt
			schonzeitaescheLabel.setTextFill(Color.GREEN); // Die Schriftfarbe wird auf Grün gesetzt
		}
		// Der VBox wird das Label mit den Einstellungen übergeben
		vbox2Spalte2.getChildren().add(schonzeitaescheLabel);
		
		// 3. Spalte und 1. Box
		vbox1Spalte3.getChildren().addAll(barschLabel,barschbildLabel); // Dritte Linie erste Spalte mit Bild und Text
		// Der Barsch hat keine Schonzeit
			schonzeitbarschLabel.setText("keine Schonzeit");
			schonzeitbarschLabel.setTextFill(Color.GREEN); // Die Schriftfarbe wird auf Grün gesetzt
		// Der VBox wird das Label mit den Einstellungen übergeben	
		vbox1Spalte3.getChildren().add(schonzeitbarschLabel);
		
		// 3. Spalte und 2. Box
		vbox2Spalte3.getChildren().addAll(forelleLabel,forellebildLabel); // Dritte Linie zweite Spalte mit Bild und Text
		if (datum >= 3 && datum <= 9) { // Die Schonzeit wird geprüft
			schonzeitforelleLabel.setText("keine Schonzeit"); // Trifft die IF zu wird dieser Text gesetzt
			schonzeitforelleLabel.setTextFill(Color.GREEN); // Die Schriftfarbe wird auf Grün gesetzt
		}else { // Wen die IF nicht erfüllt ist
			schonzeitforelleLabel.setText("hat Schonzeit !"); // Die Schonzeit des Hechtes wird überprüft
			schonzeitforelleLabel.setTextFill(Color.RED); // Trift due IF nicht zu wird dieser Text gesetzt
		}
		// Der VBox wird das Label mit den Einstellungen übergeben
		vbox2Spalte3.getChildren().add(schonzeitforelleLabel);
		
		// 4. Spalte und 1. Box
		vbox1Spalte4.getChildren().addAll(schleieLabel,schleiebildLabel); // Vierte Linie erste Spalte mit Bild und Text
		// Die Schleie hat keien Schonzeit
			schonzeitschleieLabel.setText("keine Schonzeit"); // Text wird gesetzt
			schonzeitschleieLabel.setTextFill(Color.GREEN); // Die Schriftfarbe wird auf Grün gesetzt
		// Der VBox wird das Label mit den Einstellungen übergeben	
		vbox1Spalte4.getChildren().add(schonzeitschleieLabel);
		
		// 4. Spalte und 2. Box
		vbox2Spalte4.getChildren().addAll(karpfeLabel,karpfenbildLabel); // Vierte Linie zweite Spalte mit Bild und Text
		// Der Karpfe hat keine Schonzeit
			schonzeitkarpfeLabel.setText("keine Schonzeit"); // Text wird gesetzt
			schonzeitkarpfeLabel.setTextFill(Color.GREEN); // Die Schriftfarbe wird auf Grün gesetzt
		// Der VBox wird das Label mit den Einstellungen übergeben	
		vbox2Spalte4.getChildren().add(schonzeitkarpfeLabel);
		
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
		
		// Elemente werden der HauptVBox root hinzugefügt
		root.getChildren().addAll(fischeAuswahlLabel,hBoxSpalte1,hBoxSpalte2,hboxSpalte3,hboxSpalte4,hauptmenuButton); // Alle gefüllten Boxen werden der Hauptbox übergeben
		
		// Das root wird zurückgegeben um Angezeigt zu werden
		return root;
	}
	//
	// // Funktionen für die Button
	//
	
	// Funktion um das Hauptmenu aufzurufen und zu starten
	public void hauptMenuAufrufen(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this.main);
		main.getScene().setRoot(startGuiHauptmenu.buildHauptmenu());
		});
	}
	
}
