/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior;

import User.Arrs;
import static project.s.classes.LeGame.mapaia;
import terrain.Unit;

/**
 *
 * @author al 7asob
 */
  public class Attack{
           private Unit mohagem;
     
        public Attack(Unit mohagem) {
            this.mohagem=mohagem;
           
        }
      
         Thread Attacking=new Thread()
         {
             public void run()
             {
                   System.out.println("el mohagem ? byhagem:D");
                 while(mohagem.getHealth()>0)
                 {   
                     
                     mohagem.setHealth(mohagem.getHealth()-10);
 
                     System.out.println("el mohagem ? byhagem:D");
                      System.out.println("enemy health equal "+mohagem.getHealth());
                     try {
                         Thread.sleep(100*mohagem.getAS());
                     } catch (InterruptedException ex) {
                         //Logger.getLogger(//"el getlogger da hayt3`yar 3ala 7asab hatet7at f anhy class"\\Knight.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                    if(mohagem.getHealth()==0){
                    mohagem.setalive(false);
                    mapaia.remove(mohagem.LBL[1]);
                    Arrs.ALL.remove(mohagem);
                    //mohagem.
                   mapaia.repaint();
                    }
             }   
            };
         
         
         
         
     }