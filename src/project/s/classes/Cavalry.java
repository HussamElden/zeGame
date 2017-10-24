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
public class Cavalry extends Movables implements  Ibehavior{
    private Horse H;
    private Melee spear;
   
    public void RideHorse()
   {  }
    @Override
     public String move(Coordinates XY){
     return"Cavalry is moving";
     }
      @Override
     public String attack(){
     return "Cavalry is Attacking";
     };
}
