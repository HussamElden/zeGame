/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Point;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public abstract class Unit {
    private Point position;
   private  int Health;
    private String status;
    private boolean aLive = true;
   public String Nation= new String();
 public PriceLists price=new PriceLists();
    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public boolean isaLive() {
        return aLive;
    }

    public void setaLive(boolean aLive) {
        this.aLive = aLive;
    }
 
    public String getNation() {
        return Nation;
    }

    public void setNation(String Nation) {
        this.Nation = Nation;
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
