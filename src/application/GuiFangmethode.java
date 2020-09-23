package application;
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

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class GuiFangmethode {

	private Main main;
	public GuiFangmethode(Main main) {
		this.main = main;
	}
	public Pane startGuiFangmethode(String string) {
		
		
		String fischNameString = string; // String wird durch den gewählten Button übergeben
		
		String fischString = ""; // In diesen String kommt der Link zum Bild
		// Strings für die einzelnen Texte
		String fangmethodeString = "";
		String ruteString = "";
		String rolleString = "";
		String hauptschnurString = "";
		String vorfachMontageString = "";
		String hackensystemString = "";
		String koederString = "";
		String fangzeitString = "";
		String tippString = "";
		
		// Eine Switch Case wird erstellt um die Strings anhand des gewählten Buttons zu Initialisieren
		switch (fischNameString) {
		
		case "Hecht":		fischString = "Hecht.png"; // Das Bild für den Hecht wird dem String übergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Angeln mit der Pose, allgemeines Spinnfischen (Kunstköder), Jerken, Jiggen";
							ruteString = "z.B. Spinnrute, 2,70 m, 40-80 gr. Wurfgewicht";
							rolleString = "Stationärrolle (Spinnrolle) oder Baitcastrolle";
							hauptschnurString = "geflochtene oder monofile (z.B. Fluorcarbon) Schnur mit ca. 10-15 kg Tragkraft";
							vorfachMontageString = "Stahlvorfach oder Hardmono";
							hackensystemString = "z.B. Größe 2 - 4/0 (Drilling empfohlen)";
							koederString = "toter Köderfisch, bei Kunstködern: Spinner, Twister, Gummifische, Wobbler, Jerkbait";
							fangzeitString = "Hechte fängt man während des ganzen Jahre, am besten im Herbst - Achtung: Schonzeiten und Mindestmaße beachten!";
							tippString = "vorzugsweise Stahlvorfächer (eventl. Hardmono) verwenden, da das Gebiss des Hechts die Hauptschnur ansonsten durchtrennt";
							break;
									
		case "Zander":  	fischString = "Zander.png"; // Bild für den Zander wird übergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Dropshotten, Jiggen, Jerken, Spinnfischen, Grundangel mit Köderfisch";
							ruteString = "je nach Angelmethode Ruten zwischen 1,80 - 3,00 m";
							rolleString = "z.B. Stationärrolle (Spinnrolle) oder (empfohlen) Baitcastrolle";
							hauptschnurString = "geflochtene oder monofile (Fluorcarbon) Schnur";
							vorfachMontageString = "unterschiedlich, je nach Angelmethode (monofil, geflochten, Stahlvorfach)";
							hackensystemString = "unterschiedlich, je nach Angelmethode";
							koederString = "toter Köderfisch, bei Kunstködern: Spinner, Twister, Gummifische, Jerkbait";
							fangzeitString = "In klaren Gewässern am besten während der Abenddämmerung oder der Morgendämmerung. Auch während der Nacht.";
							tippString = "Nachtaktiver Raubfisch, sehr vorsichtiger Fisch. Zander sehen sehr gut! Als Köder favorisieren wir Gummifische";
							break;
									
		case "Aal":			fischString = "Aal.png"; // Bild für den Aal wird übergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Grundangeln mit Laufbleimontage, Posenangeln ";
							ruteString = "z.B. Grundrute (3,20-3,60 m, 30-80 gr)";
							rolleString = "Stationärrolle";
							hauptschnurString = "0,30 - 0,35 monofil";
							vorfachMontageString = "0,20";
							hackensystemString = "z.B. 4-6";
							koederString = "Tauwurm, Köderfisch, Fischfetzen";
							fangzeitString = "Mai - September, am besten in der Nacht (tagsüber kann auch klappen).Sommernächste nach einem Gewitter ";
							tippString = "Schnur lieber etwas stärker wählen, da der Aal nach dem Biss immer versucht, sich am Boden zwischen den Steinen zu verstecken.";
							break;
							
		case "Äsche":		fischString = "Aesche.png"; // Bild für die Äsche wird übergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Fliegenfischen";
							ruteString = "Fliegenrute";
							rolleString = "Fliegenrolle";
							hauptschnurString = "mit Trockenfliege: Ausrüstung der Klasse 4-5 mit Schwimmschnur (DT-F).";
							vorfachMontageString = "0,18 - 0,12";
							hackensystemString = "Größe 14 - 22";
							koederString = "Nassfliegen, Nymphen";
							fangzeitString = "Juni - Dezember. Die beste Fangzeit ist der Herbst.";
							tippString = "Im Sommer sind die besten Fangplätze schnellfließende, sauerstoffreiche Stellen, im Winter ruhigere, tiefe Bereiche. ";
							break;
									
		case "Flussbarsch":	fischString = "Barsch.png"; // Bild für den Egli wird übergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Grundangeln mit Laufbleimontage, Angeln mit der Pose, Spinnfischen (Kunstköder), Drop-Shot-Angeln, ";
							ruteString = "z.B. Spinnrute, 2,70 m, 20-50 gr. Wurfgewicht oder Drop-Shot-Rute, 2,40-2,70 m";
							rolleString = "z.B. Stationärrolle (Spinnrolle) oder Baitcastrolle";
							hauptschnurString = "geflochtene oder monofile (Fluorcarbon) Schnur mit ca. 2,5 - 4 kg Tragkraft";
							vorfachMontageString = "ca. 2 - 3 kg Tragkraft";
							hackensystemString = "z.B. Drop-Shot-Haken Größe 1-2/0";
							koederString = "z.B. bei Kunstködern: kleine Spinner, Twister, Gummifische";
							fangzeitString = "während des ganzen Jahre, am besten im Herbst";
							tippString = "Barsche können auch mit Naturködern wie z.B. Maden, Würmern oder kleinen Köderfischen bzw. Fischfetzen beangelt werden.";
							break;
									
		case "Forelle":		fischString = "Regenbogenforelle.png"; // Bild für die Forelle wird übergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Posen-Schleppfischen, Fliegenfischen, Spinnfischen, Schleppen mit Sbirolinos";
							ruteString = "Matchrute, Fliegenrute, Spinnrute, Sbirolinorute (3,30 - 4,60 m, ca. 30-60 gr. WG)";
							rolleString = "Stationärrolle, Fliegenrolle";
							hauptschnurString = "0,18 - 0,25 monofil";
							vorfachMontageString = "0,16 - 0,20";
							hackensystemString = "6er - 8er";
							koederString = "Fliegenmaden, Bienenmaden, Insekten, kleine Köderfische, Wobbler, Spinner, künstliche Fliegen. Forellenteig";
							fangzeitString = "das ganze Jahr (außerhalb der Schonzeiten)";
							tippString = "Forellen sind gute Kämpfer und liefern einen guten Drill (daher nur gute Materialien verwenden)";
							break;
									
		case "Schleie":		fischString = "Schleie.png"; // Bild für die Schleie wird übergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Posenfischen, Grundangel mit Laufbleimontage, Feedern mit Futterkorb";
							ruteString = "Matchrute, Stipprute, Grundrute, Feederrute (3,60 - 4,20 m, 30 - 70 gr WG)";
							rolleString = "Stationärrolle, kleine Multirolle";
							hauptschnurString = "0,16 - 0,20 monofil (ca. 2,5 - 4 kg Tragkraft)";
							vorfachMontageString = "0,14 - 0,18 (ca. 2 - 3 kg Tragkraft)";
							hackensystemString = "10 (maximal), 12, 14";
							koederString = "Top Köder: Mistwürmer (Rotwürmer), Teile von Tauwürmern - auch: Maden, Pinkies, Mais, Schnecken";
							fangzeitString = "am besten von Mai-September: früh am Morgen oder bei der Dämmerung. Gut sind warme Sommertage nach einem leichten Regen";
							tippString = "Schleien sind sehr scheue Fische und beißen äußerst vorsichtig. Sie stehen meistens mitten oder am Rand von Wasserpflanzen";
							break;
									
		case "Karpfe":		fischString = "Schuppenkarpfen.png"; // Bild für den Karpfen wird übergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Grundfischen mit auftreibendem Köder";
							ruteString = "z.B. Karpfenrute (Testkurve 2,5 lb)";
							rolleString = "Stationärrolle, robuste Ausführung!";
							hauptschnurString = "0,30-0,35 monofile Schnur";
							vorfachMontageString = "geflochtenes Vorfach (Soft Carp Braid)";
							hackensystemString = "6er-4er (scharf und dünndrahtig)";
							koederString = "Boilies (süß), Hartmais (Kette): Köder auftreiben lassen (Pop-Up). Außerdem kann auch Schwimmbrot an präsentiert werden.";
							fangzeitString = "Mai bis Juni bei Wassertemperaturen von 18-20° C. Bei diesen Temperaturen ist auch im Stillwasser genügend Sauerstoff vorhanden.";
							tippString = "Karpfen schwimmen bei Biss oftmals auf den Angler zu - daher unbedingt Swinger einsetzen.";
							break;
				}
		
		// Button Handling für Zoom In und Out
		ButtonHandling zoomHandling = new ButtonHandling();	
		
		// Hauptbox für das Gui
		AnchorPane root = new AnchorPane();
		// Ein Background für das root wird erstellt mit Bild
		Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm()); // Image wird erstellt und das Bild übergeben
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Background wird erstellt und das Image übergeben
		root.setBackground(background); // Der Background wird dem root hinzugefügt 
							
		//
		// Die Label werden erstellt
		//
					
		// Das Label für den Titel		
		Label ueberSchriftLabel = new Label("Fangmethode für den gewählten Fisch:"); // Das Label wird erstellt und Initialisiert
		ueberSchriftLabel.setFont(new Font(40)); // Schriftgrösse
		ueberSchriftLabel.setTranslateX(40); // X-Achse im Fenster
					
		// Label für das Fischbild
		Label fischbildLabel = new Label(); // Das Label wird erstellt
		Image fischImage = new Image(getClass().getResource(fischString).toExternalForm()); // Das bild wird über die Switch Case initialisiert
		fischbildLabel.setGraphic(new ImageView(fischImage)); // Bild wird dem Label hinzugefügt
		fischbildLabel.setTranslateX(320); // X-Achse im Fenster
		fischbildLabel.setTranslateY(170); // Y-Aschse
		fischbildLabel.setScaleX(1.3); // Das Label wird vergrössert in der X-Achse
		fischbildLabel.setScaleY(1.3); // Das Label wird vergrössert in der Y-Achse
					
		// Label für den Fischnamen		
		Label fischnameLabel = new Label(fischNameString); // Der Name wird mir der Button ID aus dem Gui FischeAuswahlPrüfen übergeben
		fischnameLabel.setFont(new Font(35)); // Schriftgrösse
		fischnameLabel.setTranslateX(380); // X-Achse
		fischnameLabel.setTranslateY(100); // Y-Achse
		
		// Label empfohlene Angelmethode
		Label fangmethodeTiteLabel = new Label("empfohlende Angelmethode:"); // Das Label wird erstellt und Initialisiert
		fangmethodeTiteLabel.setTranslateX(20);	// X-Achse im root
		fangmethodeTiteLabel.setTranslateY(350); // Y-Achse im root
		fangmethodeTiteLabel.setFont(Font.font("Verdana",FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgrösse
		
		// Label für den String der Angelmethode
		Label fangmethodeTextLabel = new Label(fangmethodeString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		fangmethodeTextLabel.setTranslateX(20); // X-Achse im root
		fangmethodeTextLabel.setTranslateY(370); // Y-Achse im root
		fangmethodeTextLabel.setFont(Font.font("Verdana",FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// Label für Rute
		Label ruteTiteLabel = new Label("Rute:"); // Das Label wird erstellt und Initialisiert
		ruteTiteLabel.setTranslateX(20); // X-Achse im root
		ruteTiteLabel.setTranslateY(400); // Y-Achse im root
		ruteTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16));; // Schriftart, FETT, Schriftgrösse
		
		// Label für den String Rute
		Label ruteTextLabel = new Label(ruteString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		ruteTextLabel.setTranslateX(20); // X-Achse im root
		ruteTextLabel.setTranslateY(420); // Y-Achse im root
		ruteTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// LAbel für Rolle
		Label rolleTiteLabel = new Label("Rolle:"); // Das Label wird erstellt und Initialisiert
		rolleTiteLabel.setTranslateX(20); // X-Achse im root
		rolleTiteLabel.setTranslateY(450); // Y-Achse im root
		rolleTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgrösse
		
		// Label für den String Rolle
		Label rolleTextLabel = new Label(rolleString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		rolleTextLabel.setTranslateX(20); // X-Achse im root
		rolleTextLabel.setTranslateY(470); // Y-Achse im root
		rolleTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// Label für Hauptschnur
		Label hauptschnurTiteLabel = new Label("Hauptschnur:"); // Das Label wird erstellt und Initialisiert
		hauptschnurTiteLabel.setTranslateX(20); // X-Achse im root
		hauptschnurTiteLabel.setTranslateY(500); // Y-Achse im root
		hauptschnurTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgrösse
		
		// Label für den String Hauptschnur
		Label hauptschnurTextLabel = new Label(hauptschnurString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		hauptschnurTextLabel.setTranslateX(20); // X-Achse im root
		hauptschnurTextLabel.setTranslateY(520); // Y-Achse im root
		hauptschnurTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// Label für Vorfach und Montage
		Label vorfachmontageTiteLabel = new Label("Vorfach, Montage:"); // Das Label wird erstellt und Initialisiert
		vorfachmontageTiteLabel.setTranslateX(20); // X-Achse im root
		vorfachmontageTiteLabel.setTranslateY(550); // Y-Achse im root
		vorfachmontageTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgrösse
		
		// Label für den String Vorfach und Montage
		Label vorfachmontageTextLabel = new Label(vorfachMontageString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		vorfachmontageTextLabel.setTranslateX(20); // X-Achse im root
		vorfachmontageTextLabel.setTranslateY(570); // Y-Achse im root
		vorfachmontageTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// Label für Hacken und System
		Label hackensystemTiteLabel = new Label("Hacken, System:"); // Das Label wird erstellt und Initialisiert
		hackensystemTiteLabel.setTranslateX(20); // X-Achse im root
		hackensystemTiteLabel.setTranslateY(600); // Y-Achse im root
		hackensystemTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgrösse
		
		// Label für den String Hacken und System
		Label hackensystemTextLabel = new Label(hackensystemString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		hackensystemTextLabel.setTranslateX(20); // X-Achse im root
		hackensystemTextLabel.setTranslateY(620); // Y-Achse im root
		hackensystemTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// Label für Köder
		Label koederTiteLabel = new Label("Köder:"); // Das Label wird erstellt und Initialisiert
		koederTiteLabel.setTranslateX(20); // X-Achse im root
		koederTiteLabel.setTranslateY(650); // Y-Achse im root
		koederTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgrösse
		
		// Label für den String Köder
		Label koederTextLabel = new Label(koederString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		koederTextLabel.setTranslateX(20); // X-Achse im root
		koederTextLabel.setTranslateY(670); // Y-Achse im root
		koederTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// Label für Fangzeit
		Label fangzeitTiteLabel = new Label("Fangzeit:"); // Das Label wird erstellt und Initialisiert
		fangzeitTiteLabel.setTranslateX(20); // X-Achse im root
		fangzeitTiteLabel.setTranslateY(700); // Y-Achse im root
		fangzeitTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgrösse
		
		// Label für den String Fangzeit
		Label fangzeitTextLabel = new Label(fangzeitString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		fangzeitTextLabel.setTranslateX(20); // X-Achse im root
		fangzeitTextLabel.setTranslateY(720); // Y-Achse im root
		fangzeitTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// Label für Tipps
		Label tipssTiteLabel = new Label("zusätzliche Tipps:"); // Das Label wird erstellt und Initialisiert
		tipssTiteLabel.setTranslateX(20); // X-Achse im root
		tipssTiteLabel.setTranslateY(750); // Y-Achse im root
		tipssTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgrösse
		
		// Label für den String Tipps
		Label tippsTextLabel = new Label(tippString); // Dem Label wird der String übergebn (Initialisiert in der Switch)
		tippsTextLabel.setTranslateX(20); // X-Achse im root
		tippsTextLabel.setTranslateY(770); // Y-Achse im root
		tippsTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgrösse
		
		// Label für Fix Text nur Vorschläge
		Label vorschlagLabel = new Label("die nachfolgenden Beschreibungen sind nur Vorschläge - natürlich können auch andere Methoden bzw. Gerätschaften benutzt werden"); // Das Label wird erstellt und Initialisiert
		vorschlagLabel.setTranslateX(10); // X-Achse im root
		vorschlagLabel.setTranslateY(320); // Y-Achse im root
		vorschlagLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 11.5)); // Schriftart, FETT, Schriftgrösse
					
		// 
		// Button werden erstellt
		//
		
		// Button für Zurück zum Hauptmenu		
		Button zurueckButton = new Button("Hauptmenü"); // Button wird erstellt und Initialisiert
		zurueckButton.setTranslateX(100); // X-Achse
		zurueckButton.setTranslateY(820); // Y-Achse
		zurueckButton.setFont(new Font(20)); // Grösse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(zurueckButton);
		zoomHandling.zoomOut(zurueckButton);
		// Funktion wird dem Button übergeben 
		hauptmenuStart(zurueckButton);
					
		// Button für neuen Fisch wählen
		Button neuepruefungButton = new Button("Neuer Fisch wählen"); // Button wird erstellt und Initialisiert
		neuepruefungButton.setTranslateX(580); // X-Achse
		neuepruefungButton.setTranslateY(820); // Y-Achse
		neuepruefungButton.setFont(new Font(20)); // Grösse des Buttons
		//Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(neuepruefungButton);
		zoomHandling.zoomOut(neuepruefungButton);
		// Funktion für zurück zur Fische Auswahl
		fischeAuswahlStart(neuepruefungButton);
					
		// 
		// Das GUI wird zusammengesetzt 
		//
		root.getChildren().add(ueberSchriftLabel); // Titel wird der Box übergeben
		root.getChildren().add(fischnameLabel); // Fischname wird der Box übergeben
		root.getChildren().add(fischbildLabel); // Bild wird der Box übergeben
		root.getChildren().add(vorschlagLabel);
		root.getChildren().addAll(fangmethodeTiteLabel,fangmethodeTextLabel); // Fangmethode
		root.getChildren().addAll(ruteTiteLabel,ruteTextLabel); // Rute
		root.getChildren().addAll(rolleTiteLabel,rolleTextLabel); // Rolle
		root.getChildren().addAll(hauptschnurTiteLabel,hauptschnurTextLabel); // Hauptschnur
		root.getChildren().addAll(vorfachmontageTiteLabel,vorfachmontageTextLabel); // Vorfach und Montage
		root.getChildren().addAll(hackensystemTiteLabel,hackensystemTextLabel); // Hacken und System
		root.getChildren().addAll(koederTiteLabel,koederTextLabel); // Köder
		root.getChildren().addAll(fangzeitTiteLabel,fangzeitTextLabel); // Fangzeit
		root.getChildren().addAll(tipssTiteLabel,tippsTextLabel); // Tipps
		root.getChildren().add(zurueckButton); // Hauptmenü Butto wird hinzugefügt 
		root.getChildren().add(neuepruefungButton); // Neuer Fisch Prüfen Button wird hinzugefügt 
		
		// Das root wird zurückgegeben um Angezeigt zu werden
		return root;
	}
	
	//
	// Funktionen für die Button
	//
	
	// Für den Hauptmenu Nutton. Das Hauptmenu wird aufgerufen
	public void hauptmenuStart(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this.main);
		main.getScene().setRoot(startGuiHauptmenu.buildHauptmenu());
		});
	}
	// Für den neue Fisch wählen. Das Gui mit der Fisch Auswahl wird aufgerufen
	public void fischeAuswahlStart(Button button) {
		button.setOnAction((event) -> {
		GuiFischeAuswahlFang startGuiFischeAuswahl = new GuiFischeAuswahlFang(this.main);
		main.getScene().setRoot(startGuiFischeAuswahl.startGuiFischeAuswahlFang());
		});
	}
	
	
}
