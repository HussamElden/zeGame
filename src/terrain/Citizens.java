/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

<<<<<<< HEAD
<<<<<<< HEAD
import User.Arrs;
import java.awt.Dimension;
import java.awt.Image;
=======
=======

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

>>>>>>> ali-fadl




import User.Arrs;
import java.awt.Color;
>>>>>>> Omar
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Dimension;
import java.awt.Image;
<<<<<<< HEAD
import java.awt.event.MouseMotionListener;
=======
import java.awt.Point;

import java.util.ArrayList;
>>>>>>> ali-fadl
import javax.swing.ImageIcon;
import javax.swing.JLabel;
<<<<<<< HEAD
import static project.s.classes.LeGame.*;

=======
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import project.s.classes.LeGame;
>>>>>>> Omar
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Citizens extends Movables {
<<<<<<< HEAD
<<<<<<< HEAD
boolean draged =false;
=======
            boolean draged =false;
>>>>>>> Omar
             Barrack B;
             Mine SM;
             Farm F;
             Market M ;
             Stable S;
             Tower T;
             castle C;
             WoodCutter W;
             boolean BoolBarrack = false;
                     boolean BoolSM=false;
                     boolean BoolFarm=false;
                     boolean BoolMarket=false;
                     boolean BoolStable=false;
                     boolean BoolTower=false;
                     boolean BoolCastle=false;
                     boolean BoolWC=false;
    JLabel [] BuildLbls = new JLabel[8];
JLabel Holder = new JLabel();
=======

   Barrack B = new Barrack(Nation);
             Mine SM = new Mine (Nation);
             Farm F= new Farm(Nation);
             Market M = new Market (Nation);
             Stable S= new Stable(Nation);
             Tower T = new Tower(Nation);
             castle C = new castle(Nation);
             WoodCutter W = new WoodCutter(Nation);
    JLabel [] BuildLbls = new JLabel[8];

 
    
    
    
    
>>>>>>> ali-fadl
    private PriceLists price = new PriceLists();
// JPanel panel = new JPanel();
<<<<<<< HEAD
=======
public JLabel [] lbl = new JLabel[3];
>>>>>>> Omar
//public CitizenPanel p = new CitizenPanel(Nation);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
public Citizens(String nation)
     {          Nation = nation;
<<<<<<< HEAD
      price.Setfood(20);
         LBL[0]=new JLabel(nation+" Citizen");
=======
      price.setFood(20);
         lbl[0]=new JLabel(nation+" Citizen");
>>>>>>> Omar
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
<<<<<<< HEAD
<<<<<<< HEAD
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
       LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
     LBL[1].addMouseListener(new ShowPanel());
=======
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
       lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
     lbl[1].addMouseListener(new ShowPanel());
>>>>>>> Omar
     
      B = new Barrack(Nation);
             SM = new Mine (Nation);
        F= new Farm(Nation);
            M = new Market (Nation);
             S= new Stable(Nation);
            T = new Tower(Nation);
              C = new castle(Nation);
              W = new WoodCutter(Nation);
     }

//   public void incrementNumber(){
//   Number++;
//   }
//   public void dcrementNumber(){
//   Number--;
//   }
//   public int  GetNumber(){
//   return Number;
//   }

     


    Citizens(){
   
=======

       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));

       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));

      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      lbl[1].addMouseListener(new ShowPanel());

//   public void incrementNumber(){
//   Number++;
//   }
//   public void dcrementNumber(){
//   Number--;
//   }
//   public int  GetNumber(){
//   return Number;
//   }

     }
    
    Citizens()
            {
    price.Setfood(20);
>>>>>>> ali-fadl
    }
    public PriceLists Getprice(){
    return price;
    }
//    public JLabel ShowTab( Dimension screenSize){
//        
//    }
    public void Build()
    {
      
    }
    @Override
     public String toString() { 
         return "Citizens";
      } 

<<<<<<< HEAD
    private class Drag implements MouseMotionListener , MouseListener{

        public Drag() {
        }

        @Override
        public void mouseDragged(MouseEvent me) {
             if (BuildLbls[0].equals(me.getSource()))
 {
     BoolBarrack=true;
         //if(Inventory.price.sheck(B.price)== true)
   // B= new Barrack(Nation);
     //B.lbl[1].addMouseListener(new Release());
     //System.out.print("dragerrr");
<<<<<<< HEAD
    B.LBL[1].setBounds(me.getXOnScreen()-B.LBL[1].getWidth()/2, me.getYOnScreen()-B.LBL[1].getHeight()/2, 100,100);
     mapaia.add(B.LBL[1]);
=======
    B.lbl[1].setBounds(me.getXOnScreen()-B.lbl[1].getWidth()/2, me.getYOnScreen()-B.lbl[1].getHeight()/2, 100,100);
     LeGame.mapaia.add(B.lbl[1]);
>>>>>>> Omar
     draged=true;
 }  
             else if (BuildLbls[1].equals(me.getSource()))
             {
                 
              BoolSM=true;
<<<<<<< HEAD
                 SM.LBL[1].setBounds(me.getXOnScreen()-SM.LBL[1].getWidth()/2, me.getYOnScreen()-SM.LBL[1].getHeight()/2, 80,80);
                mapaia.add(SM.LBL[1]);
=======
                 SM.lbl[1].setBounds(me.getXOnScreen()-SM.lbl[1].getWidth()/2, me.getYOnScreen()-SM.lbl[1].getHeight()/2, 80,80);
                 LeGame.mapaia.add(SM.lbl[1]);
>>>>>>> Omar
                 draged = true;
                  //this.mouseReleased(me);
                 
             }
             else if (BuildLbls[2].equals(me.getSource()))
             {
                 BoolFarm=true;
<<<<<<< HEAD
                 F.LBL[1].setBounds(me.getXOnScreen()-F.LBL[1].getWidth()/2, me.getYOnScreen()-F.LBL[1].getHeight()/2, 100,100);
                 mapaia.add(F.LBL[1]);
=======
                 F.lbl[1].setBounds(me.getXOnScreen()-F.lbl[1].getWidth()/2, me.getYOnScreen()-F.lbl[1].getHeight()/2, 100,100);
                 LeGame.mapaia.add(F.lbl[1]);
>>>>>>> Omar
                 draged = true;
                  //this.mouseReleased(me);
             }
            else if (BuildLbls[3].equals(me.getSource()))
             {
                BoolMarket=true;
<<<<<<< HEAD
                 M.LBL[1].setBounds(me.getXOnScreen()-M.LBL[1].getWidth()/2, me.getYOnScreen()-M.LBL[1].getHeight()/2, 100,100);
                 mapaia.add(M.LBL[1]);
=======
                 M.lbl[1].setBounds(me.getXOnScreen()-M.lbl[1].getWidth()/2, me.getYOnScreen()-M.lbl[1].getHeight()/2, 100,100);
                 LeGame.mapaia.add(M.lbl[1]);
>>>>>>> Omar
                 draged = true;
                  //this.mouseReleased(me);
             }
               else if (BuildLbls[4].equals(me.getSource()))
             {
                 BoolStable=true;
<<<<<<< HEAD
                 
                 S.LBL[1].setBounds(me.getXOnScreen()-S.LBL[1].getWidth()/2, me.getYOnScreen()-S.LBL[1].getHeight()/2, 100,100);
                mapaia.add(S.LBL[1]);
=======
                 S.lbl[1].setBounds(me.getXOnScreen()-S.lbl[1].getWidth()/2, me.getYOnScreen()-S.lbl[1].getHeight()/2, 100,100);
                 LeGame.mapaia.add(S.lbl[1]);
>>>>>>> Omar
                 draged = true;
                  //this.mouseReleased(me);
             }
               else if (BuildLbls[5].equals(me.getSource()))
             {
                 BoolTower=true;
<<<<<<< HEAD
                 T.LBL[1].setBounds(me.getXOnScreen()-T.LBL[1].getWidth()/2, me.getYOnScreen()-T.LBL[1].getHeight()/2, 100,150);
                 mapaia.add(T.LBL[1]);
=======
                 T.lbl[1].setBounds(me.getXOnScreen()-T.lbl[1].getWidth()/2, me.getYOnScreen()-T.lbl[1].getHeight()/2, 100,150);
                 LeGame.mapaia.add(T.lbl[1]);
>>>>>>> Omar
                 draged = true;
                  //this.mouseReleased(me);
             }
                else if (BuildLbls[6].equals(me.getSource()))
             {
                 BoolCastle=true;
<<<<<<< HEAD
                 C.LBL[1].setBounds(me.getXOnScreen()-C.LBL[1].getWidth()/2, me.getYOnScreen()-C.LBL[1].getHeight()/2, 100,100);
                 mapaia.add(C.LBL[1]);
=======
                 C.lbl[1].setBounds(me.getXOnScreen()-C.lbl[1].getWidth()/2, me.getYOnScreen()-C.lbl[1].getHeight()/2, 100,100);
                 LeGame.mapaia.add(C.lbl[1]);
>>>>>>> Omar
                 draged = true;
                  //this.mouseReleased(me);
             }
           else if (BuildLbls[7].equals(me.getSource()))
             {
                 BoolWC=true;
<<<<<<< HEAD
                 W.LBL[1].setBounds(me.getXOnScreen()-W.LBL[1].getWidth()/2, me.getYOnScreen()-W.LBL[1].getHeight()/2, 100,100);
                 mapaia.add(W.LBL[1]);
=======
                 W.lbl[1].setBounds(me.getXOnScreen()-W.lbl[1].getWidth()/2, me.getYOnScreen()-W.lbl[1].getHeight()/2, 100,100);
                 LeGame.mapaia.add(W.lbl[1]);
>>>>>>> Omar
                 draged = true;
                  //this.mouseReleased(me);
             }
            
        }

        @Override
        public void mouseMoved(MouseEvent me) {
        }
<<<<<<< HEAD

        @Override
        public void mouseClicked(MouseEvent me) {
      //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
=======
     
>>>>>>> ali-fadl

        @Override
        public void mousePressed(MouseEvent me) {
      //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {

           if(draged)
           {
               if (BoolBarrack)
               {
               // if(Inventory.price.sheck(B.price)== true)
          Barrack Be = new Barrack(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          Be.LBL[1].setBounds(B.LBL[1].getX(),B.LBL[1].getY(), 100,100);
          mapaia.add(Be.LBL[1]);
             Arrs.ALL.add(Be);
              Arrs.ArrBarrack.add(Be);
              Be.setPosition(Be.LBL[1].getLocation());

              System.out.println(Arrs.ArrBarrack.size()+" ");
              System.out.println(me.getXOnScreen()+""+me.getYOnScreen());
            //  farm.lbl[1].setLocation(-100, -100);
              mapaia.remove(B.LBL[1]);
              mapaia.repaint();
              BoolBarrack=false;
              //System.out.println(I.getWood());
               }
               else if (BoolSM)
               {
            Mine Mine = new Mine(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          Mine.LBL[1].setBounds(SM.LBL[1].getX(),SM.LBL[1].getY(), 80,80);
         mapaia.add(Mine.LBL[1]);
             Arrs.ALL.add(Mine);
              Arrs.ArrMine.add(Mine);
              Mine.setPosition(Mine.LBL[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              mapaia.remove(SM.LBL[1]);
              mapaia.repaint();
              BoolSM=false;
              
           }
                else if (BoolFarm)
               {
            Farm farm = new Farm(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          farm.LBL[1].setBounds(F.LBL[1].getX(),F.LBL[1].getY(), 100,100);
          mapaia.add(farm.LBL[1]);
             Arrs.ALL.add(farm);
              Arrs.ArrFarm.add(farm);
              farm.setPosition(farm.LBL[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              mapaia.remove(F.LBL[1]);
              mapaia.repaint();
              BoolFarm=false;
           }
                else if (BoolMarket)
               {
            Market market = new Market(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          market.LBL[1].setBounds(M.LBL[1].getX(),M.LBL[1].getY(), 100,100);
          mapaia.add(market.LBL[1]);
             Arrs.ALL.add(market);
              Arrs.ArrMarket.add(market);
              market.setPosition(market.LBL[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              mapaia.remove(M.LBL[1]);
              mapaia.repaint();
              BoolMarket=false;
           }
                else if (BoolStable)
               {
            Stable stable = new Stable(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          stable.LBL[1].setBounds(S.LBL[1].getX(),S.LBL[1].getY(), 100,100);
          mapaia.add(stable.LBL[1]);
             Arrs.ALL.add(stable);
              Arrs.ArrStable.add(stable);
              stable.setPosition(stable.LBL[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              mapaia.remove(S.LBL[1]);
              mapaia.repaint();
              BoolStable=false;
           }
                else if (BoolTower)
               {
            Tower tower = new Tower(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          tower.LBL[1].setBounds(T.LBL[1].getX(),T.LBL[1].getY(), 100,150);
          mapaia.add(tower.LBL[1]);
             Arrs.ALL.add(tower);
              Arrs.ArrTower.add(tower);
              tower.setPosition(tower.LBL[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              mapaia.remove(T.LBL[1]);
              mapaia.repaint();
              BoolTower=false;
           }
                else if (BoolCastle)
               {
           castle castle = new castle(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          castle.LBL[1].setBounds(C.LBL[1].getX(),C.LBL[1].getY(), 100,100);
          mapaia.add(castle.LBL[1]);
             Arrs.ALL.add(castle);
              Arrs.ArrCastle.add(castle);
              castle.setPosition(castle.LBL[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              mapaia.remove(C.LBL[1]);
              mapaia.repaint();
              BoolCastle=false;
           }
                    else if (BoolWC)
               {
            WoodCutter woodCutter = new WoodCutter(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          woodCutter.LBL[1].setBounds(W.LBL[1].getX(),W.LBL[1].getY(), 100,100);
          mapaia.add(woodCutter.LBL[1]);
             Arrs.ALL.add(woodCutter);
              Arrs.ArrWood.add(woodCutter);
              woodCutter.setPosition(woodCutter.LBL[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              mapaia.remove(W.LBL[1]);
              mapaia.repaint();
              BoolWC=false;
               }
        draged=false;
        }        }

        @Override
        public void mouseEntered(MouseEvent me) {
     //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
     //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

=======

        @Override
        public void mouseClicked(MouseEvent me) {
      //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent me) {
      //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {

           if(draged)
           {
               if (BoolBarrack)
               {
              if(Inventory.price.sheck(B.price)==true)
              {
          Barrack Be = new Barrack(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          Be.lbl[1].setBounds(B.lbl[1].getX(),B.lbl[1].getY(), 100,100);
          LeGame.mapaia.add(Be.lbl[1]);
             Arrs.ALL.add(Be);
              Arrs.ArrBarrack.add(Be);
              Be.setPosition(Be.lbl[1].getLocation());

              System.out.println(Arrs.ArrBarrack.size()+" ");
              System.out.println(me.getXOnScreen()+""+me.getYOnScreen());
            //  farm.lbl[1].setLocation(-100, -100);
              LeGame.mapaia.remove(B.lbl[1]);
              LeGame.mapaia.repaint();
              BoolBarrack=false;
              //Inventory.getWood()= Inventory.getWood()- B.price.getWood();
              //System.out.println(I.getWood());
              }
              else 
                       System.out.println("NOOOO");
               }
               else if (BoolSM)
               {
            Mine Mine = new Mine(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          Mine.lbl[1].setBounds(SM.lbl[1].getX(),SM.lbl[1].getY(), 80,80);
          LeGame.mapaia.add(Mine.lbl[1]);
             Arrs.ALL.add(Mine);
              Arrs.ArrMine.add(Mine);
              Mine.setPosition(Mine.lbl[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              LeGame.mapaia.remove(SM.lbl[1]);
              LeGame.mapaia.repaint();
              BoolSM=false;
              
           }
                else if (BoolFarm)
               {
            Farm farm = new Farm(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          farm.lbl[1].setBounds(F.lbl[1].getX(),F.lbl[1].getY(), 100,100);
          LeGame.mapaia.add(farm.lbl[1]);
             Arrs.ALL.add(farm);
              Arrs.ArrFarm.add(farm);
              farm.setPosition(farm.lbl[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              LeGame.mapaia.remove(F.lbl[1]);
              LeGame.mapaia.repaint();
              BoolFarm=false;
           }
                else if (BoolMarket)
               {
            Market market = new Market(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          market.lbl[1].setBounds(M.lbl[1].getX(),M.lbl[1].getY(), 100,100);
          LeGame.mapaia.add(market.lbl[1]);
             Arrs.ALL.add(market);
              Arrs.ArrMarket.add(market);
              market.setPosition(market.lbl[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              LeGame.mapaia.remove(M.lbl[1]);
              LeGame.mapaia.repaint();
              BoolMarket=false;
           }
                else if (BoolStable)
               {
            Stable stable = new Stable(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          stable.lbl[1].setBounds(S.lbl[1].getX(),S.lbl[1].getY(), 100,100);
          LeGame.mapaia.add(stable.lbl[1]);
             Arrs.ALL.add(stable);
              Arrs.ArrStable.add(stable);
              stable.setPosition(stable.lbl[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              LeGame.mapaia.remove(S.lbl[1]);
              LeGame.mapaia.repaint();
              BoolStable=false;
           }
                else if (BoolTower)
               {
            Tower tower = new Tower(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          tower.lbl[1].setBounds(T.lbl[1].getX(),T.lbl[1].getY(), 100,150);
          LeGame.mapaia.add(tower.lbl[1]);
             Arrs.ALL.add(tower);
              Arrs.ArrTower.add(tower);
              tower.setPosition(tower.lbl[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              LeGame.mapaia.remove(T.lbl[1]);
              LeGame.mapaia.repaint();
              BoolTower=false;
           }
                else if (BoolCastle)
               {
           castle castle = new castle(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          castle.lbl[1].setBounds(C.lbl[1].getX(),C.lbl[1].getY(), 100,100);
          LeGame.mapaia.add(castle.lbl[1]);
             Arrs.ALL.add(castle);
              Arrs.ArrCastle.add(castle);
              castle.setPosition(castle.lbl[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              LeGame.mapaia.remove(C.lbl[1]);
              LeGame.mapaia.repaint();
              BoolCastle=false;
           }
                    else if (BoolWC)
               {
            WoodCutter woodCutter = new WoodCutter(Nation);
           System.out.println("MOuseRelease: "+ Nation);
          woodCutter.lbl[1].setBounds(W.lbl[1].getX(),W.lbl[1].getY(), 100,100);
          LeGame.mapaia.add(woodCutter.lbl[1]);
             Arrs.ALL.add(woodCutter);
              Arrs.ArrWood.add(woodCutter);
              woodCutter.setPosition(woodCutter.lbl[1].getLocation());
            //  farm.lbl[1].setLocation(-100, -100);
              LeGame.mapaia.remove(W.lbl[1]);
              LeGame.mapaia.repaint();
              BoolWC=false;
               }
        draged=false;
        }        }

        @Override
        public void mouseEntered(MouseEvent me) {
     //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
     //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

>>>>>>> Omar
    private class ShowPanel implements MouseListener {

        public ShowPanel() 
        {

        }

        @Override
        public void mouseClicked(MouseEvent me) 
        {
             CitizenPanel();
<<<<<<< HEAD
=======
             
>>>>>>> Omar
  //      CitizenPanel p = new CitizenPanel(Nation);
 //       p.setVisible(true);
        
  //          LeGame.mapaia.add(p);
            
 //           LeGame.mapaia.add(p.B.lbl[1]);
//            LeGame.mapaia.add(p.SM.lbl[1]);
//            LeGame.mapaia.add(p.M.lbl[1]);
//            LeGame.mapaia.add(p.S.lbl[1]);
//            LeGame.mapaia.add(p.T.lbl[1]);
//            LeGame.mapaia.add(p.C.lbl[1]);
//            LeGame.mapaia.add(p.W.lbl[1]);
//            LeGame.mapaia.add(p.F.lbl[1]);

// LeGame.mapaia.add(panel);
            System.out.println("Ctizen clicked");
          // LeGame.Panel.repaint();
            //p.repaint();

        }

        @Override
        public void mousePressed(MouseEvent me) {
<<<<<<< HEAD
=======
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> ali-fadl
        }

        @Override
        public void mouseReleased(MouseEvent me) {
<<<<<<< HEAD
=======
           //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> ali-fadl
        }

        @Override
        public void mouseEntered(MouseEvent me) {
<<<<<<< HEAD
=======
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> ali-fadl
        }

        @Override
        public void mouseExited(MouseEvent me) {
<<<<<<< HEAD
        }
    }

public void CitizenPanel()
{
<<<<<<< HEAD
    BuildLbls[0] = new JLabel();
        BuildLbls[0].setIcon(new ImageIcon(new ImageIcon("Pics//BarrackIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[0].setBounds(2, 2, 50,50);
=======
        BuildLbls[0] = new JLabel();
        BuildLbls[0].setIcon(new ImageIcon(new ImageIcon("Pics//BarrackIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[0].setBounds(90, 50, 50,50);
>>>>>>> Omar
        
        
=======
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public void panel ()
    {
     
             Barrack B = new Barrack(Nation);
             Mine SM = new Mine (Nation);
             Farm F= new Farm(Nation);
             Market M = new Market (Nation);
             Stable S= new Stable(Nation);
             Tower T = new Tower(Nation);
             castle C = new castle(Nation);
             WoodCutter W = new WoodCutter(Nation);
        JPanel panel = new JPanel();
       panel.setBounds(0,(screenSize.height-(screenSize.height/3)), screenSize.width/3,screenSize.height/3);
       panel.setBackground(Color.yellow);
       panel.setVisible(true);
       B.Blbl[1].addMouseMotionListener(new CitizenSpawner());
      SM.lbl[1].addMouseMotionListener(new CitizenSpawner());
       F.lbl[1].addMouseMotionListener(new CitizenSpawner());
       M.lbl[1].addMouseMotionListener(new CitizenSpawner());
       S.lbl[1].addMouseMotionListener(new CitizenSpawner());
       T.lbl[1].addMouseMotionListener(new CitizenSpawner());
       C.lbl[1].addMouseMotionListener(new CitizenSpawner());
       W.lbl[1].addMouseMotionListener(new CitizenSpawner());
       
        BuildLbls[0] = new JLabel("Barrack");
        BuildLbls[0].setBounds(2, 2, 100, 100);
>>>>>>> ali-fadl
        BuildLbls[1]= new JLabel("Stone Mine");
        BuildLbls[1].setIcon(new ImageIcon(new ImageIcon("Pics//StoneMineIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
<<<<<<< HEAD
        BuildLbls[1].setBounds(BuildLbls[0].getX()+120,2,50,50);
=======
        BuildLbls[1].setBounds(BuildLbls[0].getX()+120,50,50,50);
>>>>>>> Omar
        
        
        BuildLbls[2]= new JLabel("Farm");
        BuildLbls[2].setIcon(new ImageIcon(new ImageIcon("Pics//FarmIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
<<<<<<< HEAD
        BuildLbls[2].setBounds(BuildLbls[1].getX()+120,2,50,50);
=======
        BuildLbls[2].setBounds(BuildLbls[1].getX()+120,50,50,50);
>>>>>>> Omar
        
        
        BuildLbls[3]= new JLabel("Market");
        BuildLbls[3].setIcon(new ImageIcon(new ImageIcon("Pics//MarketIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
<<<<<<< HEAD
        BuildLbls[3].setBounds(BuildLbls[2].getX()+120,2,50,50);
=======
        BuildLbls[3].setBounds(BuildLbls[2].getX()+120,50,50,50);
>>>>>>> Omar
        
        
        BuildLbls[4]= new JLabel();
        BuildLbls[4].setIcon(new ImageIcon(new ImageIcon("Pics//Stableico.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[4].setBounds(BuildLbls[0].getX(),BuildLbls[0].getY()+120,50,50);
        
        
        BuildLbls[5]= new JLabel("Tower");
        BuildLbls[5].setIcon(new ImageIcon(new ImageIcon("Pics//TowerIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[5].setBounds(BuildLbls[4].getX()+120,BuildLbls[0].getY()+120,50,50);
        
        
        BuildLbls[6]= new JLabel("Castle");
        BuildLbls[6].setIcon(new ImageIcon(new ImageIcon("Pics//CastleIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[6].setBounds(BuildLbls[5].getX()+120,BuildLbls[0].getY()+120,50,50);
        
        
        BuildLbls[7]= new JLabel("Wood Cutter");
        BuildLbls[7].setIcon(new ImageIcon(new ImageIcon("Pics//WoodCutterIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[7].setBounds(BuildLbls[6].getX()+120,BuildLbls[0].getY()+120,50,50);
<<<<<<< HEAD

        for ( int i=0; i<8 ; i++)
{
    tabs.add(BuildLbls[i]);
      BuildLbls[i].addMouseMotionListener(new Drag());
      BuildLbls[i].addMouseListener(new Drag());
     

}
       // LeGame.mapaia.add(panel);
}
    }
=======

<<<<<<< HEAD
        for ( int i=0; i<8 ; i++)
{
   LeGame.tabs.add(BuildLbls[i]);
      BuildLbls[i].addMouseMotionListener(new Drag());
      BuildLbls[i].addMouseListener(new Drag());
     

}
       // LeGame.mapaia.add(panel);
}
}

   
//=======


>>>>>>> Omar

//    public void panel ()
//    {
//     
//             Barrack B = new Barrack(Nation);
//             Mine SM = new Mine (Nation);
//             Farm F= new Farm(Nation);
//             Market M = new Market (Nation);
//             Stable S= new Stable(Nation);
//             Tower T = new Tower(Nation);
//             castle C = new castle(Nation);
//             WoodCutter W = new WoodCutter(Nation);
//        JPanel panel = new JPanel();
//       panel.setBounds(0,(screenSize.height-(screenSize.height/3)), screenSize.width/3,screenSize.height/3);
//       panel.setBackground(Color.yellow);
//       panel.setVisible(true);
//       B.lbl[1].addMouseMotionListener(new CitizenSpawner());
//      SM.LBL[1].addMouseMotionListener(new CitizenSpawner());
//       F.LBL[1].addMouseMotionListener(new CitizenSpawner());
//       M.LBL[1].addMouseMotionListener(new CitizenSpawner());
//       S.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       T.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       C.LBL[1].addMouseMotionListener(new CitizenSpawner());
//       W.LBL[1].addMouseMotionListener(new CitizenSpawner());
//       
//        BuildLbls[0] = new JLabel("Barrack");
//        BuildLbls[0].setBounds(2, 2, 100, 100);
//        BuildLbls[1]= new JLabel("Stone Mine");
//        BuildLbls[1].setBounds(BuildLbls[0].getX()+120,2,100,100);
//        BuildLbls[2]= new JLabel("Farm");
//        BuildLbls[2].setBounds(BuildLbls[1].getX()+120,2,100,100);
//        BuildLbls[3]= new JLabel("Market");
//        BuildLbls[3].setBounds(BuildLbls[2].getX()+120,2,100,100);
//        BuildLbls[4]= new JLabel("Stable");
//        BuildLbls[4].setBounds(BuildLbls[0].getX(),BuildLbls[0].getY()+120,100,100);
//        BuildLbls[5]= new JLabel("Tower");
//        BuildLbls[5].setBounds(BuildLbls[4].getX()+120,BuildLbls[0].getY()+120,100,100);
//        BuildLbls[6]= new JLabel("Castle");
//        BuildLbls[6].setBounds(BuildLbls[5].getX()+120,BuildLbls[0].getY()+120,100,100);
//        BuildLbls[7]= new JLabel("Logging Mine");
//        BuildLbls[7].setBounds(BuildLbls[6].getX()+120,BuildLbls[0].getY()+120,100,100);
// 
//for ( int i=0; i<8 ; i++)
//{ 
//    panel.add(BuildLbls[i]);
//    BuildLbls[i].addMouseMotionListener(new CitizenSpawner());
//}  
//
//    }
//
//    private  class CitizenSpawner implements MouseMotionListener {
//
//        public CitizenSpawner() {
//        }
//
//        @Override
//        public void mouseDragged(MouseEvent me) 
//        {
//        if (BuildLbls[0].equals(me.getSource()))
//        B.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422, 359);
//        
//        }
//
//        @Override
//        public void mouseMoved(MouseEvent me) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }

=======
    

    private  class CitizenSpawner implements MouseMotionListener {

        public CitizenSpawner() {
    
        }

        @Override
        public void mouseDragged(MouseEvent me) 
        {
        if (BuildLbls[0].equals(me.getSource()))
        B.Blbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422, 359);
        
        }

        @Override
        public void mouseMoved(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

>>>>>>> ali-fadl
//      public void movieing(){
//        Point SP=new ;
//      MOVER m=new MOVER(this.lbl[1].getLocation(),SP,this.lbl[1]);
//           m.TMove.start();
//      }
<<<<<<< HEAD
//    LeGame.mapaia.addMouseListener(new Release());

//>>>>>>> Hussam



//       setBounds(0,(screenSize.height-(screenSize.height/3)), screenSize.width/3,screenSize.height/3);
//       setBackground(Color.yellow);
//       setVisible(true);
//       B.lbl[1].addMouseMotionListener(new CitizenSpawner());
//      SM.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       F.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       M.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       S.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       T.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       C.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       W.lbl[1].addMouseMotionListener(new CitizenSpawner());
//       
//        BuildLbls[0] = new JLabel("Barrack");
//        BuildLbls[0].setBounds(2, 2, 100, 100);
//        BuildLbls[1]= new JLabel("Stone farm");
//        BuildLbls[1].setBounds(BuildLbls[0].getX()+120,2,100,100);
//        BuildLbls[2]= new JLabel("Farm");
//        BuildLbls[2].setBounds(BuildLbls[1].getX()+120,2,100,100);
//        BuildLbls[3]= new JLabel("Market");
//        BuildLbls[3].setBounds(BuildLbls[2].getX()+120,2,100,100);
//        BuildLbls[4]= new JLabel("Stable");
//        BuildLbls[4].setBounds(BuildLbls[0].getX(),BuildLbls[0].getY()+120,100,100);
//        BuildLbls[5]= new JLabel("Tower");
//        BuildLbls[5].setBounds(BuildLbls[4].getX()+120,BuildLbls[0].getY()+120,100,100);
//        BuildLbls[6]= new JLabel("Castle");
//        BuildLbls[6].setBounds(BuildLbls[5].getX()+120,BuildLbls[0].getY()+120,100,100);
//        BuildLbls[7]= new JLabel("Wood Cutter");
//        BuildLbls[7].setBounds(BuildLbls[6].getX()+120,BuildLbls[0].getY()+120,100,100);
// 
//for ( int i=0; i<8 ; i++)
//{ 
//    add(BuildLbls[i]);
//    BuildLbls[i].addMouseMotionListener(new CitizenSpawner());
//    setVisible(false);
//}  


=======
//    
    
}
>>>>>>> ali-fadl
