package vallegrande.edu.pe.NivelAvanzado;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class VentanaBienvenidaAvanzada extends JFrame {

    private JButton botonSaludo;
    private final ResourceBundle bundle;

    public VentanaBienvenidaAvanzada(ResourceBundle bundle) {
        this.bundle = bundle;
        // Configuración de la ventana
        setTitle(bundle.getString("window.title"));
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Establecer el icono desde los recursos del classpath
        // La imagen debe estar ubicada en: /vallegrande/edu/pe/imagenes/icon.png dentro del classpath
        java.net.URL iconURL = getClass().getResource("/vallegrande/edu/pe/imagenes/icon.png");
        if (iconURL != null) {
            ImageIcon appIcon = new ImageIcon(iconURL);
            setIconImage(appIcon.getImage());
        } else {
            // Fallback visual si no se encontró el recurso
            Icon defaultIcon = UIManager.getIcon("OptionPane.informationIcon");
            if (defaultIcon instanceof ImageIcon) {
                setIconImage(((ImageIcon) defaultIcon).getImage());
            }
        }

        // Panel y botón
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        botonSaludo = new JButton(bundle.getString("button.showGreeting"));
        // Estilos del botón
        Color azul = new Color(0, 102, 204); // Azul
        botonSaludo.setBackground(azul);
        botonSaludo.setForeground(Color.WHITE); // Letras blancas
        botonSaludo.setOpaque(true);
        botonSaludo.setFocusPainted(false);
        botonSaludo.setFont(new Font("Segoe UI", Font.BOLD, 14));
        botonSaludo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botonSaludo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0, 80, 160), 1, true),
                BorderFactory.createEmptyBorder(8, 16, 8, 16)
        ));

        // Conectar la lógica al botón
        botonSaludo.addActionListener(new ControladorBienvenida(this, bundle));

        panel.add(botonSaludo);
        add(panel);
    }
}
