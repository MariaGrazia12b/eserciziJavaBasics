// Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e 
// che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.

public class Array1 {
    public static void main(String args[]) {

        numbers();
    }
    public static void numbers() {
        int [] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println("La somma è: " + sum);
    }
}