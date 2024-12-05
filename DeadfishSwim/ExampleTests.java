import static org.junit.Assert.*;
import org.junit.Test;

public class ExampleTests {
    // @org.junit.jupiter.api.Test
    @Test
    public void exampleTests() {
        assertArrayEquals(new int[] { 8, 64 }, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] { 8, 64, 3600 }, DeadFish.parse("iiisdosodddddiso"));
    }
}
