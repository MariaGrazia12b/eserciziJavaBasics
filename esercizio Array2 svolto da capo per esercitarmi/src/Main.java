// Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
// Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char [] myArray = loadArray();
        System.out.println(Arrays.toString(myArray));
        System.out.println(calcoloOccorrenze(myArray));


    }
    public static char [] loadArray () {
        char [] array = new char[6];
        Random random = new Random();
        for(int i = 0; i < array.length; i ++) {
            // 'a' sta ad indicare le lettere minuscole.
            array [i] = (char) ('a' + random.nextInt(26));
        }
        return array;
    }
    public static int calcoloOccorrenze (char [] array1) {
        int j = 0;
        for (int i = 0; i < array1.length; i ++) {
            if(array1[i] == 'a') {
                j++;
            }
        }
        return j;
    }
}