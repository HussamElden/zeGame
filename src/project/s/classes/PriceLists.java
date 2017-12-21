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

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    
  
    public void DecrementAny(PriceLists p)
     {
         this.food-=p.food;
         this.wood-=p.wood;
         this.gold-=p.gold;
         this.metal-=p.metal;
     }
     
    
      public boolean sheck(PriceLists p)
     {
         if(this.food>=p.food&& this.wood>=p.wood&&this.gold>=p.gold&&this.metal>=p.metal)
         {
          return true;
         }else{
         return false;
         }       
     }
}
