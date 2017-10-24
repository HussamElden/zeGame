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
public class Archer extends Movables implements  Ibehavior{
 PriceLists price=new PriceLists();
   protected int Range;
   public Throwable arrow;
   public void setPrice(){
    price.Setgold;
    }

    Archer()
    {
    arrow = new Throwable();
    
    Range=5;
    }

public void setRange (int archRange)
{
    if (Range > 0)
        Range=archRange;
}
public int getRange ()
{
    return Range;
}
    public void Throw() {}
    @Override
     public String move(Coordinates XY){
     return"Archer is moving";
     }
      @Override
     public String attack(){
     return "Archer is Attacking";
     };
    }


