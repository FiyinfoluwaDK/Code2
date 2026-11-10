import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    
    @Test 
    public void isTherePowerTest() {
        Bike bike = new Bike();
        assertTrue(bike.powerChecker());
    }

    @Test 
    public void acceleratorTest() {
        Bike bike = new Bike();
        int gear = bike.gearSystem(15);
        int speed = bike.acceleratorRate(gear, 15);
        assertEquals(19, speed);
    }

    @Test
    public void speedLimiterTest() {
        Bike bike = new Bike();
        int speed = bike.speedLimiter(35);
        assertEquals(30, speed);

        int speed2 = bike.speedLimiter(25);
        assertEquals(25, speed2);
    }
    

    @Test
    public void gearcheckerTest() {
        Bike bike = new Bike();
        int gear1 = bike.gearSystem(5);
        assertEquals(1, gear1);

        int gear2 = bike.gearSystem(15);
        assertEquals(2, gear2);

        int gear3 = bike.gearSystem(25);
        assertEquals(3, gear3);
    } 

}
