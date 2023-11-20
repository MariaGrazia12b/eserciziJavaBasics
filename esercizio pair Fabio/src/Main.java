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

        Sim sim1 = new Sim(123456789, BigDecimal.valueOf(3.5), "Mario Rossi",
                PianoTariffario.A, new ArrayList<>());

        Telefonata telefonata1 = new Telefonata(123456789, 987654321, 45);
        Telefonata telefonata2 = new Telefonata(123456789, 987654321, 15);
        Telefonata telefonata3 = new Telefonata(123456789, 987622221, 10);

        sim1.aggiungiTelefonata(telefonata1);
        sim1.aggiungiTelefonata(telefonata2);
        sim1.aggiungiTelefonata(telefonata3);
        System.out.println(sim1);
        System.out.println("La durata dei minuti totali di chiamata è: " + sim1.contaMinuti());
        System.out.println("Le chiamate fatte al numero 987654321 sono: " + sim1.contaTelefonate(987654321));

    }
}