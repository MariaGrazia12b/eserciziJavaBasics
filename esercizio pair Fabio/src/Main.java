/*Progettare una applicazione che simula un operatore di telefonia cellulare.
Si devono quindi gestirei dati relativi ad una carta SIM ed in particolare:
il numero di telefono, il credito disponibile, la lista delle telefonate effettuate e
la durata di ogni telefonata. La classe SIM dovrà fornire, inoltre, le seguenti funzionalità:
un costruttore parametrizzato che crea una SIM con numero di telefono,
un credito e la lista delle telefonate vuota;
 un metodo per inserire una telefonata con i relativi dati;
 un metodo per il calcolo dei minuti totali di conversazione;
metodo per il calcolo delle telefonate effettuate verso un determinato numero;
metodo per la stampa dei dati della SIM e l’elenco delle telefonate.*/

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim(345678909, BigDecimal.valueOf(15), new ArrayList<Telefonata>(), 20);
        Sim sim2 = new Sim(327891209, BigDecimal.valueOf(10), new ArrayList<Telefonata>(), 60);
        Sim sim3 = new Sim(123678123, BigDecimal.valueOf(3), new ArrayList<Telefonata>(), 45);

        Telefonata t1 = new Telefonata(345678909, 123678123, 5);
        Telefonata t2 = new Telefonata(345678909, 123678123, 2);
        Telefonata t3 = new Telefonata(327891209, 123678123, 10);
        Telefonata t4 = new Telefonata(123678123, 327891209, 8);

        sim1.aggiungiTelefonata(t1);
        sim1.aggiungiTelefonata(t2);
        System.out.println(sim1.getChiamateEffettuate());
        System.out.println();
        System.out.println(sim1.minutiTotConversazione());
        System.out.println();
        System.out.println(sim1.chiamateVersoUnNumero(123678123));
        System.out.println(sim1.chiamateVersoUnNumero(327891209));

    }
}