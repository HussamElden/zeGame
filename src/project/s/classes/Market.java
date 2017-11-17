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
public class Market extends Buildings implements IBuild {
   private int ctr;
   private int price[]=new int[3];
   private static int Number=0;
          static public ArrayList<Market>ArrMarket=new ArrayList<>();

   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
   public void setctr (int counter){
   if (ctr>0)
       counter=ctr;
   } 
   public int getctr  (){
       return ctr;
   }
   public void setFPrice (int prc){
   if (prc>=0)
       price[0]=prc;
   } 
   public int getFPrice(){
       return price[0];
   }
   public void setWPrice (int prc){
   if (prc>=0)
       price[1]=prc;
   } 
    public int getWPrice(){
       return price[1];
   }
    public void setMPrice (int prc){
   if (prc>=0)
       price[2]=prc;
   } 
    public int getMPrice(){
       return price[2];
   }
   
   
   private int increasePrice(){
    return 0;
    }
    void Sell(int x){
            
    }
    
    int Buy(){
        return 0;
    }
    @Override
    public String Build(){
        incrementNumber();
    return "market is built";
    };
    @Override
    public String Destroy(){
    return "marker is destroyed\n";
    };
    @Override
    public String spawn(){
        return null;}
    @Override
     public String toString() { 
         return "Market";
      } 
}
