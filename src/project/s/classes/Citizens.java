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
public class Citizens extends Movables {
    PriceLists price=new PriceLists();
    Citizens(){
    price.Setfood(20);
    }
    public PriceLists Getprice(){
    return price;
    }
    public void Build(){
       
    }
}
