/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

/**
 *
 * @author Ahmed
 */
public class JalvinThrower extends Movables implements  Ibehavior{
   
   private int Range;
   Throwable spear ;
    
   
   public void setRange (int JalRange){
   if (Range>0)
       JalRange=Range;
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
     };
    
}
    

