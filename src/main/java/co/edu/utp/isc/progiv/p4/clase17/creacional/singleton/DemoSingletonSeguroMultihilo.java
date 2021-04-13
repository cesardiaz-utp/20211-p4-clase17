/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.singleton;

import co.edu.utp.isc.progiv.p4.clase17.creacional.singleton.implementacion.SingletonSeguro;


/**
 *
 * @author cdiaz
 */
public class DemoSingletonSeguroMultihilo {

    public static void main(String[] args) {

        var threadFoo = new Thread(() -> {
            var singleton = SingletonSeguro.getInstance("FOO");
            System.out.println(singleton.getValue());
        });
        
        var threadBar = new Thread(() -> {
            var singleton = SingletonSeguro.getInstance("BAR");
            System.out.println(singleton.getValue());
        });

        threadFoo.start();
        threadBar.start();
    }

}
