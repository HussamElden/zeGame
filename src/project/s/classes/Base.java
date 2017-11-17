/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

/**
 *
 * @author Ahmed
 */
public class Base extends Buildings implements IBuild  {
   public void setlvl(){};
   
   Citizens citizen=new Citizens();
    @Override
    public String Build() {
        return null;
    }

    @Override
    public String Destroy() {
        setalive(false);
        return "Base was destroied and you Lost";
    }

    @Override
    public String spawn() {
       Inventory inventory=new Inventory();
       PriceLists p=citizen.Getprice();
        if(inventory.getFood()>=p.Getfood()){
        citizen.incrementNumber();
        inventory.Decfood(p.Getfood());
        return "Now you have "+citizen.GetNumber()+" citizen";
        }else{
        return "You dont have enough food";
        }
    }
    @Override
     public String toString() { 
         return "Base";
      } 
}
