/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author hos20
 */
final public class timer {
    
    public void increase(){
         Timer t = new Timer();
      
    t.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {
             int X=0;final int inc=5;
             X += inc;
             
        }
        
    }, 0, 5000);
    
}
}   
