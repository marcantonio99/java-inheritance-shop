package org.lessons.java.shop;
import java.util.Scanner;

public class Carrello {

    private Prodotto[] prodotti;
    private int numeroProdotti;

    public Carrello(int capacitaMassima) {
        prodotti = new Prodotto[capacitaMassima];
        numeroProdotti = 0;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        if (numeroProdotti < prodotti.length) {
            prodotti[numeroProdotti] = prodotto;
            numeroProdotti++;
        } else {
            System.out.println("Il carrello è pieno, impossibile aggiungere ulteriori prodotti.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Riepilogo carrello:\n");

        for (int i = 0; i < numeroProdotti; i++) {
            sb.append(prodotti[i].toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int capacitaMassima = 10;
        Carrello carrello = new Carrello(capacitaMassima);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci il tipo di prodotto (Smartphone/Televisore/Cuffie) o 'exit' per uscire:");
            String tipoProdotto = scanner.nextLine();

            if (tipoProdotto.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Inserisci il codice del prodotto:");
            int codice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il nome del prodotto:");
            String nomeProdotto = scanner.nextLine();

            System.out.println("Inserisci la descrizione del prodotto:");
            String descrizioneProdotto = scanner.nextLine();

            System.out.println("Inserisci il prezzo del prodotto:");
            double prezzoProdotto = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Inserisci l'IVA del prodotto:");
            double ivaProdotto = scanner.nextDouble();
            scanner.nextLine();

            if (tipoProdotto.equalsIgnoreCase("Smartphone")) {
                System.out.println("Inserisci il codice IMEI dello smartphone:");
                String imei = scanner.nextLine();

                System.out.println("Inserisci la quantità di memoria dello smartphone:");
                int memoria = scanner.nextInt();
                scanner.nextLine();

                carrello.aggiungiProdotto(new Smartphone(codice, nomeProdotto, descrizioneProdotto,
                        prezzoProdotto, ivaProdotto, imei, memoria));
            } else if (tipoProdotto.equalsIgnoreCase("Televisore")) {
                System.out.println("Inserisci le dimensioni del televisore in pollici:");
                int dimensioni = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Il televisore è smart? (Sì/No)");
                String isSmartInput = scanner.nextLine();
                boolean isSmart = isSmartInput.equalsIgnoreCase("Sì");

                carrello.aggiungiProdotto(new Televisore(codice, nomeProdotto, descrizioneProdotto,
                        prezzoProdotto, ivaProdotto, dimensioni, isSmart));
            } else if (tipoProdotto.equalsIgnoreCase("Cuffie")) {
                System.out.println("Inserisci il colore delle cuffie:");
                String colore = scanner.nextLine();

                System.out.println("Le cuffie sono wireless? (Sì/No)");
                String isWirelessInput = scanner.nextLine();
                boolean isWireless = isWirelessInput.equalsIgnoreCase("Sì");

                carrello.aggiungiProdotto(new Cuffie(codice, nomeProdotto, descrizioneProdotto,
                        prezzoProdotto, ivaProdotto, colore, isWireless));
            }
        }

        System.out.println(carrello.toString());
    }
}
