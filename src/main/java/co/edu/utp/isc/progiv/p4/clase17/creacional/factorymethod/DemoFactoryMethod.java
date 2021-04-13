/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase17.creacional.factorymethod;

import co.edu.utp.isc.progiv.p4.clase17.creacional.factorymethod.factory.Dialog;
import co.edu.utp.isc.progiv.p4.clase17.creacional.factorymethod.factory.HtmlDialog;
import co.edu.utp.isc.progiv.p4.clase17.creacional.factorymethod.factory.WindowsDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author cdiaz
 */
public class DemoFactoryMethod {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        var tipo = JOptionPane.showInputDialog(null, "¿Que tipo de boton quieres ejecutar?",
                "Factory Method Demo", JOptionPane.QUESTION_MESSAGE, null,
                new String[]{"Windows", "Html"}, "Windows");
        switch (tipo.toString()) {
            case "Windows":
                dialog = new WindowsDialog();
                break;
            case "Html":
                dialog = new HtmlDialog();
                break;
            default:
                throw new AssertionError();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
