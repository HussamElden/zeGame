/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

/**
 *
 * @author hos20
 */
public  class Melee {
    private int damage;
    private int range;
    private int lvl;
   
    public void setdamage (int dmg){
        if (damage > 0)
            dmg = damage;
    }
    
    public int getdamage(){
       return damage;
    }
   
    public void setrange (int rng){
        if (range > 0)
            rng = range;
    }
     
    public int getrange  (){
       return range;
    }
   
    public void setlvl (int level){
        if (lvl>0)
            level = lvl;
    }
   
    public int getlvl(){
       return lvl;
    }
   
}
