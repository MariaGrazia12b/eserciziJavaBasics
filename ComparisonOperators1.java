// Scrivi un programma che contiene un metodo che confronti due numeri interi e determini se sono diversi.
// Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.

public class ComparisonOperators1 {
    public static void main(String args[]) {
        int x = 68;
        int y = 90;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("Equals x = y: " + xyEquals(x, y));
    }
    public static boolean xyEquals(int x, int y) {
        boolean equals = x == y;
        return equals;
    }
}