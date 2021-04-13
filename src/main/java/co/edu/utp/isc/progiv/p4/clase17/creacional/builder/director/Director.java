/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.builder.director;

import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.builders.Builder;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.cars.CarType;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.Engine;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.GPSNavigator;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.Transmission;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.TripComputer;

/**
 *
 * @author cdiaz
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0d));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0d));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0d));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
