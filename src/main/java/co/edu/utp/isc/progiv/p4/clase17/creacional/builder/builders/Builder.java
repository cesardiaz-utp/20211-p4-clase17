/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.builder.builders;

import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.cars.CarType;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.Engine;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.GPSNavigator;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.Transmission;
import co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components.TripComputer;

/**
 *
 * @author cdiaz
 */
public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
