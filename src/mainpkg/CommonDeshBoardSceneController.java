/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CommonDeshBoardSceneController implements Initializable {

    @FXML
    private BorderPane deshBoardBorderPane;
    private Object getClass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addNewFacltyMenuItemOnClick(ActionEvent event)  throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("AddNewFacultyScene.fxml"));
        deshBoardBorderPane.setCenter(parent);
    }

    @FXML
    private void addNewCourseMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AddNewApprovedCourseScene.fxml"));
        deshBoardBorderPane.setCenter(parent);
        
    }

    @FXML
    private void offerCourseMenuItemOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("OfferCourseForRegistrationScene.fxml"));
        deshBoardBorderPane.setCenter(parent);
    }

    @FXML
    private void registerCoursesMenuItemOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("CourseRegistrationScene.fxml"));
        deshBoardBorderPane.setCenter(parent);
    }
//ygui
    @FXML
    private void viewFileContentMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("ViewFileContentScene.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = new Stage();
        newStage.setScene(newScene);
        
    }
    
}
