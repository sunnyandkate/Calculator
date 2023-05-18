package taschenrechner;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

	//Felder zur Eingabe der Zahlen, die berechnet werden sollen
	@FXML private TextField eingabe1;
	@FXML private TextField eingabe2;
	//fuer die Ausgabe des Ergebnisses
	@FXML private Label ausgabe;
	
	//Kombinationsfeld
	@FXML private ComboBox<String> rechenOperationen;
	//Ergebnis muss initialisiert werden
	private double zahl1, zahl2, ergebnis = 0;
	
	
	//Methode zum beenden
	@FXML protected void beendenKlick(ActionEvent event) {
		Platform.exit();
	}
	//Methode zum berechnen
	//beim Klicken auf das Kombinationsfeld oder auf die Berechnen Schaltflaeche
	@FXML protected void berechnenKlick(ActionEvent event) {
		
		zahl1 = Double.parseDouble(eingabe1.getText());
		zahl2 = Double.parseDouble(eingabe2.getText());
		//Auswahl beschaffen und zwischenspeichern
		String tempAuswahl = rechenOperationen.getSelectionModel().getSelectedItem().toString();

		if(tempAuswahl.equals("Addition")) {
			ergebnis = zahl1 + zahl2;
			
		}
		if(tempAuswahl.equals("Subtraktion")) {
			ergebnis = zahl1 - zahl2;
			
		}
		if(tempAuswahl.equals("Multiplikation")) {
			ergebnis = zahl1 * zahl2;
			
		}
		if(tempAuswahl.equals("Division")) {
			
				ergebnis = zahl1/zahl2;
			
		}
			//Ergebnis anzeigen
			//double in String umwandeln	
			ausgabe.setText(Double.toString(ergebnis));		
		
	}
	@FXML protected void initialize() {
		//Eintraege im Kombinationsfeld setzen
		rechenOperationen.getItems().addAll("Addition", "Subtraktion", "Multiplikation", "Division");
		//den ersten Eintrag auswaehlen
		rechenOperationen.getSelectionModel().selectFirst();
	}
	
}
