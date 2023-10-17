// Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e
// che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] finalArray = loadArray();
        System.out.println(Arrays.toString(finalArray));
        int result = calcoloSomma(finalArray);
        System.out.println("La somma è: " + result);

    }
    public static int [] loadArray() {
        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    public static int calcoloSomma(int [] array1) {
        int somma = 0;
        for (int i = 0; i < array1.length; i ++) {
            somma = array1[i] + somma;
        }
        return somma;
    }
}