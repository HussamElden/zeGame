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
public class Movables extends Unit {
    
   private int Agility;
   private int ID;
   private int AttackSpeed;  
  private  int Agrorange;
    Movables(){
    Agility =0;
    AttackSpeed=0;
    Agrorange=0;
    }
  public void setid (int mID){
   if (ID>0)
       mID=ID;
   } 
   public int getid  (){
       return ID;
   }
   public void setagrorange (int mRange){
   if (Agrorange>0)
       mRange=Agrorange;
   } 
   public int getagrorange(){
       return Agrorange;
   }
  public void setAgility (int Ag){
   if (Ag>0)
       Ag=Agility;
   } 
   public int getAgility(){
       return Agility;
   }
   public void setattackSpeed (int AS){
   if (AttackSpeed>0)
       AS=AttackSpeed;
   } 
   public int getattackSpeed(){
       return AttackSpeed;
   }
    void Stop(){}
    void AutoAttack(){}
    
    
}
