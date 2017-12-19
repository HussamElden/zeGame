
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
public class Soldier extends Movables implements  Ibehavior{
  private  Melee sword=new Melee();
public JLabel [] lbl = new JLabel[3];
   public Soldier(String nation)
  {          Nation = nation;

   lbl[0]=new JLabel(nation+" Soldier");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Soldier_HumanHunters.png").getImage().getScaledInstance(36,55 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Soldier_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Soldier_NightElves.png").getImage().getScaledInstance(36,55 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Soldier_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }    price.Setgold(15);
    price.Setfood(20); 
    sword.setdamage(4);
    setattackSpeed(0.96);
    setHealth(30);
    setagrorange(4);
    setAgility(1);
  }
  public void setsword (Melee Sword){
      Sword=sword;
  }
  public Melee getsword (){
      return sword;
  }
 @Override
     public String move(Point XY){
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
