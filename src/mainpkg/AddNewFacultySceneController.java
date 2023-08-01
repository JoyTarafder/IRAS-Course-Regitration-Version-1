/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AddNewFacultySceneController implements Initializable {

    @FXML   private TextField idTextField;
    @FXML   private TextField nameTextField;
    @FXML   private DatePicker dobDatePicker;
    @FXML   private DatePicker dojDatePicker;
    @FXML   private TextField salaryTextField;
    @FXML   private ComboBox<String> designationComboBox;
    @FXML   private ComboBox<String> departmentComBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designationComboBox.getItems().
                addAll(
                 "Select Designation",
                 "Lecturer-C", 
                 "Lecturer-B", 
                 "Lecturer-A",
                 "Assistant Professor",
                 "Associate Professor",
                 "Professor"
        );
        departmentComBox.getItems().
                addAll(
                 "Select Designation",
                 "CSE", 
                 "EEE", 
                 "PS",
                 "Finance",
                 "Economic",
                 "English"
        );
    }    

    @FXML
    private void addNewFacultyOnClick(ActionEvent event) {
        Boolean addStatus =
        CITSAdmin.addNewFaculty(
                Integer.parseInt(idTextField.getText()), 
                nameTextField.getText(), 
                dobDatePicker.getValue(), 
                dojDatePicker.getValue(), 
                designationComboBox.getValue(), 
                departmentComBox.getValue(), 
                Float.parseFloat(salaryTextField.getText()));
       
        // Alert Notification Code
        if (addStatus){
            Alert a = new Alert(AlertType.INFORMATION);
            a.setContentText("New Faculty is added successfully");
            a.showAndWait();
        }
        else{
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("Oops! something went wrong. \nTry later.......");
            a.showAndWait();
        }
    }


    
}
