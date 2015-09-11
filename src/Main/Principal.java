/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Ursus
 */
public class Principal {

    public static void main(String[] args) {
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();
        Ventana ventana1 = new Ventana(chat1, chat2, "Usuario 1");
        Ventana ventana2 = new Ventana(chat2, chat1, "Usuario 2");
        ventana1.setVisible(true);
        ventana2.setVisible(true);

    }

}
