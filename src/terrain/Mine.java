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

/**
 *
 * @author Ahmed
 */
public class Mine extends Buildings implements IBuild{
    
    private int WorkerLimit;
     private static int Number=0;
  public JLabel [] lbl =  new JLabel[3];
  
  public Mine (String nation)
  {          Nation = nation;

    lbl[0]=new JLabel(nation+" Stone Mine");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics://StoneMine_HumanHunters.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics://StoneMine_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics://StoneMine_NightElves.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics://StoneMine_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
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
    void IncreaseStone(Inventory inventory){
        int x = inventory.getMetal();
       x+=10;
       inventory.setMetal(x);
    }
    //    @Override
    //    public String Build(){
    //        Inventory inventory =new Inventory();
    //        incrementNumber();
    //        IncreaseStone(inventory);
    //    return"Mine is built";
    //    };
    @Override
    public String Destroy(){
        
    return"Mine is Destroy";
    };
    @Override
    public String spawn(){
    return"";
    };
    @Override
     public String toString() { 
         return "Mine";
      } 
}
