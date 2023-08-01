package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CITSAdmin {
    private int authorityLabel;
    
    public static boolean addNewFaculty(int id, String name, LocalDate dob, LocalDate doj, String designation, String dept, float salary){
        Faculty newFaulty = new Faculty(
                id,  
                name,  
                dob,  
                doj,  
                designation,  
                dept,  
                salary
        );
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try{
            f = new File("Faculty.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(newFaulty);
            oos.close();
            return true;
        } catch (IOException ex){
                if(oos != null) try { oos.close();
            } catch (IOException ex1){
                 Logger.getLogger(CITSAdmin.class.getName()).log(Level.SEVERE,null,ex);   
            }
                return false;
        }  
        
    }
    
}
