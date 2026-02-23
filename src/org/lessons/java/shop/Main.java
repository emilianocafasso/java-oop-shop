package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // primo costruttore
        Prodotto smartphone = new Prodotto("iPhone 17", "Apple", new BigDecimal(1000),
                new BigDecimal(0.22));

        System.out.println("Nome: " + smartphone.getNome());
        System.out.println("Marca: " + smartphone.getMarca());
        System.out.println("Codice: " + smartphone.getCodice());
        System.out.println("Prezzo Base: " + smartphone.getPrezzo());
        System.out.println("Prezzo Ivato: " + smartphone.getPrezzoIvato());
        System.out.println("Nome Esteso: " + smartphone.getNomeEsteso());

        // smartphone.codice = 123; --- test OK

        // secondo costruttore
        Prodotto cuffie = new Prodotto("Galaxy Buds", "Samsung");

        System.out.println("Nome Esteso: " + cuffie.getNomeEsteso());
        System.out.println("Prezzo Iniziale (default): " + cuffie.getPrezzo()); // default 0

        // uso i setter per aggiornare i dati
        cuffie.setPrezzo(new BigDecimal("120.50"));

        System.out.println("Prezzo ivato: " + cuffie.getPrezzoIvato()); // default 22%
    }
}