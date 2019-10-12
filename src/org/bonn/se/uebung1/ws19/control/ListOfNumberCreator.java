package org.bonn.se.uebung1.ws19.control;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumberCreator {

    public List<GermanNumber> createGermanNumberList() throws IndexOutOfBoundsException{
        ArrayList<GermanNumber> numberList = new ArrayList<>();
        numberList.add(null);
        for (int currentNumber = 1; currentNumber < 11; ++currentNumber){
            numberList.add(new GermanNumber(currentNumber));
        }
        return numberList;
    }

}
