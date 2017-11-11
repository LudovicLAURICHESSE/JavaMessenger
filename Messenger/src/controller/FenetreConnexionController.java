/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Thomas
 */
public class FenetreConnexionController implements Initializable {
    
    Stage stage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void openInscription(Event e) throws IOException{
            stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/ihm/FenetreInscription.fxml"));
            stage.setScene(new Scene(root,430,500));
            
            stage.setAlwaysOnTop(true);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("Java Messenger - Inscription");
            
            stage.showAndWait();
    }
    
    public void onExit(Event e){
        Platform.exit();
    }
    
}
