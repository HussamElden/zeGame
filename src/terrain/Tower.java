/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import terrain.Throwable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ahmed
 */
public class Tower extends Buildings{
   private Throwable arrows;
    private int Range;
    private int AgroRange;
  private int Attackspeed;
public JLabel [] lbl =  new JLabel[3];
     public Tower (String nation)
     {
     Nation = nation;
       lbl[0]=new JLabel(nation+" Tower");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Tower_HumanHunters.png").getImage().getScaledInstance(182,292,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Tower_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Tower_NightElves.png").getImage().getScaledInstance(182,292 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Tower_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
     }
  public void setarrows (Throwable Arrows){
          Arrows=arrows;
    }
  
    public Throwable getarrows (){
        return  arrows;
    }
public void setRange (int range){
        if (Range >0)
            range=Range;
    }
    public int getRange (){
        return  Range;
    }

public void setAttackspeed (int Aspeed){
        if (Attackspeed >0)
            Aspeed=Attackspeed;
    }
    public int getAttackspeed (){
        return  Attackspeed;
    }
    @Override
     public String toString() { 
         return "Tower";
      } 
}
