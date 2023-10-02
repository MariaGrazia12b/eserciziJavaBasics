// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico 
// e stampa tutti i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.

public class AdvancedLoops1 {
    public static void main(String args[]) {
        int x = 6;
        loop(x);
    }
    public static void loop(int x) {
        int i = 0;
        for(i = 0; i <= x; i++) {
        System.out.println(i);
        
        if(i == 5) {
            break;
        }
      }
    }
}