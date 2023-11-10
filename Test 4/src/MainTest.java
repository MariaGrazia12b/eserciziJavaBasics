import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private final Main test = new Main();

    @Test
    public void verifica_stampa_anno () {
        int result = test.stampaAnno("2023-03-01T13:00:00Z");
        assertEquals (2023, result);
    }
    @Test
    public void verifica_anno_null () {
        int result = test.stampaAnno(null);
        assertEquals (0, result);
    }
    @Test
    public void anno_parsing () {
        String nonValida = "anno_non_valido";
        Exception e = assertThrows(DateTimeParseException.class, () -> test.stampaAnno(nonValida));
        Assert.assertEquals("Errore di parsing", e.getMessage());
    }
    @Test
    public void verifica_stampa_mese () {
        //OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = test.stampaMese("2023-03-01T13:00:00Z");
        assertEquals ("MARCH", result);
    }
    @Test
    public void verifica_mese_null () {
        String result = test.stampaMese(null);
        assertEquals (null, result);
    }
    @Test
    public void mese_parsing () {
        String nonValida = "mese_non_valido";
        Exception e = assertThrows(DateTimeParseException.class, () -> test.stampaMese(nonValida));
        Assert.assertEquals("Errore di parsing", e.getMessage());
    }
    @Test
    public void verifica_stampa_giorno () {
        int result = test.stampaGiorno("2023-03-01T13:00:00Z");
        assertEquals (1, result);
    }
    @Test
    public void verifica_giorno_null () {
        int result = test.stampaGiorno(null);
        assertEquals (0, result);
    }
    @Test
    public void giorno_parsing () {
        String nonValida = "giorno_non_valido";
        Exception e = assertThrows(DateTimeParseException.class, () -> test.stampaGiorno(nonValida));
        Assert.assertEquals("Errore di parsing", e.getMessage());
    }
    @Test
    public void verifica_stampa_giorno_settimana () {
        String result = test.stampaGiornoSettimana("2023-03-01T13:00:00Z");
        assertEquals ("WEDNESDAY", result);
    }
    @Test
    public void verifica_giorno_settimana_null () {
        String result = test.stampaGiornoSettimana(null);
        assertEquals (null, result);
    }
    @Test
    public void giorno_settimana_parsing () {
        String nonValida = "giorno_non_valido";
        Exception e = assertThrows(DateTimeParseException.class, () -> test.stampaGiornoSettimana(nonValida));
        Assert.assertEquals("Errore di parsing", e.getMessage());
    }

}