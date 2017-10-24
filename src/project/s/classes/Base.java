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
   public Boolean Isdestroyed(){
   return false;
   }
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
        inventory=new Inventory();
        if(inventory.getFood()>=citizen.price.Getfood()){
        citizen.incrementNumber();
        inventory.Decfood(citizen.price.Getfood());
        return "Now you have "+citizen.GetNumber()+" citizen";
        }else{
        return "You dont have enough food";
        }
    }
}
