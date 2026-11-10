public class AC {

    boolean istherePower = true;

    public boolean powerCheck(boolean istherePower) {
        if (istherePower == true) {
            return true;
        } else {
            return false;
        }

    }

    public boolean powerSwitch() {
        if (powerCheck(true) == true) {
            return false;
        } else {
            return true;
        }

    }

    public boolean powerSwitchOff() {
        if (powerCheck(false) == false) {
            return true;
        } else {
            return false;
        }

    }

    public int temperatureRange(int temperature) {
        if (temperature < 16) {
            return 16;
        } else if (temperature > 30) {
            return 30;
        } else {
            return temperature;
        }
    }

    public int decreaseTemperature(int temperature) {
        if (temperature > 16) {
            return temperature - 1;
        } else {
            return temperature;
        }
    }

    public int increaseTemperature(int temperature) {
        if (temperature < 30) {
            return temperature + 1;
        } else {
            return temperature;
        }
    }

    public int displayTemperature(int temperature) {
        return temperature;
    }

}
