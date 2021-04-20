/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.singleton;

import co.edu.utp.isc.progiv.p4.clase17.creacional.singleton.implementacion.Singleton;

/**
 *
 * @author cdiaz
 */
public class DemoSingletonMultihilo {

    public static void main(String[] args) {

        var threadFoo = new Thread(() -> {
            var singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.getValue());
        });
        
        var threadBar = new Thread(() -> {
            var singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.getValue());
        });

        threadFoo.start();
        threadBar.start();
    }

}
