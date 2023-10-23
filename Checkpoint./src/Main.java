// Creare un programma in Java che dato un array di interi abbia i seguenti metodi:
//a) Scrivere un metodo che a partire da un array calcoli il valore massimo e il valore minimo e
// stampi l’informazione a video.
// b) Scrivere un metodo che calcoli la somma di tutti i numeri pari all’interno dell’array e
// stampi l’informazione a video.

// Creare un programma in Java che dato un array di Stringhe abbia il seguente metodo:
// c) Scrivere un metodo che ricerchi se una stringa di lunghezza arbitraria (inserita dall’utente)
// è contenuta o meno all’iterno dell’array e che restituisca true o false come risultato della ricerca.
// Il risultato della ricerca dovrà essere stampato a video.



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myArray = {2, 7, 9, 3, 6};
        System.out.println(Arrays.toString(myArray));
        System.out.println("Il numero maggiore è: " + valoreMassimo(myArray));
        System.out.println("Il numero minore è: " + valoreMinimo(myArray));
        System.out.println("Somma numeri pari: " + sommaPari(myArray));

        String [] myStringa = {"ciao", "io", "sono", "bella"};
        System.out.println(Arrays.toString(myStringa));
        System.out.println(verificaLunghezzaParola(myStringa, 2));


        Docente docente = new Docente("Maria", "Dante", 122, 29);

    }
    public static int valoreMassimo (int [] array1) {
        int numMax = array1[0];
        for( int i = 0; i < array1.length; i ++) {
            if (array1[i] > numMax) {
                numMax = array1[i];
            }
        }
        return numMax;
    }
    public static int valoreMinimo (int [] array2) {
        int numMin = array2[0];
        for( int i = 0; i < array2.length; i ++) {
            if (array2[i] < numMin) {
                numMin = array2[i];
            }
        }
        return numMin;
    }
    public static int sommaPari (int [] array3) {
        int sommaPari = 0;
        for (int i = 0; i < array3.length; i ++) {
            if ( array3[i] % 2 == 0) {
                sommaPari = array3[i] + sommaPari;
            }
        }
        return sommaPari;
    }
    public static boolean verificaLunghezzaParola (String [] stringa1, int lunghezza) {
        for (int i = 0; i < stringa1.length; i ++) {
            if (stringa1[i].length() == lunghezza) {
                return true;
            }
        }
        return false;
    }

}