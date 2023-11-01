/*E' necessario scrivere una applicazione che simula il funzionamento di un frammento del sistema
informativo di un operatore di telefonia cellulare.
Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:
- il numero di telefono
- il credito disponibile in euro
- la lista delle telefonate effettuate
Per ciascuna telefonata deve essere rappresentata la durata in minuti
La classe SIM dovrà fornire le seguenti funzionalità:
- un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle telefonate vuota
- un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
- una funzione per il calcolo dei minuti totali di conversazione.
- una funzione per il calcolo delle telefonate effettuate verso un certo numero
- una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.*/

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
        Chiamata chiamata1 = new Chiamata(45, 349623308);
        Chiamata chiamata2 = new Chiamata(25, 346789098);
        Chiamata chiamata3 = new Chiamata(40, 349623308);
        Chiamata chiamata4 = new Chiamata(15, 328976342);
        Chiamata chiamata5 = new Chiamata(2, 349623308);

        //lista vuota che mi serve solo per creare l'oggetto, non mi serve ad altro.
        ArrayList<Chiamata> listaChiamate = new ArrayList<>();
        SIM sim1 = new SIM(345239906, BigDecimal.valueOf(15), listaChiamate);

        sim1.inserimentoTelefonata(chiamata1);
        sim1.inserimentoTelefonata(chiamata2);
        sim1.inserimentoTelefonata(chiamata3);
        sim1.inserimentoTelefonata(chiamata4);
        sim1.inserimentoTelefonata(chiamata5);

        for (Chiamata chiamata : sim1.getTelefonateEffettuate()) {
            System.out.println(chiamata);
        }

        System.out.println("Minuti totali di chiamate: " + sim1.calcoloMinutiTotali());
        System.out.println("Le chiamate verso il numero 349623308 sono: " + sim1.calcoloTelefonate(349623308));
        System.out.println(sim1.toString());

    }
}