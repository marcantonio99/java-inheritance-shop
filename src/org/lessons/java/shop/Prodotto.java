package org.lessons.java.shop;

import java.util.Random;
public class Prodotto {

    //attributi con rispettivi metodi per get e set
    private int codice;
    public int getCodice(){
        return codice;
    }
    private String nome;
    public String setNome(){
        return nome;
    }
    private String descrizione;
    public String setDescrizione(){
        return descrizione;
    }
    private double prezzo;
    public double setPrezzo(){
        return prezzo;
    }
    private double iva;
    public double setIva(){
        return iva;
    }

    //costruttore
    public Prodotto(String nome, String descrizione, double prezzo, double iva){
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    private int generateRandomCode(){
        Random random = new Random();
        return random.nextInt(9999);
    }

    public double getPrezzoConIva(){
        return this.prezzo + (prezzo * iva/100);
    }

    public String getNomeCompleto(){
        return this.nome + " " + codice;
    }


}
