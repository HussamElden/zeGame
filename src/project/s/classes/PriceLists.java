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

    public PriceLists() {
    }
    public int food;
    private int wood;
    private int metal;
    private int gold;
   
 
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
