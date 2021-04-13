/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.builder.builders;

import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.cars.CarType;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.cars.Manual;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.Engine;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.GPSNavigator;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.Transmission;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.TripComputer;

/**
 *
 * @author cdiaz
 */
public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    } 
}
