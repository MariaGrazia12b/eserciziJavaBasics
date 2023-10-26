//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.

public class Main {
    public static void main(String[] args) {
        //PROMEMORIA per me: Integer (tipo oggetto): è una classe wrapper che incapsula un int in un oggetto.
        //È un tipo di dato nullable, il che significa che può contenere un valore intero o essere null.
        Integer numeratore = 20;
        Integer denominatore = null;

        try {
            System.out.println(controlloNull(numeratore, denominatore));
        } catch (IllegalArgumentException e) {
            System.out.println("ERRORE " + e);
        }

    }
    public static double controlloNull (Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("Il numeratore e il denominatore non possono essere nulli");
        }
        else if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero");
        }
        return (double) numeratore / denominatore;
    }
}