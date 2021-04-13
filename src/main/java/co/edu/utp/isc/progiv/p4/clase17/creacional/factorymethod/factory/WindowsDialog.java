/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.factorymethod.factory;

import co.edu.utp.isc.progiv.p4.clase17.creacional.factorymethod.buttons.Button;
import co.edu.utp.isc.progiv.p4.clase17.creacional.factorymethod.buttons.WindowsButton;

/**
 *
 * @author cdiaz
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
