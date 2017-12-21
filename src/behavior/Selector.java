/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior;


import User.Arrs;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static project.s.classes.LeGame.*;
import terrain.Unit;

/**
 *
 * @author al 7asob
 */
public class Selector  {

    public Selector() {
        
            mapaia.addMouseListener(new mover());


    }
        private void movieing(){
        if(ob!=null){
                                 System.out.println("moveing");
      
             Moveee m=new Moveee(ob.LBL[1].getLocation(),NP,ob.LBL[1]);
           m.TMove.start();
           
       // (ob.LBL).setLocation(NP);
        
         ob.pos=NP;
                    // System.out.println("moveing");

      ob=null;
      selected=false;
                  //   System.out.println(ob);
        }
    }
     public void movie(Unit lbl){
                                  System.out.println("movie");
                                  
    (lbl.LBL[1]).addMouseListener(new selector(lbl));
     }
    private   class selector implements MouseListener {
        Unit test;
        public selector(Unit lbl) {
            test=lbl;
           
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            if(me.getButton()==MouseEvent.BUTTON1){
           ob=test;
           selected=true;
            System.out.println("Switch unit");
            }
            else{
                for(Unit z:Arrs.ALL){
                 if(selected){
                     if(z.LBL.equals(me.getSource())){
                        if(z.Nation.equals(ob.Nation)){
                        NP.x=(me.getXOnScreen()-100);
                       NP.y=(me.getYOnScreen()-100);
                       System.out.println("Farend");

                        movieing();
                        }else{
                          Attack A=new Attack(z);
                        A.Attacking.start();
                                System.out.println("ATTACCKKKK");
                                      NP.x=(me.getXOnScreen()+100);
                       NP.y=(me.getYOnScreen()+100);
                                                    System.out.println("enemy");
                        movieing();
                        }
                     }
                 }
            }
            
            }
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    }

    private  class mover implements MouseListener {
       

        public mover() {
        }

        @Override
        public void mouseClicked(MouseEvent me) {
             System.out.println("mover");
             if (mapaia.getComponentAt(me.getPoint())!=mapaia){
                 for(Unit z:Arrs.ALL){
                     if((mapaia.getComponentAt(me.getPoint())).equals(z.LBL[1])){
                        if(z.Nation==ob.Nation){
                        NP.x=me.getX()+10;
                       NP.y=me.getY()+10;
                       System.out.println("Farend");

                        movieing();
                        }else{
                        }
                        Attack A=new Attack(z);
                        A.Attacking.start();
                          System.out.println("enemy health equal "+z.getHealth());
                         System.out.println("ATTACCKKKK");
                                NP.x=me.getX()+20;
                       NP.y=me.getY()+20;
                                movieing();
                              System.out.println("enemy");
                     }
                 }
             }else{
                 
            NP=me.getPoint();
                
             System.out.println("Free area");
                          System.out.println(mapaia.getComponentAt(me.getPoint()));

             movieing();
             }
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    
    }
}
