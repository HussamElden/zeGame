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
{   
    @Override
    public String Build(){
        incrementNumber();
    return "Barrack is built";
    };
    @Override
    public String Destroy(){
    return "Barrack is destroied";
    };
    @Override
    public String spawn(){
    return"";
    };
}
