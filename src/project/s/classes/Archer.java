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
public class Archer extends Movables implements  Ibehavior{
 PriceLists price=new PriceLists();
   protected int Range;
   public Throwable arrow = new Throwable();
   private static int Number=0;
      static public ArrayList<Archer> ArrArcher= new ArrayList<>();

   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
   Archer(){
      
    price.Setgold(20);
    price.Setfood(25);
    Range=4;
    arrow.setDamage(4);
    setattackSpeed(0.96);
    setHealth(30);
    setagrorange(6);
    setAgility(1);
    }

public void setRange (int archRange)
{
    if (Range > 0)
        Range=archRange;
}
public int getRange ()
{
    return Range;
}
    public void Throw() {}
    @Override
     public String move(Coordinates XY){
     return"Archer is moving";
     }
      @Override
     public String attack(){
     return "Archer is Attacking";
     };
    }


