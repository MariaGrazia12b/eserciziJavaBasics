//Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un
// indice specifico all'interno di una stringa e lo stampi. Il metodo dovrà avere nel costruttore
// una stringa ed una posizione e dovrà resituire il carattere in unicode o una stringa di errore.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.


public class Main {
    public static void main(String[] args) {
        String word = "Farfalla";
        System.out.println(word);

        int position = 3;

        UnicodeChar extractor = new UnicodeChar(word, position);
        String result = extractor.extractUnicodeCharacter();

        System.out.println(result);
    }

}
