package es.ideas;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Clase encargada de definir las propiedades del objeto MiColor, 
 * necesario para trabajar con colores RGB en el Controlador.
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
 * Clase Controlador: {@link es.ideas.Controlador}.
 * Clase App: {@link es.ideas.App}.
 */
public class MiColor {
    
    private final IntegerProperty valorR = new SimpleIntegerProperty(
            this, "valorR");

    private final IntegerProperty valorG = new SimpleIntegerProperty(
            this, "valorG");
    
    private final IntegerProperty valorB = new SimpleIntegerProperty(
            this, "valorB");

    /**
     * Constructor vacío
     */
    public MiColor() {
    }
    
    /**
     * Constructor del objeto MiColor
     * 
     * @param valorR
     * @param valorG
     * @param valorB
     */
    public MiColor(int valorR, int valorG, int valorB) {
        this.valorR.set(valorR);
        this.valorG.set(valorG);
        this.valorB.set(valorB);
    }
    
    /**
     * Método toString() necesario para que se muestren valores en la lista de 
     * la aplicacion.
     * 
     * @return String que contiene el formato del color RGB utilizado en la
     * lista
     */
    @Override
    public String toString() {
        return "RGB(" + valorR.get() + ", " + valorG.get() + ", " + 
                valorB.get() + ")";
    }
    
    /**
     * Método getter para extraer el valor de la propiedad R del color. 
     * 
     * @return Devuelve el valor de la propiedad "R" del objeto MiColor.
     */
    public int getValorR() {
        return valorR.get();
    }
    
    /**
     * Método setter para establecer el valor a la propiedad R del color. 
     * 
     * @param valorR
     */
    public void setValorR(int valorR){
        this.valorR.set(valorR);
    }

    /**
     * Método getter para extraer el valor de la propiedad G del color. 
     * 
     * @return Devuelve el valor de la propiedad "G" del objeto MiColor.
     */
    public int getValorG() {
        return valorG.get();
    }
    
    /**
     * Método setter para establecer el valor a la propiedad G del color. 
     * 
     * @param valorG
     */
    public void setValorG(int valorG){
        this.valorR.set(valorG);
    }
    
    /**
     * Método getter para extraer el valor de la propiedad B del color. 
     * 
     * @return Devuelve el valor de la propiedad "B" del objeto MiColor.
     */
    public int getValorB() {
        return valorB.get();
    }
             
    /**
     * Método setter para establecer el valor a la propiedad B del color. 
     * 
     * @param valorB
     */
    public void setValorB(int valorB){
        this.valorR.set(valorB);
    }

    /**
     * Método para acceder a la propiedad R del color. 
     * 
     * @return Devuelve la propiedad "R" del objeto MiColor.
     */
    public IntegerProperty valorRProperty() {
        return valorR;
    }

    /**
     * Método para acceder a la propiedad G del color. 
     * 
     * @return Devuelve la propiedad "G" del objeto MiColor.
     */
    public IntegerProperty valorGProperty() {
        return valorG;
    }

    /**
     * Método para acceder a la propiedad B del color. 
     * 
     * @return Devuelve la propiedad "B" del objeto MiColor.
     */
    public IntegerProperty valorBProperty() {
        return valorB;
    }
}
