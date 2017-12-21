/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Point;

/**
 *
 * @author Ahmed
 */
public abstract class Buildings extends Unit  {
    private int ProductionTime;
    private int BuildingTime;
    private int UpgradeTime;
    private  boolean isBuilt;

    public boolean isIsBuilt() {
        return isBuilt;
    }

    public void setIsBuilt(boolean isBuilt) {
        this.isBuilt = isBuilt;
    }
    private  boolean isFull;
    private Point SpawnPoint;
    

    public String getNation() {
        return Nation;
    }
    public void setNation(String Nation) {
        this.Nation = Nation;
    }
    public void setSpawnpoint(Point spawnpoint){
       this.SpawnPoint = spawnpoint;
    }
    
    public Point getSpawnpoint(){
        return this.SpawnPoint;
    } 
  
    public void setProductionTime(int prodtime){
        if (ProductionTime > 0)
            ProductionTime = prodtime;
    }
    
    public int getProductionTime (){
        return ProductionTime;
    }
    
    public void setBuildingTime(int buildtime){
        if (BuildingTime > 0)
            BuildingTime = buildtime;
    }

    public int getBuildingTime (){
        return BuildingTime;
    }

    public void setUpgradeTime(int upgradtime){
        if (UpgradeTime > 0)
            UpgradeTime = upgradtime;
    }

    public int getUpgradeTime (){
        return UpgradeTime;
    }
  
    boolean Built(){
        return true;
    }
    
}
