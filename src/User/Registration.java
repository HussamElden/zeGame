/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import project.s.classes.MainMenu;

/**
 *
 * @author Omar Anas
 */
public class Registration extends JFrame implements Serializable {
  UserGUI ugui = new UserGUI();
    JButton RegisterBtn=new JButton();
      JLabel ConfirmPasslbl = new JLabel();
      JPasswordField ConfirmPasstxt;
       JLabel UNlbl2;
        JLabel Passlbl2;
         JLabel NationLabel;
        JTextField UNtxt2;
        JPasswordField Passtxt2;
       JComboBox NationCombo = new JComboBox(new String[]{"Human Hunters", "Night Elves"});
        Toolkit toolkit = Toolkit.getDefaultToolkit();
             Image image = toolkit.getImage("Pics//sword.png");
public Cursor c = toolkit.createCustomCursor(image , new Point(0, 
           0), "img");
         public Registration()
        {
        setSize(5000, 5000);
        setTitle("Register");
        RegisterBtn= new JButton("Register");
      UNlbl2= new JLabel ("Username");
        Passlbl2= new JLabel ("Password");
        ConfirmPasslbl= new JLabel ("Confirm Password");
        NationLabel =  new JLabel("Your Nation");
        UNtxt2= new JTextField(16);
         Passtxt2= new JPasswordField(16);
         ConfirmPasstxt= new JPasswordField(16);
           NationCombo.setSelectedItem("Human Hunters");
        Container container= getContentPane();
        setLayout(null);
        UNtxt2.setBounds(850, Passtxt2.getHeight()+300, 170, 50);
        Passtxt2.setBounds(850, 350,170, 50);
        ConfirmPasstxt.setBounds(850, Passtxt2.getY()+50, 170, 50);
        NationCombo.setBounds(850, ConfirmPasstxt.getY()+50, 170, 50);
        NationLabel.setBounds(760, NationCombo.getY()+20, 110,10);
        RegisterBtn.setBounds(850, NationCombo.getY()+60, 169, 50);
       UNlbl2.setBounds(770, UNtxt2.getY()+20, 70, 10);
       Passlbl2.setBounds(770, Passtxt2.getY()+20, 70, 10);
       ConfirmPasslbl.setBounds(722, ConfirmPasstxt.getY()+20, 110, 10);
        container.add(UNtxt2);
        container.add(Passtxt2);
        container.add(UNlbl2);
        container.add(Passlbl2);
        container.add(RegisterBtn);
        container.add(ConfirmPasslbl);
        container.add(ConfirmPasstxt);
        container.add(NationCombo);
        container.add(NationLabel);
            setCursor(c);
        RegisterBtn.addActionListener(new Register());
            setVisible(false);
        }
     private class Register implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
          
            String UN = UNtxt2.getText();
            String Pass= Passtxt2.getText();
            String ConfirmPass= ConfirmPasstxt.getText();
            String Nation = (String) NationCombo.getSelectedItem();
        if (UN.equals("")|| Pass.equals("")||ConfirmPass.equals(""))     
         JOptionPane.showMessageDialog(null, "Don't leave a blank tab.","Alert",JOptionPane.ERROR_MESSAGE) ;
        else if (UN.length()>16 || UN.length()< 4 || Pass.length()>16 || Pass.length()< 4)
        {
            JOptionPane.showMessageDialog(null, "Username & Passsword must range from 4 to 16 letters","Alert",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if (ConfirmPass.equals(Pass))
                try {
                   ugui.addu(UN, Pass,Nation);
                   if (ugui.CheckNew==true)
                   {   dispose();
                       MainMenu g=new MainMenu();
                       g.setVisible(true);
                       g.setDefaultCloseOperation(EXIT_ON_CLOSE);
                       g.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                   }
           } catch (IOException | ClassNotFoundException ex) {
               Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        else
        {  
            JOptionPane.showMessageDialog(null, "Passwords doesn't match!","Alert",JOptionPane.ERROR_MESSAGE);
            Passtxt2.setText("");
            ConfirmPasstxt.setText("");
        }
        }
    }
    }
}
