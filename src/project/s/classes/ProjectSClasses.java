/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.s.classes;

import java.util.*;


/**
 *
 * @author Ahmed
 */
public class ProjectSClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object ob=new Object();
       Scanner sc=new Scanner(System.in);
        Base base=new Base();
       User user = new User();
       Music music=new Music();
       Timer T=new Timer();
   
       String x = new String();
          // music.Playsound();
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
                   user.setUsername(sc.nextLine());
                   System.out.println("Enter you Password");
                   user.setPassword(sc.nextLine());
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
                        System.out.println("your base is ready enter 1 to spawn workers ,2 to check your inventory");
                        
                        choice1=sc.nextInt();
                        switch(choice1){
                            case 1:{System.out.println(base.spawn());
                            choice=-1;
                            choice1=-1;
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
                      break;
                   }
                   case 3:
                   {
                      user.editu();
                      break;
                   
                   }
               }
                          
               }
           
           else
           {
               System.out.println("Wrong choice");
           }
          
    }while(choice!=-1);
       
        while (base.getalive()&&choice!=666){
        
        
        
        
        
        }
         
        
        
        
        
        
        
    }
    
}
