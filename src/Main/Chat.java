/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Interfaz.Conectorchat;
import javax.swing.JTextArea;

/**
 *
 * @author Ursus
 */
public class Chat implements Conectorchat {
    private String mensaje = "";
    private JTextArea area;

    public Chat() {

    }

    @Override
    public void enviarMensaje(String mensaje) {
        this.mensaje =  "El: " + mensaje;
    }

    @Override
    public void recibirMensaje() {
        this.area.append(mensaje);
    }
    
    @Override
    public void enviarArea(JTextArea area) {
        this.area = area;
    }
    
}
