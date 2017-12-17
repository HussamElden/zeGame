/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class Farm extends Buildings implements IBuild{
    
    private int WorkerLimit=1;
     private static int Number=0;

   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
    public void IncreaseFood(Inventory inventory){
  
        int x = inventory.getFood();
       x+=10;
       inventory.setFood(x);
    }
//    @Override
//    public String Build(){
//        Inventory inventory=new Inventory();
//        IncreaseFood(inventory);
//        incrementNumber();
//    return"Farm is built";
//    };
    @Override
    public String Destroy(){
        
    return"Farm destroyed\n";
    };
    @Override
    public String spawn(){
    return null;};
    @Override
     public String toString() { 
         return "Farm";
      } 
}
