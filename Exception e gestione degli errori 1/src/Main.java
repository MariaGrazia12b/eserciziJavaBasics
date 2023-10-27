// Scrivere una funzione che controlli se un numero int è in un determinato range.
// Se lo è ritorna true se non lo è lancia un'eccezione.

//Hai usato throw con try e catch insieme, throw ti serve per lanciare l'eccezione nel metodo,
// il try e catch ti serve per gestire l'eccezione li dove è chiamato il metodo.

public class Main {
    public static void main(String[] args) {
        int number = 90;

        int min = 1;
        int max = 50;

        try {
            System.out.println(number + " è nel range? " + verificaRange(number, min, max));
        } catch (ArithmeticException e) {
            System.out.println("ERRORE " + e);
        }
    }
    public static boolean verificaRange (int number, int min, int max) {

            if (number < min || number > max) {
                throw new ArithmeticException ("Il numero non è nel range");
            }
            return true;
    }
}