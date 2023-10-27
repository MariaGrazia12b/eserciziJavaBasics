//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> myHashSet = riempiHashSet();
        System.out.println("Il mio HashSet è:");
        for(String element : myHashSet) {
            System.out.println("Element: " + element);
        }

        HashSet<String> nuovoHashSet = new HashSet<>();
        nuovoHashSet.add("Giulietta");

        boolean contieneGiulietta = myHashSet.contains("Giulietta");
        System.out.println("Il mio HashSet contiene Giulietta: " + contieneGiulietta);

    }
    public static HashSet <String> riempiHashSet() {
        HashSet<String> lista = new HashSet<>();
        lista.add("Romeo");
        lista.add("Maria");
        lista.add("belli");
        return lista;

    }
}