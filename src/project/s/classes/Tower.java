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
public class Tower extends Buildings{
   private Throwable arrows;
    private int Range;
    private int AgroRange;
  private int Attackspeed;
     private static int Number=0;
      static public ArrayList<Wall>ArrWall=new ArrayList<>();

   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
  public void setarrows (Throwable Arrows){
          Arrows=arrows;
    }
  
    public Throwable getarrows (){
        return  arrows;
    }
public void setRange (int range){
        if (Range >0)
            range=Range;
    }
    public int getRange (){
        return  Range;
    }

public void setAttackspeed (int Aspeed){
        if (Attackspeed >0)
            Aspeed=Attackspeed;
    }
    public int getAttackspeed (){
        return  Attackspeed;
    }
}
