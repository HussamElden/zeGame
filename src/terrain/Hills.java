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
public class Hills {
   private int Number;
   public JLabel lbl = new JLabel();
       public Hills ()
        {
       lbl=new JLabel(new ImageIcon(new ImageIcon("Pics://Stones.png").getImage().getScaledInstance(100,150 ,Image.SCALE_DEFAULT)));
      }
        
   public void setNumber (int num)
   {
       if (Number >0)
   Number=num;
           
           }     
public int getNumber (){
    return Number;
}  

   
}
