package es.ideas;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class MiColor {
    
    private final IntegerProperty valorR = new SimpleIntegerProperty(
            this, "valorR");

    private final IntegerProperty valorG = new SimpleIntegerProperty(
            this, "valorG");
    
    private final IntegerProperty valorB = new SimpleIntegerProperty(
            this, "valorB");

    public MiColor() {
    }
    
    public MiColor(int valorR, int valorG, int valorB) {
        this.valorR.set(valorR);
        this.valorG.set(valorG);
        this.valorB.set(valorB);
    }
    
    //toString necesario para que se muestren valores en la lista de la 
    //aplicacion. Tambien determina el formato utilizado en la lista.
    @Override
    public String toString() {
        return "RGB(" + valorR.get() + ", " + valorG.get() + ", " + 
                valorB.get() + ")";
    }
    
    //Getters y setters
    public int getValorR() {
        return valorR.get();
    }
    
    public void setValorR(int valorR){
        this.valorR.set(valorR);
    }

    public int getValorG() {
        return valorG.get();
    }
    
    public void setValorG(int valorG){
        this.valorR.set(valorG);
    }

    public int getValorB() {
        return valorB.get();
    }
             
    public void setValorB(int valorB){
        this.valorR.set(valorB);
    }

    public IntegerProperty valorRProperty() {
        return valorR;
    }

    public IntegerProperty valorGProperty() {
        return valorG;
    }

    public IntegerProperty valorBProperty() {
        return valorB;
    }
}
