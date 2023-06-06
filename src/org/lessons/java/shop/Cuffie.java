package org.lessons.java.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffie(int codice, String nome, String descrizione, double prezzo, double iva, String colore, boolean isWireless) {
        super(codice, nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString() + ", Colore: " + colore + ", Wireless: " + isWireless;
    }
}
