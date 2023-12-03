import java.math.BigDecimal;

public class gestioneOperazioni {

    public static BigDecimal eseguiOperazione(Operazione operazione, BigDecimal numero1, BigDecimal numero2) throws Exception {
        switch (operazione) {
            case ADDIZIONE:
                return addizione(numero1, numero2);
            case SOTTRAZIONE:
                return sottrazione(numero1, numero2);
            case MOLTIPLICAZIONE:
                return moltiplicazione(numero1, numero2);
            case DIVISIONE:
                return divisione(numero1, numero2);
            case MIN:
                return minimo(numero1, numero2);
            case MAX:
                return massimo(numero1, numero2);
            default:
                throw new IllegalArgumentException("Operazione non supportata: ");
        }
    }

    private static BigDecimal addizione(BigDecimal numero1, BigDecimal numero2) {
        return numero1.add(numero2);
    }

    private static BigDecimal sottrazione(BigDecimal numero1, BigDecimal numero2) {
        return numero1.subtract(numero2);
    }

    private static BigDecimal moltiplicazione(BigDecimal numero1, BigDecimal numero2) {
        return numero1.multiply(numero2);
    }

    private static BigDecimal divisione(BigDecimal numero1, BigDecimal numero2) {
        if (numero2.compareTo(BigDecimal.ZERO) != 0) {
            return numero1.divide(numero2);
        } else {
            throw new ArithmeticException("Non si può dividere per 0");
        }
    }

    private static BigDecimal minimo(BigDecimal numero1, BigDecimal numero2) {
        return numero1.min(numero2);
    }

    private static BigDecimal massimo(BigDecimal numero1, BigDecimal numero2) {
        return numero1.max(numero2);
    }
}
