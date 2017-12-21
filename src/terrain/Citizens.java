/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import User.Arrs;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static project.s.classes.LeGame.*;

import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Citizens extends Movables {
boolean draged =false;
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
    private PriceLists price = new PriceLists();
// JPanel panel = new JPanel();
//public CitizenPanel p = new CitizenPanel(Nation);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
public Citizens(String nation)
     {          Nation = nation;
      price.Setfood(20);
         LBL[0]=new JLabel(nation+" Citizen");
          
      if(nation.equals("Human Hunters"))
      {
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
       LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
     LBL[1].addMouseListener(new ShowPanel());
     
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
    B.LBL[1].setBounds(me.getXOnScreen()-B.LBL[1].getWidth()/2, me.getYOnScreen()-B.LBL[1].getHeight()/2, 100,100);
     mapaia.add(B.LBL[1]);
     draged=true;
 }  
             else if (BuildLbls[1].equals(me.getSource()))
             {
                 
              BoolSM=true;
                 SM.LBL[1].setBounds(me.getXOnScreen()-SM.LBL[1].getWidth()/2, me.getYOnScreen()-SM.LBL[1].getHeight()/2, 80,80);
                mapaia.add(SM.LBL[1]);
                 draged = true;
                  //this.mouseReleased(me);
                 
             }
             else if (BuildLbls[2].equals(me.getSource()))
             {
                 BoolFarm=true;
                 F.LBL[1].setBounds(me.getXOnScreen()-F.LBL[1].getWidth()/2, me.getYOnScreen()-F.LBL[1].getHeight()/2, 100,100);
                 mapaia.add(F.LBL[1]);
                 draged = true;
                  //this.mouseReleased(me);
             }
            else if (BuildLbls[3].equals(me.getSource()))
             {
                BoolMarket=true;
                 M.LBL[1].setBounds(me.getXOnScreen()-M.LBL[1].getWidth()/2, me.getYOnScreen()-M.LBL[1].getHeight()/2, 100,100);
                 mapaia.add(M.LBL[1]);
                 draged = true;
                  //this.mouseReleased(me);
             }
               else if (BuildLbls[4].equals(me.getSource()))
             {
                 BoolStable=true;
                 
                 S.LBL[1].setBounds(me.getXOnScreen()-S.LBL[1].getWidth()/2, me.getYOnScreen()-S.LBL[1].getHeight()/2, 100,100);
                mapaia.add(S.LBL[1]);
                 draged = true;
                  //this.mouseReleased(me);
             }
               else if (BuildLbls[5].equals(me.getSource()))
             {
                 BoolTower=true;
                 T.LBL[1].setBounds(me.getXOnScreen()-T.LBL[1].getWidth()/2, me.getYOnScreen()-T.LBL[1].getHeight()/2, 100,150);
                 mapaia.add(T.LBL[1]);
                 draged = true;
                  //this.mouseReleased(me);
             }
                else if (BuildLbls[6].equals(me.getSource()))
             {
                 BoolCastle=true;
                 C.LBL[1].setBounds(me.getXOnScreen()-C.LBL[1].getWidth()/2, me.getYOnScreen()-C.LBL[1].getHeight()/2, 100,100);
                 mapaia.add(C.LBL[1]);
                 draged = true;
                  //this.mouseReleased(me);
             }
           else if (BuildLbls[7].equals(me.getSource()))
             {
                 BoolWC=true;
                 W.LBL[1].setBounds(me.getXOnScreen()-W.LBL[1].getWidth()/2, me.getYOnScreen()-W.LBL[1].getHeight()/2, 100,100);
                 mapaia.add(W.LBL[1]);
                 draged = true;
                  //this.mouseReleased(me);
             }
            
        }

        @Override
        public void mouseMoved(MouseEvent me) {
        }

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

    private class ShowPanel implements MouseListener {

        public ShowPanel() 
        {

        }

        @Override
        public void mouseClicked(MouseEvent me) 
        {
             CitizenPanel();
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
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    }

public void CitizenPanel()
{
    BuildLbls[0] = new JLabel();
        BuildLbls[0].setIcon(new ImageIcon(new ImageIcon("Pics//BarrackIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[0].setBounds(2, 2, 50,50);
        
        
        BuildLbls[1]= new JLabel("Stone Mine");
        BuildLbls[1].setIcon(new ImageIcon(new ImageIcon("Pics//StoneMineIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[1].setBounds(BuildLbls[0].getX()+120,2,50,50);
        
        
        BuildLbls[2]= new JLabel("Farm");
        BuildLbls[2].setIcon(new ImageIcon(new ImageIcon("Pics//FarmIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[2].setBounds(BuildLbls[1].getX()+120,2,50,50);
        
        
        BuildLbls[3]= new JLabel("Market");
        BuildLbls[3].setIcon(new ImageIcon(new ImageIcon("Pics//MarketIco.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        BuildLbls[3].setBounds(BuildLbls[2].getX()+120,2,50,50);
        
        
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

        for ( int i=0; i<8 ; i++)
{
    tabs.add(BuildLbls[i]);
      BuildLbls[i].addMouseMotionListener(new Drag());
      BuildLbls[i].addMouseListener(new Drag());
     

}
       // LeGame.mapaia.add(panel);
}
    }

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

//      public void movieing(){
//        Point SP=new ;
//      MOVER m=new MOVER(this.lbl[1].getLocation(),SP,this.lbl[1]);
//           m.TMove.start();
//      }
//    

