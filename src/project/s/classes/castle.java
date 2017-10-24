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
public class castle extends Buildings implements IBuild{
   private Throwable arrow=new Throwable();
    private int AgroRange;
    public void Throw(){}
    @Override
    public String Build(){
        incrementNumber();
    return "Castle built";
    };
    @Override
    public String Destroy(){
        
    return "Castle destroied";
    };
    @Override
    public String spawn(){
        
    return "General was spawned";
    };
}
