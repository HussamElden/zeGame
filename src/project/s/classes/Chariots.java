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
public class Chariots extends Movables implements  Ibehavior{
    private Horse H;
    private Throwable arrow;
    private int Range;
     PriceLists price=new PriceLists();
    Chariots(){
    price.Setwood(60);
    price.Setgold(40);
    }
    public void RideHorse()
   { setAgility(H.getAgility()); }
    @Override
     public String move(Coordinates XY){
     return"Cavalry is moving";
     }
      @Override
     public String attack(){
         
     return "Cavalry is Attacking";
     }
    }

