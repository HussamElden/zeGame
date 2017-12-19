/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import terrain.JalvinThrower;
import terrain.Soldier;
import terrain.Archer;
import java.util.ArrayList;
import java.util.Scanner;
import User.Arrs;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Barrack extends Buildings implements IBuild
{   

           Inventory inventory=new Inventory();
           public JLabel[] lbl = new JLabel[3];
public Barrack (String nation)
{          Nation = nation;

  lbl[0]=new JLabel(nation+" Barracks");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_HumanHunters.png").getImage().getScaledInstance(422,359 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_NightElves.png").getImage().getScaledInstance(422,359,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
       price.Setwood(150);
}
      
    @Override
    public String Destroy(){
    return "Barrack is destroyed";
    };
    @Override
    public void spawn(){
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    switch(choice){
        case 1:{
       Inventory inventory=new Inventory();
        Soldier s=new Soldier(Nation);
        if(inventory.getFood()>=s.price.Getfood()&&inventory.getGold()>=s.price.Getgold()){
        s.incrementNumber();
        inventory.Decfood(s.price.Getfood());
        inventory.Decgold(s.price.Getgold());
       // return "Now you have "+s.GetNumber()+" Soldier";
        }else{
       // return "You dont have enough resources";
        }
        
        }
        case 2:{
      Inventory  inventory=new Inventory();
        Archer a=new Archer("");
        if(inventory.getFood()>=a.price.Getfood()&&inventory.getGold()>=a.price.Getgold()){
       // a.incrementNumber();
        price.Setfood(choice);
            
//Decfood(a.price.Getfood());
        inventory.Decgold(a.price.Getgold());
       // return "Now you have "+a.GetNumber()+" Archer";
        }else{
        //return "You dont have enough resources";
        }
        }
        case 3:{
        Inventory inventory=new Inventory();
        JalvinThrower j=new JalvinThrower(Nation);
         if(inventory.getFood()>=j.price.Getfood()&&inventory.getGold()>=j.price.Getgold()){
        j.incrementNumber();
        inventory.Decfood(j.price.Getfood());
        inventory.Decgold(j.price.Getgold());
      //  return "Now you have "+j.GetNumber()+" JalvinThrower";
        }else{
       // return "You dont have enough resources";
        }
        
        }default:{
        
       // return"Wrong choice";
        
        }
    
    
    }
    
    }
    @Override
     public String toString() { 
         return "Barrack";
      } 
}
//    @Override
//    public String Build(){
//       
//        if(inventory.p.Getwood() >= price.Getwood()){  
//            int x = inventory.getWood() - price.Getwood();
//            inventory.setWood(x);
//            incrementNumber();
//        }
//    return "Barrack is built";
//    };