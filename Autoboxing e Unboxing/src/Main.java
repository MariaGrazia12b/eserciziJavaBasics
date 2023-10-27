//Scrivere una funzione che accetti in input 2 int e ne stampi la somma FATTO
//Scrivere una funzione che accetti in input 1 char lo stampi FATTO
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma FATTO
//Scrivere una funzione che accetti in input 1 Character lo stampi FATTO
//Scrivere un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//Usare le funzioni scritte con i valori creati

public class Main {
    public static void main(String[] args) {
        int numero1 = 8;
        int numero2 = 5;
        Integer numero6 = numero1; // autoboxing
        System.out.println("La somma di " + numero1 + " e " + numero2 + " è: " + calcoloSomma(numero1, numero2));
        System.out.println(numero6);
        char carattere = 'P';
        Character carattere2 = carattere; // autoboxing
        char carattere3 = carattere2; // unboxing
        stampaCarattere(carattere);
        System.out.println(carattere2);
        System.out.println(carattere3);
        Integer numero3 = 9;
        Integer numero4 = 2;
        int numero9 = numero3; // unboxing
        System.out.println("La somma di " + numero3 + " e " + numero4 + " è: " + sommaInteger(numero3, numero4));
        System.out.println(numero9);
        Character carattere1 = 'g';
        stampaCharacter(carattere1);
        double numero7 = 4;
        Double numero8 = numero7; // autoboxing
        double numero10 = numero8; //  unboxing
        System.out.println(numero7);
        System.out.println(numero8);
        System.out.println(numero10);
    }
    public static int calcoloSomma (int num1, int num2) {
        int somma = num1 + num2;
        return somma;
    }
    public static void stampaCarattere (char character) {
        System.out.println(character);
    }
    public static int sommaInteger (Integer num1, Integer num2) {
        int somma = num1 + num2;
        return somma;
    }
    public static void stampaCharacter (Character carattere) {
        System.out.println(carattere);
    }
}