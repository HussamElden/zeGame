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
public class Farm extends Buildings implements IBuild{
    
    private int WorkerLimit=1;
     private static int Number=0;
public JLabel []  lbl  = new JLabel[3];
     public Farm (String nation)
     {          Nation = nation;

             lbl[0]=new JLabel(nation+" Farm");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Farm_HumanHunters.png").getImage().getScaledInstance(364,278 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Farm_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Farm_NightElves.png").getImage().getScaledInstance(364,278 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Farm_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
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
    public void IncreaseFood(Inventory inventory){
  
        int x = inventory.getFood();
       x+=10;
       inventory.setFood(x);
    }
//    @Override
//    public String Build(){
//        Inventory inventory=new Inventory();
//        IncreaseFood(inventory);
//        incrementNumber();
//    return"Farm is built";
//    };
    @Override
    public String Destroy(){
        
    return"Farm destroyed\n";
    };
    @Override
    public void spawn(){
   // return null;};
    //@Override
    // public String toString() { 
        // return "Farm";
      } 
}
