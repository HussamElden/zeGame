/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class Mine extends Buildings implements IBuild{
    
    private int WorkerLimit;
     private static int Number=0;
     static public ArrayList<Mine>ArrMine=new ArrayList<>();

   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
    void IncreaseStone(Inventory inventory){
        int x = inventory.getMetal();
       x+=10;
       inventory.setMetal(x);
    }
    @Override
    public String Build(){
        Inventory inventory =new Inventory();
        incrementNumber();
        IncreaseStone(inventory);
    return"Mine is built";
    };
    @Override
    public String Destroy(){
        
    return"Mine is Destroy";
    };
    @Override
    public String spawn(){
    return"";
    };
    @Override
     public String toString() { 
         return "Mine";
      } 
}
