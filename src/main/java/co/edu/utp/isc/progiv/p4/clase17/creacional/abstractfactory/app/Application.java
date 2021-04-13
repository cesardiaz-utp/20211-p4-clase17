/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.app;

import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.buttons.Button;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.checkboxes.Checkbox;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.factories.GUIFactory;

/**
 *
 * @author cdiaz
 */
public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
