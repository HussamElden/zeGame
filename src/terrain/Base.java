/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import behavior.Moveee;
import User.Arrs;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.LeGame;
/**
 *
 * @author Ahmed
 */
public class Base extends Buildings implements IBuild  {
    
    public Point getSP() {
        return SP;
    }

    public void setSP(Point SP) {
        this.SP = SP;
    }
     public void setSP(int x,int y) {
        this.SP.x = SP.x;
        this.SP.y=SP.y;
    }
     behavior.Selector S=new behavior.Selector();

   public Point SP=new Point();
    public void setlvl(){};
   public Base (String nation){
                 Nation = nation;
        setName("Base");
SP.x=100;
SP.y=100;
       LBL[0]=new JLabel(nation+" Base");
           System.out.println(nation);
      if(Nation.equals("Human Hunters"))
      {
<<<<<<< HEAD
<<<<<<< HEAD
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Base_HumanHunters.png").getImage().getScaledInstance(300,250 ,Image.SCALE_DEFAULT)));
      LBL[1].addMouseListener(new Selector());
=======
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Base_HumanHunters.png").getImage().getScaledInstance(422,278 ,Image.SCALE_DEFAULT)));
>>>>>>> ali-fadl
=======
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Base_HumanHunters.png").getImage().getScaledInstance(422,278 ,Image.SCALE_DEFAULT)));
=======
      LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Base_HumanHunters.png").getImage().getScaledInstance(300,250 ,Image.SCALE_DEFAULT)));
      LBL[1].addMouseListener(new Selector());
>>>>>>> 3c023ccb011e7f4e82951d827decc80b92b11fba
>>>>>>> b4e509fe3865097aea90aa21f6db2d62feea55cb
      LBL[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Citizen_HumanHunters.png").getImage().getScaledInstance(32,50 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       LBL[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Base_NightElves.png").getImage().getScaledInstance(300,250 ,Image.SCALE_DEFAULT)));
      }
         LBL[1].addMouseListener(new Selector());

   }

  
    public  void Start(){
       Citizens citizen=new Citizens(Nation);
       citizen.setPosition(SP);
       Arrs.ALL.add(citizen);
       Arrs.ArrCitizens.add(citizen);
       citizen.LBL[1].setBounds(this.LBL[1].getWidth(),this.LBL[1].getHeight(), 32, 50);
       LeGame.mapaia.add(citizen.LBL[1]);
        System.out.println(" "+SP.x+" "+SP.y);
     Moveee m=new Moveee(citizen.LBL[1].getLocation(),SP,citizen.LBL[1]);
           m.TMove.start();
           // S.movie(citizen);
           
    }
    @Override
    public String Destroy() {
        setalive(false);
        return "Base was destroied and you Lost";
    }

    @Override
    public void spawn() {
        Citizens citizen=new Citizens(Nation);
       citizen.setPosition(SP);
       Arrs.ALL.add(citizen);
       Arrs.ArrCitizens.add(citizen);
       System.out.println(Arrs.ArrCitizens.size());
       citizen.LBL[1].setBounds(this.LBL[1].getBounds().width,this.LBL[1].getBounds().height, 32, 50);
       LeGame.mapaia.add(citizen.LBL[1]);
       SP.x+=Arrs.ArrCitizens.size()+3;
     Moveee m=new Moveee(citizen.LBL[1].getLocation(),SP,citizen.LBL[1]);
           m.TMove.start();
       //   S.movie(citizen);
    }
  
    @Override
     public String toString() {        
         return "Base";
         
      } 

    private  class Spawner implements MouseListener {

        public Spawner() {
        }

        @Override
        public void mouseClicked(MouseEvent me) {
          spawn();
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

    private  class Selector implements MouseListener {

        public Selector() {
        }

        @Override
        public void mouseClicked(MouseEvent me){
            
            LBL[2].setBounds(LeGame.screenSize.width-(LeGame.screenSize.width/3),LeGame.screenSize.height-(LeGame.screenSize.height/3),LeGame.screenSize.width/3, LeGame.screenSize.height/3);
            LeGame.mapaia.add(LBL[2]);
            LeGame.mapaia.repaint();
            LBL[2].addMouseListener(new Spawner());
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
}
