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
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import terrain.Base;
import terrain.Citizens;
import behavior.Moveee;
import behavior.Selector;
import terrain.Unit;

/**
 *
 * @author al 7asob
 */
public class LeGame extends JFrame{

    
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
     public LeGame()  {
         setSize(screenSize);
         setLayout(null);
         setVisible(true);
        
         setBackground(Color.yellow);
         jb.setLayout(null);
    jb.setVisible(true);
    jb.setBackground(Color.BLACK);
    setTitle("test run");
     
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
   b.Start();
//   refresh r=new refresh();
//   r.ref.start();
  // mapaia.add( b.Start());
//   MOVER m=new MOVER(Arrs.ArrCitizens.get(0).lbl[1].getLocation(),b.SP,Arrs.ArrCitizens.get(0).lbl[1]);
//           m.TMove.start();
     }
     
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
}
