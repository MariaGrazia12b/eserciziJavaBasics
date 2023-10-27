//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> myHashSet = riempiHashSet();
        System.out.println("La dimensione dell'HashSet è: " + myHashSet.size());
        System.out.println("Elementi del mio HashSet:");
        for (String elemento : myHashSet) {
            System.out.println(elemento);
        }
    }

    public static HashSet<String> riempiHashSet() {
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Ciao");
        lista1.add("io");
        lista1.add("sono");
        lista1.add("una");
        lista1.add("principessa");
        return lista1;
    }
}