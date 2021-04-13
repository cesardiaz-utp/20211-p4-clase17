/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.factories;

import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.checkboxes.Checkbox;
import co.edu.utp.isc.progiv.p4.clase17.creacional.abstractfactory.buttons.Button;

/**
 *
 * @author cdiaz
 */
public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
