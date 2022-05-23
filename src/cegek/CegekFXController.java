/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cegek;

import cegek.Model.Ceg;
import cegek.Model.Cegjegyzek;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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

    @FXML
    TextField txtUgyvKor;

    @FXML
    TextField txtUgyvVegz;
    @FXML
    TextField txtAlakult;
    @FXML
    TextField txtDolgSzam;
    @FXML
    TextField txtAlapToke;
    @FXML
    TextField txtBeltagNev;
    @FXML 
    TableView tabla;        
     @FXML
    AnchorPane paneTabla;

    Cegjegyzek cegjegyzek = null;

    Ceg ceg = null;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        paneUjCeg.visibleProperty().set(false);
        cegjegyzek=Cegjegyzek.cegjegyzekBetoltes();
        setTable();
        
        
    }

    @FXML
    private void btnUjCegJegyzekClick(ActionEvent event) throws Exception {
        System.out.println("új cégjegyzek");
    }

    @FXML
    private void btnUjCegClick(ActionEvent event) throws Exception {
        paneUjCeg.visibleProperty().set(true);
        paneTabla.visibleProperty().set(false);
        //tabla.visibleProperty().set(false);
        
    }

    @FXML
    private void btnSaveClick(ActionEvent event) throws Exception {
        System.out.println("save");
    }

    @FXML
    private void rdbIsChecked(ActionEvent event) throws Exception {

        if (rdbKft.isArmed()) {
            txtBeltagNev.disableProperty().set(true);
            txtAlapToke.disableProperty().set(false);
            rdbBt.selectedProperty().set(false);
        } else {
            if (rdbBt.isArmed()) {
                txtBeltagNev.disableProperty().set(false);
                txtAlapToke.disableProperty().set(true);
                rdbKft.selectedProperty().set(false);
            }
        };

    }
    
    private void setTable(){
       TableColumn cegTipCol = new TableColumn("Cégtipus");
        TableColumn ugyvVegzCol = new TableColumn("Ügyv. vegz.");
        TableColumn ugyvKorCol = new TableColumn("Ügyv. kora");
        TableColumn dolgSzCol = new TableColumn("Dolg. száma");
        TableColumn alapTokeCol = new TableColumn("Alaptőke");
        TableColumn beltagCol = new TableColumn("Beltag");
        
        tabla.getColumns().addAll(cegTipCol, ugyvVegzCol, ugyvKorCol,dolgSzCol,alapTokeCol,beltagCol);
    }

}
