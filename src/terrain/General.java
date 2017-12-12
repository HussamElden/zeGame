/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.util.ArrayList;
import project.s.classes.PriceLists;

/**
 *
 * @author hos20
 */
public class General extends Movables {
   private int Buffrange;
    PriceLists price=new PriceLists();
      private static int Number=0;

   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }

    General()
    {
    price.Setfood(70);
    price.Setgold(80);
    }
    @Override
     public String toString() { 
         return "General";
      } 
}
