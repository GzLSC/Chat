/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import javax.swing.JTextArea;
/**
 *
 * @author Ursus
 */
public interface Conectorchat {
    public void recibirMensaje();
    public void enviarMensaje(String mensaje);
    public void enviarArea(JTextArea area);
}
