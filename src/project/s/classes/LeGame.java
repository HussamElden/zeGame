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
import terrain.Unit;

/**
 *
 * @author al 7asob
 */
public class LeGame extends JFrame{

    
     JLabel mapaia=new JLabel();
     static Point NP=new Point();
     static ArrayList<Unit> obs=new ArrayList();
     static Unit ob ;
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     static Boolean selected=new Boolean(false);
      Point nextpos=new Point();
     
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
   jb.add(mapaia);
   add(jb);
     }
}
