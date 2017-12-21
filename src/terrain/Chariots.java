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
public class Chariots extends Movables implements  Ibehavior{
    private Horse H;
    private Throwable arrow=new Throwable();
    private int Range;
    public Chariots(String nation)
    {          Nation = nation;
        setName("Chariots");

         LBL[0]=new JLabel(nation+" Chariots");
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Chariot_HumanHuinters.png").getImage().getScaledInstance(85,58 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Chariot_HumanHuinters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Chariot_NightElves.png").getImage().getScaledInstance(85,58 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Chariot_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
    price.setWood(60);
    price.setGold(40);
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

