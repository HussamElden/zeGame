/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import User.Arrs;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import terrain.General;
import terrain.Throwable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import project.s.classes.LeGame;
import static project.s.classes.LeGame.panaia;
import project.s.classes.PriceLists;

/**
 *
 * @author hos20
 */
public class castle extends Buildings implements IBuild{
<<<<<<< HEAD
   private Throwable arrow=new Throwable();
    private int AgroRange;
 castle(String nation)
=======
    
 JButton[]buttons=new JButton[2];
 
 Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();

 Point SP=new Point();  
    
 private Throwable arrow=new Throwable();
 private int AgroRange;
 private static int Number=0;
 PriceLists price=new PriceLists();
 Inventory inventory=new Inventory();
 public JLabel []lbl = new JLabel[3];
public  castle(String nation)
>>>>>>> ali-fadl
     {
          Nation = nation;
           setName("castle");
       LBL[0]=new JLabel(nation+" Logging Mine");
          
      if(nation.equals("Human Hunters"))
      {
<<<<<<< HEAD
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_HumanHunters.png").getImage().getScaledInstance(422,378 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_NightElves.png").getImage().getScaledInstance(422,378 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
=======
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_HumanHunters.png").getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_NightElves.png").getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Castle_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
>>>>>>> Omar
      }
<<<<<<< HEAD
<<<<<<< HEAD
         
         price.setMetal(120);
     }
=======
=======
>>>>>>> b4e509fe3865097aea90aa21f6db2d62feea55cb
      
      
      lbl[1].addMouseListener(new mouselisten());
      
      
         price.Setmetal(120);
=======
         
         price.setMetal(120);
>>>>>>> 3c023ccb011e7f4e82951d827decc80b92b11fba
     }
<<<<<<< HEAD
=======
 
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
>>>>>>> ali-fadl
    public void Throw(){}
//    @Override
//   public String Build()
//    {    
//     incrementNumber();
//    return "Castle is built";
//    };
    @Override
    public String Destroy()
    {  
    return "Castle is destroyed";
    };
    @Override
    public void spawn()
    { 
<<<<<<< HEAD
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
      switch(choice)
      { 
          case 1:
          {
       Inventory inventory=new Inventory();
        General g=new General(Nation);
<<<<<<< HEAD
        if(inventory.getFood()>=g.price.Getfood()&&inventory.getGold()>=g.price.Getgold()){
       // g.incrementNumber();
        inventory.Decfood(g.price.Getfood());
        inventory.Decgold(g.price.Getgold());
=======
        if(inventory.getFood()>=g.price.getFood()&&inventory.getGold()>=g.price.getGold()){
        g.incrementNumber();
        inventory.Decfood(g.price.getFood());
        inventory.Decgold(g.price.getGold());
>>>>>>> Omar
      //  return "Now you have "+g.GetNumber()+" General";
        }
        else
        {
       // return "You dont have enough resources";
        }
          }
        default:
        {
      // return"Wrong choice";
=======
        
        
        
        
        
        
        
        
//    Scanner sc=new Scanner(System.in);
//    int choice=sc.nextInt();
//      switch(choice)
//      { 
//          case 1:
//          {
//       Inventory inventory=new Inventory();
//        General g=new General(Nation);
//        if(inventory.getFood()>=g.price.Getfood()&&inventory.getGold()>=g.price.Getgold()){
//        g.incrementNumber();
//        inventory.Decfood(g.price.Getfood());
//        inventory.Decgold(g.price.Getgold());
//       // return "Now you have "+g.GetNumber()+" General";
//        }
//        else
//        {
//       // return "You dont have enough resources";
//        }
//          }
//        default:
//        {
//      // return"Wrong choice";
//        }
//    }
}
    
           public void spawnCatapult() 
    {
           
        Catapult sayara=new Catapult(Nation);
        sayara.setPosition(SP);
        Arrs.ALL.add(sayara);
        Arrs.ArrCatapult.add(sayara);
        sayara.lbl[1].setBounds(this.lbl[1].getBounds());
       // sayara.lbl[1].setBounds(this.lbl[1].getBounds().height, this.lbl[1].getBounds().width, 32, 50);
        LeGame.mapaia.add(sayara.lbl[1]);
        SP.x+=Arrs.ArrCavalry.size()+3;
        MOVER haraka=new MOVER(sayara.lbl[1].getLocation(),SP,sayara.lbl[1]);
        haraka.TMove.start();   
         
   }
           
           public void spawnGeneral()
           {
               
        General hitler=new General(Nation);
        hitler.setPosition(SP);
        Arrs.ALL.add(hitler);
        Arrs.ArrGeneral.add(hitler);
       hitler.lbl[1].setBounds(this.lbl[1].getBounds());
       
       // hitler.lbl[1].setBounds(this.lbl[1].getBounds().height, this.lbl[1].getBounds().width, 32, 50);
        LeGame.mapaia.add(hitler.lbl[1]);
        SP.x+=Arrs.ArrGeneral.size()+3;
        MOVER haraka=new MOVER(hitler.lbl[1].getLocation(),SP,hitler.lbl[1]);
        haraka.TMove.start();   
               
               
           }
    
      public void CastlePanel()
    {        
      buttons[0]= new JButton("Catapult");
      buttons[0].setBounds(2, 2, 100, 100);
      buttons[1]= new JButton("Hitler");
      buttons[1].setBounds(100, 2, 100, 100);
//      buttons[2]= new JButton("Chariot");
//      buttons[2].setBounds(200,2, 100, 100);

         

      panaia.add(buttons[0]);
      panaia.add(buttons[1]);
     
         
     
     
     buttons[0].addActionListener(new Action());
     buttons[1].addActionListener(new Action());
     
    // Blbl[1].addMouseListener(new mouselisten());
     
     
   
     LeGame.mapaia.add(panaia);
   //    Panel.setLayout(new FlowLayout());
     LeGame.mapaia.repaint();
        
    }
    
    public void removebuttons()
    {
        panaia.remove(buttons[0]);
        panaia.remove(buttons[1]);
       
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
>>>>>>> ali-fadl
        }
    }
    
     private class mouselisten implements MouseListener
     {
        @Override
        public void mouseClicked(MouseEvent e) {
               
            CastlePanel();
            
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
                spawnCatapult();
                
            }
            if(x.equals(buttons[1]))
            {
                spawnGeneral();
                
            }
          
            
        }
         
        }            
           
    
    
    @Override
     public String toString() { 
         return "castle";
      } 
}
