// Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.

public class NumericalOperators3 {
    public static void main(String args[]) {
        int a = 56;
        int b = 34;
        
        System.out.println("a: " + a);
        a++;
        System.out.println("Inc: " + a);
        
        System.out.println("b: " + b);
        b++;
        System.out.println("Inc: " + b);
        
        int c = a++ * b++;
        System.out.println("Multiplication: " + c);
    }
}