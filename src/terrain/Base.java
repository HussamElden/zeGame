/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import project.s.classes.PriceLists;
import terrain.Citizens;
import javax.swing.JLabel;
/**
 *
 * @author Ahmed
 */
public class Base extends Buildings implements IBuild  {
   Citizens citizen=new Citizens();
   public void setlvl(){};
    @Override
    public String Destroy() {
        setalive(false);
        return "Base was destroied and you Lost";
    }

    @Override
    public String spawn() {
       return "hii";
    }
    @Override
     public String toString() { 
         return "Base";
      } 
}
