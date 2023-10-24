// Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

public class Main {
    public static void main(String[] args) {
        int numeratore = 26;
        int denominatore = 0;
        System.out.println(provaDivisione0(numeratore, denominatore));
    }
    public static int provaDivisione0 (int numeratore, int denominatore) {
        int divisione = 0;
        try {
            divisione = numeratore / denominatore;
        } catch (ArithmeticException e) {
            System.out.println("Errore. Tentativo di divisione per zero " + e);
        }
        return divisione;
    }
}