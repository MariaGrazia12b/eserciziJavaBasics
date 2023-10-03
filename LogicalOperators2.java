// Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se 
// un numero è pari o dispari utilizzando solo gli operatori logici.

public class LogicalOperators2
{
    public static void main(String args[])
    {
        int x = 7;
        System.out.println("x: " + x);
        System.out.println("x è dispari? " + isOdd(x));
        System.out.println("x è pari? " + isEven(x));
    }
    public static boolean isOdd(int x)
    {
        boolean ris = (x % 2 != 0);
        return ris;
    }
    public static boolean isEven(int x) {
        boolean ris2 = (x % 2 == 0);
        return ris2;
    }
}