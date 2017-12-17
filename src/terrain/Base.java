/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.PriceLists;
import terrain.Citizens;
import javax.swing.JLabel;
/**
 *
 * @author Ahmed
 */
public class Base extends Buildings implements IBuild  {
<<<<<<< HEAD
=======
   
    public void setlvl(){};
   public JLabel[] lbl = new JLabel[3];
   public Base (String nation){
                 Nation = nation;

       lbl[0]=new JLabel(nation+" Base");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics://Base_HumanHunters.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics://Base_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics://Base_NightElves.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics://Base_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
   
   }
>>>>>>> Omar
   Citizens citizen=new Citizens();
   public void setlvl(){};
    @Override
    public String Destroy() {
        setalive(false);
        return "Base was destroied and you Lost";
    }

    @Override
    public String spawn() {
       return "hii";
    }
    @Override
     public String toString() { 
         return "Base";
      } 
}
