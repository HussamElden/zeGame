/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Point;
import javax.swing.JLabel;
import project.s.classes.Coordinates;

/**
 *
 * @author hos20
 */
public interface Ibehavior {
    public String move(Point XY);
    public Thread attack(Point no2ta, Point nextNo2ta , JLabel arrow);
    
}
