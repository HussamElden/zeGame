/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author al 7asob
 */
public class MOVER {
     private Point no2ta,nextNo2ta;
       private JLabel arch;
         int speed=1;
        public MOVER(Point no2ta1,Point nextNo2ta1,JLabel arch1) {
          //  System.out.println("constructing thread");
            no2ta=no2ta1;
            nextNo2ta=nextNo2ta1;
            arch=arch1;
        }
       public  Thread TMove = new Thread()
            {

            public void run()
              {  while(!no2ta.equals(nextNo2ta))
        {
        if(no2ta.x<nextNo2ta.x)
        {
            no2ta.x+=speed;
      //  System.out.println("x increase");

        }
        else if(no2ta.x>nextNo2ta.x)
        {
           no2ta.x-=speed;

        }
       if(no2ta.y<nextNo2ta.y)
        {
            no2ta.y+=speed;
     // System.out.println("y increase");

        }
        else if(no2ta.y>nextNo2ta.y)
        {
            no2ta.y-=speed;

        }
        
          arch.setLocation(no2ta);
                  try {
                       Thread.sleep(100000/(100*100));
                    } 
                  catch (InterruptedException ex) 
                    {   }
                    
                 }
             
                 }}; 
}
