package org.bonn.se.ws19.uebung2.test;

import org.bonn.se.ws19.uebung2.control.ContainerException;
import org.bonn.se.ws19.uebung2.control.*;

public class HelperClass {
    public static void main(String[] args){
        Container container;
        CloneableMember member1;
        Member member2;
        Member member3;
        Member member1Clone;

        container = new Container();
        member1 = new CloneableMember();
        member2 = new ConcreteMember();
        member3 = new ConcreteMember();
        member1Clone = member1.clone();

        try {
            container.addMember(member1);
            container.addMember(member2);
            container.addMember(member1Clone);
        }catch (ContainerException e){
            System.out.println(e.toString());
        }
    }
}
