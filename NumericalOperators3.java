// Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.

public class NumericalOperators3 {
    public static void main(String args[]) {
        int a = 56;
        int b = 34;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Multiplication: " + multiplication(a, b));
    }
    public static int multiplication(int a, int b) {
        a += 2;
        b += 3;
        int c = a * b;
        return c;
    }
}