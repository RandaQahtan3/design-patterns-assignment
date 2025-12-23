package com.randa.car.builder;

import com.randa.car.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarBuilderTest {

    @Test
    void shouldBuildCompleteCarSuccessfully() {
        Car car = new CarBuilder()
                .model("SUV")
                .engine("V8")
                .transmission("Automatic")
                .addInterior("Leather Seats")
                .addInterior("GPS")
                .addExterior("Sunroof")
                .addSafety("ABS")
                .addSafety("Airbags")
                .build();

        assertNotNull(car);
        assertEquals("SUV", car.getModel());
        assertEquals("V8", car.getEngine());
        assertEquals("Automatic", car.getTransmission());
        assertEquals(2, car.getInteriorFeatures().size());
        assertEquals(1, car.getExteriorOptions().size());
        assertEquals(2, car.getSafetyFeatures().size());
    }

    @Test
    void shouldThrowExceptionWhenRequiredFieldsMissing() {
        CarBuilder builder = new CarBuilder();
        assertThrows(IllegalStateException.class, builder::build);
    }
}