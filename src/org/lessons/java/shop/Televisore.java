package org.lessons.java.shop;

public class Televisore extends Prodotto{
    private int dimensioni;
    private boolean isSmart;

    public Televisore(int codice, String nome, String descrizione, double prezzo, double iva, int dimensioni, boolean isSmart) {
        super(codice, nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dimensioni: " + dimensioni + " pollici, Smart: " + isSmart;
    }
}
