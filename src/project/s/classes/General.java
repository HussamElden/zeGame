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
public class General extends Movables {
   private int Buffrange;
    PriceLists price=new PriceLists();
      private static int Number=0;
      static public ArrayList<General>ArrGeneral=new ArrayList<>();

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
}
