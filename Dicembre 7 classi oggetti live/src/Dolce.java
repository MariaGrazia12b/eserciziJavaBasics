//Crea una classe Dolce che estende la classe Prodotto.
//Aggiungi attributi specifici per i dolci, ad esempio, tipo (torta, biscotto, ecc.).

import java.math.BigDecimal;

public class Dolce extends Prodotto {
    enum Tipo {
        TORTA,
        BISCOTTO,
        CORNETTO,
        CIAMBELLA
    }
    public Dolce(String nome, BigDecimal prezzo, int quantitaNelMagazzino, Tipo tipo) {
        super(nome, prezzo, quantitaNelMagazzino);
    }



}
