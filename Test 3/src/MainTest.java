import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private final Main test = new Main();

    @Test
    public void data_manuale () {
        String result = test.dataManuale ("2023-03-01T13:00:00Z");
        assertEquals("01 marzo 2023", result);
    }
    @Test
    public void data_null () {
        String result = test.dataManuale (null);
        assertNull(null, result);
    }
    @Test
    public void data_empty () {
        String result = test.dataManuale ("");
        assertNull(null, result);
    }

}