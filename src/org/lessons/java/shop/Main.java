package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // creazione prodotto
        System.out.println("Creazione prodotto");

        Prodotto newProdotto = new Prodotto("Smarphone", "Breve descrizione smarthphone", new BigDecimal(100),
                new BigDecimal(0.22));

        System.out.println(newProdotto.getPrezzoBase());
        System.out.println(newProdotto.getPrezzoIvato());
        System.out.println(newProdotto.getNomeEsteso());

    }
}