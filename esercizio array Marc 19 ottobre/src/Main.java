// Implementare un metodo statico di nome stringaCorta che prende come parametro
// un array di oggetti String e che restituisce la stringa dell’array avente lunghezza
// minima. Nel caso vi fossero due o più stringhe con la lunghezza minima,
// il metodo ne deve restituire una arbitrariamente.

public class Main {
    public static void main(String[] args) {
        String [] myStringa = {"ciao", "core", "bella", "pe", "voi", "ci"};
        System.out.println("La parola più corta è: " + stringaCorta(myStringa));
    }
    public static String stringaCorta (String [] stringa) {
        String parolaCorta = stringa[0];
        for (int i = 0; i < stringa.length; i ++) {
            if (parolaCorta.length() > stringa[i].length()) {
                parolaCorta = stringa[i];
            }
        }
        return parolaCorta;
    }
}