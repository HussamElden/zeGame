/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import User.Arrs;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import terrain.Cavalry;
import terrain.Knight;
import terrain.Chariots;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import project.s.classes.LeGame;
import project.s.classes.PriceLists;
import static project.s.classes.LeGame.panaia;

/**
 *
 * @author Ahmed
 */
public class Stable extends Buildings implements IBuild {

    

    
    
   JButton[]buttons=new JButton[3];
 
     Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();

   Point SP=new Point();  
   private static int Number=0;
   Inventory inventory=new Inventory();
   PriceLists price=new PriceLists();
   public JLabel [] lbl = new JLabel[3];
   public Stable (String nation)
{Nation = nation;
       lbl[0]=new JLabel(nation+" Stable");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Stable_HumanHunters.png").getImage().getScaledInstance(422,344 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Stable_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Stable_NightElves.png").getImage().getScaledInstance(422,344 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Stable_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      
      
    lbl[1].addMouseListener(new mouselisten());  
      
     
    
    
}
   
   
   public Point getSP() {
        return SP;
    }

    public void setSP(Point SP) {
        this.SP = SP;
    }
        public void setSP(int x,int y)
        {
            
        this.SP.x=x;
        this.SP.y=y;
        
        }
        
   public void incrementNumber(){
   Number++;
   }
   public void dcrementNumber(){
   Number--;
   }
   public int  GetNumber(){
   return Number;
   }
   private void setPrice()
     {
    price.Setwood(175);
     }
//    }
//@Override
//    public String Build() {
//    if(inventory.getWood()>=price.Getwood())
//        incrementNumber();
//    return "Stable is built";
//    }

    @Override
    public String Destroy() {
       dcrementNumber();
        return "Stable is destroyed";
    }

    @Override
    public void spawn() 
    {
        
          Knight fares=new Knight(Nation);
           fares.setPosition(SP);
        Arrs.ALL.add(fares);
        Arrs.ArrKnight.add(fares);
        fares.lbl[1].setBounds(this.lbl[1].getBounds().x, this.lbl[1].getBounds().y, 32, 50);
         //fares.lbl[1].setBounds(this.lbl[1].getBounds());
         
        LeGame.mapaia.add(fares.lbl[1]);
        SP.x+=Arrs.ArrKnight.size()+3;
        MOVER haraka=new MOVER(fares.lbl[1].getLocation(),SP,fares.lbl[1]);
         haraka.TMove.start();   
   }
    
    public void spawnCavalary() 
    {
             
        Cavalry rammyeltany=new Cavalry(Nation);
        
        rammyeltany.setPosition(SP);
        Arrs.ALL.add(rammyeltany);
        Arrs.ArrCavalry.add(rammyeltany);
         rammyeltany.lbl[1].setBounds(this.lbl[1].getBounds().x, this.lbl[1].getBounds().y, 32, 50);
      //  rammyeltany.lbl[1].setBounds(this.lbl[1].getBounds());
        LeGame.mapaia.add(rammyeltany.lbl[1]);
        SP.x+=Arrs.ArrCavalry.size()+3;
        MOVER haraka=new MOVER(rammyeltany.lbl[1].getLocation(),SP,rammyeltany.lbl[1]);
        haraka.TMove.start();   
         
         
   } 
    

    public void spawnChariot() 
    {
        
        
        Chariots kar=new Chariots(Nation);
        kar.setPosition(SP);
        Arrs.ALL.add(kar);
        Arrs.ArrChariots.add(kar);
       // kar.lbl[1].setBounds(this.lbl[1].getBounds());
        kar.lbl[1].setBounds(this.lbl[1].getBounds().x, this.lbl[1].getBounds().y, 32, 50);
        LeGame.mapaia.add(kar.lbl[1]);
        SP.x+=Arrs.ArrCavalry.size()+3;
        MOVER haraka=new MOVER(kar.lbl[1].getLocation(),SP,kar.lbl[1]);
        haraka.TMove.start();   
         
         
   }    
       
       
       
    
   public void StablePanel()
    {
        
        

      buttons[0]= new JButton("Knight");
      buttons[0].setBounds(2, 2, 100, 100);
      buttons[1]= new JButton("Cavalry");
      buttons[1].setBounds(100, 2, 100, 100);
      buttons[2]= new JButton("Chariot");
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
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
     private class mouselisten implements MouseListener
     {
        @Override
        public void mouseClicked(MouseEvent e) {
               
            StablePanel();
            
            LeGame.mapaia.addMouseListener(new buttonsremover());
            
            
                  
                
                
                
              // P.setVisible(true);
              // buttons[0].setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Ali\\Desktop\\archer.png").getImage().getScaledInstance(422,359,Image.SCALE_DEFAULT)));
           //    LeGame.mapaia.add(P);
               
               
        }


        @Override
        public void mousePressed(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                spawnCavalary();
                
            }
            if(x.equals(buttons[2]))
            {
               spawnChariot();
                
            }
            
        }
         
        }    
       
       

        
        
        
        
        
        
        
//         Scanner sc=new Scanner(System.in);
//    int choice=sc.nextInt();
//    switch(choice)
//    {
//        case 1:
//        {
//       Inventory inventory=new Inventory();
//        Knight k=new Knight(Nation);
//        if(inventory.getFood()>=k.price.Getfood()&&inventory.getGold()>=k.price.Getgold()){
//        k.incrementNumber();
//        inventory.Decfood(k.price.Getfood());
//        inventory.Decgold(k.price.Getgold());
//        //return "Now you have "+k.GetNumber()+" Knight";
//        }else{
//       // return "You dont have enough resources";
//        }
//        
//        }
//        case 2:
//        {
//      Inventory  inventory=new Inventory();
//        Cavalry ca=new Cavalry("");
//        if(inventory.getFood()>=ca.price.Getfood()&&inventory.getGold()>=ca.price.Getgold()){
//        ca.incrementNumber();
//        inventory.Decfood(ca.price.Getfood());
//        inventory.Decgold(ca.price.Getgold());
//       // return "Now you have "+ca.GetNumber()+" Cavalry";
//        }else{
//       // return "You dont have enough resources";
//        }
//        }
//        case 3:{
//        Inventory inventory=new Inventory();
//        Chariots ch=new Chariots(Nation);
//         if(inventory.getWood()>=ch.price.Getwood()&&inventory.getGold()>=ch.price.Getgold()){
//        ch.incrementNumber();
//        inventory.Decwood(ch.price.Getwood());
//        inventory.Decgold(ch.price.Getgold());
//      //  return "Now you have "+ch.GetNumber()+" Chariots";
//        }else{
//      //  return "You dont have enough resources";
//        }
//        
//        }default:{
        
       // return"Wrong choice";   
     
    }
   
    

   


