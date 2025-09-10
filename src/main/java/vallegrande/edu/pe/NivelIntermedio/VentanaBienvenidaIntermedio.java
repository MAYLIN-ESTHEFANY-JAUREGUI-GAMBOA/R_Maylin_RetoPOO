package vallegrande.edu.pe.NivelIntermedio;

import javax.swing.*;
import java.awt.*;

public class VentanaBienvenidaIntermedio {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bienvenid@");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // centrar

        JButton botonSaludo = new JButton("Mostrar saludo");
        // Estilo del botón: azul con letras blancas
        botonSaludo.setBackground(new Color(0, 102, 204));
        botonSaludo.setForeground(Color.WHITE);
        botonSaludo.setFont(new Font("Segoe UI", Font.BOLD, 14));
        botonSaludo.setFocusPainted(false);
        botonSaludo.setCursor(new Cursor(Cursor.HAND_CURSOR));

        botonSaludo.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog(frame, "¿Cuál es tu nombre?");
            if (nombre != null && !nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "¡Hola, " + nombre + "! ¡Buen trabajo!");
            } else {
                JOptionPane.showMessageDialog(frame, "No ingresaste un nombre.");
            }
        });

        JPanel panel = new JPanel();
        panel.setBackground(new Color(200, 220, 255)); // azul más fuerte de fondo
        panel.add(botonSaludo);

        frame.add(panel);
        frame.setVisible(true);
    }
}
