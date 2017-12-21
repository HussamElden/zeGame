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
public class Cavalry extends Movables implements  Ibehavior{
    private Horse H;
    private Melee spear= new Melee();
  public Cavalry(String nation){
               Nation = nation;
                       setName("Cavalry");
      LBL[0]=new JLabel(nation+" Cavalry");
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Cavlary_HumanHunters.png").getImage().getScaledInstance(58,80 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Cavlary_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics//Cavlary_NightElves.png").getImage().getScaledInstance(58,80 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics//Cavlary_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
       price.setFood(60);
    price.setGold(75);
    spear.setdamage(3);
    spear.setrange(3);
    setAgility(3);
    setattackSpeed(0.96);
    setagrorange(4);
    }
    public void RideHorse()
   {  }
    @Override
     public String move(Point XY){
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
