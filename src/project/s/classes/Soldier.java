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
public class Soldier extends Movables implements  Ibehavior{
  private  Melee sword;
   
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
    }

