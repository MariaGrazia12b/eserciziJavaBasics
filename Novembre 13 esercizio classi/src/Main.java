//Creare due classi: Manager e Sviluppatore. Entrambe le classi hanno un bonus
// generico in base alla qualifica. Aggiungere attributi specifici per ciascuna classe, ad esempio:
//Per la classe Manager: bonus (double)
//Per la classe Sviluppatore: linguaggio (String)
//Creare una classe Azienda che contenga i manager e gli sviluppatori.
//Definire i Costruttori per le classi.
//- Aggiungere metodo calcolaStipendio alle classi che calcolino lo stipendio degli impiegati
// considerare il bonus per i manager
//- metodo visualizzaDettagli che restituisca informazioni dettagliate sugli impiegati.

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Manager> listaManager = new ArrayList<>();
        List<Sviluppatore> listaSviluppatori = new ArrayList<>();
        Azienda azienda = new Azienda(listaManager, listaSviluppatori);
        Manager manager1 = new Manager("Paolo", "Giallo", 500, BigDecimal.valueOf(1500));
        Manager manager2 = new Manager("Roberto", "Nero", 500, BigDecimal.valueOf(1500));
        Sviluppatore sviluppatore1 = new Sviluppatore("Carlo", "Verde", "Java", BigDecimal.valueOf(1500), 500);
        Sviluppatore sviluppatore2 = new Sviluppatore("Sandro", "Rosso", "Java", BigDecimal.valueOf(1500), 500);

        azienda.aggiungiManager(manager1);
        azienda.aggiungiManager(manager2);
        azienda.aggiungiSviluppatore(sviluppatore1);
        azienda.aggiungiSviluppatore(sviluppatore2);
        azienda.infoAzienda();





    }
}