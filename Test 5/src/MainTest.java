import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {
    private final Main test = new Main();
    @Test
    public void verifica_aggiungi_anno () {
        OffsetDateTime result = test.aggiungiAnno("2023-03-01T13:00:00Z");
        OffsetDateTime data1 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        assertEquals(data1, result);
    }
    @Test
    public void anno_parsing () {
        String nonValida = "anno_non_valido";
        Exception e = assertThrows(DateTimeParseException.class, () -> test.aggiungiAnno(nonValida));
        assertEquals("Errore di parsing", e.getMessage());
    }
    @Test
    public void verifica_aggiungi_anno_null () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = test.aggiungiAnno(null);
        assertEquals(null, result);
    }
    @Test
    public void verifica_sottrai_mese () {
        OffsetDateTime result = test.sottraiMese("2023-03-01T13:00:00Z");
        OffsetDateTime data1 = OffsetDateTime.parse("2023-02-01T13:00:00Z");
        assertEquals(data1, result);
    }
    @Test
    public void mese_parsing () {
        String nonValida = "mese_non_valido";
        Exception e = assertThrows(DateTimeParseException.class, () -> test.sottraiMese(nonValida));
        assertEquals("Errore di parsing", e.getMessage());
    }
    @Test
    public void verifica_sottrai_mese_null () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = test.sottraiMese(null);
        assertEquals(null, result);
    }
    @Test
    public void verifica_aggiungi_7giorni () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = test.aggiungi7Giorni(data.toString());
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-08T13:00:00Z");
        assertEquals(data1, result);
    }
    @Test
    public void giorni7_parsing () {
        String nonValida = "giorno_non_valido";
        Exception e = assertThrows(DateTimeParseException.class, () -> test.aggiungi7Giorni(nonValida));
        assertEquals("Errore di parsing", e.getMessage());
    }
    @Test
    public void verifica_aggiungi_7giorni_null () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = test.aggiungi7Giorni(null);
        assertEquals(null, result);
    }


}
    /*Data iniziale: 01 marzo 2023
        Data modificata: 08 febbraio 2024*/