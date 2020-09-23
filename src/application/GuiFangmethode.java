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
		
		
		String fischNameString = string; // String wird durch den gew�hlten Button �bergeben
		
		String fischString = ""; // In diesen String kommt der Link zum Bild
		// Strings f�r die einzelnen Texte
		String fangmethodeString = "";
		String ruteString = "";
		String rolleString = "";
		String hauptschnurString = "";
		String vorfachMontageString = "";
		String hackensystemString = "";
		String koederString = "";
		String fangzeitString = "";
		String tippString = "";
		
		// Eine Switch Case wird erstellt um die Strings anhand des gew�hlten Buttons zu Initialisieren
		switch (fischNameString) {
		
		case "Hecht":		fischString = "Hecht.png"; // Das Bild f�r den Hecht wird dem String �bergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Angeln mit der Pose, allgemeines Spinnfischen (Kunstk�der), Jerken, Jiggen";
							ruteString = "z.B. Spinnrute, 2,70 m, 40-80 gr. Wurfgewicht";
							rolleString = "Station�rrolle (Spinnrolle) oder Baitcastrolle";
							hauptschnurString = "geflochtene oder monofile (z.B. Fluorcarbon) Schnur mit ca. 10-15 kg Tragkraft";
							vorfachMontageString = "Stahlvorfach oder Hardmono";
							hackensystemString = "z.B. Gr��e 2 - 4/0 (Drilling empfohlen)";
							koederString = "toter K�derfisch, bei Kunstk�dern: Spinner, Twister, Gummifische, Wobbler, Jerkbait";
							fangzeitString = "Hechte f�ngt man w�hrend des ganzen Jahre, am besten im Herbst - Achtung: Schonzeiten und Mindestma�e beachten!";
							tippString = "vorzugsweise Stahlvorf�cher (eventl. Hardmono) verwenden, da das Gebiss des Hechts die Hauptschnur ansonsten durchtrennt";
							break;
									
		case "Zander":  	fischString = "Zander.png"; // Bild f�r den Zander wird �bergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Dropshotten, Jiggen, Jerken, Spinnfischen, Grundangel mit K�derfisch";
							ruteString = "je nach Angelmethode Ruten zwischen 1,80 - 3,00 m";
							rolleString = "z.B. Station�rrolle (Spinnrolle) oder (empfohlen) Baitcastrolle";
							hauptschnurString = "geflochtene oder monofile (Fluorcarbon) Schnur";
							vorfachMontageString = "unterschiedlich, je nach Angelmethode (monofil, geflochten, Stahlvorfach)";
							hackensystemString = "unterschiedlich, je nach Angelmethode";
							koederString = "toter K�derfisch, bei Kunstk�dern: Spinner, Twister, Gummifische, Jerkbait";
							fangzeitString = "In klaren Gew�ssern am besten w�hrend der Abendd�mmerung oder der Morgend�mmerung. Auch w�hrend der Nacht.";
							tippString = "Nachtaktiver Raubfisch, sehr vorsichtiger Fisch. Zander sehen sehr gut! Als K�der favorisieren wir Gummifische";
							break;
									
		case "Aal":			fischString = "Aal.png"; // Bild f�r den Aal wird �bergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Grundangeln mit Laufbleimontage, Posenangeln ";
							ruteString = "z.B. Grundrute (3,20-3,60 m, 30-80 gr)";
							rolleString = "Station�rrolle";
							hauptschnurString = "0,30 - 0,35 monofil";
							vorfachMontageString = "0,20";
							hackensystemString = "z.B. 4-6";
							koederString = "Tauwurm, K�derfisch, Fischfetzen";
							fangzeitString = "Mai - September, am besten in der Nacht (tags�ber kann auch klappen).Sommern�chste nach einem Gewitter ";
							tippString = "Schnur lieber etwas st�rker w�hlen, da der Aal nach dem Biss immer versucht, sich am Boden zwischen den Steinen zu verstecken.";
							break;
							
		case "�sche":		fischString = "Aesche.png"; // Bild f�r die �sche wird �bergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Fliegenfischen";
							ruteString = "Fliegenrute";
							rolleString = "Fliegenrolle";
							hauptschnurString = "mit Trockenfliege: Ausr�stung der Klasse 4-5 mit Schwimmschnur (DT-F).";
							vorfachMontageString = "0,18 - 0,12";
							hackensystemString = "Gr��e 14 - 22";
							koederString = "Nassfliegen, Nymphen";
							fangzeitString = "Juni - Dezember. Die beste Fangzeit ist der Herbst.";
							tippString = "Im Sommer sind die besten Fangpl�tze schnellflie�ende, sauerstoffreiche Stellen, im Winter ruhigere, tiefe Bereiche. ";
							break;
									
		case "Flussbarsch":	fischString = "Barsch.png"; // Bild f�r den Egli wird �bergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Grundangeln mit Laufbleimontage, Angeln mit der Pose, Spinnfischen (Kunstk�der), Drop-Shot-Angeln, ";
							ruteString = "z.B. Spinnrute, 2,70 m, 20-50 gr. Wurfgewicht oder Drop-Shot-Rute, 2,40-2,70 m";
							rolleString = "z.B. Station�rrolle (Spinnrolle) oder Baitcastrolle";
							hauptschnurString = "geflochtene oder monofile (Fluorcarbon) Schnur mit ca. 2,5 - 4 kg Tragkraft";
							vorfachMontageString = "ca. 2 - 3 kg Tragkraft";
							hackensystemString = "z.B. Drop-Shot-Haken Gr��e 1-2/0";
							koederString = "z.B. bei Kunstk�dern: kleine Spinner, Twister, Gummifische";
							fangzeitString = "w�hrend des ganzen Jahre, am besten im Herbst";
							tippString = "Barsche k�nnen auch mit Naturk�dern wie z.B. Maden, W�rmern oder kleinen K�derfischen bzw. Fischfetzen beangelt werden.";
							break;
									
		case "Forelle":		fischString = "Regenbogenforelle.png"; // Bild f�r die Forelle wird �bergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Posen-Schleppfischen, Fliegenfischen, Spinnfischen, Schleppen mit Sbirolinos";
							ruteString = "Matchrute, Fliegenrute, Spinnrute, Sbirolinorute (3,30 - 4,60 m, ca. 30-60 gr. WG)";
							rolleString = "Station�rrolle, Fliegenrolle";
							hauptschnurString = "0,18 - 0,25 monofil";
							vorfachMontageString = "0,16 - 0,20";
							hackensystemString = "6er - 8er";
							koederString = "Fliegenmaden, Bienenmaden, Insekten, kleine K�derfische, Wobbler, Spinner, k�nstliche Fliegen. Forellenteig";
							fangzeitString = "das ganze Jahr (au�erhalb der Schonzeiten)";
							tippString = "Forellen sind gute K�mpfer und liefern einen guten Drill (daher nur gute Materialien verwenden)";
							break;
									
		case "Schleie":		fischString = "Schleie.png"; // Bild f�r die Schleie wird �bergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Posenfischen, Grundangel mit Laufbleimontage, Feedern mit Futterkorb";
							ruteString = "Matchrute, Stipprute, Grundrute, Feederrute (3,60 - 4,20 m, 30 - 70 gr WG)";
							rolleString = "Station�rrolle, kleine Multirolle";
							hauptschnurString = "0,16 - 0,20 monofil (ca. 2,5 - 4 kg Tragkraft)";
							vorfachMontageString = "0,14 - 0,18 (ca. 2 - 3 kg Tragkraft)";
							hackensystemString = "10 (maximal), 12, 14";
							koederString = "Top K�der: Mistw�rmer (Rotw�rmer), Teile von Tauw�rmern - auch: Maden, Pinkies, Mais, Schnecken";
							fangzeitString = "am besten von Mai-September: fr�h am Morgen oder bei der D�mmerung. Gut sind warme Sommertage nach einem leichten Regen";
							tippString = "Schleien sind sehr scheue Fische und bei�en �u�erst vorsichtig. Sie stehen meistens mitten oder am Rand von Wasserpflanzen";
							break;
									
		case "Karpfe":		fischString = "Schuppenkarpfen.png"; // Bild f�r den Karpfen wird �bergeben
		// Die einzelnen Texte werden in die Strings Initialisiert
							fangmethodeString = "Grundfischen mit auftreibendem K�der";
							ruteString = "z.B. Karpfenrute (Testkurve 2,5 lb)";
							rolleString = "Station�rrolle, robuste Ausf�hrung!";
							hauptschnurString = "0,30-0,35 monofile Schnur";
							vorfachMontageString = "geflochtenes Vorfach (Soft Carp Braid)";
							hackensystemString = "6er-4er (scharf und d�nndrahtig)";
							koederString = "Boilies (s��), Hartmais (Kette): K�der auftreiben lassen (Pop-Up). Au�erdem kann auch Schwimmbrot an pr�sentiert werden.";
							fangzeitString = "Mai bis Juni bei Wassertemperaturen von 18-20� C. Bei diesen Temperaturen ist auch im Stillwasser gen�gend Sauerstoff vorhanden.";
							tippString = "Karpfen schwimmen bei Biss oftmals auf den Angler zu - daher unbedingt Swinger einsetzen.";
							break;
				}
		
		// Button Handling f�r Zoom In und Out
		ButtonHandling zoomHandling = new ButtonHandling();	
		
		// Hauptbox f�r das Gui
		AnchorPane root = new AnchorPane();
		// Ein Background f�r das root wird erstellt mit Bild
		Image imageBackground = new Image(getClass().getResource("transparent.png").toExternalForm()); // Image wird erstellt und das Bild �bergeben
		BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage); // Background wird erstellt und das Image �bergeben
		root.setBackground(background); // Der Background wird dem root hinzugef�gt 
							
		//
		// Die Label werden erstellt
		//
					
		// Das Label f�r den Titel		
		Label ueberSchriftLabel = new Label("Fangmethode f�r den gew�hlten Fisch:"); // Das Label wird erstellt und Initialisiert
		ueberSchriftLabel.setFont(new Font(40)); // Schriftgr�sse
		ueberSchriftLabel.setTranslateX(40); // X-Achse im Fenster
					
		// Label f�r das Fischbild
		Label fischbildLabel = new Label(); // Das Label wird erstellt
		Image fischImage = new Image(getClass().getResource(fischString).toExternalForm()); // Das bild wird �ber die Switch Case initialisiert
		fischbildLabel.setGraphic(new ImageView(fischImage)); // Bild wird dem Label hinzugef�gt
		fischbildLabel.setTranslateX(320); // X-Achse im Fenster
		fischbildLabel.setTranslateY(170); // Y-Aschse
		fischbildLabel.setScaleX(1.3); // Das Label wird vergr�ssert in der X-Achse
		fischbildLabel.setScaleY(1.3); // Das Label wird vergr�ssert in der Y-Achse
					
		// Label f�r den Fischnamen		
		Label fischnameLabel = new Label(fischNameString); // Der Name wird mir der Button ID aus dem Gui FischeAuswahlPr�fen �bergeben
		fischnameLabel.setFont(new Font(35)); // Schriftgr�sse
		fischnameLabel.setTranslateX(380); // X-Achse
		fischnameLabel.setTranslateY(100); // Y-Achse
		
		// Label empfohlene Angelmethode
		Label fangmethodeTiteLabel = new Label("empfohlende Angelmethode:"); // Das Label wird erstellt und Initialisiert
		fangmethodeTiteLabel.setTranslateX(20);	// X-Achse im root
		fangmethodeTiteLabel.setTranslateY(350); // Y-Achse im root
		fangmethodeTiteLabel.setFont(Font.font("Verdana",FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String der Angelmethode
		Label fangmethodeTextLabel = new Label(fangmethodeString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		fangmethodeTextLabel.setTranslateX(20); // X-Achse im root
		fangmethodeTextLabel.setTranslateY(370); // Y-Achse im root
		fangmethodeTextLabel.setFont(Font.font("Verdana",FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// Label f�r Rute
		Label ruteTiteLabel = new Label("Rute:"); // Das Label wird erstellt und Initialisiert
		ruteTiteLabel.setTranslateX(20); // X-Achse im root
		ruteTiteLabel.setTranslateY(400); // Y-Achse im root
		ruteTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16));; // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String Rute
		Label ruteTextLabel = new Label(ruteString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		ruteTextLabel.setTranslateX(20); // X-Achse im root
		ruteTextLabel.setTranslateY(420); // Y-Achse im root
		ruteTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// LAbel f�r Rolle
		Label rolleTiteLabel = new Label("Rolle:"); // Das Label wird erstellt und Initialisiert
		rolleTiteLabel.setTranslateX(20); // X-Achse im root
		rolleTiteLabel.setTranslateY(450); // Y-Achse im root
		rolleTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String Rolle
		Label rolleTextLabel = new Label(rolleString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		rolleTextLabel.setTranslateX(20); // X-Achse im root
		rolleTextLabel.setTranslateY(470); // Y-Achse im root
		rolleTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// Label f�r Hauptschnur
		Label hauptschnurTiteLabel = new Label("Hauptschnur:"); // Das Label wird erstellt und Initialisiert
		hauptschnurTiteLabel.setTranslateX(20); // X-Achse im root
		hauptschnurTiteLabel.setTranslateY(500); // Y-Achse im root
		hauptschnurTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String Hauptschnur
		Label hauptschnurTextLabel = new Label(hauptschnurString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		hauptschnurTextLabel.setTranslateX(20); // X-Achse im root
		hauptschnurTextLabel.setTranslateY(520); // Y-Achse im root
		hauptschnurTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// Label f�r Vorfach und Montage
		Label vorfachmontageTiteLabel = new Label("Vorfach, Montage:"); // Das Label wird erstellt und Initialisiert
		vorfachmontageTiteLabel.setTranslateX(20); // X-Achse im root
		vorfachmontageTiteLabel.setTranslateY(550); // Y-Achse im root
		vorfachmontageTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String Vorfach und Montage
		Label vorfachmontageTextLabel = new Label(vorfachMontageString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		vorfachmontageTextLabel.setTranslateX(20); // X-Achse im root
		vorfachmontageTextLabel.setTranslateY(570); // Y-Achse im root
		vorfachmontageTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// Label f�r Hacken und System
		Label hackensystemTiteLabel = new Label("Hacken, System:"); // Das Label wird erstellt und Initialisiert
		hackensystemTiteLabel.setTranslateX(20); // X-Achse im root
		hackensystemTiteLabel.setTranslateY(600); // Y-Achse im root
		hackensystemTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String Hacken und System
		Label hackensystemTextLabel = new Label(hackensystemString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		hackensystemTextLabel.setTranslateX(20); // X-Achse im root
		hackensystemTextLabel.setTranslateY(620); // Y-Achse im root
		hackensystemTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// Label f�r K�der
		Label koederTiteLabel = new Label("K�der:"); // Das Label wird erstellt und Initialisiert
		koederTiteLabel.setTranslateX(20); // X-Achse im root
		koederTiteLabel.setTranslateY(650); // Y-Achse im root
		koederTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String K�der
		Label koederTextLabel = new Label(koederString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		koederTextLabel.setTranslateX(20); // X-Achse im root
		koederTextLabel.setTranslateY(670); // Y-Achse im root
		koederTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// Label f�r Fangzeit
		Label fangzeitTiteLabel = new Label("Fangzeit:"); // Das Label wird erstellt und Initialisiert
		fangzeitTiteLabel.setTranslateX(20); // X-Achse im root
		fangzeitTiteLabel.setTranslateY(700); // Y-Achse im root
		fangzeitTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String Fangzeit
		Label fangzeitTextLabel = new Label(fangzeitString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		fangzeitTextLabel.setTranslateX(20); // X-Achse im root
		fangzeitTextLabel.setTranslateY(720); // Y-Achse im root
		fangzeitTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// Label f�r Tipps
		Label tipssTiteLabel = new Label("zus�tzliche Tipps:"); // Das Label wird erstellt und Initialisiert
		tipssTiteLabel.setTranslateX(20); // X-Achse im root
		tipssTiteLabel.setTranslateY(750); // Y-Achse im root
		tipssTiteLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 16)); // Schriftart, FETT, Schriftgr�sse
		
		// Label f�r den String Tipps
		Label tippsTextLabel = new Label(tippString); // Dem Label wird der String �bergebn (Initialisiert in der Switch)
		tippsTextLabel.setTranslateX(20); // X-Achse im root
		tippsTextLabel.setTranslateY(770); // Y-Achse im root
		tippsTextLabel.setFont(Font.font("Verdana", FontPosture.ITALIC, 13)); // Schriftart, KURSIV, Schriftgr�sse
		
		// Label f�r Fix Text nur Vorschl�ge
		Label vorschlagLabel = new Label("die nachfolgenden Beschreibungen sind nur Vorschl�ge - nat�rlich k�nnen auch andere Methoden bzw. Ger�tschaften benutzt werden"); // Das Label wird erstellt und Initialisiert
		vorschlagLabel.setTranslateX(10); // X-Achse im root
		vorschlagLabel.setTranslateY(320); // Y-Achse im root
		vorschlagLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 11.5)); // Schriftart, FETT, Schriftgr�sse
					
		// 
		// Button werden erstellt
		//
		
		// Button f�r Zur�ck zum Hauptmenu		
		Button zurueckButton = new Button("Hauptmen�"); // Button wird erstellt und Initialisiert
		zurueckButton.setTranslateX(100); // X-Achse
		zurueckButton.setTranslateY(820); // Y-Achse
		zurueckButton.setFont(new Font(20)); // Gr�sse des Buttons
		// Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(zurueckButton);
		zoomHandling.zoomOut(zurueckButton);
		// Funktion wird dem Button �bergeben 
		hauptmenuStart(zurueckButton);
					
		// Button f�r neuen Fisch w�hlen
		Button neuepruefungButton = new Button("Neuer Fisch w�hlen"); // Button wird erstellt und Initialisiert
		neuepruefungButton.setTranslateX(580); // X-Achse
		neuepruefungButton.setTranslateY(820); // Y-Achse
		neuepruefungButton.setFont(new Font(20)); // Gr�sse des Buttons
		//Zoom In und Out werden aufgerufen
		zoomHandling.zoomIn(neuepruefungButton);
		zoomHandling.zoomOut(neuepruefungButton);
		// Funktion f�r zur�ck zur Fische Auswahl
		fischeAuswahlStart(neuepruefungButton);
					
		// 
		// Das GUI wird zusammengesetzt 
		//
		root.getChildren().add(ueberSchriftLabel); // Titel wird der Box �bergeben
		root.getChildren().add(fischnameLabel); // Fischname wird der Box �bergeben
		root.getChildren().add(fischbildLabel); // Bild wird der Box �bergeben
		root.getChildren().add(vorschlagLabel);
		root.getChildren().addAll(fangmethodeTiteLabel,fangmethodeTextLabel); // Fangmethode
		root.getChildren().addAll(ruteTiteLabel,ruteTextLabel); // Rute
		root.getChildren().addAll(rolleTiteLabel,rolleTextLabel); // Rolle
		root.getChildren().addAll(hauptschnurTiteLabel,hauptschnurTextLabel); // Hauptschnur
		root.getChildren().addAll(vorfachmontageTiteLabel,vorfachmontageTextLabel); // Vorfach und Montage
		root.getChildren().addAll(hackensystemTiteLabel,hackensystemTextLabel); // Hacken und System
		root.getChildren().addAll(koederTiteLabel,koederTextLabel); // K�der
		root.getChildren().addAll(fangzeitTiteLabel,fangzeitTextLabel); // Fangzeit
		root.getChildren().addAll(tipssTiteLabel,tippsTextLabel); // Tipps
		root.getChildren().add(zurueckButton); // Hauptmen� Butto wird hinzugef�gt 
		root.getChildren().add(neuepruefungButton); // Neuer Fisch Pr�fen Button wird hinzugef�gt 
		
		// Das root wird zur�ckgegeben um Angezeigt zu werden
		return root;
	}
	
	//
	// Funktionen f�r die Button
	//
	
	// F�r den Hauptmenu Nutton. Das Hauptmenu wird aufgerufen
	public void hauptmenuStart(Button button) {
		button.setOnAction((event) -> {
		GuiHauptmenu startGuiHauptmenu = new GuiHauptmenu(this.main);
		main.getScene().setRoot(startGuiHauptmenu.buildHauptmenu());
		});
	}
	// F�r den neue Fisch w�hlen. Das Gui mit der Fisch Auswahl wird aufgerufen
	public void fischeAuswahlStart(Button button) {
		button.setOnAction((event) -> {
		GuiFischeAuswahlFang startGuiFischeAuswahl = new GuiFischeAuswahlFang(this.main);
		main.getScene().setRoot(startGuiFischeAuswahl.startGuiFischeAuswahlFang());
		});
	}
	
	
}
