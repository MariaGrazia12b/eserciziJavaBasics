//Scrivere il programma Cerca che crea e inizializza un array di int contenete 10 valori a
//piacere (usando il comando di inizializzazione che prevede la lista dei valori tra parentesi graffe), chiede
//all’utente di inserire un numero e stampa Presente se il numero `e presente nell’array, oppure Assente
//se il numero non `e presente.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] myArray = loadArray();
        System.out.println(Arrays.toString(myArray));
        System.out.println(verificaNumero(myArray));


    }
    public static int [] loadArray() {
        int [] array = new int [10];
        Random random = new Random();
        for (int i = 0; i < 10; i ++) {
            array[i] = random.nextInt(1,20);
        }
        return array;
    }
    public static String verificaNumero (int [] array1) {
        int j = 16;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] == j) {
                return "presente";
            }
        }
        return "assente";
    }
}