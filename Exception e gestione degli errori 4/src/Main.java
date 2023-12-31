// Scrivere una funzione che accetti un array in input e provi a dividere
// un numero dell'array per 0 e gestista sia l'eccezione della divisione
// che quella di indice non presente nell'array, leggendone il messaggio.
// Eseguire sempre un blocco di codice scrivendo un messaggio in console.

public class Main {
    public static void main(String[] args) {
        int [] myArray = {3, 7, 1, 9, 5};
        int index = 4;
        try {
            System.out.println("Il risultato della divisione è: " + calcoloDivisioneVerificaIndice(myArray, index));
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("ERRORE: " + e);
        }
    }

    public static int calcoloDivisioneVerificaIndice(int[] array1, int indice) {
       
        int risultato = array1[indice] / 0;
        if (indice > array1.length) {
            throw new ArrayIndexOutOfBoundsException("Errore di accesso a un indice non presente nell'array");
        }
            return risultato;
    }
}