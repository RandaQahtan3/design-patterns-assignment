package com.randa.car.app;

import com.randa.car.Car;
import com.randa.car.builder.CarBuilder;
import com.randa.doc.Document;
import com.randa.doc.formats.DocumentFactory;

public class CarApp {

    public static void main(String[] args) {

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

        System.out.println(car);

        // Factory Pattern usage
        Document document = DocumentFactory.create("PDF");
        document.render(car.toString());
        document.save("car-specs.pdf");
    }
}