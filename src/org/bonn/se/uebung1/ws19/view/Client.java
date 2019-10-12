package org.bonn.se.uebung1.ws19.view;

import org.bonn.se.uebung1.ws19.control.*;

public class Client {

	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 */
	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber 
		// mit dem übergegebenen Wert der Variable aNumber 
		// aufgerufen werden
		Translator translateToGerman = TranslatorCreator.createGermanTranslator();
	    System.out.println("Das Ergebnis der Berechnung: " + translateToGerman.translateNumber(aNumber) );
	}
}


