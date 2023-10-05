import java.util.Arrays;

public class EsercizioPair {
        public static void main(String[] args) {

                int[] uguale = {4, 4, 4};
                int[] notATriangle = {2, 9, 2};
                int[] isoscele = {4, 6, 4};

                verificaTriangolo(notATriangle);

        }


        public static void verificaTriangolo(int [] myTriangle) {
                Arrays.sort(myTriangle);
                if (myTriangle[0] == myTriangle[1] && myTriangle[1] == myTriangle[2]) {
                        System.out.println("E' un triangolo equilatero.");
                } else if ((myTriangle[0] + myTriangle[1]) <= myTriangle[2]) {
                        System.out.println("Non si tratta di un triangolo.");
                } else if (myTriangle[0] == myTriangle[1] && (myTriangle[0] + myTriangle[1]) <= myTriangle[2]) {
                        System.out.println("E' un tringolo isoscele.");
                }
        }
}

// Scrivi un programma che inseriti i lati di un triangolo
// li passi ad una funzione che deve riconoscere se il triangolo non esiste,
// se è equilatero, se è isoscele se è scaleno .
// Nel caso in cui sia scaleno o isoscele deve riconoscere,
// in aggiunta, se è anche rettangolo.