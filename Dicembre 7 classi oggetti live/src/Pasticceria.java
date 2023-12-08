//Crea una classe Pasticceria che gestisca l'inventario dei dolci.
//Questa classe dovrebbe avere metodi per aggiungere un nuovo dolce all'inventario,
//visualizzare l'inventario e calcolare il totale delle vendite.

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pasticceria {
    ArrayList<Dolce> listaDolci;

    public Pasticceria(ArrayList<Dolce> listaDolci) {
        this.listaDolci = listaDolci;
    }

    public ArrayList<Dolce> getListaDolci() {
        return listaDolci;
    }

    public void setListaDolci(ArrayList<Dolce> listaDolci) {
        this.listaDolci = listaDolci;
    }

    @Override
    public String toString() {
        return "Pasticceria{" +
                "listaDolci=" + listaDolci +
                '}';
    }

    public void aggiungiDolce (Dolce dolce) {
        if (this.listaDolci.contains(dolce)) {
            System.out.println("Dolce già esistente");
        } else {
            this.listaDolci.add(dolce);
        }
    }

    public BigDecimal totaleVendite () {
        BigDecimal totale = BigDecimal.ZERO;
        for (Dolce d : this.listaDolci) {
            totale = totale.add(d.getPrezzo().multiply(BigDecimal.valueOf(d.getQuantitaNelMagazzino())));
        }
        return totale;
    }

    //Funzionalità extra:
    //-vendiDolce: Aggiungi un metodo che simuli la vendita di un dolce,
    // riducendo la quantità disponibile in magazzino.
    //-aggiornaPrezzo: Aggiungi un metodo per aggiornare il prezzo di un dolce esistente.
    //-rimuoviDolce: Aggiungi un metodo per rimuovere un dolce dall'inventario.

    public void vendiDolce (Dolce dolce) {
        for (Dolce d : this.listaDolci) {
            if (d == dolce) {
                d.setQuantitaNelMagazzino(d.getQuantitaNelMagazzino() - 1);
            }
        }
    }
    public void aggiornaPrezzo (Dolce dolce, BigDecimal prezzo) {
        for (Dolce d : this.listaDolci) {
            if (d == dolce) {
                d.setPrezzo(prezzo);
            }
        }
    }
    public void rimuoviDolce (Dolce d) {
        if (this.listaDolci.contains(d)) {
            this.listaDolci.remove(d);
        }
    }
}
