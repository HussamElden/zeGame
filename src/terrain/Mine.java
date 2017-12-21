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
  public Mine (String nation)
  {          Nation = nation;
                                setName("Mine");
    LBL[0]=new JLabel(nation+" Stone Mine");
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//StoneMine_HumanHunters.png").getImage().getScaledInstance(245,161 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//StoneMine_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//StoneMine_NightElves.png").getImage().getScaledInstance(245,161 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//StoneMine_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
       price.Setwood(20); 
       price.Setgold(10);
         setalive(true);
         Work.start();
  }

    @Override
    public String Destroy(){
        
    return"Mine is Destroy";
    };
    @Override
    public void spawn(){
    return;
    };
    @Override
     public String toString() { 
         return "Mine";
      } 
         public Thread Work=new Thread(){
                
            public void run(){
                while(getalive()){
                Inventory.price.Setmetal(Inventory.price.Getmetal()+4);
                }
                
             try {
                       Thread.sleep(12000);
                    } 
                  catch (InterruptedException ex) 
                    {   }
            }};
}
//    void IncreaseStone(Inventory inventory){
//        int x = inventory.getMetal();
//       x+=10;
//       inventory.setMetal(x);
//    }
    //    @Override
    //    public String Build(){
    //        Inventory inventory =new Inventory();
    //        incrementNumber();
    //        IncreaseStone(inventory);
    //    return"Mine is built";
    //    };