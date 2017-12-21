/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import User.Arrs;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import project.s.classes.LeGame;
/**
 *
 * @author Omar Anas
 */
public class CitizenPanel 
{
        
        
      public JLabel Holder;  
        
        
//          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//  JLabel [] BuildLbls = new JLabel[8];
// // JLabel Barracklbl = new JLabel("Barrack");
//  Base base;
//  Barrack B ;
//             Mine SM ;
//             Farm F;
//             Market M ;
//             Stable S;
//             Tower T;
//             castle C;
//             WoodCutter W ;
//                String x = base.Nation;
//             String MyNation= x;
//public CitizenPanel (String Nation)
//{
//
// setBounds(0,(screenSize.height-(screenSize.height/3)), screenSize.width/3,screenSize.height/3);
//       setBackground(Color.yellow);
//       setVisible(true);
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
//        //B= new Barrack(MyNation);
//        SM= new Mine(Nation);
//        F= new Farm(Nation);
//        M= new Market(Nation);
//        T= new Tower(Nation);
//        C=new castle(Nation);
//        W= new WoodCutter(Nation);
//        S= new Stable(Nation);
//        for ( int i=0; i<8 ; i++)
//{
//   add(BuildLbls[i]);
//    //BuildLbls[i].addMouseMotionListener(new CitizenSpawner());
//    BuildLbls[i].addMouseListener(new Release());
//}
//
//}
//
//    private class Release implements MouseListener {
//
//        public Release() {
//        }
//
//        @Override
//        public void mouseClicked(MouseEvent me) {
//        }
//
//        @Override
//        public void mousePressed(MouseEvent me) {
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent me) {
//       if (BuildLbls[0].equals(me.getSource()))
//       {
//          B = new Barrack(MyNation);
//       
//           System.out.println("MOuseRelease: "+ MyNation);
//          B.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,359);
//          LeGame.mapaia.add(B.lbl[1]);
//             Arrs.ALL.add(B);
//              Arrs.ArrBarrack.add(B);
//              B.setPosition(B.lbl[1].getLocation());
//
//              System.out.println(B.lbl[1].getLocation());
//              System.out.println(me.getXOnScreen()+""+me.getYOnScreen());
//       }
//
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent me) {
//        }
//
//        @Override
//        public void mouseExited(MouseEvent me) {
//        }
//    }

//    private class CitizenSpawner implements MouseMotionListener {
//
//        public CitizenSpawner() {
//        }
//
//        @Override
//        public void mouseDragged(MouseEvent me) {
// if (BuildLbls[0].equals(me.getSource()))
// {
//         //if(Inventory.price.sheck(B.price)== true)
//     //B=new Barrack(MyNation);
//     B.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,359);
////LeGame.mapaia.add(B.lbl[1]);
//
//
// }
//        else if (BuildLbls[1].equals(me.getSource()))
//            if(Inventory.price.sheck(SM.price)== true)
//            SM.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 245,161);
//
//        else if (BuildLbls[2].equals(me.getSource()))
//            if(Inventory.price.sheck(B.price)== true)
//            F.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 364,278);
//
//        else if (BuildLbls[3].equals(me.getSource()))
//            if(Inventory.price.sheck(B.price)== true)
//            M.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 436,278);
//
//        else if (BuildLbls[4].equals(me.getSource()))
//            if(Inventory.price.sheck(B.price)== true)
//            S.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,344);
//
//        else if (BuildLbls[5].equals(me.getSource()))
//            if(Inventory.price.sheck(B.price)== true)
//            T.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(),182,292);
//
//        else if (BuildLbls[6].equals(me.getSource()))
//            if(Inventory.price.sheck(B.price)== true)
//            C.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,378);
//
//        else if (BuildLbls[7].equals(me.getSource()))
//            if(Inventory.price.sheck(B.price)== true)
//            W.lbl[1].setBounds(me.getXOnScreen(), me.getYOnScreen(), 422,317);        }
//
//       @Override
//        public void mouseMoved(MouseEvent me) {
//        }
//    }
}


