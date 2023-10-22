//1. Leggere un array di interi di 6 posizioni, leggere un ulteriore numero intero
// e dire quanti numeri memorizzati nell’array sono inferiori e quanti superiori
// dell’ultimo numero letto.

//2. Leggere un array di interi di 10 posizioni e dire se in tutte le posizioni pari
// dell’array è memorizzato un numero pari.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] myArray = loadArray();
        System.out.println(Arrays.toString(myArray));
        numeroMaggioreMinore(myArray);
        System.out.println(numeriPariInPostiPari(myArray));
    }
    public static int [] loadArray() {
        int [] funcArray = new int [6];
        Random random = new Random();
        for (int i = 0; i < 6; i ++) {
            funcArray[i] = random.nextInt(1,10);
        }
        return funcArray;
    }
    public static void numeroMaggioreMinore(int [] array1) {
        int confronto = 5;
        int numeriMaggiori = 0;
        int numeriMinori = 0;
        for(int i = 0; i < array1.length; i ++) {
            if(array1[i] <= confronto) {
                numeriMinori ++;
            } else if (array1[i] > confronto) {
                numeriMaggiori ++;
            }
        }
        System.out.println("I numeri minori sono: " + numeriMinori);
        System.out.println("I numeri maggiori sono: " + numeriMaggiori);
    }
    
    //per vedere i dispari partivo da i = 1 e poi sempre i+= 2.
    public static boolean numeriPariInPostiPari(int [] array2) {
        for (int i = 0; i < array2.length; i += 2) {
            if(array2[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
