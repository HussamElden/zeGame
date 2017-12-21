/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

/**
 *
 * @author Ahmed
 */
public class Throwable {
    private int Speed;
    private int Damage;
    
    public void setSpeed (int Tspeed){
        if (Speed >=0)
            Tspeed = Speed;
    }
    public int getSpeed (){
        return  Speed;
    }
    public void setDamage (int TDamage){
        if (Damage >0)
            TDamage = Damage;
    }
    public int getDamage (){
        return  Damage;
    }

    void Motion(){
        
    }
}
