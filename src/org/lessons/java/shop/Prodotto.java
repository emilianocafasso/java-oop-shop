package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        // genera numero randome per il codice
        Random random = new Random();
        this.codice = random.nextInt(9000) + 1000;

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodo prezzo base
    public BigDecimal getPrezzoBase() {
        return prezzo;
    }

    // medoto prezzo con iva
    public BigDecimal getPrezzoIvato() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    // metodono nome esteso
    public String getNomeEsteso() {
        return codice + " - " + nome;
    }

}
