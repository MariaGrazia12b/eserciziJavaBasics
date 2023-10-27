//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashSet <String> parole = creazioneHashSet();

        String parolaDaVerificare = new String();
        parolaDaVerificare = "bella";
        verificaElementoDaEliminare(parole, parolaDaVerificare);
        System.out.println(parole);

        parole.clear();
        svuotaHashSet(parole);
    }
    public static HashSet<String> creazioneHashSet() {
        HashSet<String> myFirstHashSet = new HashSet<>();
        myFirstHashSet.add("io");
        myFirstHashSet.add("sono");
        myFirstHashSet.add("bella");
        return myFirstHashSet;
    }
    public static HashSet<String> verificaElementoDaEliminare(HashSet <String> myHashSet1, String elementoDaEliminare) {
        Iterator<String> iterator = myHashSet1.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println("Parola aggiunta: " + elemento);
                //suggerito da IntelliJ al posto di if(elemento == elementoDaEliminare)
                if (Objects.equals(elemento, elementoDaEliminare)) {
                    iterator.remove();
                }
        }
        return myHashSet1;
    }

    public static void svuotaHashSet (HashSet <String> myHashSet3) {
        if (myHashSet3.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        }
    }
}