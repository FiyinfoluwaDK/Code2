import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ACTest {

    @Test
    public void testPowerCheck() {

        AC ac = new AC();

        assertTrue(ac.powerCheck(true));
        assertFalse(ac.powerCheck(false));

    }
    @Test 
    public void testTemperatureRange() {
        AC ac = new AC();

        assertEquals(16, ac.temperatureRange(10));
        assertEquals(30, ac.temperatureRange(35));
        assertEquals(25, ac.temperatureRange(25));
    }
    @Test 
    public void testIncreaseTemperature() {
        AC ac = new AC();

        assertEquals(26, ac.increaseTemperature(25));
        assertEquals(30, ac.increaseTemperature(29));
        assertEquals(30, ac.increaseTemperature(30));
    }
    @Test
    public void testDecreaseTemperature() {
        AC ac = new AC();

        assertEquals(24, ac.decreaseTemperature(25));
        assertEquals(16, ac.decreaseTemperature(17));
        assertEquals(16, ac.decreaseTemperature(16));
    }
    @Test 
    public void testDisplayTemperature() {
        AC ac = new AC();

        assertEquals(25, ac.displayTemperature(25));
        assertEquals(30, ac.displayTemperature(30));
        assertEquals(16, ac.displayTemperature(16));
    }
}

