import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private static final Main test = new Main();

    @Test
    public void data_full() {
        String result = test.dataFull("2002-03-01T13:00:00Z");
        assertEquals("venerdì 1 marzo 2002", result);
    }
    @Test
    public void null_full() {
        String result = test.dataFull(null);
        assertEquals(null, result);
    }
    @Test
    public void empty_string() {
        String result = test.dataFull(" ");
        assertEquals(null, result);
    }
    @Test
    public void data_medium() {
        String result = test.dataMedium("2002-03-01T13:00:00Z");
        assertEquals("1 mar 2002", result);
    }
    @Test
    public void null_medium() {
        String result = test.dataMedium(null);
        assertEquals(null, result);
    }
    @Test
    public void empty_medium() {
        String result = test.dataMedium(" ");
        assertEquals(null, result);
    }
    @Test
    public void data_short() {
        String result = test.dataShort("2002-03-01T13:00:00Z");
        assertEquals("01/03/02", result);

    }
    @Test
    public void null_short() {
        String result = test.dataShort(null);
        assertEquals(null, result);
    }
    @Test
    public void empty_short() {
        String result = test.dataShort(" ");
        assertEquals(null, result);
    }
}