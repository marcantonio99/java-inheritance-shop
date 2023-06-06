package org.lessons.java.shop;

public class Smartphone extends Prodotto{
    private String imei;
    private int memoria;

    public Smartphone(int codice, String nome, String descrizione, double prezzo, double iva, String imei, int memoria) {
        super(codice, nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    public String getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", IMEI: " + imei + ", Memoria: " + memoria + "GB";
    }
}
