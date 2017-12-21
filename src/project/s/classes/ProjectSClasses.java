/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import User.User;
import java.awt.Cursor;
import User.UserGUI;
import java.io.IOException;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import terrain.Barrack;


/**
 *
 * @author Ahmed
 */
public class ProjectSClasses {

    /**
     *
     */
   
 
    public static void main(String[] args) throws IOException {
       
       UserGUI g= new UserGUI();
       g.setVisible(true);
       g.setDefaultCloseOperation(EXIT_ON_CLOSE);
       g.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      

    /*    Scanner sc=new Scanner(System.in);
        Base base=new Base();
       User user = new User();
       Music music=new Music();
       
       String US =new String ();
   
       String x = new String();
          music.Playsound();
       int choice = -1;
       do {
           
           System.out.println("Enter 1 to Signin, 2 to SignUp");
           
           
           choice = sc.nextInt();
           switch(choice)
           {
               case 1:
               {
                   System.out.println("Enter you UserName");
                   x=sc.next();
                      user.setUsername(x);
                   System.out.println("Enter you Password");
                   x=sc.next();
                      user.setPassword(x);
                   if( user.Checkuser()){
                     System.out.println("you are now loggedIn");
                   }
                   else
                   {
                      choice = -1;
                      System.out.println("wrong setting of username and password");
                  
                   }
                   break;
               }
               case 2:
               {
                   System.out.println("Enter your new Username");
                    x=sc.next();
                      user.setUsername(x);
                   System.out.println("Enter you Password");
                   x=sc.next();
                      user.setPassword(x);
                   user.addu();
                   break;
               }
               }
               if(choice!=-1)
               {
                   System.out.println("Enter 1 to play , 2 to delete,3 to edit");
                  choice = sc.nextInt();
                  switch(choice)
                         {
                   case 1:
                   {    int choice1 =-1;
                       do{
                        System.out.println("your base is ready enter 1 to spawn Citizen ,2 to check your inventory");
                        
                        choice1=sc.nextInt();
                        switch(choice1){
                            case 1:{System.out.println(base.spawn());
                            //Display();
                            choice= -1;
                            choice1= -1;
                                    break;
                            }
                            case 2:{
                        Inventory inv=new Inventory();
                        System.out.println("You have "+inv.getGold()+" Gold\nYou have "+inv.getFood()+" Food \nYou have "+inv.getWood()+" Wood \nYou have "+inv.getMetal()+" Metal.");
                        choice=-1;
                        break;
                            }
                        }
                       }while(choice1!=-1);
                        break;
                        
                   }
                   
                   case 2:
                   {
                       System.out.println("enter the desired name to delete");
                      user.deleteu();
                       choice=-1;
                      break;
                   }
                   case 3:
                   {
                      user.editu();
                       choice=-1;
                      break;
                   
                   }
               }
                          
               }
           
           else
           {
               System.out.println("Wrong choice");
           }
          
    }while(choice!=-1);
       
        while (base.getalive()&&US!="END")
        {
            System.out.println("Enter the name of the Unit you want to select or enter All");
            Display();
            US=sc.next();
            US = US.toUpperCase();
            if(US.equals("CITIZEN")){
            Citizens C =new Citizens();
            if(C.GetNumber()==0){
            System.out.println("You dont have any Citizens to select enter 1 to spawn a Citizen or 2 to Cancel");
            choice=sc.nextInt();
            switch(choice){
                case 1:{
                base.spawn();
                break; 
                }
                default:{
                break;
                 }
            }
            }else{
                System.out.println("Enter 1 to build woodCutter,2 to build a Mine,3 to build a Farm,4 to ArmyBuildings");
                int choise2=sc.nextInt();
                switch(choise2){
                    case 1:{
                    WoodCutter[] woodcutter=new WoodCutter[1];
                    
                    System.out.println(woodcutter[0].Build());
                    break;
                    }
                    case 2:{
                    Mine mine=new Mine();
                    System.out.println(mine.Build());
                    break;
                    }
                    case 3:{
                    Farm farm=new Farm();
                    System.out.println(farm.Build());
                    
                    }
                
                }
            
            
            }
            }
            
        }
         
        
        
        
        
        
        
    }
    public static String Getcaster(String Caster){
    int ctr=0;
    String newCaster = new String();
            newCaster="";
            for (int i = 0; i <Caster.length();i++)
            {
                if(Caster.charAt(i)=='@'){
                break;
                }else if(ctr>=3){
                    newCaster+=Caster.charAt(i);
                
                }else if(Caster.charAt(i)=='.'){
                ctr++;
                }

            }
    
    return newCaster;
    }
    public static void Display(){
            Object[] ob = new Object[9];
            ob[0] = new Citizens();
            ob[1] = new Soldier();
            ob[2] = new Knight();
            ob[3] = new JalvinThrower();
            ob[4] = new Archer();
            ob[5] = new Cavalry();
            ob[6] = new General();
            ob[7] = new Chariots();
            for(int i=0;i<8;i++){
             String v=new String();
             v=ob[i].toString();
             //System.out.print(((v)ob[i]));
             if(Getcaster(v)=="Citizens"&&((Citizens)ob[i]).GetNumber()!=0){
             System.out.print(((Citizens)ob[i]).GetNumber()+" Citizen ");
             }
             else if(Getcaster(v)=="Soldier"&&((Soldier)ob[i]).GetNumber()!=0){
              System.out.print(((Soldier)ob[i]).GetNumber()+" Soldier ");
             }
             else if("Knight".equals(v)&&((Knight)ob[i]).GetNumber()!=0){
                  System.out.print(((Knight)ob[i]).GetNumber()+" Knight ");
             }
             else if("JalvinThrower".equals(v)&&((JalvinThrower)ob[i]).GetNumber()!=0){
             System.out.print(((JalvinThrower)ob[i]).GetNumber()+" JalvinThrower ");
             }
             else if("Archer".equals(v)&&((Archer)ob[i]).GetNumber()!=0){
             System.out.print(((Archer)ob[i]).GetNumber()+" Archer ");
             }
             else if("Cavalry".equals(v)&&((Cavalry)ob[i]).GetNumber()!=0){
             System.out.print(((Cavalry)ob[i]).GetNumber()+" Cavalry ");
             }
             else if("General".equals(v)&&((General)ob[i]).GetNumber()!=0){
             System.out.print(((General)ob[i]).GetNumber()+" General ");
             }
             else if("Chariots".equals(v)&&((Chariots)ob[i]).GetNumber()!=0){
             System.out.print(((Chariots)ob[i]).GetNumber()+" Chariots ");
             }
            }*/
            
           
            
            
    }
}
