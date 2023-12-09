import java.time.OffsetDateTime;
import java.util.ArrayList;

//Nella classe Utils fornire i seguenti metodi:
//Aggiungere un evento alla persona; OK
//Rimuovere un evento alla persona; OK
//Visualizzare dettagli evento; OK
//Ricerca evento per data inizio e data fine; OK
//Visualizzare gli eventi disponibili; OK
//Visualizzare gli eventi prenotati da una persona; OK
//Conteggio posti occupati all'evento; OK
//Cancellare una prenotazione all'evento;
public class Utils {


    //Aggiungere un evento alla persona;
    public void aggiungiEvento (Partecipante p, Evento e) {
        if (p.getListaEventi().contains(e)) {
            System.out.println("Evento già esistente.");
        } else {
            p.getListaEventi().add(e);
        }
    }
    //Rimuovere un evento alla persona;
    public void rimuoviEvento (Partecipante p, Evento e) {
        if (p.getListaEventi().contains(e)) {
            p.getListaEventi().remove(e);
        }
    }
    //Visualizzare dettagli evento;
    public String dettagliEvento (Evento e) {
        return e.getDescrizione();
    }
    //Ricerca evento per data inizio e data fine;
    public Evento ricercaPerData (ArrayList<Evento> lista, OffsetDateTime dataInizio, OffsetDateTime dataFine) {
        //ArrayList<Evento> listaEventi = new ArrayList<>();
        for (Evento evento : lista) {
            if (evento.getDataInizio().isEqual(dataInizio) && evento.getDataFine().isEqual(dataFine)) {
                return evento;
            }
        }
        return null;
    }
    //Visualizzare gli eventi disponibili;
    public Evento disponibili (ArrayList<Evento> eventi) {
        for (Evento e : eventi) {
            if (e.isDisponibilita()) {
                return e;
            } else {
                System.out.println("Evento non disponibile");
            }
        }
        return null;
    }
    //Visualizzare gli eventi prenotati da una persona;
    public boolean prenotati (Partecipante p, Evento e) {
        if (p.getListaEventi().contains(e)) {
                return true;
        }
        return false;
    }
    //Conteggio posti occupati all'evento;
    public int postiOccupati (Evento e) {
        int conteggioPosti = 0;
        for (int i = 0; i < e.getPartecipanti(); i ++) {
            conteggioPosti ++;
        }
        return  conteggioPosti;
    }
    //Cancellare una prenotazione all'evento;
    public int cancellaPrenotazione (Evento e) {
       e.setPartecipanti(e.getPartecipanti()-1);
       return e.getPartecipanti();
    }
}
