package org.bonn.se.uebung1.ws19.control;

public class GermanNumber extends Number {

    private static String[] numberNames = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
    private String name;

    public GermanNumber(int givenValue){
        super(givenValue);
        name = numberNames[value-1];
    }

    @Override
    public String toString(){
      return name;
    }
}
