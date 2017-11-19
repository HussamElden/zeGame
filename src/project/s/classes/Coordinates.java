/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

/**
 *
 * @author hos20
 */
public abstract class Coordinates {
    private float x;
    private float y;
    public void setX(float x){
    this.x = x;
    }
    public void setY(float y){
    this.y = y;
    }
    public float getX(){
    return x;
    }
    public float getY(){
    return y;
    }
    @Override
     public String toString() { 
         return "Coordinates";
      } 
}
