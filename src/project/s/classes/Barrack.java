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
public class Barrack extends Buildings implements IBuild
{   PriceLists price=new PriceLists();
private void setPrice(){
    price.Setwood(150);
  
    }
    @Override
    public String Build(){
        incrementNumber();
    return "Barrack is built";
    };
    @Override
    public String Destroy(){
    return "Barrack is destroyed";
    };
    @Override
    public String spawn(){
    return"";
    };
}
