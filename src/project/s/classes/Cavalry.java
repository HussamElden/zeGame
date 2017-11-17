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
    private Melee spear= new Melee();
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
   Cavalry(){
    price.Setfood(60);
    price.Setgold(75);
    spear.setdamage(3);
    spear.setrange(3);
    setAgility(3);
    setattackSpeed(0.96);
    setagrorange(4);
    }
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

    @Override
    void AutoAttack() {
        super.AutoAttack(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
     public String toString() { 
         return "Cavalry";
      } 
     
}
