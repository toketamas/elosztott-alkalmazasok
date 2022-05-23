/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cegek;

import cegek.Model.Beltag;
import cegek.Model.Bt;
import cegek.Model.Ceg;
import cegek.Model.Cegjegyzek;
import cegek.Model.Kft;
import cegek.Model.Ugyvezeto;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    Button btnBevitel;
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
    @FXML
    TextField txtCegSzam;

    Cegjegyzek cegjegyzek = null;

    Ceg ceg = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        paneUjCeg.visibleProperty().set(false);
        cegjegyzek = Cegjegyzek.cegjegyzekBetoltes();
        setTable();
        String cegSzam=(cegjegyzek.getLista().size())+"";
        System.out.println(cegSzam);
        txtCegSzam.setText((cegjegyzek.getLista().size())+"");

    }

    @FXML
    private void btnUjCegJegyzekClick(ActionEvent event) throws Exception {
        System.out.println("új cégjegyzek");
    }

    @FXML
    private void btnUjCegClick(ActionEvent event) throws Exception {
        paneUjCeg.visibleProperty().set(true);
        paneTabla.visibleProperty().set(false);

    }

    @FXML
    private void btnSaveClick(ActionEvent event) throws Exception {
        cegjegyzek.cegjegyzekMentes();
        System.out.println("Cégjegyzék elmentve");
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

    @FXML
    private void ujCeg(ActionEvent event) throws Exception {
        int ugyvKor;
        int dolgozokSzama = 0;
        int alaptoke = 0;
        String alakult = txtAlakult.getText();
        ArrayList<Integer> dolgozokAzon = new ArrayList<Integer>();
        try {
            ugyvKor = Integer.parseInt(txtUgyvKor.getText());
            dolgozokSzama = Integer.parseInt(txtDolgSzam.getText());
        } catch (NumberFormatException ex) {
            ugyvKor = 0;
            dolgozokSzama = 0;
            System.err.println("Ide csak számot lehet írni!");//Ezt le kell cserélni felugró ablakra                
        }
        if (ugyvKor != 0) {
            Ugyvezeto ugyvezeto = new Ugyvezeto(1, ugyvKor, txtUgyvVegz.getText());

            if (rdbKft.isSelected()) {
                try {
                    alaptoke = Integer.parseInt(txtAlapToke.getText());
                    if (alaptoke < 1000000) {
                        alaptoke = 1000000;
                    }
                } catch (NumberFormatException ex) {
                    alaptoke = 1000000;
                }

            }
            if (rdbKft.isSelected()) {
                ceg = new Kft(alaptoke, alakult, ugyvezeto, dolgozokSzama, dolgozokAzon);
            }

            if (rdbBt.isSelected()) {
                Beltag beltag = new Beltag(2, txtBeltagNev.getText());
                ceg = new Bt(beltag, alakult, ugyvezeto, dolgozokSzama, dolgozokAzon);
            }

            cegjegyzek.addCeg(ceg);
            paneUjCeg.visibleProperty().set(false);
            paneTabla.visibleProperty().set(true);
            txtCegSzam.setText((cegjegyzek.getLista().size())+"");
            System.out.println("A cegjegyzekhez egy új " + ceg.getClass().getName() + " lett hozzaadva.");

        } else {
            System.err.println("Meg kell adni az ügyvezető korát!");//Ezt le kell cserélni felugró ablakra 
        }

    }

    private void setTable() {
        TableColumn cegTipCol = new TableColumn("Cégtipus");
        TableColumn ugyvVegzCol = new TableColumn("Ügyv. vegz.");
        TableColumn ugyvKorCol = new TableColumn("Ügyv. kora");
        TableColumn dolgSzCol = new TableColumn("Dolg. száma");
        TableColumn alapTokeCol = new TableColumn("Alaptőke");
        TableColumn beltagCol = new TableColumn("Beltag");

        tabla.getColumns().addAll(cegTipCol, ugyvVegzCol, ugyvKorCol, dolgSzCol, alapTokeCol, beltagCol);
    }

}
