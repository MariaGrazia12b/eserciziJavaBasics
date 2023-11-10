import org.junit.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

import static org.junit.Assert.*;

public class MainTest {
    private final Main test = new Main();

    @Test
    public void data_manuale () throws DataFormatException {
        String result = test.dataManuale ("2023-03-01T13:00:00Z");
        assertEquals("01 marzo 2023", result);
    }
    @Test
    public void data_null () throws DataFormatException {
        String nonValida = null;
        Exception e = assertThrows(DataFormatException.class, () -> test.dataManuale(nonValida));
        assertEquals("Stringa data vuota o nulla", e.getMessage());
    }
    @Test
    public void data_empty () throws DataFormatException {
        String nonValida = "";
        Exception e = assertThrows(DataFormatException.class, () -> test.dataManuale(nonValida));
        assertEquals("Stringa data vuota o nulla", e.getMessage());
    }
    @Test
    public void data_parsing () {
        String nonValida = "data_non_valida";
        Exception e = assertThrows(DateTimeParseException.class, () -> test.dataManuale(nonValida));
        assertEquals("Errore di parsing", e.getMessage());
    }
}