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
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Knight extends Movables implements  Ibehavior {
   
     private Melee sword=new Melee();
   
     public Knight(String nation)
     {          Nation = nation;
                                setName("Knight");
        LBL[0]=new JLabel(nation+" Knight");
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Knight_HumanHunters.png").getImage().getScaledInstance(91,122 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Knight_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Knight_NightElves.png").getImage().getScaledInstance(91,122 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Knight_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
         
         sword.setdamage(10);
         price.Setfood(60);
         price.Setgold(75);
         setagrorange(2);
         setAgility(1);
         setattackSpeed(0.96);
        
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
