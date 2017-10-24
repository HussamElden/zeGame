/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

/**
 *
 * @author Ahmed
 */
public class MiniMap {
   private int Width;
   private int Height;
  private  int Border;
   
      public void setWidth (int w)
     {
   if (Width>0)
       w=Width;
   } 
   public int getWidth  ()
   {
       return Width;
   }
  
      public void setHeight (int h)
     {
   if (Height>0)
       h=Height;
   } 
   public int getHeight ()
   {
       return Height;
   }
    public void setBorder (int b)
     {
   if (Border>0)
       b=Border;
   } 
   public int getBorder()
   {
       return Border;
   }
  void ShowMap(){
    
    }
}
