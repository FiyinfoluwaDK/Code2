
    const hasPower = true;

    function bike() {
        this.hasPower = true; 
    }

    function powerChecker() {
        return hasPower;
    }
    
    function gearSystem(speed) {
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

    function acceleratorRate(gear, speed) {
        if (hasPower) {
            let newSpeed = speed + gear;
            return newSpeed;
        }
        return 0; 
    }

    function powerOff() {
        hasPower = false;
    }

    function brake() {
        if (hasPower) {
            return true; 
        }
        return false; 
    }

    function headlights() {
        if (hasPower) {
            return true;
        }
        return false;
    }
    
    function speed() {
        if (hasPower) {
            let speed = 0;
            return speed;
        }
        return 0;
    }
    function speedLimiter(speed) {
        if (hasPower) {
            if (speed > 30) {
                speed = 30; 
            }
            return speed;
        }
        return 0; 
    }

