/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author hos20
 */
public interface Iuser 
{
    public void addu(String x,String y,String z)throws FileNotFoundException,IOException,ClassNotFoundException;
    public void editu();
    public void deleteu();
    public void save();
    
}
