import java.util.Arrays;

public class EsercizioPair {
        public static void main(String[] args) {

                int[] uguale = {4, 4, 4};
                int[] notATriangle = {40, 2, 5};
                int[] isoscele = {4, 6, 4};
                int[] scaleno = {4, 2, 3};

                verificaTriangolo(scaleno);
        }
        public static void verificaTriangolo(int[] myTriangle) {
                Arrays.sort(myTriangle);

                double power1 = Math.pow(myTriangle[0], 2);
                double power2 = Math.pow(myTriangle[1], 2);
                double power3 = Math.pow(myTriangle[2], 2);
                // Calcolo delle potenze del valore dei lati per applicare il
                // teorema di Pitagora.

                if ((myTriangle[2] + myTriangle[1] > myTriangle[0])
                        && (myTriangle[0] + myTriangle[1] > myTriangle[2])
                        && (myTriangle[2] + myTriangle[0] > myTriangle[1])
                        // Teorema di ineguaglianza del triangolo.
                )
                {
                        System.out.println("La figura è un triangolo.");

                        if (myTriangle[0] == myTriangle[1] && myTriangle[1] == myTriangle[2]) {
                                System.out.println("E' un triangolo equilatero.");
                        } else if (myTriangle[0] == myTriangle[1]) {
                                System.out.println("E' un tringolo isoscele.");
                                pitagora(power1, power2, power3);

                        } else if (myTriangle[0] != myTriangle[1] && myTriangle[1] != myTriangle[2]) {
                                System.out.println("E' un tringolo scaleno.");
                                pitagora(power1, power2, power3);
                        }

                } else {
                        System.out.println("La figura non è un triangolo.");
                }
        }

        public static void pitagora (double a, double b, double c) {
                if ((a + b) == c) {
                        System.out.println("Il triangolo è anche rettangolo.");
                } else {
                        System.out.println(("Non si tratta di un triangolo rettangolo."));
                }
        }
}

// Scrivi un programma che inseriti i lati di un triangolo
// li passi ad una funzione che deve riconoscere se il triangolo non esiste,
// se è equilatero, se è isoscele se è scaleno .
// Nel caso in cui sia scaleno o isoscele deve riconoscere,
// in aggiunta, se è anche rettangolo.