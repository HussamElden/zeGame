/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.util.ArrayList;
import project.s.classes.Coordinates;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class JalvinThrower extends Movables implements  Ibehavior{
   
   private int Range;
   Throwable spear=new Throwable();
   PriceLists price=new PriceLists();
    private static int Number=0;

    public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
    JalvinThrower(){
    price.Setfood(20);
    price.Setgold(25);
    spear.setDamage(5);
    setHealth(50);
    setagrorange(4);
    setAgility(1);
            
    }
   
   public void setRange (int JalRange){
   if (Range>0)
       Range=JalRange;
   } 
   public int getRange(){
       return Range;
   }
     
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
         return "JalvinThrower";
      } 
}
    

