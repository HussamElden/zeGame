/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class WoodCutter extends Buildings implements IBuild{
   static int x=0;
    private Trees tree;
     private static int Number=0;
     PriceLists price=new PriceLists();
   Inventory inventory=new Inventory();

     WoodCutter()
     {
         price.Setwood(25);   
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
//    @Override
//    public String Build(){
//         if(inventory.getWood()>=price.Getwood())
//        incrementNumber();
//   
//        increasewood(inventory);
//    return"Woodcutter is built";
//    };
    @Override
    public String Destroy(){
        
    return"Woodcutter is Destroy";
    };
    @Override
    public String spawn(){
    return"";
    };
    @Override
     public String toString() { 
         return "WoodCutter";
      } 
}
