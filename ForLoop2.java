// Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati che vuoi avere 
// e stampi tutti i numeri naturali in ordine inverso.
// (Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).

public class ForLoop2 {
    public static void main(String args[]) {
        int x = 8;
        int y = 3;
        loop(x, y);
    }
    public static void loop(int x, int y) {
        int i = 0;
        for(i = x; i > (x - y); i--) {
            System.out.println(i);
        }
    }
}