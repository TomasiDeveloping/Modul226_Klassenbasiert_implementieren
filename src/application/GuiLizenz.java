package application;
import java.util.Calendar;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GuiLizenz {

	private Main main;
	public GuiLizenz(Main main) {
		this.main = main;
	}
	
	public Pane startGuiLizenz() {
		//
		// // Kalender und Datum berechnung für die Resttage der Lizenz
		//
		
		// Zwei Kalender werden erstellt
		Calendar cal = Calendar.getInstance(); // Dient für das jetztige Datum
		Calendar end = Calendar.getInstance(); // Dient um das Enddatum festzulegen
		// Das Enddatum wird dem Initialisierten Enddatum übergeben
		end.set(2020, 00, 01); // ACHTUNG Calendar startet bei Monat 0 ! // Plus 1 Tag damit der letzte Tag auch noch zählt
		// 3 long werden erstellt und das Datum in Milisekunden übergeben fütr eine genau berechnung der Resttage
		long start = cal.getTimeInMillis(); // Die Millisekunden des aktuellen Datum wird initialisiert
		long ende = end.getTimeInMillis(); // Die Millisekunden des Enddatum wird initialisiert
		// Die Berechnung: Durch 1000 gibt Sekunden. Durch 60 ergibt Minuten. Durch 60 ergibt Stunden und durch 24 ergiebt die Anzahl der Tage
		long diff = (ende - start) / 1000 / 60 / 60 / 24; 
		
		// 
		// // Die Strings für den User und die zwei Datums der Lizenz werden erstellt
		//
		//
		String nameString = "Tomasi";
		String vornameString = "Patrick";
		String strasseString = "Postgasse 10a";
		String wohnortString = "5079 Zeihen";
		// String für Lizenz Datum
		String erterTagString = "01.01.2019";
		String letzterTagString = "31.12.2019";
		
		//
		// // Funktion für die Zoom Funktion wird erstellt
		//
		ButtonHandling zoomHandling = new ButtonHandling();
		
		// 
		// // GUI 
		//
		AnchorPane root = new AnchorPane(); // Dient als root für das GUI
		
		// Ein Transparentes Bild wird in ein Image übergeben für den Hintergrund des GUI
		Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm());
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Das Image wird dem Background übergeben
		root.setBackground(background); // Der Hintergrund wird dem root hinzugefügt
		
		//
		// // Label werden erstellt
		//
		Label titeLabel = new Label("Lizenz"); // Das Titel Label wird erstellt und mit Text initialisiert
		titeLabel.setFont(new Font(50)); // Schriftgrösse
		titeLabel.setTranslateX(50); // X-Achse
		
		Label fotoLabel = new Label(); // Label für das Passfoto wird erstellt
		Image userFotoImage = new Image(getClass().getResource("Passfoto.png").toExternalForm()); // Ein Image mit dem Passfoto wird erstellt
		fotoLabel.setGraphic(new ImageView(userFotoImage)); // Das Image wird dem Label übergeben
		fotoLabel.setScaleX(0.7); // Die X-Grösse des Labels wird erstellt
		fotoLabel.setScaleY(0.7); // Die Y-Grösse des Labels wird erstellt
		fotoLabel.setTranslateX(350); // X-Achse im root
		fotoLabel.setTranslateY(50); // Y-Achse im root
		
		Label nameLabel = new Label("Name:"); // Das Label mit dem Text wird erstellt und Initialisiert
		nameLabel.setFont(new Font(30)); // Schriftgrösse
		nameLabel.setTranslateX(50); // X-Achse im root
		nameLabel.setTranslateY(400); // Y-Achse im root
		
		Label vornameLabel = new Label("Vorname:"); // Das Label mit dem Text wird erstellt und Initialisiert
		vornameLabel.setFont(new Font(30)); // Schriftgrösse
		vornameLabel.setTranslateX(50); // X-Achse im root
		vornameLabel.setTranslateY(450); // Y-Achse im root
		
		Label strasseLabel = new Label("Strasse:"); // Das Label mit dem Text wird erstellt und Initialisiert
		strasseLabel.setFont(new Font(30)); // Schriftgrösse
		strasseLabel.setTranslateX(50); // X-Achse im root
		strasseLabel.setTranslateY(500); // Y-Achse im root
		
		Label wohnOrtLabel = new Label("Wohnort:"); // Das Label mit dem Text wird erstellt und Initialisiert
		wohnOrtLabel.setFont(new Font(30)); // Schriftgrösse
		wohnOrtLabel.setTranslateX(50); // X-Achse im root
		wohnOrtLabel.setTranslateY(550); // Y-Achse im root
		
		Label userNameLabel = new Label(nameString);  // Das Label wird erstellt und den String für den User Name übergeben
		userNameLabel.setFont(new Font(25)); // Schriftgrösse
		userNameLabel.setTranslateX(300); // X-Achse im root
		userNameLabel.setTranslateY(400); // Y-Achse im root
		
		Label userVornameLabel = new Label(vornameString); // Das Label wird erstellt und den String für den User vorname übergeben
		userVornameLabel.setFont(new Font(25)); // Schriftgrösse
		userVornameLabel.setTranslateX(300); // X-Achse im root
		userVornameLabel.setTranslateY(450); // Y-Achse im root
		
		Label userStrasseLabel = new Label(strasseString); // Das Label wird erstellt und den String für den User Strasse übergeben
		userStrasseLabel.setFont(new Font(25)); // Schriftgrösse
		userStrasseLabel.setTranslateX(300); // X-Achse im root
		userStrasseLabel.setTranslateY(500); // Y-Achse im root
		
		Label userWohnortLabel = new Label(wohnortString); // Das Label wird erstellt und den String für den User Wohnort übergeben
		userWohnortLabel.setFont(new Font(25)); // Schriftgrösse
		userWohnortLabel.setTranslateX(300); // X-Achse im root
		userWohnortLabel.setTranslateY(550); // Y-Achse im root
		
		Label gueltigkeitLabel = new Label("Gültigkeit:"); // Das Label mit dem Text wird erstellt und Initialisiert
		gueltigkeitLabel.setFont(new Font(30)); // Schriftgrösse
		gueltigkeitLabel.setTranslateX(50); // X-Achse im root
		gueltigkeitLabel.setTranslateY(650); // Y-Achse im root
		
		Label ersterTagLabel = new Label("Vom (erster Tag)"); // Das Label mit dem Text wird erstellt und Initialisiert
		ersterTagLabel.setFont(new Font(25)); // Schriftgrösse
		ersterTagLabel.setTranslateX(50); // X-Achse im root
		ersterTagLabel.setTranslateY(700); // Y-Achse im root
		
		Label letzterTagLabel = new Label("Bis (letzter Tag)"); // Das Label mit dem Text wird erstellt und Initialisiert
		letzterTagLabel.setFont(new Font(25)); // Schriftgrösse
		letzterTagLabel.setTranslateX(300); // X-Achse im root
		letzterTagLabel.setTranslateY(700); // Y-Achse im root
		
		Label startDatumLabel = new Label(erterTagString); // Das Label wird erstellt und der String füd das Start Datum übergeben
		startDatumLabel.setFont(new Font(25)); // Schriftgrösse
		startDatumLabel.setTranslateX(50); // X-Achse im root
		startDatumLabel.setTranslateY(740); // Y-Achse im root
		
		Label endDatumLabel = new Label(letzterTagString); // Das Label wird erstellt und der String für das End Datum übergeben
		endDatumLabel.setFont(new Font(25)); // Schriftgrösse
		endDatumLabel.setTranslateX(300); // X-Achse im root
		endDatumLabel.setTranslateY(740); // Y-Achse im root
		
		Label gueltikeitnochLabel = new Label("Gültigkeit noch: " + diff + " Tage"); // Das Label für die Lzenzdauer wird estellt und die berechneten Tage übergeben
		gueltikeitnochLabel.setFont(new Font(25)); // Schriftgrösse
		gueltikeitnochLabel.setTranslateX(50); // X-Achse im root
		gueltikeitnochLabel.setTranslateY(800); // Y-Achse im root
		// Mit einer If wird geprüft wielange die Lizenz Gültig ist und was entsprechend angezeigt wird im GUI
		if (diff <=3 && diff >=1) { // Ist die Differenz 3 oder kleiner aber grösser oder glecih einen Tag
			gueltikeitnochLabel.setTextFill(Color.ORANGE); // Trifft dies zu wird die Textfarbe auf Orange gesetzt
		}else if (diff <= 0) { // Ist die Differenz 0 oder kleiner:
			gueltikeitnochLabel.setText("Die Lizenz ist abgelaufen"); // Einer neuer Text wird übergeben
			gueltikeitnochLabel.setTextFill(Color.RED); // Die Textfarbe wird auf Rot gesetzt
		}else { // Trifft nichts davon zu also Lizenz ist länger als 3 Tage Gültig:
			gueltikeitnochLabel.setTextFill(Color.GREEN); // Im diesem Fall wird die Textfarbe auf Grün gesetzt
		}
		//
		// // Button für das zurück zum Hauptmenü
		//
		Button hauptMenuButton = new Button("Hauptmenü"); // Button wird erstellt und der Text Initialisiert
		hauptMenuButton.setFont(new Font(20)); // Schriftgrösse
		hauptMenuButton.setTranslateX(600); // X-Achse im root
		hauptMenuButton.setTranslateY(800); // Y-Achse im root
		// Funktionen für den Button werden aufgerufen
		startGuiHauptmenu(hauptMenuButton); // Funktion um das GUI Hauptmenu aufzurufen
		// Zoom In und Out 
		zoomHandling.zoomIn(hauptMenuButton);
		zoomHandling.zoomOut(hauptMenuButton);
		
		//
		// // Dem root werden alle Label und der Button übergeben
		//
		root.getChildren().addAll(titeLabel, fotoLabel, nameLabel, vornameLabel, strasseLabel, wohnOrtLabel, userNameLabel, userVornameLabel, userStrasseLabel, userWohnortLabel, gueltigkeitLabel);
		root.getChildren().addAll(ersterTagLabel, letzterTagLabel,startDatumLabel,endDatumLabel,gueltikeitnochLabel,hauptMenuButton);
		
		// Der ertsellte root wird zurückgegeben um Angezeigt zu werden
		return root;
		
	}
	//
	// // Funktion um das Hauptmenu GUI aufzurufen und zu starten
	//

	public void startGuiHauptmenu(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu start = new GuiHauptmenu(this.main);
		main.getScene().setRoot(start.buildHauptmenu());
			
		
	});
	}
	
	
}
