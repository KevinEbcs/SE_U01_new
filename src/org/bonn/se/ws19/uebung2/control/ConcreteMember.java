package org.bonn.se.ws19.uebung2.control;

public class ConcreteMember implements Member {

    private int id;

    private static int nextId;

    public ConcreteMember(){
        // sets the new Members id to the current highest ID + 1, then increments that value
        this.id = nextId++;
    }

    public int getId() {
        return this.id;
    }

    //Only to be used by Cloneable Member for setting it's own ID when cloned
    protected void setId(int newId) {
        this.id = newId;
    }

    @Override
    public String toString(){
        return "Member (ID = " + this.id +")";
    }


}
