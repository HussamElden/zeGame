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
public class Catapult extends Movables implements  Ibehavior {
    
    private int Range;
    private Throwable Stone;
  
  
public void setRange (int cataRange)
{
    if (Range > 0)
        Range=cataRange;
}
public int getRange ()
{
    return Range;
}
     
     
     public void Throw(){}
     @Override
     public String move(Coordinates XY){
     return"Catapult is moving";
     }
      @Override
     public String attack(){
     return "Catapult is Attacking";
     };
    }

