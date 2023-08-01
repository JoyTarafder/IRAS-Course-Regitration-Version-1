/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewFileContentSceneController implements Initializable {

    @FXML private ComboBox<String> fileNameComboBox;
    @FXML private TextArea fileContentTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fileNameComboBox.getItems().addAll(
                "Select a filename to load",
                "Faculty.bin",
                "Course.bin",
                "OfferCourse.bin",
                "RegisteredCourse.bin"
        );
        
        fileContentTextArea.clear();
   
    }    

    @FXML
    private void loadFileContentButtonOnClick(ActionEvent event) {
          FileInputStream fis;
          ObjectInputStream ois;
          Object object = null;
          
          try {
              String selectedFileName = fileNameComboBox.getItems().toString();
              fis = new FileInputStream(selectedFileName);
              ois = new ObjectInputStream(fis);
     
              while(true){
                    if(selectedFileName.equals("Faculty.bin")){
                         Faculty obj = null;
                    }
                    else if(selectedFileName.equals("Course.bin")){
                       Course obj = null;
                    }
                    else if(selectedFileName.equals("OfferCourse.bin")){
                        OfferCourse obj = null;
                    }
                    else if(selectedFileName.equals("RegisteredCourse.bin")){
                        RegisteredCourse obj = null;
                    }
//                    while(true){
//                        object = ois.readObject();
//                        if(object instanceof )
//                    }
              }
          } catch(Exception e) {
              
          }
    }
    
}
