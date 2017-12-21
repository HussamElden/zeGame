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
import terrain.MOVER;
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
     static Point NP=new Point();
     static Unit ob ;
    static public  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     static Boolean selected=new Boolean(false);
      Point nextpos=new Point();
     Base b=new Base(Arrs.u.getNation());
     Citizens citizen=new Citizens(Arrs.u.getNation());
     JPanel jb=new JPanel();
     public static JPanel panaia=new JPanel();
     public LeGame()  {
         JLabel LBL=new JLabel();
         setSize(screenSize);
         setLayout(null);
         setVisible(true);
         setBackground(Color.yellow);
         jb.setLayout(null);
    jb.setVisible(true);
    jb.setBackground(Color.BLACK);
    setTitle("test run");
      panaia.setBounds(0,(screenSize.height-(screenSize.height/3)), screenSize.width/3,screenSize.height/3);
      panaia.setLayout(null);
      panaia.setBackground(Color.yellow); 
      panaia.setVisible(true);
    jb.setBackground(Color.green);  
    jb.setBounds(0, 0, screenSize.width, screenSize.height);
    mapaia.setIcon(new ImageIcon(new ImageIcon("terrain.png").getImage().getScaledInstance(screenSize.width*2,screenSize.height*2 , Image.SCALE_DEFAULT)));
   mapaia.setBounds(0, 0, screenSize.width*2, screenSize.height*2);
   System.out.println(Arrs.u.getNation());
   if(Arrs.u.getNation().equals("Human Hunters")){
  // citizen.lbl[1].setBounds(0, 0, 100, 100);
   b.LBL[1].setBounds(10,10,422, 278);
   b.SP.x=300;
   b.SP.y=300;
   }else{
   b.LBL[1].setBounds(100,100, 422, 278);
   }
   mapaia.add(b.LBL[1]);
   //mapaia.add(citizen.lbl[1]);
   jb.add(mapaia);
   add(jb);
   b.Start();
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

    
    
   
  // mapaia.add( b.Start());
//   MOVER m=new MOVER(Arrs.ArrCitizens.get(0).lbl[1].getLocation(),b.SP,Arrs.ArrCitizens.get(0).lbl[1]);
//           m.TMove.start();
     }
    
}
