//Creare un hashmap prendere tutti i valori, ordinarli e stamparli

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animali animale1 = new Animali("Mucca", "Cane");
        Animali animale2 = new Animali("Picchio", "Pettirosso");
        Animali animale3 = new Animali("Coccodrillo", "Lucertola");

        Map<String, Animali> listaAnimali = new LinkedHashMap<>();
        listaAnimali.put("Mammiferi", animale1);
        listaAnimali.put("Uccelli", animale2);
        listaAnimali.put("Rettili", animale3);

        List<Animali> listaOrdinata = new ArrayList<>(listaAnimali.values());
        Collections.sort(listaOrdinata, Comparator.comparing(Animali :: getNome1));

        System.out.println("Animali: " + listaAnimali);
        System.out.println("Lista animali ordinata: " + listaOrdinata);
        
    }
}