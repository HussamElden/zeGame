/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptionns;

/**
 *
 * @author Ali
 */
public class NotEnoughResourcesException extends Exception {

    @Override
    public String getMessage() {
        return "You don`t have enough resources in your bag";
    }
    
    
    
}
