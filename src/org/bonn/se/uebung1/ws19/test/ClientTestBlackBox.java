package org.bonn.se.uebung1.ws19.test;
import org.bonn.se.uebung1.ws19.view.*;

public class ClientTestBlackBox {
    public static void main(String[]args){
        Client subject = new Client();
        subject.display(-1);
        subject.display(3);
        subject.display(0);
        subject.display(134);
    }
}
