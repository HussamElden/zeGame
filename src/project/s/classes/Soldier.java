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
public class Soldier extends Movables implements  Ibehavior{
  private  Melee sword=new Melee();
    private static int Number=0;
     PriceLists price=new PriceLists();
    static public ArrayList<Soldier>ArrSoldier=new ArrayList<>();

    Soldier()
  {

    price.Setgold(15);
    price.Setfood(20); 
    sword.setdamage(4);
    setattackSpeed(0.96);
    setHealth(30);
    setagrorange(4);
    setAgility(1);
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
  public void setsword (Melee Sword){
      Sword=sword;
  }
  public Melee getsword (){
      return sword;
  }
 @Override
     public String move(Coordinates XY){
     return"Soldier is moving";
     }
      @Override
     public String attack(){
     return "Soldier is Attacking";
     }
     @Override
     public String toString() { 
         return "Soldier";
      } 
    }

