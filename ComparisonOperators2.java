// Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
// Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.

public class ComparisonOperators2 {
    public static void main(String args[]) {
        char caracter1 = 'h';
        char caracter2 = 'h';
        System.out.println("Caracter1: " + caracter1);
        System.out.println("Caracter2: " + caracter2);
        
        boolean charEquals = caracter1 != caracter2;
        System.out.println("Result equals: " + charEquals);
    }
}

