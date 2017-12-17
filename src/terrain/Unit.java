/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import project.s.classes.Coordinates;

/**
 *
 * @author Ahmed
 */
public abstract class Unit {
    private Coordinates position;
    private  int Health;
    private String status;
    private static Inventory inventory=new Inventory();
    private boolean aLive = true;
   private String Nation;

    public String getNation() {
        return Nation;
    }

    public void setNation(String Nation) {
        this.Nation = Nation;
    }
    public void setposition (Coordinates pos){
         position = pos;
    }
  
    public Coordinates getposition (){
        return  position;
    }
    public void setHealth (int health){
        if (health >= 0)
            Health = health;
    }
    
    public int getHealth (){
        return  Health;
    }
    
    public void setStatus (String Stat){
       status = Stat;
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
        aLive = x;
    }
    
}
