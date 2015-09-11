/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Interfaz.Conectorchat;
import javax.swing.JScrollPane;

/**
 *
 * @author Ursus
 */
public class Ventana extends JFrame {

    private JTextField textoEnviar;
    private JTextArea textoDondeRecibe;
    private JButton botonEnviar;
    private String mensajeEnviar;
    private JScrollPane scroll;
    private Conectorchat conector;
    private Chat chat;

    public Ventana(Chat chat, Conectorchat conector, String nom) {
        super(nom);
        this.chat = chat;
        this.conector = conector;
        this.setVisible(true);
        this.setSize(300, 250);
        this.setLayout(null);
        Init();

    }

    public void Init() {
        textoEnviar = new JTextField();
        textoEnviar.setBounds(5, 180, 180, 25);
        textoDondeRecibe = new JTextArea();
        scroll = new JScrollPane(textoDondeRecibe);
        textoDondeRecibe.setEditable(false);
        scroll.setBounds(0, 0, 285, 180);
        botonEnviar = new JButton("Enviar");
        chat.enviarArea(textoDondeRecibe);
        botonEnviar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mensajeEnviar = textoEnviar.getText() + "\n";
                textoEnviar.setText("");
                
                conector.enviarMensaje(mensajeEnviar);
                textoDondeRecibe.append("Tu: " + mensajeEnviar);
                conector.recibirMensaje();
                mensajeEnviar = "";
            }
        });

        botonEnviar.setBounds(190, 180, 90, 25);
        this.add(scroll);
        this.add(textoEnviar);
        this.add(botonEnviar);
    }


}
