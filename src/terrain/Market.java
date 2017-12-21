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
public class Market extends Buildings implements IBuild {
   private int ctr;
   private int[] prices=new int[3];
public Market (String nation)
{          Nation = nation;
                            setName("Marker");

      LBL[0]=new JLabel(nation+" Market");
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Market_HumanHunters.png").getImage().getScaledInstance(436,278 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Market_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Market_NightElves.png").getImage().getScaledInstance(436,278 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Market_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
}


   public void setctr (int counter){
   if (ctr>0)
       counter=ctr;
   } 
   public int getctr  (){
       return ctr;
   }
   public void setFPrice (int prc){
   if (prc>=0)
       prices[0]=prc;
   } 
   public int getFPrice(){
       return prices[0];
   }
   public void setWPrice (int prc){
   if (prc>=0)
       prices[1]=prc;
   } 
    public int getWPrice(){
       return prices[1];
   }
    public void setMPrice (int prc){
   if (prc>=0)
       prices[2]=prc;
   } 
    public int getMPrice(){
       return prices[2];
   }
   
   
   private int increasePrice(){
    return 0;
    }
    void Sell(int x){
            
    }
    
    int Buy(){
        return 0;
    }
//    @Override
//    public String Build(){
//        incrementNumber();
//    return "market is built";
//    };
    @Override
    public String Destroy(){
    return "marker is destroyed\n";
    };
    @Override
    public void spawn(){
        return ;}
    @Override
     public String toString() { 
         return "Market";
      } 
}
