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
public class Farm extends Buildings implements IBuild{
    
    private int WorkerLimit;
    public void IncreaseFood(Inventory  food){
        
    }
    @Override
    public String Build(){
        incrementNumber();
    return"Farm is built";
    };
    @Override
    public String Destroy(){
        
    return"Farm destroyed\n";
    };
    @Override
    public String spawn(){
    return null;};
    
}
