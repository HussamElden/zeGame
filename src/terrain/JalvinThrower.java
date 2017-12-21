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
public class JalvinThrower extends Movables implements  Ibehavior{
   
   private int Range;
   Throwable spear=new Throwable();


    public JalvinThrower(String nation)
    {          Nation = nation;
                    setName("JalvinThrower");

      LBL[0]=new JLabel(nation+" Jalvin Thrower");
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//JalvinThrower_HumanHunters.png").getImage().getScaledInstance(49,72 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//JalvinThrower_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//JalvinThrower_NightElves.png").getImage().getScaledInstance(49,72,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//JalvinThrower_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
        
        price.Setfood(20);
    price.Setgold(25);
    spear.setDamage(5);
    setHealth(50);
    setagrorange(4);
    setAgility(1);
            
    }
   
   public void setRange (int JalRange){
   if (Range>0)
       Range=JalRange;
   } 
   public int getRange(){
       return Range;
   }
     
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
         return "JalvinThrower";
      } 
}
    

