//Scrivere un programma che prende sulla linea di comando (cioè all’atto del suo avvio)
// una sequenza di numeri reali e che stampa a video le seguenti informazioni:
// (i) la somma di tutti i numeri della sequenza;
// (ii) la media aritmetica esatta dei numeri della sequenza;
// (iii) il numero massimo e il numero minimo della sequenza.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] myArray = loadArray();
        System.out.println(Arrays.toString(myArray));
        System.out.println("la somma è: " + calcoloSomma(myArray));
        System.out.println("la media è: " + mediaAritmetica(myArray));
        System.out.println("il valore minimo è: " + numMin(myArray));
        System.out.println("il valore massimo è: " + numMax(myArray));
    }
    public static int [] loadArray() {
        int [] funcArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i ++) {
            funcArray[i] = random.nextInt(1,50);
        }
        return funcArray;
    }
    public static int calcoloSomma(int [] myArray) {
        int somma = 0;
        for (int i = 0; i < myArray.length; i++) {
            somma = myArray[i] + somma;
        }
        return somma;
    }
    public static float mediaAritmetica(int [] myArray1) {
        float media = 0;
        int somma = 0;
        for (int i = 0; i < myArray1.length; i++) {
            somma = myArray1[i] + somma;
        }
        media = somma / 10;
        return media;
    }
    public static int numMin (int [] myArray3) {
        int min = myArray3[0];
        for (int i = 0; i < myArray3.length; i++) {
            if(myArray3[i] < min) {
              min = myArray3[i];
            }
        }
        return min;
    }
    public static int numMax (int [] myArray4) {
        int max = myArray4[0];
        for (int i = 0; i < myArray4.length; i++) {
            if(myArray4[i] > max) {
                max = myArray4[i];
            }
        }
        return max;
    }
}