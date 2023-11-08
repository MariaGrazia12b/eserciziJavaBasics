import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private final Main test = new Main();

    @Test
    public void somma_di_due_integer() {
        Integer result = test.somma(1,2);
        Integer expected = 3;
        assertEquals("La somma dovrebbe essere 3", expected, result);
    }
    @Test
    public void somma_di_integer_negativo() {
        Integer result = test.somma(-1,2);
        Integer expected = 1;
        assertEquals("Il risultato della moltiplicazione dovrebbe essere 1", expected, result);
    }
    @Test
    public void somma_di_null_e_integer() {
        Integer result = test.somma(null,2);
        Integer expected = null;
        assertEquals("Se un numero è null il risultato dovrebbe essere null", expected, result);
    }
    @Test
    public void moltiplicazione_di_due_integer() {
        Integer result = test.moltiplicazione(1,2);
        Integer expected = 2;
        assertEquals("Il risultato della moltiplicazione dovrebbe essere 2", expected, result);
    }
    @Test
    public void moltiplicazione_di_due_integer_non_uno() {
        Integer result = test.moltiplicazione(5,2);
        Integer expected = 10;
        assertEquals("Il risultato della moltiplicazione dovrebbe essere 10", expected, result);
    }
    @Test
    public void moltiplicazione_con_null() {
        Integer result = test.moltiplicazione(null,2);
        Integer expected = null;
        assertEquals("Se un numero è null il risultato dovrebbe essere null", expected, result);
    }


}