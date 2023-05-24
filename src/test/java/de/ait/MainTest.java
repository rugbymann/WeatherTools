package de.ait;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Nested
@DisplayName("IsWindGusty tests")

class MainTest {
    @ParameterizedTest
    @CsvSource({"0, false, Calm with speed of 0.5 km",
            "3, false, Light Air with speed of 3 km",
            "10, false, Light Breeze with speed of 10 km",
            "16, false, Gentle Breeze with speed of 16 km",
            "25, false, Moderate Breeze with speed of 25 km",
            "35, false, Fresh Breeze with speed of 35 km"})
    public void IsWindGusty_test_false(double speed, boolean gusty) {
        assertEquals(speed,gusty);
    }

    @ParameterizedTest
    @CsvSource({"0.5, true, Calm with speed of 0.5 km",
            "3, true, Light Air with speed of 3 km",
            "10, true, Light Breeze with speed of 10 km",
            "16, true, Gentle Breeze with speed of 16 km",
            "25, true, Moderate Breeze with speed of 25 km",
            "35, true, Fresh Breeze with speed of 35 km"})
    public void IsWindGusty_test_true(double speed, boolean gusty) {


    }
}