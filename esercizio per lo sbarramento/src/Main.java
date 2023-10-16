// Scrivere un programma che riempia un array A di dimensione 5 con numeri interi casuali compresi
// tra 1 e 100 e lo stampi (a scopo di test). Scrivere programmi che, dopo aver creato un array casuale
// di questo tipo, eseguano ciascuna delle seguenti operazioni:
//(a) Calcola la somma degli elementi di A e stampala.
// (b) Contare il numero di elementi di A il cui contenuto è inferiore a 10.
// (c) Creare un nuovo array B di dimensione 5 tale che per tutti i B[i] (0<=i<=19), B[i] = A[0] + A[1] + ... + A[ io]


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] A = loadArray();
        System.out.println(Arrays.toString(A));
        System.out.println("La somma è: " + calcoloSomma(A));
        System.out.println("I numeri minori di 10 sono: " + elementiMinori(A));
        int [] B = calcolaB(A);
        System.out.println(Arrays.toString(B));



    }
    public static int [] loadArray() {
        int [] funcArray = new int[5];
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            funcArray[i] = random.nextInt(1, 100);
        }
        return funcArray;
    }
    public static int calcoloSomma(int [] myArray) {
        int somma = 0;
        for(int i = 0; i < myArray.length; i++) {
            somma = myArray[i] + somma;
        }
        return somma;
    }
    public static int elementiMinori(int [] myArray2) {
        int j = 0;
        for(int i = 0; i < myArray2.length; i++) {
            if(myArray2 [i] < 10) {
                j++;
            }
        }
        return j;
    }
    public static int [] calcolaB(int [] A) {
        int [] newArray = new int[5];
        int somma = 0;
        for (int i = 0; i < A.length; i++) {
            somma = A[i] + somma;
            newArray [i] = somma;
        }
        return newArray;
    }
}