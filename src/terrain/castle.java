/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import terrain.General;
import terrain.Throwable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.PriceLists;

/**
 *
 * @author hos20
 */
public class castle extends Buildings implements IBuild{
   private Throwable arrow=new Throwable();
    private int AgroRange;
     private static int Number=0;
     PriceLists price=new PriceLists();
     Inventory inventory=new Inventory();
  public JLabel []lbl = new JLabel[3];
 castle(String nation)
     {
          Nation = nation;
       lbl[0]=new JLabel(nation+" Logging Mine");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_HumanHunters.png").getImage().getScaledInstance(422,378 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_NightElves.png").getImage().getScaledInstance(422,378 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
         
         price.Setmetal(120);
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
    public void Throw(){}
//    @Override
//   public String Build()
//    {    
//     incrementNumber();
//    return "Castle is built";
//    };
    @Override
    public String Destroy()
    {  
        dcrementNumber();
    return "Castle is destroyed";
    };
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
        General g=new General(Nation);
        if(inventory.getFood()>=g.price.Getfood()&&inventory.getGold()>=g.price.Getgold()){
        g.incrementNumber();
        inventory.Decfood(g.price.Getfood());
        inventory.Decgold(g.price.Getgold());
        return "Now you have "+g.GetNumber()+" General";
        }
        else
        {
        return "You dont have enough resources";
        }
          }
        default:
        {
       return"Wrong choice";
        }
    }
}
    @Override
     public String toString() { 
         return "castle";
      } 
}
