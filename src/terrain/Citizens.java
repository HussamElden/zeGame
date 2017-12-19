/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

<<<<<<< HEAD

=======
>>>>>>> Hussam
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
<<<<<<< HEAD
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;

=======
>>>>>>> Hussam
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import project.s.classes.LeGame;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Citizens extends Movables {
<<<<<<< HEAD
             Barrack B = new Barrack("Human Hunters");
             Mine SM = new Mine ("Human Hunters");
             Farm F= new Farm("Human Hunters");
             Market M = new Market ("Human Hunters");
             Stable S= new Stable("Human Hunters");
             Tower T = new Tower("Human Hunters");
             castle C = new castle("Human Hunters");
             WoodCutter W = new WoodCutter("Human Hunters");
    JLabel [] BuildLbls = new JLabel[8];

    private PriceLists price = new PriceLists();
 
public JLabel [] lbl = new JLabel[3];
public Panel p = new Panel();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
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
 private PriceLists price = new PriceLists();
public JLabel [] lbl = new JLabel[3];
public JPanel p = new JPanel();
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
>>>>>>> Hussam
public Citizens(String nation)
     {          Nation = nation;
      price.Setfood(20);
         lbl[0]=new JLabel(nation+" Citizen");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {

<<<<<<< HEAD
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
=======
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));

>>>>>>> Hussam
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
     lbl[1].addMouseListener(new ShowPanel());
     }

<<<<<<< HEAD
//   public void incrementNumber(){
//   Number++;
//   }
//   public void dcrementNumber(){
//   Number--;
//   }
//   public int  GetNumber(){
//   return Number;
//   }
=======
     

>>>>>>> Hussam
    Citizens(){
   
    }
    public PriceLists Getprice(){
    return price;
    }
//    public JLabel ShowTab( Dimension screenSize){
//        
//    }
    public void Build(){
      
    }
    @Override
     public String toString() { 
         return "Citizens";
      } 
<<<<<<< HEAD
=======

>>>>>>> Hussam


    private class ShowPanel implements MouseListener {

        public ShowPanel() 
        {

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
//        BuildLbls[7]= new JLabel("Wood Cutter");
//        BuildLbls[7].setBounds(BuildLbls[6].getX()+120,BuildLbls[0].getY()+120,100,100);
// 
//for ( int i=0; i<8 ; i++)
//{ 
//    add(BuildLbls[i]);
//    BuildLbls[i].addMouseMotionListener(new CitizenSpawner());
//    setVisible(false);
//}  
        }

        @Override
        public void mouseClicked(MouseEvent me) 
        {
        Panel p = new Panel();
        p.setVisible(true);
            LeGame.mapaia.add(p);
            LeGame.mapaia.add(p.B.lbl[1]);;
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
<<<<<<< HEAD
}
//
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
//        BuildLbls[7]= new JLabel("Wood Cutter");
//        BuildLbls[7].setBounds(BuildLbls[6].getX()+120,BuildLbls[0].getY()+120,100,100);
// 
//for ( int i=0; i<8 ; i++)
//{ 
//    panel.add(BuildLbls[i]);
//    BuildLbls[i].addMouseMotionListener(new CitizenSpawner());
//}  
//
//    private  class CitizenSpawner implements MouseMotionListener {
//
//        public CitizenSpawner() {
//        }
//
//        @Override
//        public void mouseDragged(MouseEvent me) 
//        {
//        if (BuildLbls[0].equals(me.getSource())){
//          // if(Inventory.price.sheck(B.price)== true)
//          
//                      B.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422, 359);
//        
//        }
//         
//        else if (BuildLbls[1].equals(me.getSource()))
//            SM.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 245,161);
//        else if (BuildLbls[2].equals(me.getSource()))
//            F.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 364,278);
//        else if (BuildLbls[3].equals(me.getSource()))
//            M.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 436,278);
//        else if (BuildLbls[4].equals(me.getSource()))
//            S.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,344);
//        else if (BuildLbls[5].equals(me.getSource()))
//            T.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(),182,292);
//        else if (BuildLbls[6].equals(me.getSource()))
//            C.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,378);
//        else if (BuildLbls[7].equals(me.getSource()))
//            W.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,317);
//        }
//
//        @Override
//        public void mouseMoved(MouseEvent me) {
//        }
//    }}
//=======
=======

>>>>>>> Hussam
//      public void movieing(){
//        Point SP=new ;
//      MOVER m=new MOVER(this.lbl[1].getLocation(),SP,this.lbl[1]);
//           m.TMove.start();
//      }
//    
<<<<<<< HEAD
//>>>>>>> Hussam

=======

}
>>>>>>> Hussam
