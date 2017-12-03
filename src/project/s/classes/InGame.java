/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Omar Anas
 */
public class InGame extends JFrame {

JButton NewGameBtn;

    public InGame() 
    {   
     setSize(400, 400);
        setTitle("Main Menu");
        NewGameBtn= new JButton("New Game");
        Container c=getContentPane();
c.add(NewGameBtn,BorderLayout.CENTER);
    }


    private class Play implements ActionListener,Serializable {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {

        }
    }
}
