// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso, 
// la stampa dovrà saltare il valore uguale a 5.

public class AdvancedLoops2 {
    public static void main(String args[]) {
        int x = 8;
        loop(x);
    }
    public static void loop(int x) {
        int i = 0;
        for(i = 0; i <= x; i++) {
            if(i == 5) {
            continue;
            }
        System.out.println(i);
        }
    }
}