// Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.

import java.nio.charset.CharacterCodingException;

public class Main {
    public static void main(String[] args) {
        char character = 'i';

        try {
            controlloCarattere(character);
        } catch (ArithmeticException e) {
            System.out.println("ERRORE: " + e);
        }
    }

    public static void controlloCarattere (char character) {
            // Character.isDigit() per verificare se il carattere è un numero.
            if (!Character.isDigit(character)) {
                throw new ArithmeticException ("Il carattere NON è un numero");
            } else {
                System.out.println("Il carattere è un numero.");
            }
    }
}