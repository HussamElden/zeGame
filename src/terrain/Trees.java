/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ahmed
 */
public class Trees {
   private int Number;
    JLabel lbl = new JLabel();
   public Trees ()
   {
              lbl=new JLabel(new ImageIcon(new ImageIcon("Pics://Trees.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));

   }
   public void setNumber (int Num){
        if (Number >0)
            Num=Number;
    }
    public int getNumber (){
        return  Number;
    }
    void Spawn(){
        
    }
    @Override
     public String toString() { 
         return "Trees";
      } 
}
