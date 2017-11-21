/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class Citizens extends Movables {
    private PriceLists price = new PriceLists();
     private static int Number = 0;
     static public ArrayList<Citizens>ArrCitizens=new ArrayList<>();

   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
    Citizens(){
    price.Setfood(20);
    }
    public PriceLists Getprice(){
    return price;
    }
    public void Build(){
       
    }
    @Override
     public String toString() { 
         return "Citizens";
      } 
}
