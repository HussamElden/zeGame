/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Citizens extends Movables {

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

       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));

      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      lbl[1].addMouseListener(new ShowPanel());
     }

     

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


    private static class ShowPanel implements MouseListener {

        public ShowPanel() 
        {
        
        }

        @Override
        public void mouseClicked(MouseEvent me) 
        {

        }

        @Override
        public void mousePressed(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       B.lbl[1].addMouseMotionListener(new CitizenSpawner());
      SM.lbl[1].addMouseMotionListener(new CitizenSpawner());
       F.lbl[1].addMouseMotionListener(new CitizenSpawner());
       M.lbl[1].addMouseMotionListener(new CitizenSpawner());
       S.lbl[1].addMouseMotionListener(new CitizenSpawner());
       T.lbl[1].addMouseMotionListener(new CitizenSpawner());
       C.lbl[1].addMouseMotionListener(new CitizenSpawner());
       W.lbl[1].addMouseMotionListener(new CitizenSpawner());
       
        BuildLbls[0] = new JLabel("Barrack");
        BuildLbls[0].setBounds(2, 2, 100, 100);
        BuildLbls[1]= new JLabel("Stone Mine");
        BuildLbls[1].setBounds(BuildLbls[0].getX()+120,2,100,100);
        BuildLbls[2]= new JLabel("Farm");
        BuildLbls[2].setBounds(BuildLbls[1].getX()+120,2,100,100);
        BuildLbls[3]= new JLabel("Market");
        BuildLbls[3].setBounds(BuildLbls[2].getX()+120,2,100,100);
        BuildLbls[4]= new JLabel("Stable");
        BuildLbls[4].setBounds(BuildLbls[0].getX(),BuildLbls[0].getY()+120,100,100);
        BuildLbls[5]= new JLabel("Tower");
        BuildLbls[5].setBounds(BuildLbls[4].getX()+120,BuildLbls[0].getY()+120,100,100);
        BuildLbls[6]= new JLabel("Castle");
        BuildLbls[6].setBounds(BuildLbls[5].getX()+120,BuildLbls[0].getY()+120,100,100);
        BuildLbls[7]= new JLabel("Logging Mine");
        BuildLbls[7].setBounds(BuildLbls[6].getX()+120,BuildLbls[0].getY()+120,100,100);
 
for ( int i=0; i<8 ; i++)
{ 
    panel.add(BuildLbls[i]);
    BuildLbls[i].addMouseMotionListener(new CitizenSpawner());
}  

    }

    private  class CitizenSpawner implements MouseMotionListener {

        public CitizenSpawner() {
        }

        @Override
        public void mouseDragged(MouseEvent me) 
        {
        if (BuildLbls[0].equals(me.getSource()))
        B.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422, 359);
        
        }

        @Override
        public void mouseMoved(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

//      public void movieing(){
//        Point SP=new ;
//      MOVER m=new MOVER(this.lbl[1].getLocation(),SP,this.lbl[1]);
//           m.TMove.start();
//      }
//    

}
