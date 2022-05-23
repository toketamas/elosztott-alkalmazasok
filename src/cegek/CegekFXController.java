/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cegek;

import cegek.Model.Cegjegyzek;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ttoke
 */
public class CegekFXController implements Initializable {

    @FXML
    Button btnSave;

    @FXML
    Button btnUjCegJegyzek;

    @FXML
    Button btnUjCeg;
    
    @FXML
    RadioButton rdbKft;
    
     @FXML
    RadioButton rdbBt;
     
     @FXML
       AnchorPane paneUjCeg;

    Cegjegyzek cegjegyzek = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
 paneUjCeg.visibleProperty().set(false);
    }

    @FXML
    private void btnUjCegJegyzekClick(ActionEvent event) throws Exception {
        System.out.println("új cégjegyzek");
    }

    @FXML
    private void btnUjCegClick(ActionEvent event) throws Exception {
       paneUjCeg.visibleProperty().set(true);
    }

    @FXML
    private void btnSaveClick(ActionEvent event) throws Exception {
        System.out.println("save");
    }

    @FXML
    private void rdbIsChecked(ActionEvent event) throws Exception {
        
        System.out.println(rdbKft.isArmed());
        
    }

}
