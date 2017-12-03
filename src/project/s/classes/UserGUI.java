package project.s.classes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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
import javax.swing.JButton;
import javax.swing.JFrame;
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
        JTextField UNtxt;
        JPasswordField Passtxt;
        JPanel panel=new JPanel();
        ArrayList<User>AllUsers=new ArrayList<>();
        User u = new User();
        ObjectOutputStream OutFile;
        boolean CheckNew= true;
   
  public UserGUI(String x) 
    {
        setSize(400, 400);
        setTitle("Login");
      LoginBtn= new JButton("Login");
        SignUpBtn= new JButton("Sign Up");
      UNlbl= new JLabel ("Username");
        Passlbl= new JLabel ("Password");
         UNtxt= new JTextField(16);
         Passtxt= new JPasswordField(16);
        Container container= getContentPane();
        container.setLayout(null);
        UNtxt.setBounds(200, Passtxt.getHeight(), 170, 50);
        Passtxt.setBounds(200, 50,170, 50);
        LoginBtn.setBounds(200, 100, 75, 50);
        SignUpBtn.setBounds(292, 100, 77, 50);
       UNlbl.setBounds(120, 20, 70, 10);
       Passlbl.setBounds(120, UNlbl.getWidth(), 70, 10);
        container.add(UNtxt);
        container.add(Passtxt);
        container.add(UNlbl);
        container.add(Passlbl);
        container.add(LoginBtn);
        container.add(SignUpBtn);
        SignUpBtn.addActionListener(new SignUp());
       // LoginBtn.addActionListener(new Base().Build());
    }
  
 private void checkU(String u) throws IOException, FileNotFoundException, ClassNotFoundException
 {
  readU();
 for(int i=0;i<AllUsers.size();i++)
 {
     if(AllUsers.get(i).getUsername().equals(u))
     {
     CheckNew=false;
     return;
     }
     else
     {
     CheckNew=true;
     j++;
     }
 }

 }
@Override
    public void addu(String UN, String Pass) throws FileNotFoundException,IOException,ClassNotFoundException
    {    String FileName= "d://tusers.txt";

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
            JOptionPane.showMessageDialog(null, "Username already exists! Try another one.","Alert",JOptionPane.ERROR_MESSAGE);
    }

public void readU() throws FileNotFoundException, IOException, ClassNotFoundException,  InvalidClassException
{
  String FileName= "d://tusers.txt";
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

    private class SignUp implements ActionListener,Serializable {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String UN = UNtxt.getText();
            String Pass= Passtxt.getText();
            
            try {
                addu(UN, Pass);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           
         
        }
    }

}
