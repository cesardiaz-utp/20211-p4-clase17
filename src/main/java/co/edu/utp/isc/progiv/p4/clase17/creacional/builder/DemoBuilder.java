/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.builder;

import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.builders.CarBuilder;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.builders.CarManualBuilder;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.cars.Car;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.cars.Manual;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.director.Director;

/**
 *
 * @author cdiaz
 */
public class DemoBuilder {
    
    public static void main(String[] args) {
        var director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        var builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        var car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        var manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        var carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
