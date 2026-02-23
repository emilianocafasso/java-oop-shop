package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        // creazione prodotto
        System.out.println("Creazione prodotto");

        Prodotto newProdotto = new Prodotto("Smartphone", "Breve descrizione prodotto", 20, 0.22);

        System.out.println(
                newProdotto.getPrezzoBase() + " " + newProdotto.getPrezzoIvato() + " " + newProdotto.getNomeEsteso());

    }
}