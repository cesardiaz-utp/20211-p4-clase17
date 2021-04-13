/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.builder.cars;

import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.Engine;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.GPSNavigator;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.Transmission;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.TripComputer;

/**
 *
 * @author cdiaz
 */
public class Car {
    private final CarType carType;
    private final Integer seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private Double fuel = 0d;

    public Car(CarType carType, Integer seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
