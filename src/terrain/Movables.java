/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

/**
 *
 * @author hos20
 */
public abstract class Movables extends Unit {

    private int Agility;
    private int ID;
    private double AttackSpeed;
    private int Agrorange;

    Movables() {
        Agility = 0;
        AttackSpeed = 0;
        Agrorange = 0;
    }

    public void setid(int mID) {
        if (ID > 0) 
            mID = ID;        
    }

    public int getid() {
        return ID;
    }

    public void setagrorange(int mRange) {
        if (Agrorange > 0) {
            Agrorange = mRange;
        }
    }

    public int getagrorange() {
        return Agrorange;
    }

    public void setAgility(int Ag) {
        if (Ag > 0) 
            Agility = Ag;        
    }

    public int getAgility() {
        return Agility;
    }

    public void setattackSpeed(double AS) {
        if (AttackSpeed > 0) 
            AttackSpeed = AS;
    }

    public double getattackSpeed() {
        return AttackSpeed;
    }

    void Stop() {
    }

    void AutoAttack() {
    }

}
