import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenstralTest {

    @Test
    public void testCalculateNextPeriod() {
        MenstrualCycle cycle = new MenstrualCycle(28);
        String nextPeriod = cycle.calculateNextPeriod("2024-06-01");
        assertEquals("2024-06-29", nextPeriod);
    }

    @Test
    public void testCalculateOvulationDate() {
        MenstrualCycle cycle = new MenstrualCycle(28);
        String ovulationDate = cycle.calculateOvulationDate("2024-06-01");
        assertEquals("2024-06-15", ovulationDate);
    }

    @Test
    public void testCalculateFertileWindow() {
        MenstrualCycle cycle = new MenstrualCycle(28);
        String fertileWindow = cycle.calculateFertileWindow("2024-06-01");
        assertEquals("2024-06-10 to 2024-06-16", fertileWindow);
    }
}