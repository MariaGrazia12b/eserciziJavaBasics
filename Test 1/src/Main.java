//Riprendi uno degli esercizi già svolti e corretti
//Aggiungi Junit al progetto
//Crea una funzione di test che non dia errori

import static org.junit.Assert.*;
public class Main {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 5;
        System.out.println( "La somma è: " + somma(a, b));
        System.out.println( "La moltiplicazione è: " + moltiplicazione(a, b));
    }
    public static Integer somma (Integer x, Integer y) {
        if (x == null || y == null) {
            return null;
        }
        return x + y;
    }
    public static Integer moltiplicazione (Integer x, Integer y) {
        if (x == null || y == null) {
            return null;
        }
        return x * y;
    }

}