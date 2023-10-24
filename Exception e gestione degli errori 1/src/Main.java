// Scrivere una funzione che controlli se un numero int è in un determinato range.
// Se lo è ritorna true se non lo è lancia un'eccezione.

public class Main {
    public static void main(String[] args) {
        int number = 45;
        int number1 = 90;

        int min = 1;
        int max = 50;

        System.out.println(number + " è nel range? " + verificaRange(number, min, max));
        System.out.println(number1 + " è nel range? " + verificaRange(number1, min, max));
    }
    public static boolean verificaRange (int number, int min, int max) {
        try {
            if (number < min || number > max) {
                throw new ArithmeticException ("Il numero non è nel range");
            }
            return true;
        } catch (ArithmeticException e) {
            System.out.println("C'è stato un errore " + e);
            return false;
        }
    }
}