/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import terrain.JalvinThrower;
import terrain.Soldier;
import terrain.Archer;
import java.util.ArrayList;
import java.util.Scanner;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Barrack extends Buildings implements IBuild
{   PriceLists price=new PriceLists();
    private static int Number=0;

private void setPrice(){
    price.Setwood(150);
  
    }
    @Override
    public String Build(){
        incrementNumber();
    return "Barrack is built";
    };
    @Override
    public String Destroy(){
    return "Barrack is destroyed";
    };
    public void incrementNumber(){
     Number++;
     }
     public void dcrementNumber(){
     Number--;
     }
     public int  GetNumber(){
     return Number;
      }
    @Override
    public String spawn(){
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    switch(choice){
        case 1:{
       Inventory inventory=new Inventory();
        Soldier s=new Soldier();
        if(inventory.getFood()>=s.price.Getfood()&&inventory.getGold()>=s.price.Getgold()){
        s.incrementNumber();
        inventory.Decfood(s.price.Getfood());
        inventory.Decgold(s.price.Getgold());
        return "Now you have "+s.GetNumber()+" Soldier";
        }else{
        return "You dont have enough resources";
        }
        
        }
        case 2:{
      Inventory  inventory=new Inventory();
        Archer a=new Archer();
        if(inventory.getFood()>=a.price.Getfood()&&inventory.getGold()>=a.price.Getgold()){
        a.incrementNumber();
        inventory.Decfood(a.price.Getfood());
        inventory.Decgold(a.price.Getgold());
        return "Now you have "+a.GetNumber()+" Archer";
        }else{
        return "You dont have enough resources";
        }
        }
        case 3:{
        Inventory inventory=new Inventory();
        JalvinThrower j=new JalvinThrower();
         if(inventory.getFood()>=j.price.Getfood()&&inventory.getGold()>=j.price.Getgold()){
        j.incrementNumber();
        inventory.Decfood(j.price.Getfood());
        inventory.Decgold(j.price.Getgold());
        return "Now you have "+j.GetNumber()+" JalvinThrower";
        }else{
        return "You dont have enough resources";
        }
        
        }default:{
        
        return"Wrong choice";
        
        }
    
    
    }
    
    }
    @Override
     public String toString() { 
         return "Barrack";
      } 
}
