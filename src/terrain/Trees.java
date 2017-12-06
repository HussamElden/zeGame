/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

/**
 *
 * @author Ahmed
 */
public class Trees {
   private int Number;
    public void setNumber (int Num){
        if (Number >0)
            Num=Number;
    }
    public int getNumber (){
        return  Number;
    }
    void Spawn(){
        
    }
    @Override
     public String toString() { 
         return "Trees";
      } 
}
