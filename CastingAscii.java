// Dati due caratteri, restituire la somma dei loro valori ASCII.

public class CastingAscii {
    public static void main(String[] args) {
        char character1 = 'B';
        char character2 = 'O';

        int sommaAscii = (int) character1 + (int) character2;
        System.out.println("La somma dei valori ASCII di " + character1 + " e " + character2 + " è: " + sommaAscii);
    }
}