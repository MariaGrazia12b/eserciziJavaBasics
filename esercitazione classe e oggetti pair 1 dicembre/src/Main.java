//Creare una classe Evento che ha come attributi: id, titolo, descrizione, luogo, data inizio,
//data fine, partecipanti.
//Classe Partecipante: nome; lista eventi;
//Nella classe Utils fornire i seguenti metodi:
//Aggiungere un evento alla persona;
//Rimuovere un evento alla persona;
//Visualizzare dettagli evento;
//Ricerca evento per data inizio e data fine;
//Visualizzare gli eventi disponibili;
//Visualizzare gli eventi prenotati da una persona;
//Conteggio posti occupati all'evento;
//Cancellare una prenotazione all'evento;


import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Evento e1 = new Evento(1, "Bello", "Sfilata belli", "Roma",
                OffsetDateTime.parse("2024-03-04T22:00:00Z"), OffsetDateTime.parse("2024-03-04T23:00:00Z"),
                       20, true);
        Evento e2 = new Evento(2, "Brutti", "Sfilata brutti", "Milano",
                OffsetDateTime.parse("2024-03-04T22:00:00Z"), OffsetDateTime.parse("2024-03-04T23:00:00Z"),
                15, true);
        Evento e3 = new Evento(3, "Bo", "Cinema", "Roma",
                OffsetDateTime.parse("2024-07-08T21:00:00Z"), OffsetDateTime.parse("2024-07-08T23:00:00Z"),
                100, false);
        Evento e4 = new Evento(4, "Non so", "Passeggiata", "Latina",
                OffsetDateTime.parse("2024-05-05T10:00:00Z"), OffsetDateTime.parse("2024-05-05T17:00:00Z"),
                15, false);

        Partecipante p1 = new Partecipante("Maria", new ArrayList<>());

        Utils utils = new Utils();
        utils.aggiungiEvento(p1, e1);
        utils.aggiungiEvento(p1, e2);
        System.out.println(p1.getListaEventi());
        System.out.println();
        utils.rimuoviEvento(p1, e2);
        System.out.println(p1.getListaEventi());
        System.out.println();
        System.out.println(utils.dettagliEvento(e3));
        System.out.println();
        System.out.println(utils.ricercaPerData(p1.getListaEventi(), OffsetDateTime.parse("2024-03-04T22:00:00Z"),
                OffsetDateTime.parse("2024-03-04T23:00:00Z")));
        System.out.println();
        System.out.println(utils.disponibili(p1.getListaEventi()));
        System.out.println();
        System.out.println(utils.prenotati(p1, e3));
        System.out.println();
        System.out.println(utils.postiOccupati(e4));
        System.out.println();
        System.out.println(utils.cancellaPrenotazione(e4));

    }
}