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

    public boolean brake() {
        if (hasPower) {
            return true; 
        }
        return false; 
    }

    public boolean headlights() {
        if (hasPower) {
            return true;
        }
        return false;
    }
    
    public int speed() {
        if (hasPower) {
            int speed = 0;
            return speed;
        }
        return 0;
    }
    public int speedLimiter(int speed) {
        if (hasPower) {
            if (speed > 30) {
                speed = 30; 
            }
            return speed;
        }
        return 0; 
    }
}
