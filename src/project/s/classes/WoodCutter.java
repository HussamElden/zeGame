/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Ahmed
 */
public class WoodCutter extends Buildings implements IBuild{
   static int x=0;
    private Trees tree;
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

    public WoodCutter() {
        
    }
    
    public void settree (Trees Tree){
          Tree=tree;
    }
  
    public Trees gettree (){
        return  tree;
    }
    void increasewood(Inventory inventory){
       int x = inventory.getWood();
       x+=5;
       inventory.setWood(x);
    }
    @Override
    public String Build(){
        incrementNumber();
    return"Woodcutter is built";
    };
    @Override
    public String Destroy(){
        
    return"Woodcutter is Destroy";
    };
    @Override
    public String spawn(){
    return"";
    };
}
