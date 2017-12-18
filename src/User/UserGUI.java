package User;
import User.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.security.auth.login.AppConfigurationEntry;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import project.s.classes.MainMenu;
public class UserGUI extends JFrame implements Iuser,Serializable  {
      
    int j=0;
     
         
        JButton LoginBtn;
        JButton SignUpBtn;
        JLabel UNlbl;
        JLabel Passlbl;
        JLabel SignUplbl;
        JTextField UNtxt;
        JPasswordField Passtxt;
        JPanel panel=new JPanel();
        ImageIcon icon;
        //------------
           JButton RegisterBtn=new JButton();
      JLabel ConfirmPasslbl = new JLabel();
      JPasswordField ConfirmPasstxt;
       JLabel UNlbl2;
        JLabel Passlbl2;
         JLabel NationLabel;
        JTextField UNtxt2;
        JPasswordField Passtxt2;
       JComboBox NationCombo = new JComboBox(new String[]{"Human Hunters", "Night Elves"});

        //-----------------
        ArrayList<User>AllUsers=new ArrayList<>();
        User u = new User();
           static Arrs xyz=new Arrs();
        ObjectOutputStream OutFile;
        boolean CheckNew= true;
   boolean CheckLogin= true;
             MainMenu MM=new MainMenu();

   //SignUpndLogin Sl = new SignUpndLogin();

   
  public UserGUI()  
    {
        
       setSize(5000, 5000);
        setTitle("Login");
      LoginBtn= new JButton("Login");
        SignUpBtn= new JButton("Sign Up");
      UNlbl= new JLabel ("Username");
        Passlbl= new JLabel ("Password");
        SignUplbl = new JLabel("Don't have an account?");
         UNtxt= new JTextField(16);
         Passtxt= new JPasswordField(16);
        //Container container= getContentPane();
        setLayout(null);
        UNtxt.setBounds(850,Passtxt.getY()+300, 170, 50);
        Passtxt.setBounds(850,350,170, 50);
      LoginBtn.setBounds(850,400,169, 50);
        SignUpBtn.setBounds(942, LoginBtn.getY()+250, 77, 50);
        SignUplbl.setBounds(Passlbl.getY()+770,LoginBtn.getY()+270,132,10);
       UNlbl.setBounds(770, 320, 70, 10);
       Passlbl.setBounds(770, UNlbl.getY()+50, 70, 10);

       add(UNtxt);
       add(Passtxt);
       add(UNlbl);
        add(Passlbl);
        add(LoginBtn);
       add(SignUpBtn);
        add(SignUplbl);

//         container.add(UNtxt);
//       container.add(Passtxt);
//       container.add(UNlbl);
//        container.add(Passlbl);
//        container.add(LoginBtn);
//        container.add(SignUpBtn);
//        container.add(SignUplbl);
        SignUpBtn.addActionListener(new SignUpndLogin());
        LoginBtn.addActionListener(new SignUpndLogin());
        setVisible(false);
       
       // add(Sl);
       // add(MM);
        //Sl.setVisible(true);  
    }
 private void checkU(String u) throws IOException, FileNotFoundException, ClassNotFoundException
 {
     
 readU();
 for(int i=0;i<AllUsers.size();i++)
 {
     if(AllUsers.get(i).getUsername().equals(u))
     {
     CheckNew=false;
//     return;
     }
     else
     {
     CheckNew=true;
     j++;
     }
 }

 }
  private void checkUserForLogin(String UN,String pass) throws IOException, FileNotFoundException, ClassNotFoundException 
 {  
  readU();
 for(int i=0;i<AllUsers.size();i++)
 {
     if(AllUsers.get(i).getUsername().equals(UN))
     {
      if (AllUsers.get(i).getPassword().equals(pass))
      { CheckLogin=true;
        Arrs.u=AllUsers.get(i);
      { 
          CheckLogin=true;
      }
     }
     else
     {
     CheckLogin=false;
     }
 }
 }
 }
        @Override
    public void addu(String UN, String Pass,String Nation) throws FileNotFoundException,IOException,ClassNotFoundException
    {    String FileName= "tusers.txt";

      checkU(UN);
     // readU();
        if (CheckNew==true)
        {   
             u.setID(j);
        u.setUsername(UN);
        u.setPassword(Pass);
        u.setNation(Nation);
            AllUsers.add(u);
        OutFile = new ObjectOutputStream(new FileOutputStream(FileName));
        OutFile.writeObject(AllUsers);
        OutFile.close();
        }
        else
        {  JOptionPane.showMessageDialog(null, "Username already exists! Try another one.","Alert",JOptionPane.ERROR_MESSAGE);
        CheckNew=false;
        }
    }

public void readU() throws FileNotFoundException, IOException,InvalidClassException, ClassNotFoundException
{
  String FileName= "tusers.txt";
AllUsers=null;
 ObjectInputStream InFile=new ObjectInputStream(new FileInputStream(FileName));
AllUsers=(ArrayList<User>)InFile.readObject();
InFile.close();

}
    @Override
    public void editu() 
    {
    }

    @Override
    public void deleteu() {
    }

    @Override
    public void save() {
    }
  private class SignUpndLogin implements ActionListener,Serializable {
   
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if (ae.getSource()== SignUpBtn)
            {  dispose();
               Registration g = new Registration();
                g.setVisible(true);
                g.setDefaultCloseOperation(EXIT_ON_CLOSE);
                g.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            }
            else if (ae.getSource()== LoginBtn){
                String UN= UNtxt.getText();
            String Pass=Passtxt.getText();
          
            try {
                checkUserForLogin(UN, Pass);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (CheckLogin==true)
            {
           dispose();
            MainMenu g = new MainMenu();
            g.setVisible(true);
                g.setDefaultCloseOperation(EXIT_ON_CLOSE);
               g.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            }
       else 
           JOptionPane.showMessageDialog(null, "Invalid Username or Password","Alert",JOptionPane.ERROR_MESSAGE);
            
            }
        }
    }
}


  
  
       
//      public SignUpndLogin()
//        {
//        setSize(5000, 5000);
//        setTitle("Register");
//        RegisterBtn= new JButton("Register");
//      UNlbl2= new JLabel ("Username");
//        Passlbl2= new JLabel ("Password");
//        ConfirmPasslbl= new JLabel ("Confirm Password");
//        NationLabel =  new JLabel("Your Nation");
//        UNtxt2= new JTextField(16);
//         Passtxt2= new JPasswordField(16);
//         ConfirmPasstxt= new JPasswordField(16);
//           NationCombo.setSelectedItem("Human Hunters");
//        Container container= getContentPane();
//        setLayout(null);
//        UNtxt2.setBounds(850, Passtxt2.getHeight()+300, 170, 50);
//        Passtxt2.setBounds(850, 350,170, 50);
//        ConfirmPasstxt.setBounds(850, Passtxt2.getY()+50, 170, 50);
//        NationCombo.setBounds(850, ConfirmPasstxt.getY()+50, 170, 50);
//        NationLabel.setBounds(760, NationCombo.getY()+20, 110,10);
//        RegisterBtn.setBounds(850, NationCombo.getY()+60, 169, 50);
//       UNlbl2.setBounds(770, UNtxt2.getY()+20, 70, 10);
//       Passlbl2.setBounds(770, Passtxt2.getY()+20, 70, 10);
//       ConfirmPasslbl.setBounds(722, ConfirmPasstxt.getY()+20, 110, 10);
//        container.add(UNtxt2);
//        container.add(Passtxt2);
//        container.add(UNlbl2);
//        container.add(Passlbl2);
//        container.add(RegisterBtn);
//        container.add(ConfirmPasslbl);
//        container.add(ConfirmPasstxt);
//        container.add(NationCombo);
//        container.add(NationLabel);
//        RegisterBtn.addActionListener(new Register());
//            setVisible(false);
//        }

        
  
  
  
// private class Register implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) 
//        {
//          
//            String UN = UNtxt2.getText();
//            String Pass= Passtxt2.getText();
//            String ConfirmPass= ConfirmPasstxt.getText();
//            String Nation = (String) NationCombo.getSelectedItem();
//        if (UN.equals("")|| Pass.equals("")||ConfirmPass.equals(""))     
//         JOptionPane.showMessageDialog(null, "Don't leave a blank tab.","Alert",JOptionPane.ERROR_MESSAGE) ;
//        else if (UN.length()>16 || UN.length()< 4 || Pass.length()>16 || Pass.length()< 4)
//        {
//            JOptionPane.showMessageDialog(null, "Username & Passsword must range from 4 to 16 letters","Alert",JOptionPane.ERROR_MESSAGE);
//        }
//        else
//        {
//            if (ConfirmPass.equals(Pass))
//                try {
//                    addu(UN, Pass,Nation);
//                   if (CheckNew==true)
//                   { 
//                       InGame g=new InGame();
//                       dispose();
//                       dispose();
//                       g.setVisible(true);
//                       g.setDefaultCloseOperation(EXIT_ON_CLOSE);
//                       g.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//                   }
//           } catch (IOException | ClassNotFoundException ex) {
//               Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
//           }
//        else
//        {  
//            JOptionPane.showMessageDialog(null, "Passwords doesn't match!","Alert",JOptionPane.ERROR_MESSAGE);
//            Passtxt2.setText("");
//            ConfirmPasstxt.setText("");
//        }
//        }
//    }
 
//<<<<<<< HEAD:src/project/s/classes/UserGUI.java
//  private class Login implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) 
//        {
//            String UN= UNtxt.getText();
//            String Pass=Passtxt.getText();
//          
//            try {
//                checkUserForLogin(UN, Pass);
//            } catch (IOException | ClassNotFoundException ex) {
//                Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            if (CheckLogin==true)
//            {
//           //     dispose();
//        InGame g=new InGame();
//        g.setVisible(true);
//        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
//          }
//       else 
//           JOptionPane.showMessageDialog(null, "Invalid Username or Password","Alert",JOptionPane.ERROR_MESSAGE);
//   
//        }
//=======
//  private class Login implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) 
//        {
//            String UN= UNtxt.getText();
//            String Pass=Passtxt.getText();
//          
//            try {
//                checkUserForLogin(UN, Pass);
//            } catch (IOException | ClassNotFoundException ex) {
//                Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            if (CheckLogin==true)
//            {
//           //     dispose();
//        InGame g=new InGame();
//        g.setVisible(true);
//        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
//            g.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//
//          }
//       else 
//           JOptionPane.showMessageDialog(null, "Invalid Username or Password","Alert",JOptionPane.ERROR_MESSAGE);
//   
//        }
//>>>>>>> master:src/User/UserGUI.java

