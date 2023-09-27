// Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.
// Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.

public class AssignmentOperators {
    public static void main(String args[]) {
        int a = 60;
        int b = 80;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("Multiplication: " + multiplication(a, b));
    }
    public static int multiplication(int a, int b) {
        a += 5;
        b += 3;
        int multi = a * b;
        return multi;
    }
}