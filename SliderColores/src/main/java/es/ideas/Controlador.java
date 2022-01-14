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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        lista = FXCollections.observableArrayList();
        lvColores.setItems(lista);
        
        sliderR.valueProperty().addListener((obs, oldval, newVal) -> {
        sliderR.setValue(Math.round(newVal.doubleValue()));
        formaColor.setFill(Color.rgb((int) sliderR.getValue(), (int) sliderG.getValue(), (int) sliderB.getValue()));
        labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        sliderG.valueProperty().addListener((obs, oldval, newVal) -> {
        sliderG.setValue(Math.round(newVal.doubleValue()));
        formaColor.setFill(Color.rgb((int) sliderR.getValue(), (int) sliderG.getValue(), (int) sliderB.getValue()));
        labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        
        sliderB.valueProperty().addListener((obs, oldval, newVal) -> {
        sliderB.setValue(Math.round(newVal.doubleValue()));
        formaColor.setFill(Color.rgb((int) sliderR.getValue(), (int) sliderG.getValue(), (int) sliderB.getValue()));
        labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        labelR.textProperty().bind(sliderR.valueProperty().asString());
        labelG.textProperty().bind(sliderG.valueProperty().asString());
        labelB.textProperty().bind(sliderB.valueProperty().asString());
    }    

    @FXML
    private void onClickAñadir(ActionEvent event) {
        MiColor c = new MiColor((int) sliderR.getValue(), (int) sliderG.getValue(), (int) sliderB.getValue());
        lista.add(c);
    }
}
