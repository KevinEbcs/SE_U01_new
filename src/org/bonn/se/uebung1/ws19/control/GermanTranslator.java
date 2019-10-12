package org.bonn.se.uebung1.ws19.control;

import java.util.List;

public class GermanTranslator implements Translator {
	
	/*
	 * @see org.bonn.se.uebung1.ws19.control.Translator#translateNumber(int)
	 */
	public String translateNumber( int number ) {
		try {
			GermanNumber numberToTranslate = new GermanNumber(number);
			return numberToTranslate.toString();
		}catch (ArrayIndexOutOfBoundsException e){
			return "Übersetzung der Zahl " + number + " nicht möglich " + version;
		}
	}
		
	/*
	 * Objektmethode der Klasse GermanTranslator
	 * zur Ausgabe einer Info. 
	 */

	public void printInfo() {
	       System.out.println("GermanTranslator c / o 2019 by HBRS");
	}
}
