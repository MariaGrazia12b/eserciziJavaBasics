// Scrivere un programma che contenga un metodo che permette di inizializzare una matrice riempita con dei valori a vostro piacimento
// e restituisca la somma degli elementi sulla prima riga.
public class ArrayMulti1
{
    public static void main(String args[]) {
        int finalSum = sumMatrix();
        System.out.println("The sum is: " + finalSum);
    }
    public static int sumMatrix () {
        int [] [] matrix = {{2, 3, 4, 5},
                {6, 7, 8, 9}};
        int sum = 0;
        //COMMENTO PROMEMORIA PER ME STESSA: matrix[0] indica la prima riga; [1] indica la seconda riga; se ce ne fosse una terza sarebbe [2]
        for(int i = 0; i < matrix[0].length; i++) {
            sum += matrix[0] [i];
        }
        return sum;
    }
}
