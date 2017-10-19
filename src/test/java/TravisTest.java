import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TravisTest {

    @Test
    public void passingTest() {
        assertEquals(1 + 1, 2);
    }

    @Test
    public void failingTest() {
        assertEquals(1 + 1, 3);
    }
}
