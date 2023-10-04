// Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
// Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.

public class Array2 {
    public static void main(String args[]) {
        character();
    }
    public static void character() {
        char [] charArray = {'s', 'e', 'r', 'e', 'n', 'e', 'r', 'e'};
        int totalOccurrences = 0;
        for(int i = 0; i <= charArray.length -1; i++) {
            if(charArray[i] == 'a') {
                totalOccurrences += 1;
            }
        }
        System.out.println(totalOccurrences);
    }
}
