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
public class Catapult extends Movables implements  Ibehavior {
    PriceLists price=new PriceLists();
    private int Range;
    private Throwable Stone=new Throwable();
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
    Catapult(){
    price.Setwood(125);
    price.Setgold(80);
     setHealth(70);
     Stone.setDamage(15);
     Stone.setSpeed(1);
     setattackSpeed(0.96);
     
     Range=7;
}
    
  
  
public void setRange (int cataRange)
{
    if (Range > 0)
        Range=cataRange;
}
public int getRange ()
{
    return Range;
}
     
     
     public void Throw(){}
     @Override
     public String move(Coordinates XY){
     return"Catapult is moving";
     }
      @Override
     public String attack(){
     return "Catapult is Attacking";
     };
    }

