/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
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
public class Citizens extends Movables {
  
    private PriceLists price = new PriceLists();

public JLabel [] lbl = new JLabel[3];
     public Citizens(String nation)
     {          Nation = nation;

         lbl[0]=new JLabel(nation+" Citizen");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
     }
     
    Citizens(){
    price.Setfood(20);
    }
    public PriceLists Getprice(){
    return price;
    }
//    public JLabel ShowTab( Dimension screenSize){
//        
//    }
    public void Build(){
      
    }
    @Override
     public String toString() { 
         return "Citizens";
      } 
//      public void movieing(){
//        Point SP=new ;
//      MOVER m=new MOVER(this.lbl[1].getLocation(),SP,this.lbl[1]);
//           m.TMove.start();
//      }
//    
}
