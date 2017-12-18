/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import User.UserGUI;
import User.User;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Omar Anas
 */
public class MainMenu extends JFrame {
//public  UserGUI ugui= new UserGUI();
   
JButton NewGameBtn;
JButton MyAccount;
JButton Options;
JButton Help;
JButton Credits;
JButton Quit;
<<<<<<< HEAD:src/project/s/classes/InGame.java

 Toolkit toolkit = Toolkit.getDefaultToolkit();
             Image image = toolkit.getImage("Pics//sword.png");
public Cursor c = toolkit.createCustomCursor(image , new Point(0, 
           0), "img");
        public InGame() 
=======
        public MainMenu() 
>>>>>>> Hussam:src/project/s/classes/MainMenu.java
    {   
          setSize(5000, 5000);

       //setTitle("Main Menu");
        NewGameBtn= new JButton("New Game");
        MyAccount= new JButton("My Account");
        Options= new JButton("Options");
        Help= new JButton("Help");
        Credits= new JButton("Credits");
        Quit= new JButton("Quit");
        //Container c=getContentPane();
        setLayout(null);
         setVisible(false);
     NewGameBtn.setBounds(850, 300, 150, 50);
     Options.setBounds(850,NewGameBtn.getY()+60,150,50);
     MyAccount.setBounds(850,Options.getY()+60,150,50);
             Help.setBounds(850,MyAccount.getY()+60,150,50);
             Credits.setBounds(850,Help.getY()+60,150,50);
             Quit.setBounds(850, Credits.getY()+60, 150, 50);
     add(NewGameBtn);
     add(Options);
          add(MyAccount);
          add(Help);
          add(Credits);
          
          add(Quit);
          setCursor(c);
          Quit.addActionListener(new AllButtons());
          NewGameBtn.addActionListener(new AllButtons());
        MyAccount.addActionListener(new AllButtons());
       
    }

    private class AllButtons implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
           if (ae.getSource()== Quit)
           {
            int x= JOptionPane.showConfirmDialog (null, "Would You Like to Quit?","Quit",JOptionPane.YES_NO_CANCEL_OPTION);
            if(x==0)
            {
            System.exit(0);
            }
           }
           else if (ae.getSource()==NewGameBtn)
           { dispose();
                                                     System.out.println("moveing");

                LeGame game=new LeGame();
                game.setVisible(true);
                game.setDefaultCloseOperation(3);
           }
    
        
        }
    }
    }


 /*   private static class MyAccount extends JFrame implements ActionListener {
UserGUI ugui;
User u;
JButton deletebtn;
JButton BackButton;
        JLabel UN,RealUN;
        
public MyAccount() 
        {
         
            setSize(400,400);
            setTitle("");
            deletebtn=new JButton("Remove Account");
            BackButton= new JButton("Back");
            Container c= getContentPane();
            c.setLayout(null);
            UN=new JLabel("Username: ");
          //  RealUN=new JLabel("7amo");
            UN.setBounds(850, 100, 70, 10);
          // RealUN.setBounds(930,100,300,10);
            deletebtn.setBounds(875, 200, 150, 50);
            c.add(deletebtn);
            c.add(BackButton);
            c.add(UN);
           // c.add(RealUN);
        }


        @Override
        public void actionPerformed(ActionEvent ae) 
        {
         MyAccount g = new MyAccount();
         g.setVisible(true);
                 g.setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
    }
<<<<<<< HEAD:src/project/s/classes/InGame.java
*/
    private class AllButtons implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
           if (ae.getSource()== Quit){
            int x= JOptionPane.showConfirmDialog (null, "Would You Like to Quit?","Quit",JOptionPane.YES_NO_CANCEL_OPTION);
            if(x==0)
            {
            System.exit(0);
            }
    
        
        }
    }
    }
}

=======
*/
>>>>>>> Hussam:src/project/s/classes/MainMenu.java
