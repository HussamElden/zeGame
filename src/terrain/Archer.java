/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;
     
import User.User;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.Coordinates;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Archer extends Movables implements  Ibehavior {
 PriceLists price=new PriceLists();
   protected int Range;
   public Throwable arrow = new Throwable();

   public JLabel[] lbl=new JLabel[3];
 
 
   Archer(String nation){
                    Nation = nation;

       lbl[0]=new JLabel(nation+" Archer");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Archer_HumanHunters.png").getImage().getScaledInstance(50,68 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Archer_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Archer_NightElves.png").getImage().getScaledInstance(50,68 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Archer_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
    price.Setgold(20);
    price.Setfood(25);
    Range=4;
    arrow.setDamage(4);
    setattackSpeed(0.96);
    setHealth(30);
    setagrorange(6);
    setAgility(1);
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
     public String move(Point XY){
     return"Archer is moving";
     }
      @Override
     public String attack() {
     
      return "Archer Attacking";
     }
//         Thread byt7rak=new Thread()
//                 {
//      public void run()
//             {  while(no2ta!=nextNo2ta)
//        {
//        if(no2ta.x<nextNo2ta.x)
//        {
//            no2ta.x+=getattackSpeed();
//        }
//        else if(no2ta.x>nextNo2ta.x)
//        {
//           no2ta.x=-getattackSpeed();
//        }
//        else if(no2ta.y<nextNo2ta.y)
//        {
//            no2ta.y+=getattackSpeed();
//        }
//        else if(no2ta.y>nextNo2ta.y)
//        {
//            no2ta.y=-getattackSpeed();
//            
//        }
//                 }
//          arrow.setLocation(no2ta);
//         
//     
//     }
//                 }
//                 return byt7rak;
                 
     @Override
     public String toString() { 
         return "Archer";
      } 
    }


