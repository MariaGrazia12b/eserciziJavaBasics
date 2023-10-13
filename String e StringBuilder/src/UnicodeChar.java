public class UnicodeChar {
    private String word;
    private int position;

    public UnicodeChar(String inputString, int position) {
        this.word = inputString;
        this.position = position;
    }
    public String extractUnicodeCharacter() {
        StringBuilder result = new StringBuilder();

        if (position >= 0 && position < word.length()) {
            //PROMEMORIA per me: Il metodo charAt è un metodo della classe String in Java. Esso restituisce
            // il carattere situato all'indice specificato in una stringa.
            char character = word.charAt(position);
            result.append("Il carattere in Unicode all'indice ")
                    .append(position)
                    .append(" è: ")
                    //PROMEMORIA per me: Integer.toHexString è un metodo in Java che fa parte della classe Integer.
                    // Questo metodo converte un valore intero in una stringa che rappresenta
                    // il valore in formato esadecimale.
                    //Usando toUpperCase(), si assicura che la rappresentazione esadecimale sia sempre
                    // in maiuscolo, indipendentemente dall'implementazione specifica del metodo toHexString.
                    .append(Integer.toHexString((int) character).toUpperCase());
        } else {
            result.append("Errore");
        }

        return result.toString();
    }
}
