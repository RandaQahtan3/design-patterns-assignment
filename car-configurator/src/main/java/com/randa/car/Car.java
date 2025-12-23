package com.randa.car;

import java.util.List;

public class Car {
    private final String model;
    private final String engine;
    private final String transmission;

    private final List<String> interiorFeatures;
    private final List<String> exteriorOptions;
    private final List<String> safetyFeatures;

    public Car(String model, String engine, String transmission,
               List<String> interiorFeatures,
               List<String> exteriorOptions,
               List<String> safetyFeatures) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.interiorFeatures = interiorFeatures;
        this.exteriorOptions = exteriorOptions;
        this.safetyFeatures = safetyFeatures;
    }

    public String getModel() { return model; }
    public String getEngine() { return engine; }
    public String getTransmission() { return transmission; }
    public List<String> getInteriorFeatures() { return interiorFeatures; }
    public List<String> getExteriorOptions() { return exteriorOptions; }
    public List<String> getSafetyFeatures() { return safetyFeatures; }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", interiorFeatures=" + interiorFeatures +
                ", exteriorOptions=" + exteriorOptions +
                ", safetyFeatures=" + safetyFeatures +
                '}';
    }
}