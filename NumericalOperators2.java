// Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.

public class NumericalOperators2 {
    public static void main(String args[]) {
        int number1 = 60;
        int number2 = 34;
        int number3 = 78;
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        System.out.println("Number3: " + number3);

        System.out.println("Arithmetic average: " + computeMedia(number1, number2, number3));
    }
    public static int computeMedia(int number1, int number2, int number3) {
        int result = (number1 + number2 + number3) / 3;
        return result;
    }
}