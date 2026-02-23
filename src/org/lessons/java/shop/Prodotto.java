package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        // genera numero randome per il codice
        Random random = new Random();
        this.codice = random.nextInt(9000) + 1000;

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodo prezzo base
    public double getPrezzoBase() {
        return prezzo;
    }

    // medoto prezzo con iva
    public double getPrezzoIvato() {
        return prezzo * (1 + iva);
    }

    // metodono nome esteso
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

}
