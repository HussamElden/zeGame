/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omar Anas
 */
public class User implements Serializable
{
    private int ID;
    private String Username;
    private String Password;
    private String Nation;

    public String getNation() {
        return Nation;
    }

    public void setNation(String Nation) {
        this.Nation = Nation;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}

  /*  private int ID;
    private String Username=new String();
    private String Password = new String();
    boolean loggedIn;
    private final String FILENAME = "C:\\Users\\hos20\\Desktop\\lab.txt";
      User[] AllUsers = new User[100];
       boolean checkNew = true;
        int j=0;
         Scanner in = new Scanner (System.in);
    private void readU() {
        BufferedReader br = null;
		FileReader fr = null;
                
    	try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String Line;

			while ((Line = br.readLine()) != null) {
				AllUsers[j] = new User();
                                 String []Seprated = Token(Line, '~');
                                AllUsers[j].Username = Seprated[1];
                               // if(u.equals(AllUsers[j].Username)){
                                //checkNew=false;
                                //}
                                  AllUsers[j].Password = Seprated[2];
                                 
                                   j++;
                                   
			}
br.close();
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
    }
     private void readU(String u) {
        BufferedReader br = null;
		FileReader fr = null;
                
    	try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String Line;

			while ((Line = br.readLine()) != null) {
				AllUsers[j] = new User();
                                 String []Seprated = Token(Line, '~');
                                AllUsers[j].Username = Seprated[1];
                                if(u.equals(AllUsers[j].Username)){
                                checkNew=false;
                                }
                                  AllUsers[j].Password = Seprated[2];
                                 
                                   j++;
                                   
			}
br.close();
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
    }
    @Override
    public void addu() {
        
                readU(Username);
                 if(checkNew==true){
                AllUsers[j] = new User();
               AllUsers[j].ID=j+1;
              AllUsers[j].Username = Username;
                 AllUsers[j].Password = Password;
             PrintWriter pr=null;
            try {
               pr = new PrintWriter(FILENAME);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        for (int i = 0; i < j+1; i++)
            {
               pr.println((i+1)+ "~" + AllUsers[i].Username + "~" + AllUsers[i].Password + "~");
            }
              pr.close();
                }

	
    }

    @Override
    public void editu() {
    }

    @Override
    public void deleteu() {
        String deletedname=new String ();
        String N=new String();
       int j=0;
        deletedname=in.nextLine();
        
        
         PrintWriter pr = null;
            try {
               pr = new PrintWriter(FILENAME);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        for (int i = 0; i < j+1; i++)
            {readU();
               AllUsers[i] = new User();
               if(deletedname!=AllUsers[i].Username)
            {
               pr.println((j+1)+ "~" + AllUsers[i].Username + "~" + AllUsers[i].Password + "~");
               j++;
            }
            }
              pr.close();
    }

    @Override
    public void save() {
    }
    public boolean Checkuser()
    {
//        int i=0;
//        readU(Username);
//
//        while(i<10)
//        {AllUsers[i] = new User();
//       if (Username == AllUsers[i].Username)
//       {
//       if (Password == AllUsers[i].Password){
//           return true;
//            }
//       }
//       i++;
//        }
//
//      return false;
        return true;
        }

        
     public void setUsername (String UN){
        if (UN.length()<=16)
            Username=UN;
    }
    public String getUsername (){
        return Username;
    }
     public void setPassword (String PW){
        if (PW.length()<=16)
            Password=PW;
    }
    public String getPassword (){
        return Password;
    }
     public static String[] Token(String line, char seprator) 
    {
        String []Result = new String[50];
        String Word = "";
        int ctr = 0;
        for(int i = 0; i < line.length(); i++)
        {
            if (line.charAt(i) != seprator)
                Word += line.charAt(i);
            else
            {
                Result[ctr] = Word;
                ctr++;
                Word = new String();
            }
        }
        return Result;
    }*/
