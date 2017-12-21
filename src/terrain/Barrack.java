/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import terrain.JalvinThrower;
import terrain.Soldier;
import terrain.Archer;
import java.util.ArrayList;
import java.util.Scanner;
import User.Arrs;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import terrain.MOVER;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import project.s.classes.LeGame;
import project.s.classes.PriceLists;
import project.s.classes.LeGame;
import static project.s.classes.LeGame.panaia;

/**
 *
 * @author Ahmed
 */
public class Barrack extends Buildings implements IBuild
{

   

   
PriceLists price=new PriceLists();
    Point SP=new Point();
    Inventory inventory=new Inventory();
    public JLabel[] Blbl = new JLabel[3];//barrack label
      Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
    JButton[]buttons=new JButton[3];
    
    
    
    
    
public Barrack (String nation)
{   
    price.Setwood(150);
    Nation = nation;
    Blbl[0]=new JLabel(nation+" Barracks");
          
      if(nation.equals("Human Hunters"))
      {
      Blbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_HumanHunters.png").getImage().getScaledInstance(422,359 ,Image.SCALE_DEFAULT)));
      Blbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
      Blbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_NightElves.png").getImage().getScaledInstance(422,359,Image.SCALE_DEFAULT)));
      Blbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Barracks_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      
      }
      
   
       Blbl[1].addMouseListener(new mouselisten());
      

       
       
     
}
 public Point getSP() {
        return SP;
    }

    public void setSP(Point SP) {
        this.SP = SP;
    }
        public void setSP(int x,int y) {
        this.SP.x=x;
        this.SP.y=y;
    }
    @Override
    public String Destroy(){
    return "Barrack is destroyed";
    };
    @Override
    public void spawn()
    {
        Archer arch=new Archer(Nation);
        arch.setPosition(SP);
        Arrs.ALL.add(arch);
        Arrs.ArrArcher.add(arch);
       // arch.lbl[1].setBounds(this.Blbl[1].getBounds());
        arch.lbl[1].setBounds(this.Blbl[1].getBounds().x, this.Blbl[1].getBounds().y, 32, 50);
        LeGame.mapaia.add(arch.lbl[1]);
        SP.x+=Arrs.ArrArcher.size()+3;
        MOVER haraka=new MOVER(arch.lbl[1].getLocation(),SP,arch.lbl[1]);
         haraka.TMove.start();
         
    }
    
    public void spawnSoldier()
    {
        Soldier gondy=new Soldier(Nation);
        gondy.setPosition(SP);
        Arrs.ALL.add(gondy);
        Arrs.ArrSoldier.add(gondy);
        //gondy.lbl[1].setBounds(this.Blbl[1].getBounds());
                gondy.lbl[1].setBounds(this.Blbl[1].getBounds().x, this.Blbl[1].getBounds().y, 32, 50);

        LeGame.mapaia.add(gondy.lbl[1]);
        SP.x+=Arrs.ArrSoldier.size()+5;
        MOVER haraka=new MOVER(this.Blbl[1].getLocation(),SP,gondy.lbl[1]);
        haraka.TMove.start();
   
    }
 
    
    
    public void spawnJalvinThrower()
    {
        
        JalvinThrower rammy=new JalvinThrower(Nation);
        rammy.setPosition(SP);
        Arrs.ALL.add(rammy);
        Arrs.ArrJalvin.add(rammy);
//       rammy.lbl[1].setBounds(this.Blbl[1].getBounds());
        rammy.lbl[1].setBounds(this.Blbl[1].getBounds().width, this.Blbl[1].getBounds().height, 32, 50);
        LeGame.mapaia.add(rammy.lbl[1]);
        SP.x+=Arrs.ArrJalvin.size()+3;
        MOVER haraka=new MOVER(this.Blbl[1].getLocation(),SP,rammy.lbl[1]);
        haraka.TMove.start();    
    }
    
    public void barrackpanel()
    {
        
          
      buttons[0]= new JButton("Archer");
      buttons[0].setBounds(2, 2, 100, 100);
      buttons[1]= new JButton("soldier");
      buttons[1].setBounds(100, 2, 100, 100);
      buttons[2]= new JButton("JalvinThrower");
      buttons[2].setBounds(200,2, 100, 100);

         

      panaia.add(buttons[0]);
      panaia.add(buttons[1]);
      panaia.add(buttons[2]);
         
     
     
     buttons[0].addActionListener(new Action());
     buttons[1].addActionListener(new Action());
     buttons[2].addActionListener(new Action());
    // Blbl[1].addMouseListener(new mouselisten());
     
     
   
     LeGame.mapaia.add(panaia);
   //    Panel.setLayout(new FlowLayout());
     LeGame.mapaia.repaint();
        
    }
    
    public void removebuttons()
    {
        panaia.remove(buttons[0]);
        panaia.remove(buttons[1]);
        panaia.remove(buttons[2]);
        LeGame.panaia.repaint();
    }
    @Override
     public String toString() { 
         return "Barrack";
      } 

    private  class buttonsremover implements MouseListener {

       
        @Override
        public void mouseClicked(MouseEvent e) {
             
           if(LeGame.mapaia.equals(e.getSource()))
               {
                    removebuttons();          
           
               }
        }

        @Override
        public void mousePressed(MouseEvent e) {
         }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
    
     private class mouselisten implements MouseListener
     {
        @Override
        public void mouseClicked(MouseEvent e) {            
            barrackpanel();            
            LeGame.mapaia.addMouseListener(new buttonsremover());      
        }


        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
     }
       public  class Action implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
            Object x=e.getSource();
            
            if(x.equals(buttons[0]))
            {
                spawn();
                
            }
            if(x.equals(buttons[1]))
            {
                spawnSoldier();
                
            }
            if(x.equals(buttons[2]))
            {
               spawnJalvinThrower();
                
            }
            
        }
         
        }
           
//  private class tanfez implements MouseListener{
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//          
//               
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//      
//  }
//         

       
       

     

    
     }

//    @Override
//    public String Build(){
//       
//        if(inventory.p.Getwood() >= price.Getwood()){  
//            int x = inventory.getWood() - price.Getwood();
//            inventory.setWood(x);
//            incrementNumber();
//        }
//    return "Barrack is built";
//    };