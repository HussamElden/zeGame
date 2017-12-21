/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import User.Arrs;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import terrain.Barrack;
import terrain.Base;
import terrain.Citizens;
<<<<<<< HEAD
import behavior.Moveee;
import behavior.Selector;
=======
import terrain.MOVER;
import terrain.CitizenPanel;
>>>>>>> Omar
import terrain.Unit;
import terrain.BarrackPanel;
import terrain.Stable;
import terrain.castle;


/**
 *
 * @author al 7asob
 */
public class LeGame extends JFrame{

    Panel x;
    
    public static   JLabel mapaia=new JLabel();
     public static Point NP=new Point();
     public static Unit ob;
    static public  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     public static Boolean selected=new Boolean(false);
    public static JPanel tabs=new JPanel();

      Point nextpos=new Point();
     Base b=new Base(Arrs.u.getNation());
     Citizens citizen=new Citizens(Arrs.u.getNation());
     
     
     JPanel jb=new JPanel();
<<<<<<< HEAD
<<<<<<< HEAD
=======
     public static JPanel panaia=new JPanel();
=======
>>>>>>> b4e509fe3865097aea90aa21f6db2d62feea55cb
     public static JLabel tabs = new JLabel();
    // Image PanelBackground= Toolkit.getDefaultToolkit().createImage("Pics//panel.png");
     JLabel fady= new JLabel();
     JLabel PanelBackground= new JLabel();
<<<<<<< HEAD
=======
     public static JPanel panaia=new JPanel();
>>>>>>> ali-fadl
=======
>>>>>>> 3c023ccb011e7f4e82951d827decc80b92b11fba
>>>>>>> b4e509fe3865097aea90aa21f6db2d62feea55cb
     public LeGame()  {
<<<<<<< HEAD
         setSize(screenSize);
=======
         
         JLabel LBL=new JLabel();
                   tabs.setBounds(0,(screenSize.height-(screenSize.height/3)), screenSize.width/3,screenSize.height/3);

         tabs.setIcon(new ImageIcon(new ImageIcon("Pics//panel.png").getImage().getScaledInstance(screenSize.width/3, screenSize.height/3, Image.SCALE_DEFAULT)));
        //  tabs.add(PanelBackground);
       //tabs.setBackground(Color.yellow);
       tabs.setLayout(null);
       tabs.setVisible(true);
    
       jb.add(tabs);
       setSize(screenSize);
>>>>>>> Omar
         setLayout(null);
         setVisible(true);
        
         setBackground(Color.yellow);
         jb.setLayout(null);
    jb.setVisible(true);
    jb.setBackground(Color.BLACK);
    setTitle("test run");
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> b4e509fe3865097aea90aa21f6db2d62feea55cb
      panaia.setBounds(0,(screenSize.height-(screenSize.height/3)), screenSize.width/3,screenSize.height/3);
      panaia.setLayout(null);
      panaia.setBackground(Color.yellow); 
      panaia.setVisible(true);
<<<<<<< HEAD
>>>>>>> ali-fadl
=======
=======
>>>>>>> 3c023ccb011e7f4e82951d827decc80b92b11fba
>>>>>>> b4e509fe3865097aea90aa21f6db2d62feea55cb
    jb.setBackground(Color.green);  
    jb.setBounds(0, 0, screenSize.width, screenSize.height);
    mapaia.setIcon(new ImageIcon(new ImageIcon("terrain.png").getImage().getScaledInstance(screenSize.width*2,screenSize.height*2 , Image.SCALE_DEFAULT)));
   mapaia.setBounds(0, 0, screenSize.width*2, screenSize.height*2);
   System.out.println(Arrs.u.getNation());
   if(Arrs.u.getNation().equals("Human Hunters")){
  // citizen.lbl[1].setBounds(0, 0, 100, 100);
   b.LBL[1].setBounds(10,10,422, 278);
       System.out.println(b.LBL[1].getLocation().x);
       
   //b.setSP(b.LBL[1].getLocation());
   b.SP.x=1000;
   b.SP.y=100;
   }else{
   b.LBL[1].setBounds(100,100, 422, 278);
   }
   mapaia.add(b.LBL[1]);
   //mapaia.add(citizen.lbl[1]);
    tabs.setBounds(0,screenSize.height- screenSize.height/3, screenSize.width/3,screenSize.height/3);
   tabs.setLayout(null);
   tabs.setVisible(true);
   tabs.setBackground(Color.yellow);
   jb.add(tabs);
   jb.add(mapaia);

   add(jb);
//   mapaia.add(panel);
//   mapaia.add(panel.B.lbl[1]);
   b.Start();
<<<<<<< HEAD
//   refresh r=new refresh();
//   r.ref.start();
=======
   Barrack B =new Barrack(Arrs.u.getNation());
   
   Stable horse=new Stable(Arrs.u.getNation());
   
   castle home=new castle(Arrs.u.getNation());
             
   
   
   // B.Blbl[1].setBounds(1000,500,422, 278);
    //mapaia.add(B.Blbl[1]);
    //B.setSP(B.Blbl[1].getLocation().x+300,B.Blbl[1].getLocation().y+300);
      
   // horse.lbl[1].setBounds(200, 200, 422, 278);
    //mapaia.add(horse.lbl[1]);
    //horse.setSP(horse.lbl[1].getLocation().x+300,horse.lbl[1].getLocation().y+300);
    
    home.lbl[1].setBounds(400, 400, 422, 270);
    mapaia.add(home.lbl[1]);
    home.setSP(home.lbl[1].getLocation().x+300,home.lbl[1].getLocation().y+300);

    
    
   
>>>>>>> ali-fadl
  // mapaia.add( b.Start());
//   MOVER m=new MOVER(Arrs.ArrCitizens.get(0).lbl[1].getLocation(),b.SP,Arrs.ArrCitizens.get(0).lbl[1]);
//           m.TMove.start();
     refresh r=new refresh();
   r.ref.start();
     }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b4e509fe3865097aea90aa21f6db2d62feea55cb
<<<<<<< HEAD
     
//     private  class refresh {
//     
//        Thread ref = new Thread()
//            {
//
//            public void run()
//              {  while(true)
//                {
//                    repaint();
//                  try {
//                       Thread.sleep(1000);
//                    } 
//                  catch (InterruptedException ex) 
//                    {   }
//                    
//                 }
//             
//                 }}; 
//    }
=======
<<<<<<< HEAD
    
>>>>>>> ali-fadl
=======
private  class refresh {

        Thread ref = new Thread()
            {

            public void run()
              {  while(true)
                {
                    repaint();
                  try {
                       Thread.sleep(1000);
                    } 
                  catch (InterruptedException ex) 
                    {   }

                 }

                 }}; 
    }
>>>>>>> Omar
<<<<<<< HEAD
=======
    
>>>>>>> ali-fadl
=======
>>>>>>> 3c023ccb011e7f4e82951d827decc80b92b11fba
>>>>>>> b4e509fe3865097aea90aa21f6db2d62feea55cb
}
