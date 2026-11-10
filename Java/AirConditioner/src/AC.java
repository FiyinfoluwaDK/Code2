public class AC {

    boolean istherePower = true;

    public static boolean powerCheck(boolean istherePower) {
        if (istherePower == true) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean powerSwitch() {
        if (powerCheck(true) == true) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean powerSwitchOff() {
        if (powerCheck(false) == false) {
            return true;
        } else {
            return false;
        }

    }

    public static int temperatureRange(int temperature) {
        if (temperature < 16) {
            return 16;
        } else if (temperature > 30) {
            return 30;
        } else {
            return temperature;
        }
    }

    public static int decreaseTemperature(int temperature) {
        if (temperature > 16) {
            return temperature - 1;
        } else {
            return temperature;
        }
    }

    public static int increaseTemperature(int temperature) {
        if (temperature < 30) {
            return temperature + 1;
        } else {
            return temperature;
        }
    }

    public static int displayTemperature(int temperature) {
        return temperature;
    }

}
