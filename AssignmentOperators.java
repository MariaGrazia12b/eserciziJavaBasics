// Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.
// Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.

public class AssignmentOperators {
    public static void main(String args[]) {
        int a = 56;
        int b = 34;
        
        System.out.println("a: " + a);
        a += 5;
        System.out.println("Inc: " + a);
        
        System.out.println("b: " + b);
        b += 3;
        System.out.println("Inc: " + b);
        
        int multi = a * b;
        System.out.println("Multiplication: " + multi);
        
    }
}