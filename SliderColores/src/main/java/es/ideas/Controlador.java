/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ideas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Axelt
 */
public class Controlador implements Initializable {

    @FXML
    private Label labelR;
    @FXML
    private Slider sliderG;
    @FXML
    private Slider sliderR;
    @FXML
    private Slider sliderB;
    @FXML
    private Label labelB;
    @FXML
    private Label labelG;
    @FXML
    private Label labelRGB;
    @FXML
    private AnchorPane anchorColoreado;
    @FXML
    private ListView<?> lvColores;
    @FXML
    private Button btnAñadir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clicked(MouseEvent event) {
    }
    
}
