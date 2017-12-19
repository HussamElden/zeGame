/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import terrain.Barrack;
import terrain.Citizens;
import terrain.Farm;
import terrain.Market;
import terrain.Mine;
import terrain.Stable;
import terrain.Tower;
import terrain.WoodCutter;
import terrain.castle;

/**
 *
 * @author Omar Anas
 */
public class Panel extends JPanel
{ 
          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  JLabel [] BuildLbls = new JLabel[8];
 // JLabel Barracklbl = new JLabel("Barrack");
   public Barrack B = new Barrack("Human Hunters");
             Mine SM = new Mine ("Human Hunters");
             Farm F= new Farm("Human Hunters");
             Market M = new Market ("Human Hunters");
             Stable S= new Stable("Human Hunters");
             Tower T = new Tower("Human Hunters");
             castle C = new castle("Human Hunters");
             WoodCutter W = new WoodCutter("Human Hunters");
             
public Panel ()
{
    
 setBounds(0,(screenSize.height-(screenSize.height/3)), screenSize.width/3,screenSize.height/3);
       setBackground(Color.yellow);
       setVisible(false);
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
        BuildLbls[7]= new JLabel("Wood Cutter");
        BuildLbls[7].setBounds(BuildLbls[6].getX()+120,BuildLbls[0].getY()+120,100,100);
        for ( int i=0; i<8 ; i++)
{ 
   add(BuildLbls[i]);
    BuildLbls[i].addMouseMotionListener(new CitizenSpawner());
} 
       
}

    private class CitizenSpawner implements MouseMotionListener {

        public CitizenSpawner() {
        }

        @Override
        public void mouseDragged(MouseEvent me) {
 if (BuildLbls[0].equals(me.getSource()))
         if(Inventory.price.sheck(B.price)== true)
                      B.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422, 359);
        
         
        else if (BuildLbls[1].equals(me.getSource()))
            if(Inventory.price.sheck(SM.price)== true)
            SM.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 245,161);
            
        else if (BuildLbls[2].equals(me.getSource()))
            if(Inventory.price.sheck(B.price)== true)
            F.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 364,278);
            
        else if (BuildLbls[3].equals(me.getSource()))
            if(Inventory.price.sheck(B.price)== true)
            M.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 436,278);
            
        else if (BuildLbls[4].equals(me.getSource()))
            if(Inventory.price.sheck(B.price)== true)
            S.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,344);
            
        else if (BuildLbls[5].equals(me.getSource()))
            if(Inventory.price.sheck(B.price)== true)
            T.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(),182,292);
            
        else if (BuildLbls[6].equals(me.getSource()))
            if(Inventory.price.sheck(B.price)== true)
            C.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,378);
            
        else if (BuildLbls[7].equals(me.getSource()))
            if(Inventory.price.sheck(B.price)== true)
            W.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,317);        }

       @Override
        public void mouseMoved(MouseEvent me) {
        }
    }}
    
 
