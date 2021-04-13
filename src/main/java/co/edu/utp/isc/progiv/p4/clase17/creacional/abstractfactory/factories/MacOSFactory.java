/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.factories;

import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.buttons.Button;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.buttons.MacOSButton;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.checkboxes.Checkbox;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.checkboxes.MacOSCheckbox;

/**
 *
 * @author cdiaz
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
