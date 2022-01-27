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
        
        //Creación de la lista observable y asignación al listView
        lista = FXCollections.observableArrayList();
        lvColores.setItems(lista);
        
        //Listener para los slider donde primero se hace que sus valores
        //sean Int, después la forma que muestra el color se actualiza con los
        //valores RGB de los tres slider y por último se actualiza la etiqueta
        //que muestra el RGB actual.
        sliderR.valueProperty().addListener((obs, oldval, newVal) -> {
            sliderR.setValue(newVal.intValue());
            formaColor.setFill(Color.rgb((int) sliderR.getValue(), 
                    (int) sliderG.getValue(), (int) sliderB.getValue()));
            labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + 
                    sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        sliderG.valueProperty().addListener((obs, oldval, newVal) -> {
            sliderG.setValue(newVal.intValue());
            formaColor.setFill(Color.rgb((int) sliderR.getValue(), 
                    (int) sliderG.getValue(), (int) sliderB.getValue()));
            labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + 
                    sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        sliderB.valueProperty().addListener((obs, oldval, newVal) -> {
            sliderB.setValue(newVal.intValue());
            formaColor.setFill(Color.rgb((int) sliderR.getValue(), 
                    (int) sliderG.getValue(), (int) sliderB.getValue()));
            labelRGB.textProperty().set("RGB(" + sliderR.getValue() + ", " + 
                    sliderG.getValue() + ", " + sliderB.getValue() + ")");
        });
        
        //Bind para las tres etiquetas adyacentes a los slider los cuales se
        //encargan de actualizar el valor actual del slider correspondiente.
        labelR.textProperty().bind(sliderR.valueProperty().asString());
        labelG.textProperty().bind(sliderG.valueProperty().asString());
        labelB.textProperty().bind(sliderB.valueProperty().asString());
        
        //Habilita el botón de Eliminar cuando un elemento está seleccionado
        btnEliminar.disableProperty().
                bind(lvColores.getSelectionModel().
                selectedItemProperty().isNull()); 
    }    

    //OnClick para el botón añadir que se encarga de cojer los valores actuales
    //de cada slider creando un MiColor y añadiéndolo a la lista.
    @FXML
    private void onClickAñadir(ActionEvent event) {
        MiColor c = new MiColor((int) sliderR.getValue(), 
                (int) sliderG.getValue(), (int) sliderB.getValue());
        lista.add(c);
    }
    
    //OnClick para el botón eliminar que se encarga de eliminar el valor
    //seleccionado actualmente en la lista, tras lo cual deselecciona.
    @FXML
    private void onClickEliminar(ActionEvent event) {
        lista.remove(lvColores.getSelectionModel().getSelectedItem());
        lvColores.getSelectionModel().clearSelection();
    }  
}
