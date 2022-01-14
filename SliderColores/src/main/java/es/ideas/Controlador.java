package es.ideas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controlador implements Initializable {
    
    private ObservableList<MiColor> lista;
    
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
    private ListView<MiColor> lvColores;
    @FXML
    private Button btnAñadir;
    @FXML
    private Rectangle formaColor;
    @FXML
    private Button btnEliminar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        lista = FXCollections.observableArrayList();
        lvColores.setItems(lista);
        
        sliderR.valueProperty().addListener((obs, oldval, newVal) -> {
            sliderR.setValue(newVal.intValue());
            formaColor.setFill(Color.rgb((int) sliderR.getValue(), (int) sliderG.getValue(), (int) sliderB.getValue()));
            labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        sliderG.valueProperty().addListener((obs, oldval, newVal) -> {
            sliderG.setValue(newVal.intValue());
            formaColor.setFill(Color.rgb((int) sliderR.getValue(), (int) sliderG.getValue(), (int) sliderB.getValue()));
            labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        
        sliderB.valueProperty().addListener((obs, oldval, newVal) -> {
            sliderB.setValue(newVal.intValue());
            formaColor.setFill(Color.rgb((int) sliderR.getValue(), (int) sliderG.getValue(), (int) sliderB.getValue()));
            labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        labelR.textProperty().bind(sliderR.valueProperty().asString());
        labelG.textProperty().bind(sliderG.valueProperty().asString());
        labelB.textProperty().bind(sliderB.valueProperty().asString());
        
        // Habilita el botón de Eliminar cuando un elemento está seleccionado
        btnEliminar.disableProperty().
                bind(lvColores.getSelectionModel().
                selectedItemProperty().isNull()); 
    }    

    @FXML
    private void onClickAñadir(ActionEvent event) {
        MiColor c = new MiColor((int) sliderR.getValue(), (int) sliderG.getValue(), (int) sliderB.getValue());
        lista.add(c);
    }

    @FXML
    private void onClickEliminar(ActionEvent event) {
        lista.remove(lvColores.getSelectionModel().getSelectedItem());
        lvColores.getSelectionModel().clearSelection();
    }  
}
