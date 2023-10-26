//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet <String> parole = creazioneHashSet();
        System.out.println(parole);
        String elementoDaAggiungere = "bella";
        parole.add(elementoDaAggiungere);
        System.out.println(parole);
        System.out.println(verificaElementoDaEliminare(parole, elementoDaAggiungere));
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
    public static HashSet<String> verificaElementoDaEliminare(HashSet <String> myHashSet2, String elementoDaEliminare) {
        //for (String elemento : myHashSet2) {
          //  if (elemento.equals(elementoDaEliminare)) {
            //    myHashSet2.remove(elemento);
            //}
        //}
        // ho sostituito il for loop con questa formula che mi ha suggerto IntelliJ.
        myHashSet2.removeIf(elemento -> elemento.equals(elementoDaEliminare));
        return myHashSet2;
    }
    public static void svuotaHashSet (HashSet <String> myHashSet3) {
        if (myHashSet3.size() == 0) {
            System.out.println("HashSet vuoto");
        }
    }
}