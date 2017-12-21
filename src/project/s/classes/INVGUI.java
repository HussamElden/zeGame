/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static project.s.classes.LeGame.screenSize;
//import static project.s.classes.LeGame.screenSize;


/**
 *
 * @author al 7asob
 */
public class INVGUI extends JPanel implements Runnable {
    public JLabel[] l=new JLabel[4];
    @Override
    public void run() {
        
    }

    public INVGUI() {
       this.setBounds(screenSize.width-400, 0, 400, 50);
       this.setBackground(Color.GRAY);
       for(int i=0;i<4;i++){
       l[i]=new JLabel();
       }
       l[0].setBounds(0, 0, 50, 50);
       l[0].setIcon(new ImageIcon(new ImageIcon("Pics//FoodIco.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
       l[1].setBounds(0, 0, 50, 50);
       l[1].setIcon(new ImageIcon(new ImageIcon("Pics//WoodIco.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
       l[2].setBounds(0, 0, 50, 50);
       l[2].setIcon(new ImageIcon(new ImageIcon("Pics//IronIco.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
       l[3].setBounds(0, 0, 50, 50);
       l[3].setIcon(new ImageIcon(new ImageIcon("Pics//GoldIco.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
       for(int i=0;i<4;i++){
       this.add(l[i]);
       }
       this.setVisible(true);
       
    }
    
}
