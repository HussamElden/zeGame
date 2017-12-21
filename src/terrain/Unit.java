/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Point;
<<<<<<< HEAD
import javax.swing.JLabel;
=======
>>>>>>> Omar
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public abstract class Unit {
    public Point pos;
     public JLabel[] LBL=new JLabel[3];
     private int AS;
   private  int Health;
    private String Name;
    private boolean aLive = true;
<<<<<<< HEAD
   public  String Nation=new String();
=======
   public String Nation= new String();
>>>>>>> Omar
 public PriceLists price=new PriceLists();
    public int getAS() {
        return AS;
    }

    public void setAS(int AS) {
        this.AS = AS;
    }
    public Point getPosition() {
        return pos;
    }

    public void setPosition(Point position) {
        this.pos = position;
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
    
    public void setName (String Stat){
       Name = Stat;
    }
    
    public String getName (){
        return  Name;
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
