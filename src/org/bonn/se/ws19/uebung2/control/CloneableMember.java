package org.bonn.se.ws19.uebung2.control;

public class CloneableMember extends ConcreteMember implements Cloneable {
   private CloneableMember(int id){
       this.setId(id);
   }

   public CloneableMember(){
       super();
   }

   @Override
   public CloneableMember clone(){
       //Caution: Increments nextId in ConcreteMember
       return new CloneableMember(this.getId());
   }
}
