/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory;

import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.app.Application;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.factories.GUIFactory;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.factories.MacOSFactory;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.factories.WindowsFactory;

/**
 *
 * @author cdiaz
 */
public class DemoAbstractFactory {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

}
