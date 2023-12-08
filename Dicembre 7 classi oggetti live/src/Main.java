/*Definizione delle classi:
Crea una classe Prodotto che rappresenti i prodotti in vendita.
I prodotti hanno attributi come nome, prezzo e quantità in magazzino. OK.

Crea una classe Dolce che estende la classe Prodotto.
Aggiungi attributi specifici per i dolci, ad esempio, tipo (torta, biscotto, ecc.).

Crea una classe Pasticceria che gestisca l'inventario dei dolci.
Questa classe dovrebbe avere metodi per aggiungere un nuovo dolce all'inventario,
visualizzare l'inventario e calcolare il totale delle vendite.

Metodi di gestione della Pasticceria:
-aggiungiDolce: Un metodo che consente di aggiungere un nuovo dolce all'inventario.
-visualizzaInventario: Un metodo che mostra l'inventario corrente della pasticceria, elencando i dettagli di ciascun dolce.
-calcolaTotaleVendite: Un metodo che calcola il totale delle vendite, considerando il prezzo e la quantità venduta di ciascun dolce.

Funzionalità extra:
-vendiDolce: Aggiungi un metodo che simuli la vendita di un dolce, riducendo la quantità disponibile in magazzino.
-aggiornaPrezzo: Aggiungi un metodo per aggiornare il prezzo di un dolce esistente.
-rimuoviDolce: Aggiungi un metodo per rimuovere un dolce dall'inventario.

Test del sistema:
Crea un programma principale che istanzia la classe Pasticceria e esegue alcune operazioni di gestione,
come l'aggiunta di dolci, la visualizzazione dell'inventario e il calcolo del totale delle vendite.*/

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dolce dolce1 = new Dolce("tiramisu", BigDecimal.valueOf(2), 3, Dolce.Tipo.TORTA);
        Dolce dolce2 = new Dolce("bomba", BigDecimal.valueOf(1.5), 5, Dolce.Tipo.CIAMBELLA);
        Dolce dolce3 = new Dolce("ciambellina", BigDecimal.valueOf(0.5), 10, Dolce.Tipo.BISCOTTO);

        ArrayList<Dolce> listaDolci = new ArrayList<>();
        listaDolci.add(dolce1);
        listaDolci.add(dolce2);
        Pasticceria pasticceria = new Pasticceria(listaDolci);
        System.out.println(pasticceria.getListaDolci());
        System.out.println();
        pasticceria.aggiungiDolce(dolce3);
        System.out.println(pasticceria.getListaDolci());
        System.out.println();
        pasticceria.vendiDolce(dolce1);
        System.out.println(pasticceria.getListaDolci());
        System.out.println();
        pasticceria.aggiornaPrezzo(dolce2, BigDecimal.valueOf(3));
        System.out.println(pasticceria.getListaDolci());
        System.out.println();
        System.out.println(pasticceria.totaleVendite());
        System.out.println();
        pasticceria.rimuoviDolce(dolce1);
        System.out.println(pasticceria.getListaDolci());
        System.out.println();
        System.out.println(pasticceria.totaleVendite());


    }
}