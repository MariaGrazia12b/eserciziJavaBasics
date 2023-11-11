//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
// crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        BigDecimal numero1 = BigDecimal.valueOf(4.5);
        BigDecimal numero2 = BigDecimal.valueOf(2);
        for (Operazione operazione1 : Operazione.values()) {
            try {
                BigDecimal risultato = operazione(operazione1, numero1, numero2);
                System.out.println(numero1 + " " + operazione1.getSimbolo() + " " + numero2 + " = " + risultato);
            } catch (ArithmeticException e) {
                System.out.println("Errore" +e);
            }
        }
    }
    public static BigDecimal operazione (Operazione operazione1, BigDecimal numero1, BigDecimal numero2) throws Exception {
        switch (operazione1) {
            case ADDIZIONE:
                return numero1.add(numero2);
            case SOTTRAZIONE:
                return numero1.subtract(numero2);
            case MOLTIPLICAZIONE:
                return numero1.multiply(numero2);
            case DIVISIONE:
                if (numero2.compareTo(BigDecimal.ZERO) != 0) {
                    return numero1.divide(numero2);
                } else {
                    throw new ArithmeticException("Non si può dividere per 0");
                }
            case MIN:
                return numero1.min(numero2);
            case MAX:
                return numero1.max(numero2);
            default:
                return BigDecimal.valueOf(0);
        }
    }
}