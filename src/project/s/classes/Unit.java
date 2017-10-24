/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

/**
 *
 * @author Ahmed
 */
public class Unit {
    protected Coordinates position;
   private  int Health;
   private int Number=0;
  private String status;
  Inventory inventory;
   private boolean aLive;
   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
    public void setposition (Coordinates pos){
         position= pos;
    }
  
    public Coordinates getposition (){
        return  position;
    }
    public void setHealth (int health){
        if (health >=0)
            Health=health;
    }
    public int getHealth (){
        return  Health;
    }
    public void setStatus (String Stat){
       status= Stat;
    }
    public String getStatus (){
        return  status;
    }
    public int decreasingHealth(){
        return 0;
    }
   
    public void Delete(){
        
    }
    public boolean getalive(){
    return aLive;
    }
    public void setalive(boolean x){
    aLive=x;
    }
}
