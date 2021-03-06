package es.ideas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación encargada de crear el escenario, la escena 
 * y de cargar el contenido.
 * 
 * @author Alex
 * @see <a href="https://github.com/iAleZz"> Repositorio
 *      de Alex</a>
 * @author Sebastián
 * @see <a href="https://github.com/SebastianSegui"> Repositorio
 *      de Sebastián</a>
 * @see <a href="https://github.com/SebastianSegui/ColoresJavaFX"> Repositorio
 *      del proyecto</a>
 * 
 * Clase MiColor: {@link es.ideas.MiColor}.
 * Clase Controlador: {@link es.ideas.Controlador}.
 */

public class App extends Application {

    private static Scene scene;
    
    /**
     * Recibe el stage y le carga la vista mediante el método loadFXML.
     * 
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("view/Vista"), 1028, 714);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(
                fxml + ".fxml"));
        return fxmlLoader.load();
    }

    private static void main(String[] args) {
        launch();
    }
}