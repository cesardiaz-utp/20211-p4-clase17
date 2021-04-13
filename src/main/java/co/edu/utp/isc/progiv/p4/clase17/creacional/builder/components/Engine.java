/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.builder.components;

/**
 *
 * @author cdiaz
 */
public class Engine {

    private final Double volume;
    private Double mileage;
    private boolean started;

    public Engine(Double volume, Double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(Double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public Double getVolume() {
        return volume;
    }

    public Double getMileage() {
        return mileage;
    }
}
