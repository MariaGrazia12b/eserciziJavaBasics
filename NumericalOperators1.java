// Definisci un metodo per la divisione di 2 numeri interi che restituisca il quoziente che dovrà essere stampato.

public class NumericalOperators1 {
    public static void main(String args[]) {
        int number1 = 90;
        int number2 = 45;
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);

        System.out.println("Division: " + division(number1, number2));
    }

    public int division(int number1, int number2) {
        int resultDiv = number1 / number2;
        return resultDiv;
    }
}