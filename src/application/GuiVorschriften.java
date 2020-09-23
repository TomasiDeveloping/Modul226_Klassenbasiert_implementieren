package application;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

public class GuiVorschriften {

	private Main main;
	public GuiVorschriften(Main main) {
		this.main = main;
	}
	
	public Pane startGuiVorschriften() {
		
		// Als root wird ein TextFlow gewählt da die Vorschriften ausschliessich aus Text besteht
		TextFlow root = new TextFlow();
		
		// Das transparente Bild für den Hintergrund wird geladen
		Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm()); // Bild wird in ein Image gespeichert
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Ein Background Image wird erstellt und das Bild übergeben
		root.setBackground(background); // Das Hintergrundbild wird dem root übergeben
		// Die Textausrichtung wird bestimmt und auf Center gesetzt
		root.setTextAlignment(TextAlignment.CENTER);
		// Die Spaltenlinie zwischen den einzelnen Texte wird erhöht für ein schöneres Design
		root.setLineSpacing(10);
		// Die Funktion für das Button zoomen wird erstellt
		ButtonHandling zoomHandling = new ButtonHandling();
		
		//
		// // Die Strings für die einzelnen Textfelder werden erstellt und implementiert
		//
		String vorschriftenString = "Der Inhaber dieser Karte ist berechtigt im Dättwilerweiher vom Ufer aus und mit dem Boot zu fischen und"
				+ " hat folgendes zu bachten: \n ";
		
		String pfeil = "\u2B9A";
		String regel1 = "      " + pfeil + " Der Ausweis ist persönlich und nicht übertragbar.\n";
		String regel2 = "      " + pfeil + " Der Inhaber des Jahrespatent ist berechtigt einen Gastfischer mitzunehmen.\n";
		String regel3 = "      " + pfeil + " Pro Patent sind zwei Schnüre (2 Angelruten) erlaubt."
				+ " Der Gastfischer darf mit einer Schnur (1 Angelrute) fischen.\n";
		String regel4 = "      " + pfeil + " Von den nachstehend aufgeführten Fischen, Hecht und Zander, dürfen insgesamt pro Patentinhaber und Tag"
				+ " nicht mehr als drei Fische mitgenommen werden\n";
		String regel5 = "      " + pfeil + " Die Fischerei ist das ganze Jahr offen, ausgenommen Hecht und Zander, die vom 1. Januar - 30. April"
				+ " nicht gefischt werden dürfen.\n";
		String regel6 = "      " + pfeil + " Vorsichtsmassnahmen und Verhaltensregeln in Sachen Krebspest (Das Merkblatt hat der Karteninhaber"
				+ " gegen Unterschrift erhalten).\n";
		String regel7 = "      " + pfeil + " Schonmasse, die vom Vorsitzenden festgelegt wurden, sind einzuhalten, egal ob sie von eidgenössichen"
				+ " oder kantonalen Bestimmungen abweichen.\n";
		String regel8 = "      " + pfeil + " Auf Grund von neuen Fischereivorschriften muss eine Fangstatistik geführt werden.\n";
		String regel9 = "      " + pfeil + " Im übrigen gelten die kantonalen Vorschriften.\n";
		String endtext = "FISCHERCLUB DÄTTWILERWEIHER\n";
		String datumString = "Baden, 1 Januar 2018\n";
		
		//
		// // Text Layouts werden erstellt und die Strings übergeben
		//
		// Das Textlayout für den Titel wird erstellt und initialisiert
		Text titeLtext = new Text("Vorschriften:\n"); // Text wird übergeben
		titeLtext.setFont(Font.font("Verdana", FontWeight.BOLD, 40)); // Grösse wird erstellt und den Text auf Fett gestellt
		
		Text ueberschrifText = new Text(vorschriftenString); // Text für die überschriuft wird übergeben
		ueberschrifText.setTranslateY(50); // Y-Achse 
		ueberschrifText.setFont(Font.font("Verdana", FontWeight.BOLD, 18)); // Schriftart, Grösse und kursiv wird gesetzt
		
		Text regel1Text = new Text(regel1); // String für Regel 1 wird übergeben
		regel1Text.setTranslateY(80); // Y-Achse
		regel1Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
	
		Text regel2Text = new Text(regel2); // String für Regel 2 wird übergeben
		regel2Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
		regel2Text.setTranslateY(90); // Y-Acshe
		
		Text regel3Text = new Text(regel3); // String für Regel 3 wird übergeben
		regel3Text.setTranslateY(100); // Y- Achse
		regel3Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
		
		Text regel4Text = new Text(regel4); // String für Regel 4 wird übergeben
		regel4Text.setTranslateY(110); // Y-Acshe
		regel4Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
		
	
		Text regel5Text = new Text(regel5); // String für Regel 5 wird übergeben
		regel5Text.setTranslateY(120); // Y-Acshe
		regel5Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
		
		Text regel6Text = new Text(regel6); // String für Regel 6 wird übergeben
		regel6Text.setTranslateY(130); // Y-Acshe
		regel6Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
		
		Text regel7Text = new Text(regel7); // String für Regel 7 wird übergeben
		regel7Text.setTranslateY(140); // Y-Acshe
		regel7Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
		
		Text regel8Text = new Text(regel8); // String für Regel 8 wird übergeben
		regel8Text.setTranslateY(150); // Y-Acshe
		regel8Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
		
		Text regel9Text = new Text(regel9); // String für Regel 9 wird übergeben
		regel9Text.setTranslateY(160); // Y-Acshe
		regel9Text.setFont(Font.font("Verdana", FontPosture.ITALIC, 18)); // Schriftart, Grösse, kursiv
		
		Text endText = new Text(endtext); // String für End Text wird übergeben
		endText.setTranslateY(180); // Y-Acshe
		endText.setFont(Font.font("Verdana", FontWeight.BOLD, 18)); // Schriftart, Grösse, FETT
		
		Text datumText = new Text(datumString); // String für das Datum wird übergeben
		datumText.setTranslateY(200); // Y-Acshe
		datumText.setTranslateX(300); // X-Acshe
		datumText.setFont(Font.font("Verdana", FontWeight.BOLD, 14)); // Schriftart, Grösse, FETT
		
		//
		// // Button für zurück zum Hauptmenu wird erstellt.
		//
		Button hauptmenuButton = new Button("Hauptmenü"); // Der Button wird erstellt und mit dem Text initialisiert
		hauptmenuButton.setTranslateY(200); // Y-Achse des Buttons
		hauptmenuButton.setMinSize(200, 50); // X-Achse des Buttons
		hauptmenuButton.setFont(new Font(25)); // Schriftgrösse des Buttons wird übergeben
		// Die Zoom Funktion wird aufgerufen
		zoomHandling.zoomIn(hauptmenuButton);
		zoomHandling.zoomOut(hauptmenuButton);
		// Die Funktion um das Hauptmenu GUI zu laden wird übergeben
		hauptMenuAufrufen(hauptmenuButton);
		
		//
		// // Die Layouts werden dem Root übergeben
		//
		// Titel wird übergeben
		root.getChildren().add(titeLtext);
		// überschrift und alle Regeln werden übergeben
		root.getChildren().addAll(ueberschrifText,regel1Text,regel2Text,regel3Text,regel4Text,regel5Text,regel6Text,regel7Text,regel8Text,regel9Text);
		// Der End Text das Datum und der Button werden übergeben
		root.getChildren().addAll(endText,datumText,hauptmenuButton);
		
		// Der root wird zurückgegeben um angezeigt zu werden
		return root;
		
	}
	//
	// // Funktionen
	//
	// Funktion für den Button um das Hauptmenu GUI aufzurufen
	public void hauptMenuAufrufen(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this.main);
		main.getScene().setRoot(startGuiHauptmenu.buildHauptmenu());
			
		
	});
	}
	
	
}
