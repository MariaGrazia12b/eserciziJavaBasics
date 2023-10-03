// Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
// verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione 
// comprensivo dei due limiti (inferiore e superiore).

public class LogicalOperators1 {
    public static void main(String args[]) {
        int x = 60;
        int y = 19;
        int z = 21;
        System.out.println("Value of " + z + " is between " + x + " and " + y + "? " + comparison(x, y, z));
    }
    public static boolean comparison(int x, int y, int z) {
        return (z < x && z > y);
    }
}