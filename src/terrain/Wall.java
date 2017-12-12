/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import terrain.Archer;
import java.util.ArrayList;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Wall extends Buildings{
    public void PutArcher(Archer archer){}
 PriceLists price=new PriceLists();
   private static int Number=0;
    Inventory inventory=new Inventory();
        static public ArrayList<Wall>ArrWall=new ArrayList<>();

    Wall()
   {
       price.Setwood(10);
    
   }
    @Override
     public String toString() { 
         return "Wall";
      } 
}
