//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //inizializzazione con costruttore e put
        Map<String, String> animali = new HashMap<String, String>();
        animali.put("Mammifero", "Cane");
        animali.put("Uccello", "Pettirosso");
        animali.put("Pesce", "Pescepalla");
        animali.put("Rettile", "Coccodrillo");
        System.out.println("Animali: " + animali);

        //inizializzazione con Map.of() massimo 10 coppie
        Map<String, String> animali1 = new HashMap<String, String>(
                Map.of("Mammifero", "Orso", "Uccello", "Passerotto",
                        "Pesce", "Pescerosso", "Rettile", "Lucertola")
                );
        System.out.println("Altri animali: " + animali1);

        //inizializzazione con Map.ofEntries()
        Map<String, String> animali2 = new HashMap<String, String>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, String>("Mammifero", "Mucca"),
                new AbstractMap.SimpleEntry<String, String>("Uccello", "Picchio"),
                new AbstractMap.SimpleEntry<String, String>("Pesce", "Piragna"),
                new AbstractMap.SimpleEntry<String, String>("Rettile", "Geco")
        ));
        System.out.println("Ancora animali: " + animali2);
    }
}