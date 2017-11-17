/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class Knight extends Movables implements  Ibehavior {
     private static int Number=0;
     private Melee sword=new Melee();
    PriceLists price=new PriceLists();
            static public ArrayList<Knight>ArrKnight=new ArrayList<>();

     Knight()
     {
         sword.setdamage(10);
         price.Setfood(60);
         price.Setgold(75);
         setagrorange(2);
         setAgility(1);
         setattackSpeed(0.96);
        
     }
     public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
  public void RideHorse()
   {  }
    @Override
     public String move(Coordinates XY){
     return"Archer is moving";
     }
      @Override
     public String attack(){
     return "Archer is Attacking";
     }
     @Override
     public String toString() { 
         return "Knight";
      } 
}
