/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.Coordinates;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Knight extends Movables implements  Ibehavior {
     private static int Number=0;
     private Melee sword=new Melee();
    PriceLists price=new PriceLists();
   public JLabel [] lbl =  new JLabel[3];
     public Knight(String nation)
     {          Nation = nation;

        lbl[0]=new JLabel(nation+" Knight");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Knight_HumanHunters.png").getImage().getScaledInstance(91,122 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Knight_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Knight_NightElves.png").getImage().getScaledInstance(91,122 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Knight_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
         
         sword.setdamage(10);
         price.setFood(60);
         price.setGold(75);
         setagrorange(2);
         setAgility(1);
         setattackSpeed(0.96);
        
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
  public void RideHorse()
   {  }
    @Override
     public String move(Point XY){
     return"Archer is moving";
     }
      @Override
     public String attack(){
     return "Archer is Attacking";
     }
     @Override
     public String toString() { 
         return "Knight";
      } 
}
