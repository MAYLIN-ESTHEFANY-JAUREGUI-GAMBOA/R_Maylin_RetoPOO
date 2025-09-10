package vallegrande.edu.pe.EstructuraPrincipal;

import javax.swing.*;

public class VentanaBienvenida {

    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("Bienvenid@");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear botón
        JButton botonSaludo = new JButton("Mostrar saludo");

        // Acción del botón
        botonSaludo.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "¡Hola, buen trabajo Maylin!");
        });

        // Agregar botón a la ventana
        frame.add(botonSaludo);

        // Hacer visible
        frame.setVisible(true);
    }
}
