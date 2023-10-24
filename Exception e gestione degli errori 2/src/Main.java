// Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.

public class Main {
    public static void main(String[] args) {
        char character = 'i';
        controlloCarattere(character);
    }

    public static void controlloCarattere (char character) {
        try {
            // Character.isDigit() per verificare se il carattere è un numero.
            if (!Character.isDigit(character)) {
                throw new ArithmeticException ();
            } else {
                System.out.println("Il carattere è un numero.");

            }
        } catch (ArithmeticException e) {
            System.out.println("C'è stato un errore " + e);
            System.out.println(("Il carattere " + character + " non è un numero"));
        }
    }
}