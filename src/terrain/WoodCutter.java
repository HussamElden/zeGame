/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class WoodCutter extends Buildings implements IBuild{
   static int x=0;
    private Trees tree;
<<<<<<< HEAD
=======
public JLabel [] lbl = new JLabel[3];
>>>>>>> Omar
     public WoodCutter(String nation)
     {
                             setName("WoodCutter");
         Nation = nation;
       LBL[0]=new JLabel(nation+" Logging Mine");
          
      if(nation.equals("Human Hunters"))
      {

<<<<<<< HEAD
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//WoodCutter_HumanHunters.png").getImage().getScaledInstance(422,317 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//WoodCutter_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics//WoodCutter_NightElves.png").getImage().getScaledInstance(422,317 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon(nation+"Pics//WoodCutter_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
=======
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//WoodCutter_HumanHunters.png").getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//WoodCutter_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {

       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//WoodCutter_NightElves.png").getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//WoodCutter_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
>>>>>>> Omar

      }
         price.setWood(25);   
         setalive(true);
        // Work.start();
     }
    public void settree (Trees Tree){
          Tree=tree;
    }
  
    public Trees gettree (){
        return  tree;
    }
    void increasewood(Inventory inventory){
       int x = inventory.getWood();
       x+=10;
       inventory.setWood(x);
    }

    public Thread Work=new Thread(){
                
            public void run(){
                while(getalive()){
                Inventory.price.setWood(Inventory.price.getWood()+4);
                }
                
             try {
                       Thread.sleep(12000);
                    } 
                  catch (InterruptedException ex) 
                    {   }
            }};
            
    @Override
    public String Destroy(){
        
    return"Woodcutter is Destroy";
    };
    @Override
    public void spawn(){
    
    };
    @Override
     public String toString() { 
         return "WoodCutter";
      }
     
}
//    @Override
//    public String Build(){
//         if(inventory.getWood()>=price.getWood())
//        incrementNumber();
//   
//        increasewood(inventory);
//    return"Woodcutter is built";
//    };