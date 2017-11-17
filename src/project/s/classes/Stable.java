/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ahmed
 */
public class Stable extends Buildings implements IBuild {
     private static int Number=0;
   Inventory inventory=new Inventory();
   PriceLists price=new PriceLists();
    static public ArrayList<Stable>ArrStable=new ArrayList<>();

   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
   private void setPrice()
     {
    price.Setwood(175);
    }
@Override
    public String Build() {
    if(inventory.getWood()>=price.Getwood())
        incrementNumber();
    return "Stable is built";
    }

    @Override
    public String Destroy() {
       dcrementNumber();
        return "Stable is destroyed";
    }

    @Override
    public String spawn() 
    {
         Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    switch(choice)
    {
        case 1:
        {
       Inventory inventory=new Inventory();
        Knight k=new Knight();
        if(inventory.getFood()>=k.price.Getfood()&&inventory.getGold()>=k.price.Getgold()){
        k.incrementNumber();
        inventory.Decfood(k.price.Getfood());
        inventory.Decgold(k.price.Getgold());
        return "Now you have "+k.GetNumber()+" Knight";
        }else{
        return "You dont have enough resources";
        }
        
        }
        case 2:
        {
      Inventory  inventory=new Inventory();
        Cavalry ca=new Cavalry();
        if(inventory.getFood()>=ca.price.Getfood()&&inventory.getGold()>=ca.price.Getgold()){
        ca.incrementNumber();
        inventory.Decfood(ca.price.Getfood());
        inventory.Decgold(ca.price.Getgold());
        return "Now you have "+ca.GetNumber()+" Cavalry";
        }else{
        return "You dont have enough resources";
        }
        }
        case 3:{
        Inventory inventory=new Inventory();
        Chariots ch=new Chariots();
         if(inventory.getWood()>=ch.price.Getwood()&&inventory.getGold()>=ch.price.Getgold()){
        ch.incrementNumber();
        inventory.Decwood(ch.price.Getwood());
        inventory.Decgold(ch.price.Getgold());
        return "Now you have "+ch.GetNumber()+" Chariots";
        }else{
        return "You dont have enough resources";
        }
        
        }default:{
        
        return"Wrong choice";   
    }
    }
}
}

