/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Point;
import java.util.ArrayList;
import project.s.classes.Coordinates;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Chariots extends Movables implements  Ibehavior{
    private Horse H;
    private Throwable arrow=new Throwable();
    private int Range;
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
    Chariots()
    {
    price.Setwood(60);
    price.Setgold(40);
    Range=4;
    arrow.setDamage(4);
    setattackSpeed(0.96);
    setHealth(30);
    setagrorange(6);
    setAgility(1);
    }
    public void RideHorse()
   { setAgility(H.getAgility()); }
    @Override
     public String move(Point XY){
     return"Cavalry is moving";
     }
      @Override
     public String attack(){
         
     return "Cavalry is Attacking";
     }
     @Override
     public String toString() { 
         return "Chariots";
      } 
    }

