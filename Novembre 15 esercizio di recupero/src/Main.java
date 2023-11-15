// Si desidera sviluppare un'applicazione Java che gestisca il noleggio di veicoli.
// I veicoli possono essere di tre tipi: Auto, Biciclette, Barche.
// Entrambi i tipi di veicoli condividono alcune caratteristiche comuni,
// ma hanno anche attributi specifici
//Creare quindi un utente che noleggi un veicolo

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Veicolo veicolo = new Veicolo("kje", "jhkdl", "jaloi", "giallo", 2, true);

        Veicolo veicolo = new Veicolo("aha", "bhb", "ehe", "rosso", 4, true);
        Veicolo veicolo1 = new Veicolo("aha", "bhb", "ehe", "rosso", 4, false);
        Veicolo veicolo2 = new Veicolo("aha", "bhb", "ehe", "rosso", 4, false);
        Veicolo veicolo3 = new Veicolo("aha", "bhb", "ehe", "rosso", 4, false);

        ArrayList<Veicolo> listaVeicoli = new ArrayList<>();
        listaVeicoli.add(veicolo);
        listaVeicoli.add(veicolo1);
        listaVeicoli.add(veicolo2);
        NoleggioVeicoli.setVeicoli(listaVeicoli);

        //NoleggioVeicoli.setVeicoli(new ArrayList<>(Arrays.asList(veicolo, veicolo1, veicolo2)));

        NoleggioVeicoli.addVeicolo(veicolo3);

        System.out.println(NoleggioVeicoli.selezioneVeicolo());

    }
}