package hexlet.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SomeClassTest {

    @Test
    public void testSum() {
        int expected = 5;
        int actual = SomeClass.sum(3, 2);
        assertEquals(expected, actual);
    }
}
