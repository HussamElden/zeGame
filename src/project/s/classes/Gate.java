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
public class Gate extends Buildings implements IBuild{
   private boolean open;
    public Boolean open(boolean x){
    return true;
    }
    private Boolean CheckWall(){
    return true;
    }
    @Override
    public String Build(){
        incrementNumber();
    return"Gate is built\n";
    };
    @Override
    public String Destroy(){
    return "Gate is destroyed";
    };
    @Override
    public String spawn(){
    return null;};
}
