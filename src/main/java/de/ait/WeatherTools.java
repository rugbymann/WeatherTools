package de.ait;

public class WeatherTools {
    public static String getWindDescription(double speed, boolean isGusty){
        String description = "";
        if (speed <= 1) {
            description = "Calm";
        } else if (speed >= 1 & speed <= 5) {
            description = "Light Air";
        } else if (speed >= 6 & speed <= 11) {
            description = "Light Breeze";
        } else if (speed >= 12 & speed <= 19) {
            description = "Gentle Breeze";
        } else if (speed >= 20 & speed <= 28) {
            description = "Moderate Breeze";
        } else if (speed >= 29 & speed <= 38) {
            description = "Fresh Breeze";
        }else if (speed >= 39 & speed <= 49) {
            description = "Strong Breeze";
        }else if (speed >= 50 & speed <= 61) {
            description = "Near Gale";
        }else if (speed >= 62 & speed <= 74) {
            description = "Gale";
        }else if (speed >= 75 & speed <= 88) {
            description = "Strong Gale";
        }else if (speed >= 89 & speed <= 102) {
            description = "Storm";
        }

        if (isGusty) {
            description = "Gusty" + description;
        }
        return description + " with speed of " + speed + "km/h";
    }
}
