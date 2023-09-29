// Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 1 valore intero 
// come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
// (Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4).

public class WhileLoop {
    public static void main(String args[]) {
        int x = 5;
        System.out.println("La somma è: " +loop(x));
        
    }
    public static int loop(int x) {
        int sum = 0;
        int i = 0;
        while(i <= x) {
            sum += i;
            i++;
        }
        return sum;
    } 
}