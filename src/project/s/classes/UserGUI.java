package project.s.classes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.security.auth.login.AppConfigurationEntry;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
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
        //------------
           JButton RegisterBtn=new JButton();
      JLabel ConfirmPasslbl = new JLabel();
      JPasswordField ConfirmPasstxt;
       JLabel UNlbl2;
        JLabel Passlbl2;
        JTextField UNtxt2;
        JPasswordField Passtxt2;
        ArrayList<User>AllUsers=new ArrayList<>();
        User u = new User();
        ObjectOutputStream OutFile;
        boolean CheckNew= true;
   boolean CheckLogin= true;
  public UserGUI(String x) 
    {
        setSize(400, 400);
        setTitle("Login");
      LoginBtn= new JButton("Login");
        SignUpBtn= new JButton("Sign Up");
      UNlbl= new JLabel ("Username");
        Passlbl= new JLabel ("Password");
        SignUplbl = new JLabel("Don't have an account?");
         UNtxt= new JTextField(16);
         Passtxt= new JPasswordField(16);
        Container container= getContentPane();
        container.setLayout(null);
        UNtxt.setBounds(200,Passtxt.getHeight(), 170, 50);
        Passtxt.setBounds(200,50,170, 50);
      LoginBtn.setBounds(200,100,169, 50);
        SignUpBtn.setBounds(292, LoginBtn.getHeight()+300, 77, 50);
        SignUplbl.setBounds(Passlbl.getHeight()+130,LoginBtn.getHeight()+320,132,10);
       UNlbl.setBounds(120, 20, 70, 10);
       Passlbl.setBounds(120, UNlbl.getWidth(), 70, 10);
//     panel.setSize(400,400);
//       panel.add(UNtxt);
//        panel.add(Passtxt);
//        panel.add(UNlbl);
//        panel.add(Passlbl);
//        panel.add(LoginBtn);
//        panel.add(SignUpBtn);
        container.add(UNtxt);
        container.add(Passtxt);
        container.add(UNlbl);
        container.add(Passlbl);
        container.add(LoginBtn);
        container.add(SignUpBtn);
        container.add(SignUplbl);
        SignUpBtn.addActionListener(new SignUpndLogin());
        LoginBtn.addActionListener(new SignUpndLogin());
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
      }
     }
     else
     {
     CheckLogin=false;
     }
 }
 }
@Override
    public void addu(String UN, String Pass) throws FileNotFoundException,IOException,ClassNotFoundException
    {    String FileName= "tusers.txt";

      checkU(UN);
     // readU();
        if (CheckNew==true)
        {   
             u.setID(j);
        u.setUsername(UN);
        u.setPassword(Pass);
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

public void readU() throws FileNotFoundException, IOException, ClassNotFoundException,  InvalidClassException
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
  private class SignUpndLogin extends JFrame implements ActionListener,Serializable {

   
        public SignUpndLogin()
        {
        setSize(400, 400);
        setTitle("Register");
        RegisterBtn= new JButton("Register");
      UNlbl2= new JLabel ("Username");
        Passlbl2= new JLabel ("Password");
        ConfirmPasslbl= new JLabel ("Confirm Password");
         UNtxt2= new JTextField(16);
         Passtxt2= new JPasswordField(16);
         ConfirmPasstxt= new JPasswordField(16);
        Container container= getContentPane();
        container.setLayout(null);
        UNtxt2.setBounds(200, Passtxt2.getHeight(), 170, 50);
        Passtxt2.setBounds(200, 50,170, 50);
        ConfirmPasstxt.setBounds(200, 100, 170, 50);
        RegisterBtn.setBounds(200, 150, 169, 50);
       UNlbl2.setBounds(120, 20, 70, 10);
       Passlbl2.setBounds(120, UNlbl2.getWidth(), 70, 10);
       ConfirmPasslbl.setBounds(90, Passlbl2.getWidth()+UNlbl2.getWidth()-20, 110, 10);
         container.add(UNtxt2);
        container.add(Passtxt2);
        container.add(UNlbl2);
        container.add(Passlbl2);
        container.add(RegisterBtn);
        container.add(ConfirmPasslbl);
        container.add(ConfirmPasstxt);
        RegisterBtn.addActionListener(new Register());
        }

        
        
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            if (ae.getSource()== SignUpBtn){
            SignUpndLogin g=new SignUpndLogin();
        g.setVisible(true);
        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
           //     dispose();
        InGame g=new InGame();
        g.setVisible(true);
        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
          }
       else 
           JOptionPane.showMessageDialog(null, "Invalid Username or Password","Alert",JOptionPane.ERROR_MESSAGE);
            
            }
        }
    }
 private class Register implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
           String UN = UNtxt2.getText();
            String Pass= Passtxt2.getText();
            String ConfirmPass= ConfirmPasstxt.getText();
        if (UN.equals("")|| Pass.equals("")||ConfirmPass.equals(""))
           JOptionPane.showMessageDialog(null, "Don't leave a blank tab.","Alert",JOptionPane.ERROR_MESSAGE);
        else if (UN.length()>16 || UN.length()< 4 || Pass.length()>16 || Pass.length()< 4)
        {
            JOptionPane.showMessageDialog(null, "Username & Passsword must range from 4 to 16 letters","Alert",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if (ConfirmPass.equals(Pass))
                try {
                    addu(UN, Pass);
                   if (CheckNew==true)
                   {  InGame g=new InGame();
           g.setVisible(true);
           g.setDefaultCloseOperation(EXIT_ON_CLOSE);
                   }
           } catch (IOException | ClassNotFoundException ex) {
               Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        else
        {  
            JOptionPane.showMessageDialog(null, "Passwords doesn't match!","Alert",JOptionPane.ERROR_MESSAGE);
            Passtxt2.setText("");
            ConfirmPasstxt.setText("");
        }
        }
    }
 }
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

  }
