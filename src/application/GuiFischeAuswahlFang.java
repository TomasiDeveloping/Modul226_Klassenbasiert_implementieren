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

public class GuiFischeAuswahlFang {

	private Main main;
	public GuiFischeAuswahlFang(Main main) {
	this.main = main;
	}
	
	String string;
	public Pane startGuiFischeAuswahlFang() {
		
		// Die Hauptbox wird erstellt
		VBox root = new VBox(20); 
		// Ein Hintergrund Bild wird erstellt und �bergeben
		Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm()); // Ein Image wird erstellt und das Bild �bergeben
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Ein Background wird estellt und das Image mit dem Bild �bergene
		root.setBackground(background); // Der Hintergrund wird dem root hinzugef�gt
		
		//
		// // Alles Boxen werden erstellt
		//
						
		// HBox f�r die erste Spalte
		HBox hBoxSpalte1 = new HBox(100);
		// 2mal VBox um Button und Text anzuzeigen 
		VBox vBox1Spalte1 = new VBox();
		VBox vBox2Spalte1 = new VBox();
						
		// HBox f�r 2. Spalte
		HBox hBoxSpalte2 = new HBox(100);
		// 2 VBoxen f�r Bild und Text
		VBox vbox1Spalte2 = new VBox();
		VBox vbox2Spalte2 = new VBox();
						
		// HBox f�r die 3.Spalte
		HBox hboxSpalte3 = new HBox(100);
		// 2mal VBox f�r Bild und Text
		VBox vbox1Spalte3 = new VBox();
		VBox vbox2Spalte3 = new VBox();
						
		// HBox f�r die 4 Spalte
		HBox hboxSpalte4 = new HBox(100);
		// 2mal VBox f�r Bild und Text
		VBox vbox1Spalte4 = new VBox();
		VBox vbox2Spalte4 = new VBox();
						
		// Die Zoom In und Zoom Out wird �ber die Klaase Handling aufgerufen
		ButtonHandling zoomHandling = new ButtonHandling();
				
		//
		// // Button f�r die Fische werden erstellt
		//
						
		//Button f�r Hecht
		Button hechtbButton = new Button(); // Button wird erstellt
		hechtbButton.setId("Hecht"); // Eine ID wird gesetzt um den Button zu Identifizieren und den ID in ein String umzuwandeln
		Image hechtimage  = new Image(getClass().getResource("Hecht.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		hechtbButton.setGraphic(new ImageView(hechtimage)); // Das Bild wird dem Button �bergeben
		hechtbButton.setTranslateX(100); // X-Achse des Butons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(hechtbButton);
		zoomHandling.zoomOut(hechtbButton);
		// Funktion um das Pr�f GUI aufzurufen
		startGuiFangmethode(hechtbButton);
						
		// Button Zander
		Button zanderButton = new Button(); // Button wird erstellt
		zanderButton.setId("Zander"); // Eine ID wird gesetzt um den Button zu Identifizieren und den ID in ein String umzuwandeln
		Image zanderImage  = new Image(getClass().getResource("Zander.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		zanderButton.setGraphic(new ImageView(zanderImage)); // Das Bild wird dem Button �bergeben
		zanderButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(zanderButton);
		zoomHandling.zoomOut(zanderButton);
		// Funktion um das Pr�f GUI aufzurufen
		startGuiFangmethode(zanderButton);
						
		// Button Aal
		Button aalButton = new Button(); // Button wird erstellt
		aalButton.setId("Aal"); // Eine ID wird gesetzt um den Button zu Identifizieren und den ID in ein String umzuwandeln
		Image aalImage  = new Image(getClass().getResource("Aal.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		aalButton.setGraphic(new ImageView(aalImage)); // Das Bild wird dem Button �bergeben
		aalButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Zoom Out werden aufgerufen
		zoomHandling.zoomIn(aalButton);
		zoomHandling.zoomOut(zanderButton);
		// Funktion um das Pr�f GUI aufzurufen
		startGuiFangmethode(aalButton);
						
		// Button Aesche
		Button aescheButton = new Button(); // Button wird erstellt
		aescheButton.setId("�sche"); // Eine ID wird gesetzt um den Button zu Identifizieren und den ID in ein String umzuwandeln
		Image aescheImage  = new Image(getClass().getResource("Aesche.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		aescheButton.setGraphic(new ImageView(aescheImage)); // Das Bild wird dem Button �bergeben
		aescheButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(aescheButton);
		zoomHandling.zoomOut(aescheButton);
		// Funktion um das Pr�f GUI aufzurufen
		startGuiFangmethode(aescheButton);
						
		// Button Barsch
		Button barschButton = new Button(); // Button wird erstellt
		barschButton.setId("Flussbarsch"); // Eine ID wird gesetzt um den Button zu Identifizieren und den ID in ein String umzuwandeln
		Image barschImage  = new Image(getClass().getResource("Barsch.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		barschButton.setGraphic(new ImageView(barschImage)); // Das Bild wird dem Button �bergeben
		barschButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(barschButton);
		zoomHandling.zoomOut(barschButton);
		// Funktion um das Pr�f GUI aufzurufen
		startGuiFangmethode(barschButton);
						
		// Button Forelle
		Button forelleButton = new Button(); // Button wird erstellt
		forelleButton.setId("Forelle"); // Eine ID wird gesetzt um den Button zu Identifizieren und den ID in ein String umzuwandeln
		Image forelleImage  = new Image(getClass().getResource("Regenbogenforelle.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		forelleButton.setGraphic(new ImageView(forelleImage)); // Das Bild wird dem Button �bergeben
		forelleButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(forelleButton);
		zoomHandling.zoomOut(forelleButton);
		// Funktion um das Pr�f GUI aufzurufen
		startGuiFangmethode(forelleButton);

		// Button Schleie
		Button schleieButton = new Button(); // Button wird erstellt
		schleieButton.setId("Schleie"); // Eine ID wird gesetzt um den Button zu Identifizieren und den ID in ein String umzuwandeln
		Image schleieImage  = new Image(getClass().getResource("Schleie.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		schleieButton.setGraphic(new ImageView(schleieImage)); // Das Bild wird dem Button �bergeben
		schleieButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(schleieButton);
		zoomHandling.zoomOut(schleieButton);
		// Funktion um das Pr�f GUI aufzurufen
		startGuiFangmethode(schleieButton);
						
		// Button Karpfe
		Button karpfenButton = new Button(); // Button wird erstellt
		karpfenButton.setId("Karpfe"); // Eine ID wird gesetzt um den Button zu Identifizieren und den ID in ein String umzuwandeln
		Image karpfenImage = new Image(getClass().getResource("Schuppenkarpfen.png").toExternalForm()); // Ein Image mit dem Bild wird erstellt
		karpfenButton.setGraphic(new ImageView(karpfenImage)); // Das Bild wird dem Button �bergeben
		karpfenButton.setTranslateX(100); // X-Achse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(karpfenButton);
		zoomHandling.zoomOut(karpfenButton);
		// Funktion um das Pr�f GUI aufzurufen
		startGuiFangmethode(karpfenButton);
						
		// Button f�r das Hauptmenu wird erstellt
		Button hauptmenuButton = new Button("Hauptmen�"); // Button wird erstellt und Initialisiert
		hauptmenuButton.setFont(new Font(20)); // Schriftgr�sse
		hauptmenuButton.setScaleX(1.2); // Button wird mal 1.2 in der X Achse vergr�ssert
		hauptmenuButton.setScaleX(1.2); // Button wird mal 1.2 in der Y Achse vergr�ssert
		hauptmenuButton.setTranslateX(350); // X-Achse des Buttons
		// Zoom in und Out werden aufgerufen
		zoomHandling.zoomIn(hauptmenuButton);
		zoomHandling.zoomOut(hauptmenuButton);
		// Funktion f�r zur�ck zum Hauptmenu
		hauptmenuStart(hauptmenuButton);
				
		//
		// // Label f�r die Fisch Namen werden ersrellt und �berschrift
		//
						
		// Label Hecht
		Label hechtlabel = new Label("Hecht"); // Das Label mit dem Namen wird erstellt
		hechtlabel.setFont(new Font(40)); // Die Schriftgr�sse
		hechtlabel.setTranslateX(180); // X-Achse des Labels
						
		//Label Zander
		Label zanderLabel = new Label("Zander"); // DAs LAabel mit dem Namen wird erstellt
		zanderLabel.setFont(new Font(40)); // Schriftgr�sse
		zanderLabel.setTranslateX(160); // X-Achse des Labels
						
		// Label Aal
		Label aaLabel = new Label("Aal"); // Das Label mit dem Namen wird erstellt
		aaLabel.setFont(new Font(40)); // Schriftgr�sse
		aaLabel.setTranslateX(200); // X-Achse des Labels
						
		// Label Aesche
		Label aescheLabel = new Label("�sche"); // Das Label mit dem Namen wird erstellt
		aescheLabel.setFont(new Font(40)); // Schriftgr�sse
		aescheLabel.setTranslateX(180); // X-Achse des Labels
						
		// Label Barsch
		Label barschLabel = new Label("Flussbarsch"); // Das Label mit dem Namen wird erstellt
		barschLabel.setFont(new Font(40)); // Schriftgr�sse
		barschLabel.setTranslateX(130); // X-Achse des Labels
						
		// Label Forelle
		Label forelleLabel = new Label("Forelle"); // Das Label mit dem Namen wird erstellt
		forelleLabel.setFont(new Font(40)); // Schriftgr�sse
		forelleLabel.setTranslateX(180); // X-Achse des Labels
						
		// Label Schleie
		Label schleieLabel = new Label("Schleie"); // Das Label mit dem Namen wird erstellt
		schleieLabel.setFont(new Font(40)); // Schriftgr�sse
		schleieLabel.setTranslateX(170); // X-Achse des Labels
						
		// Label Karpfe
		Label karpfeLabel = new Label("Karpfe"); // Das Label mit dem Namen wird erstellt
		karpfeLabel.setFont(new Font(40)); // Schriftgr�sse
		karpfeLabel.setTranslateX(170); // X-Achse des Labels
						
						
		// Das Label f�r die �berschrift
		Label fischeAuswahlLabel = new Label("Fangmethode f�r den Fisch w�hlen:"); // Das Label wird mit dem Namen erstellt
		fischeAuswahlLabel.setFont(new Font(40)); // Schriftgr�sse
		fischeAuswahlLabel.setTranslateX(10); // X-Achse des Labels
						
		//				
		// // Die einzelnen VBoxen f�r die Fische werden gef�llt
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
		// // Die einzelnen HBoxen werden gef�llt f�r die Spalten in der Root
		//
		
		// HBox Spalte 1
		hBoxSpalte1.getChildren().addAll(vBox1Spalte1,vBox2Spalte1); // Die erste Spalte wird mit den zwei Boxen gef�llt
		// HBox Spalte 2
		hBoxSpalte2.getChildren().addAll(vbox1Spalte2,vbox2Spalte2); // Die zweite Spalte wird mit den zwei Boxen gef�llt
		// Hbox Spalte 3
		hboxSpalte3.getChildren().addAll(vbox1Spalte3,vbox2Spalte3); // Die dritte Spalte wird mit den zwei Boxen gef�llt
		// Hbox Spalte 4
		hboxSpalte4.getChildren().addAll(vbox1Spalte4,vbox2Spalte4); // Die vierte Spalte wird mit den zwei Boxen gef�llt
		
		//
		// // Elemente werden der HauptVBox root hinzugef�gt
		//
		root.getChildren().addAll(fischeAuswahlLabel,hBoxSpalte1,hBoxSpalte2,hboxSpalte3,hboxSpalte4,hauptmenuButton); // Alle gef�llten Boxen werden der Hauptbox �bergeben
		
		// Das root wird zur�ckgegeben um Angezeigt zu werden
		return root;
		
	}
	
	//
	// Funktionen f�r die Button
	//
	
	// Funktion um das Hauptmenu aufzurufen und starten
	public void hauptmenuStart(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this.main);
		main.getScene().setRoot(startGuiHauptmenu.buildHauptmenu());
		});
	}
	// Funktion um das Gui mit der Fangmethode aufzurufen und starten
	public void startGuiFangmethode(Button button) {
		button.setOnAction((event) -> {
		// Ein String wird erstellt und die Button ID �bergeben
		String string = button.getId();
		GuiFangmethode startGuiFangmethode = new GuiFangmethode(this.main);
		main.getScene().setRoot(startGuiFangmethode.startGuiFangmethode(string)); // Der String wird �bergeben das das GUI mit der gew�hlten Einsetllung gestartet wird	
	});
	}
	
}


