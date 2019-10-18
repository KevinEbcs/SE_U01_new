package org.bonn.se.ws19.uebung2.control;

public class ContainerException extends Exception {
    private String message;
    public ContainerException(int memberID) {
        this.message = "Das ConcreteMember-Objekt mit der ID " + memberID + " ist bereits vorhanden!";
    }

    @Override
    public String toString(){
        return message;
    }
}
