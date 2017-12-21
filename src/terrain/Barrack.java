/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ahmed
 */
public class Barrack extends Buildings implements IBuild
{   

           public JLabel[] lbl = new JLabel[3];
public Barrack (String nation)
{          Nation = nation;

  lbl[0]=new JLabel(nation+" Barracks");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_HumanHunters.png").getImage().getScaledInstance(125,125 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_NightElves.png").getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
       price.setWood(150);
price.setFood(0);
price.setGold(0);
price.setMetal(0);
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
        if(inventory.getFood()>=s.price.getFood()&&inventory.getGold()>=s.price.getGold()){
        s.incrementNumber();
        inventory.Decfood(s.price.getFood());
        inventory.Decgold(s.price.getGold());

      //  return "Now you have "+s.GetNumber()+" Soldier";
        }else{
      //  return "You dont have enough resources";

       // return "Now you have "+s.GetNumber()+" Soldier";
        }
        
        }
        case 2:{
      Inventory  inventory=new Inventory();
        Archer a=new Archer("");
        if(inventory.getFood()>=a.price.getFood()&&inventory.getGold()>=a.price.getGold()){
       // a.incrementNumber();
        price.setFood(choice);
            
//Decfood(a.price.getFood());
        inventory.Decgold(a.price.getGold());
       // return "Now you have "+a.GetNumber()+" Archer";
        }else{

    //    return "You dont have enough resources";

        //return "You dont have enough resources";

        }
        }
        case 3:{
        Inventory inventory=new Inventory();
        JalvinThrower j=new JalvinThrower(Nation);
         if(inventory.getFood()>=j.price.getFood()&&inventory.getGold()>=j.price.getGold()){
        j.incrementNumber();
        inventory.Decfood(j.price.getFood());
        inventory.Decgold(j.price.getGold());

     //   return "Now you have "+j.GetNumber()+" JalvinThrower";
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
//        if(inventory.p.getWood() >= price.getWood()){  
//            int x = inventory.getWood() - price.getWood();
//            inventory.setWood(x);
//            incrementNumber();
//        }
//    return "Barrack is built";
//    };