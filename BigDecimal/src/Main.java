//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
// crei un metodo per calcolare l'operazione richiesta e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        BigDecimal numero1 = BigDecimal.valueOf(4.5);
        BigDecimal numero2 = BigDecimal.valueOf(2);

        gestioneOperazioni operazioni = new gestioneOperazioni();

        for (Operazione operazione : Operazione.values()) {
            try {
                BigDecimal risultato = gestioneOperazioni.eseguiOperazione(operazione, numero1, numero2);
                System.out.println("Risultato: " + risultato);
            } catch (ArithmeticException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }
    }
}