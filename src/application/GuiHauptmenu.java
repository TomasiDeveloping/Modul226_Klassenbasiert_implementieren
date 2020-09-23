package application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GuiHauptmenu {

	private Main main;
	public GuiHauptmenu(Main main) {
		this.main = main;
	}
	
	
	
	public Pane buildHauptmenu() {
		
		// Das Root f�r das GUI wird erstellt
		StackPane root = new StackPane();
		// Ein Transparentes Bild wird himzugef�gt und dient als Hintergrundbild des GUI
		Image imageBackground  = new Image(getClass().getResource("transparent.png").toExternalForm());// Ein Image wird erstellt und das Bild �bergeben
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Ein BAckground wird erstellt und das Image mit dem Bild �bergeben
		root.setBackground(background); // Der Hintergrund mit dem Bild wird dem root �bergeben
		
		// Eine VBox dient als Grundger�st f�r das GUI
		VBox main = new VBox(40);
				
		// Eine HBox dient als Text und Logo der �berschrift
		HBox willkommenBox = new HBox();
		// Das Label f�r die �berschrift wird erstellt
		Label willkommenLabel = new Label("Fischer Club D�ttwiler Weiher"); // Text der �berschrift
		willkommenLabel.setTranslateX(10); // X-Achse in der Box
		willkommenLabel.setTranslateY(100); // Y-Achse in der Box
		willkommenLabel.setFont(new Font(50)); // Schriftgr�sse wird festgelegt
		willkommenLabel.setTextFill(Color.BLUE); // Schriftfarbe
		willkommenLabel.setEffect(new Reflection()); // Eine Reflektion des Text als Effekt
				
		// Das Label f�r das Logo wird erstellt
		Label bildLabel = new Label();
		Image logoImage = new Image(getClass().getResource("logo.PNG").toExternalForm()); // Ein Image mit dem Logo wird erstellt
		bildLabel.setGraphic(new ImageView(logoImage)); // Dem Label wird das Image mit dem Logo �bergeben
		bildLabel.setTranslateX(20); // X-Achse in der Box
		
		//
		// Button f�r das Hauptmenu
		//
		
		// Die zoom In und out werden erstellt
		ButtonHandling zoomHandling = new ButtonHandling();
		
		// Der erste Button wird erstellt
		Button schonzeitpruefenButton = new Button("Fische auf Ihre Schonzeit und Schonmass pr�fen");
		schonzeitpruefenButton.setFont(new Font(30)); // Schrifgr�sse des Buttons
		schonzeitpruefenButton.setTranslateX(100); //Die X-Achse des Buttons
		schonzeitpruefenButton.setTranslateY(60); // Die Y-Achse des Buttons
		schonzeitpruefenButton.setMaxWidth(700); // Die gr�sse des Buttons damit alle gleich gross sind am Schluss
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(schonzeitpruefenButton);
		zoomHandling.zoomOut(schonzeitpruefenButton);
		// Funktion wird aufgerufen f�r den Click Event
		startFischeAufSchonzeitPruefen(schonzeitpruefenButton);
				
		// Der zweite Butto wird erstellt
		Button fischeInDerSchonzeitButton = new Button("Fische und Ihre aktuelle Schonzeit anzeigen");
		fischeInDerSchonzeitButton.setFont(new Font(30)); // Schriftgr�sse
		fischeInDerSchonzeitButton.setTranslateX(100); // X-Achse
		fischeInDerSchonzeitButton.setTranslateY(60); // Y-Achse
		fischeInDerSchonzeitButton.setMaxWidth(700); // Gr�sse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(fischeInDerSchonzeitButton);
		zoomHandling.zoomOut(fischeInDerSchonzeitButton);
		// Funktion f�r den Button wird aufgerufen
		startFischeInDerSchonzeit(fischeInDerSchonzeitButton);
				
		// Der dritte Button wird erstellt
		Button infoFischButton = new Button("Fangmethoden f�r die Fische");
		infoFischButton.setFont(new Font(30)); // Schriftgr�sse
		infoFischButton.setTranslateX(100); // X-Achse
		infoFischButton.setTranslateY(60); // Y-Achse
		infoFischButton.setMaxWidth(700); // Gr��se des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(infoFischButton);
		zoomHandling.zoomOut(infoFischButton);
		// Funktion f�r Fische Auswahl f�r Infos
		startGuiFischeAuswahlFang(infoFischButton);

		// Der vierte Button wird erstellt
		Button vorschriftenButton = new Button("Vorschriften");
		vorschriftenButton.setFont(new Font(30)); // Schriftgr�sse
		vorschriftenButton.setTranslateX(100); // X-Achse
		vorschriftenButton.setTranslateY(60); // Y-Achse
		vorschriftenButton.setMaxWidth(700); // Button gr�sse
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(vorschriftenButton);
		zoomHandling.zoomOut(vorschriftenButton);
		// Funktion Gui Vorschriften aufrufen
		startGuiVorschriften(vorschriftenButton);
		
		// Der f�nfte Button f�r die Lizenz wird erstellt
		Button lizenzButton = new Button("Lizenz Anzeigen");
		lizenzButton.setFont(new Font(30)); // Schriftgr�sse
		lizenzButton.setTranslateX(100); // X-Achse
		lizenzButton.setTranslateY(60); // Y-Achse
		lizenzButton.setMaxWidth(700); // Button gr�sse
		// Zoom IN und OUT werden aufgerufen
		zoomHandling.zoomIn(lizenzButton);
		zoomHandling.zoomOut(lizenzButton);
		// Funktion Gui Lizenz starten
		startGuiLizenz(lizenzButton);
		
		//
		// Das Layout wird erstellt und gef�llt
		//
				
		// Der VBox wird das Titel Label und das Logo Label �bergeben
		willkommenBox.getChildren().addAll(willkommenLabel,bildLabel);
		// Der Hauptbox werden alle Label und Buttons �bergeben
		main.getChildren().addAll(willkommenBox,schonzeitpruefenButton,fischeInDerSchonzeitButton,infoFischButton,vorschriftenButton,lizenzButton);
		// Die mainBox wird dem root �bergeben
		root.getChildren().add(main);
		
		// Das root wird zur�ckgegeben um Angeziegt zu werden
		return root;
		
	}
	
	//
	// Funktionen um die gew�nschte Auswahl aufzurufen
	//
	
	// Funktion um das GUI Fische Auswahl aufzurufen und zu starten
	public void startFischeAufSchonzeitPruefen(Button button) {
		button.setOnAction((event) -> {
		GuiFischeAuswahlPruefen start = new GuiFischeAuswahlPruefen(this.main);
		main.getScene().setRoot(start.startGuiFischeAuswahl());
	});
	}
	// Funktion um das GUI mit den Fischen mit en aktuellen Schonzeiten aufzurufen und zu starten
	public void startFischeInDerSchonzeit(Button button) {
		button.setOnAction((event) -> {
		GuiFischeInDerSchonzeit start = new GuiFischeInDerSchonzeit(this.main);
		main.getScene().setRoot(start.buildGuiInDerSchonzeit());	
		});	
	}
	// Funktion um das GUI mit der Lizenz aufzurzufen und zu starten
	public void startGuiLizenz(Button button) {
		button.setOnAction((event) -> {
		GuiLizenz start = new GuiLizenz(this.main);
		main.getScene().setRoot(start.startGuiLizenz());
		});
	}
	// Funktion um das GUI mit der Fischeauswahl f�r die Fangmethode aufzurufen und zu starten
	public void startGuiFischeAuswahlFang(Button button) {
		button.setOnAction((event) -> {
		GuiFischeAuswahlFang start = new GuiFischeAuswahlFang(this.main);
		main.getScene().setRoot(start.startGuiFischeAuswahlFang());
		});
	}
	// Funktion um das Vorschriften GUI aufzurufen und zu starten
	public void startGuiVorschriften(Button button) {
		button.setOnAction((event) -> {
		GuiVorschriften start = new GuiVorschriften(this.main);
		main.getScene().setRoot(start.startGuiVorschriften());
});
	}
	
}
