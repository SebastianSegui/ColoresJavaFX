package es.ideas;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Color {
    
    private final IntegerProperty valorR = new SimpleIntegerProperty(
            this, "valorR");

    private final IntegerProperty valorG = new SimpleIntegerProperty(
            this, "valorG");
    
    private final IntegerProperty valorB = new SimpleIntegerProperty(
            this, "valorB");

    public Color() {
    }
    
    public Color(int valorR, int valorG, int valorB) {
        this.valorR.set(valorR);
        this.valorG.set(valorG);
        this.valorB.set(valorB);
    }

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

    @Override
    public String toString() {
        return "RGB(" + valorR.get() + ", " + valorG.get() + ", " + valorB.get() + ")";
    }
    
    
}
