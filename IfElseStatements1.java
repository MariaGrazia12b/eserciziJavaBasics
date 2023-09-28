// Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi "Fizz" al posto del numero e per i 
// multipli di 5 stampi "Buzz". Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".

// ESERCIZIO SVOLTO IN PAIR

 public class IfElseStatements1 {
     public static void main (String args[]) {

       System.out.println(IfElse(1));
       System.out.println(IfElse(2));
       System.out.println(IfElse(15));
    
    }
    public static String IfElse(int x) {
         String result = String.valueOf (x);   
         if (x % 3 == 0 && x % 5 == 0) {
             result = "FizzBuzz";
         } else if(x % 5 == 0) {
             result = "Fizz";
         } else if(x % 3 == 0) {
             result = "Buzz";
         }
     
       return result;
     }
 }

