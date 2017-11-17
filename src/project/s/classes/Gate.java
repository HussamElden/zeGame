/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.util.ArrayList;

/**
 *
 * @author hos20
 */
public class Gate extends Buildings implements IBuild{
   private boolean open;
    private static int Number=0;
    Inventory inventory=new Inventory();
   PriceLists price=new PriceLists();
        static public ArrayList<Gate>ArrGate=new ArrayList<>();

   Gate()
   {
       price.Setwood(35);
       
   }
   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
    public Boolean open(boolean x){
    return true;
    }
    private Boolean CheckWall(){
    return true;
    }
    @Override
    public String Build(){
         if(inventory.getWood()>=price.Getwood())
        incrementNumber();
    return"Gate is built\n";
    };
    @Override
    public String Destroy(){
    return "Gate is destroyed";
    };
    @Override
    public String spawn(){
    return null;};
}
