// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca 
// la tabellina aritmetica di quel numero che dovrà essere stampata a video.

public class ForLoop {
    public static void main(String args[]) {
        int x = 9;
        loop(x);
    }
    public static void loop(int x) {
        int result = 0;
        for(int i = 1; i <= 10; i++) {
            result = x * i;
            System.out.println(result);
        }
    }
}