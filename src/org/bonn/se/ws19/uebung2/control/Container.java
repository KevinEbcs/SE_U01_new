package org.bonn.se.ws19.uebung2.control;

import java.util.ArrayList;

public class Container {
   ArrayList <Member> contents = new ArrayList<Member>();

   public void addMember(Member newMember) throws ContainerException{
       for (Member currentMember: contents
            ) {
           if (newMember.getId()==currentMember.getId()) throw new ContainerException(newMember.getId());
       }
           contents.add(newMember);
   }

   public String deleteMember (int id){
       for (Member currentMember : contents
            ) {
           if(id == currentMember.getId()){
               contents.remove(currentMember);
               return "";
           }
       }
       return "Kein ConcreteMember-Objekt mit der ID " + id + " gefunden";
   }

   public void dump(){
       for (Member currentMember :
            contents) {
           System.out.println(currentMember.toString());
       }
   }

   public int size(){
       return contents.size();
   }
}
