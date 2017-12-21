/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.PriceLists;

/**
 *
 * @author hos20
 */
public class General extends Movables {
   private int Buffrange;
    PriceLists price=new PriceLists();


   public General(String nation)
    {
                  Nation = nation;
                          setName("General");

              LBL[0]=new JLabel(nation+" General");
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//General_HumanHunters.png").getImage().getScaledInstance(117,190 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//General_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//General_NightElves.png").getImage().getScaledInstance(117,190 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//General_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
    price.setFood(70);
    price.setGold(80);
    }
    @Override
     public String toString() { 
         return "General";
      } 
}
