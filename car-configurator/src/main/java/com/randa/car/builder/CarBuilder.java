package com.randa.car.builder;

import com.randa.car.Car;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {

    private String model;
    private String engine;
    private String transmission;

    private final List<String> interiorFeatures = new ArrayList<>();
    private final List<String> exteriorOptions = new ArrayList<>();
    private final List<String> safetyFeatures = new ArrayList<>();

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder transmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    // optional features:
    public CarBuilder addInterior(String feature) {
        this.interiorFeatures.add(feature);
        return this;
    }

    public CarBuilder addExterior(String option) {
        this.exteriorOptions.add(option);
        return this;
    }

    public CarBuilder addSafety(String feature) {
        this.safetyFeatures.add(feature);
        return this;
    }

    public Car build() {
        if (model == null || engine == null || transmission == null) {
            throw new IllegalStateException("model, engine, transmission are required");
        }
        return new Car(model, engine, transmission, interiorFeatures, exteriorOptions, safetyFeatures);
    }
}