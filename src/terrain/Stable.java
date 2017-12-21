/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import terrain.Cavalry;
import terrain.Knight;
import terrain.Chariots;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Stable extends Buildings implements IBuild {
   public JLabel [] lbl = new JLabel[3];
public Stable (String nation)
{Nation = nation;
       lbl[0]=new JLabel(nation+" Stable");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Stable_HumanHunters.png").getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Stable_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Stable_NightElves.png").getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Stable_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      price.setWood(175);
}


    @Override
    public String Destroy() {
     
        return "Stable is destroyed";
    }

    @Override
    public void spawn() 
    {
         Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    switch(choice)
    {
        case 1:
        {
       Inventory inventory=new Inventory();
        Knight k=new Knight(Nation);
        if(inventory.getFood()>=k.price.getFood()&&inventory.getGold()>=k.price.getGold()){
        k.incrementNumber();
        inventory.Decfood(k.price.getFood());
        inventory.Decgold(k.price.getGold());
       // return "Now you have "+k.GetNumber()+" Knight";
        }else{
      //  return "You dont have enough resources";
        }
        
        }
        case 2:
        {
      Inventory  inventory=new Inventory();
        Cavalry ca=new Cavalry("");
        if(inventory.getFood()>=ca.price.getFood()&&inventory.getGold()>=ca.price.getGold()){
        ca.incrementNumber();
        inventory.Decfood(ca.price.getFood());
        inventory.Decgold(ca.price.getGold());
      //  return "Now you have "+ca.GetNumber()+" Cavalry";
        }else{
      //  return "You dont have enough resources";
        }
        }
        case 3:{
        Inventory inventory=new Inventory();
        Chariots ch=new Chariots(Nation);
         if(inventory.getWood()>=ch.price.getWood()&&inventory.getGold()>=ch.price.getGold()){
        ch.incrementNumber();
        inventory.Decwood(ch.price.getWood());
        inventory.Decgold(ch.price.getGold());
      //  return "Now you have "+ch.GetNumber()+" Chariots";
        }else{
      //  return "You dont have enough resources";
        }
        
        }default:{
        
       // return"Wrong choice";   
    }
    }
}
    @Override
     public String toString() { 
         return "Stable";
      } 
}

//    }
//@Override
//    public String Build() {
//    if(inventory.getWood()>=price.getWood())
//        incrementNumber();
//    return "Stable is built";
//    }
