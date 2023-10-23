// Contare il numero di occorrenze di un elemento in un array di stringhe: FATTO.
// Trovare la posizione di un elemento in un array: FATTO.
// Dato un array di stringhe verificare la parola più corta: FATTO.
// Creare un array di char con funzione random di dimensione 4: FATTO.
// Calcola le occorrenze di un char: FATTO.
// Creare un array di interi con funzione random di dimensione 6: FATTO.
// Copiare gli elementi di un array in un nuovo array: FATTO.
// Calcolo somma: FATTO.
// Calcolo media aritmetica: FATTO.
// Stampare il valore massimo e il valore minimo: FATTO.
// Verificare se un array contiene un elemento specifico: FATTO.
// Mettere in ordine crescente o decrescente l'array: FATTO.
// Eliminare il numero di duplicato:
// Invertire l'ordine degli elementi in un array: FATTO.
// Conto numeri pari, numeri dispari: FATTO.
// Verifica numeri pari in posizioni pari: FATTO.
// Dato un numero, verifica quanti elementi dell'array sono maggiori e quanti minori: FATTO.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String [] arrayStringhe = {"ciao", "io", "sono", "bella", "ciao"};
        System.out.println(Arrays.toString(arrayStringhe));
        System.out.println("La parola è presente: " + numeroOccorrenze(arrayStringhe) + " volte");
        posizioneElemento(arrayStringhe);
        System.out.println("La parola più corta è: " + parolaPiuCorta(arrayStringhe));
        char [] arrayDiChar = loadArrayChar();
        System.out.println(Arrays.toString(arrayDiChar));
        occorrenzeChar(arrayDiChar);
        int [] arrayDiInt = loadArrayInt();
        System.out.println(Arrays.toString(arrayDiInt));
        int [] arrayCopiato = copiaArray(arrayDiInt);
        System.out.println(Arrays.toString(arrayCopiato));
        System.out.println("La somma degli elementi dell'array è: " + calcoloSomma(arrayDiInt));
        System.out.println("La media degli elementi dell'array è: " + mediaAritmetica(arrayDiInt));
        System.out.println("Il numero più piccolo è: " + valoreMinimo(arrayDiInt));
        System.out.println("Il numero più grande è: " + valoreMassimo(arrayDiInt));
        System.out.println("Il numero selezionato è presente nell'array? " + verificaPresenzaElemento(arrayDiInt));
        System.out.println(Arrays.toString(arrayOrdineCrescente(arrayDiInt)));
        calcoloNumeriPariEDispari(arrayDiInt);
        verificaNumeriMaggioriMinoriDiX(arrayDiInt);
        System.out.println("I numeri nelle posizioni pari sono tutti pari? " + numeriPariInPosizioniPari(arrayDiInt));
        System.out.println("Array invertito: " + Arrays.toString(invertiOrdine(arrayDiInt)));
        System.out.println("Array senza duplicati: " + Arrays.toString(eliminaDuplicati(arrayDiInt)));

    }
    public static int numeroOccorrenze(String [] stringhe1) {
        String parola = "ciao";
        int occorrenze = 0;
        for(int i = 0; i < stringhe1.length; i ++) {
            if(stringhe1[i] == parola) {
                occorrenze++;
            }
        }
        return occorrenze;
    }
    public static void posizioneElemento(String [] stringhe2) {
        String parola = "bella";
        for (int i = 0; i < stringhe2.length; i ++) {
            if (stringhe2[i] == parola) {
                System.out.println("La pozione della parola 'bella' è: " + i);
            }
        }
    }
    public static String parolaPiuCorta(String [] stringhe3) {
        String parolaCorta = stringhe3[0];
        for (int i = 0; i < stringhe3.length; i ++) {
            if (stringhe3[i].length() < parolaCorta.length()) {
                parolaCorta = stringhe3[i];
            }
        }
        return parolaCorta;
    }
    public static char [] loadArrayChar () {
        char [] funcArray = new char[4];
        Random random = new Random();
        for (int i = 0; i < funcArray.length; i ++) {
            funcArray[i] = (char) ('a' + random.nextInt(26));
        }
        return funcArray;
    }
    public static void occorrenzeChar (char [] char1) {
        char character = 'p';
        for(int i = 0; i < char1.length; i ++) {
            if (char1[i] == character) {
                System.out.println("Il carattere 'p' è presente: " + i + " volte.");
            }
        }
    }
    public static int [] loadArrayInt() {
        int [] funcArray = new int [6];
        Random random = new Random();
        for (int i = 0; i < 6; i ++) {
            funcArray[i] = random.nextInt(1, 50);
        }
        return funcArray;
    }
    public static int [] copiaArray(int [] arrayDaCopiare) {
        int lunghezza = arrayDaCopiare.length;
        int [] nuovoArray = new int[lunghezza];
        for (int i = 0; i < lunghezza; i ++) {
            nuovoArray[i] = arrayDaCopiare[i];
        }
        return nuovoArray;
    }
    public static int calcoloSomma (int [] array1) {
        int somma = 0;
        for (int i = 0; i < array1.length; i ++) {
            somma = array1[i] + somma;
        }
        return somma;
    }
    public static int mediaAritmetica (int [] array2) {
        int media = 0;
        int somma = 0;
        for (int i = 0; i < array2.length; i ++) {
            somma = array2[i] + somma;
        }
        media = somma / 6;
        return media;
    }
    public static int valoreMinimo(int [] array3) {
        int min = array3[0];
        for (int i = 0; i < array3.length; i ++) {
            if (array3[i] < min) {
                min = array3[i];
            }
        }
        return min;
    }
    public static int valoreMassimo(int [] array4) {
        int max = array4[0];
        for (int i = 0; i < array4.length; i ++) {
            if(array4[i] > max) {
                max = array4[i];
            }
        }
        return max;
    }
    public static boolean verificaPresenzaElemento (int [] array5) {
        int elementoDaVerificare = 9;
        for(int i = 0; i < array5.length; i ++) {
            if (array5[i] == elementoDaVerificare) {
                return true;
            }
        }
        System.out.println( "Il numero da verificare è: " + elementoDaVerificare);
        return false;
    }
    public static int [] arrayOrdineCrescente (int [] array6) {
        int memoria = 0;
        for(int i = 0; i < array6.length; i ++) {
            for (int j = i; j < array6.length; j ++) {
                if (array6[i] > array6[j]) { // per ordine decrescente < al posto di >.
                    memoria = array6[j];
                    array6[j] = array6[i];
                    array6[i] = memoria;
                }
            }
        }
        return array6;
    }
    public static void calcoloNumeriPariEDispari (int [] array7) {
        int numeriPari = 0;
        int numeriDispari = 0;
        for (int i = 0; i < array7.length; i ++) {
            if (array7[i] % 2 == 0) {
                numeriPari ++;
            } else if ( array7[i] % 2 != 0) {
                numeriDispari ++;
            }
        }
        System.out.println("I numeri pari sono: " +numeriPari);
        System.out.println(("I numeri dispari sono: " + numeriDispari));
    }
    public static void verificaNumeriMaggioriMinoriDiX (int [] array8) {
        int numero = 14;
        int numeriMinori = 0;
        int numeriMaggiori = 0;
        for (int i = 0; i < array8.length; i ++)
        {
            if (array8[i] < numero)
            {
                numeriMinori++;
            }
            else
            {
                numeriMaggiori ++;
            }
        }
        System.out.println("I numeri minori di " + numero + " sono: " + numeriMinori);
        System.out.println("I numeri maggiori di " + numero + " sono: " + numeriMaggiori);
    }
    public static boolean numeriPariInPosizioniPari (int [] array9) {
        for (int i = 0; i < array9.length; i += 2) {
            if(array9[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public static int [] invertiOrdine (int [] array10) {
        int memoria = 0;
        int i = 0;
        int j = array10.length -1;
        while (i < j) {
            memoria = array10[i];
            array10[i] = array10[j];
            array10[j] = memoria;
            i++;
            j--;
        }
        return array10;
    }
    public static int [] eliminaDuplicati (int [] array11) {
        int length = 0;
        for (int i = 0; i < array11.length; i ++) {
            boolean dupli = false;
            for (int j = 0; j< i; j ++) {
                if (array11[i] == array11[j]) {
                    dupli = true;
                }
            }
            if (!dupli) {
               array11[length]= array11[i];
               length ++;
            }
        }
        int [] nuovoArray = new int[length];
        for (int k = 0; k < length; k ++) {
            nuovoArray[k] = array11[k];
        }
        return nuovoArray;
    }
}