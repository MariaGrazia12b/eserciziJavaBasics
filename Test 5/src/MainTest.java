import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private final Main test = new Main();
    @Test
    public void verifica_aggiungi_anno () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = test.aggiungiAnno(data);
        OffsetDateTime data1 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        assertEquals(data1, result);
    }
    @Test
    public void verifica_aggiungi_anno_null () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = test.aggiungiAnno(null);
        assertEquals(null, result);
    }
    @Test
    public void verifica_sottrai_mese () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = test.sottraiMese(data);
        OffsetDateTime data1 = OffsetDateTime.parse("2023-02-01T13:00:00Z");
        assertEquals(data1, result);
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
        OffsetDateTime result = test.aggiungi7Giorni(data);
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-08T13:00:00Z");
        assertEquals(data1, result);
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