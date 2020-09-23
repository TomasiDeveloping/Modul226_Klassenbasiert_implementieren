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
		
		// Das Root für das GUI wird erstellt
		StackPane root = new StackPane();
		// Ein Transparentes Bild wird himzugefügt und dient als Hintergrundbild des GUI
		Image imageBackground  = new Image(getClass().getResource("transparent.png").toExternalForm());// Ein Image wird erstellt und das Bild übergeben
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Ein BAckground wird erstellt und das Image mit dem Bild übergeben
		root.setBackground(background); // Der Hintergrund mit dem Bild wird dem root übergeben
		
		// Eine VBox dient als Grundgerüst für das GUI
		VBox main = new VBox(40);
				
		// Eine HBox dient als Text und Logo der überschrift
		HBox willkommenBox = new HBox();
		// Das Label für die überschrift wird erstellt
		Label willkommenLabel = new Label("Fischer Club Dättwiler Weiher"); // Text der überschrift
		willkommenLabel.setTranslateX(10); // X-Achse in der Box
		willkommenLabel.setTranslateY(100); // Y-Achse in der Box
		willkommenLabel.setFont(new Font(50)); // Schriftgrösse wird festgelegt
		willkommenLabel.setTextFill(Color.BLUE); // Schriftfarbe
		willkommenLabel.setEffect(new Reflection()); // Eine Reflektion des Text als Effekt
				
		// Das Label für das Logo wird erstellt
		Label bildLabel = new Label();
		Image logoImage = new Image(getClass().getResource("logo.PNG").toExternalForm()); // Ein Image mit dem Logo wird erstellt
		bildLabel.setGraphic(new ImageView(logoImage)); // Dem Label wird das Image mit dem Logo übergeben
		bildLabel.setTranslateX(20); // X-Achse in der Box
		
		//
		// Button für das Hauptmenu
		//
		
		// Die zoom In und out werden erstellt
		ButtonHandling zoomHandling = new ButtonHandling();
		
		// Der erste Button wird erstellt
		Button schonzeitpruefenButton = new Button("Fische auf Ihre Schonzeit und Schonmass prüfen");
		schonzeitpruefenButton.setFont(new Font(30)); // Schrifgrösse des Buttons
		schonzeitpruefenButton.setTranslateX(100); //Die X-Achse des Buttons
		schonzeitpruefenButton.setTranslateY(60); // Die Y-Achse des Buttons
		schonzeitpruefenButton.setMaxWidth(700); // Die grösse des Buttons damit alle gleich gross sind am Schluss
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(schonzeitpruefenButton);
		zoomHandling.zoomOut(schonzeitpruefenButton);
		// Funktion wird aufgerufen für den Click Event
		startFischeAufSchonzeitPruefen(schonzeitpruefenButton);
				
		// Der zweite Butto wird erstellt
		Button fischeInDerSchonzeitButton = new Button("Fische und Ihre aktuelle Schonzeit anzeigen");
		fischeInDerSchonzeitButton.setFont(new Font(30)); // Schriftgrösse
		fischeInDerSchonzeitButton.setTranslateX(100); // X-Achse
		fischeInDerSchonzeitButton.setTranslateY(60); // Y-Achse
		fischeInDerSchonzeitButton.setMaxWidth(700); // Grösse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(fischeInDerSchonzeitButton);
		zoomHandling.zoomOut(fischeInDerSchonzeitButton);
		// Funktion für den Button wird aufgerufen
		startFischeInDerSchonzeit(fischeInDerSchonzeitButton);
				
		// Der dritte Button wird erstellt
		Button infoFischButton = new Button("Fangmethoden für die Fische");
		infoFischButton.setFont(new Font(30)); // Schriftgrösse
		infoFischButton.setTranslateX(100); // X-Achse
		infoFischButton.setTranslateY(60); // Y-Achse
		infoFischButton.setMaxWidth(700); // Grööse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(infoFischButton);
		zoomHandling.zoomOut(infoFischButton);
		// Funktion für Fische Auswahl für Infos
		startGuiFischeAuswahlFang(infoFischButton);

		// Der vierte Button wird erstellt
		Button vorschriftenButton = new Button("Vorschriften");
		vorschriftenButton.setFont(new Font(30)); // Schriftgrösse
		vorschriftenButton.setTranslateX(100); // X-Achse
		vorschriftenButton.setTranslateY(60); // Y-Achse
		vorschriftenButton.setMaxWidth(700); // Button grösse
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(vorschriftenButton);
		zoomHandling.zoomOut(vorschriftenButton);
		// Funktion Gui Vorschriften aufrufen
		startGuiVorschriften(vorschriftenButton);
		
		// Der fünfte Button für die Lizenz wird erstellt
		Button lizenzButton = new Button("Lizenz Anzeigen");
		lizenzButton.setFont(new Font(30)); // Schriftgrösse
		lizenzButton.setTranslateX(100); // X-Achse
		lizenzButton.setTranslateY(60); // Y-Achse
		lizenzButton.setMaxWidth(700); // Button grösse
		// Zoom IN und OUT werden aufgerufen
		zoomHandling.zoomIn(lizenzButton);
		zoomHandling.zoomOut(lizenzButton);
		// Funktion Gui Lizenz starten
		startGuiLizenz(lizenzButton);
		
		//
		// Das Layout wird erstellt und gefüllt
		//
				
		// Der VBox wird das Titel Label und das Logo Label übergeben
		willkommenBox.getChildren().addAll(willkommenLabel,bildLabel);
		// Der Hauptbox werden alle Label und Buttons übergeben
		main.getChildren().addAll(willkommenBox,schonzeitpruefenButton,fischeInDerSchonzeitButton,infoFischButton,vorschriftenButton,lizenzButton);
		// Die mainBox wird dem root übergeben
		root.getChildren().add(main);
		
		// Das root wird zurückgegeben um Angeziegt zu werden
		return root;
		
	}
	
	//
	// Funktionen um die gewünschte Auswahl aufzurufen
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
	// Funktion um das GUI mit der Fischeauswahl für die Fangmethode aufzurufen und zu starten
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
