package de.ait;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeatherToolsTest {
    @ParameterizedTest
    @CsvSource({"0.5, false, Calm with speed of 0.5 km",
            "0, true, Calm with speed of 0.5 km",
            "3, false, Light Air with speed of 3 km",
            "3, true, Light Air with speed of 3 km",
            "10, false, Light Breeze with speed of 10 km",
            "10, true, Light Breeze with speed of 10 km",
            "16, false, Gentle Breeze with speed of 16 km",
            "16, true, Gentle Breeze with speed of 16 km",
            "25, false, Moderate Breeze with speed of 25 km",
            "25, true, Moderate Breeze with speed of 25 km",
            "35, false, Fresh Breeze with speed of 35 km",
            "35, true, Fresh Breeze with speed of 35 km",
            "45, false, Strong Breeze with speed of 45 km",
            "45, true, Strong Breeze with speed of 45 km",
            "55, false, Near Gale with speed of 55 km",
            "55, true, Near Gale with speed of 55 km",
            "65, false, Gale with speed of 65 km",
            "65, true,  Gale with speed of 65 km",
            "75, false, Strong Gale with speed of 75 km",
            "75, true,  Strong Gale with speed of 75 km",
            "85, false,  Storm with speed of 85 km",
            "85, true,  Storm Gale with speed of 85 km",})
    public void IsWindGusty_test_false(double speed, boolean gusty,String description) {
        assertEquals(description,WeatherTools.getWindDescription(speed,gusty));
    }

}