/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import terrain.Inventory;

/**
 *
 * @author hos20
 */
public class PriceLists {
     private int food;
    private int wood;
    private int metal;
    private int gold;

    public PriceLists(int food, int wood, int metal, int gold) {
        this.food = food;
        this.wood = wood;
        this.metal = metal;
        this.gold = gold;
    }

    public PriceLists() {
         this.food = 0;
        this.wood = 0;
        this.metal = 0;
        this.gold = 0;
    }
  
    
   
   
 
    public void Setmetal(int M){
            metal =M;
            
    }
    public int Getmetal(){
    return metal;
    }
    public void Setwood(int W){
    wood =W;
    }
    public int Getwood(){
    return wood;
    }
    public void Setfood(int F){
    food=F;
    }
    public int Getfood(){
    return food;
    }
    public void Setgold(int G){
    gold=G;
    }
    public int Getgold(){
    return gold;
    }
    
}
