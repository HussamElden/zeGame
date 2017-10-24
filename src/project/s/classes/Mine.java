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
public class Mine extends Buildings implements IBuild{
    
    private int WorkerLimit;
    void IncreaseStone(){
        
    }
    @Override
    public String Build(){
        incrementNumber();
    return"Mine is built";
    };
    @Override
    public String Destroy(){
        
    return"Mine is Destroy";
    };
    @Override
    public String spawn(){
    return"";
    };
}
