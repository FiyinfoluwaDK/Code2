public class Bike {
    private boolean hasPower;

    public Bike() {
        this.hasPower = true; 
    }

    public boolean powerChecker() {
        return hasPower;
    }
    
    public int gearSystem(int speed) {
        if (speed <= 0) {
            return 0;
        }
        if (speed < 10) {
            return 1;
        }
        if (speed < 20) {
            return 2;
        }
        return 3;
    }

    public int acceleratorRate(int gear, int speed) {
        if (hasPower) {
            int newSpeed = speed + gear;
            return newSpeed;
        }
        return 0; 
    }
        
    public void powerOff() {
        hasPower = false;
    }

    public int brake(int speed) {
        if (hasPower) {
            int newSpeed = speed - 5;
            if (newSpeed < 0) {
                newSpeed = 0;
            }
            return newSpeed;
        }
        return 0;
    }
    
    public int speedLimiter(int speed) {
        if (speed > 30) {
            return 30;
        }
        return speed;
    }

    public boolean headlights() {
        return true; 
    }
}
