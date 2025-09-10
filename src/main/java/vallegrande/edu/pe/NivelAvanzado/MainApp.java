package vallegrande.edu.pe.NivelAvanzado;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainApp {
    public static void main(String[] args) {
        try {
            // Look & Feel Nimbus
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            Locale locale = Locale.getDefault();
            ResourceBundle bundle = ResourceBundle.getBundle("vallegrande.edu.pe.i18n.messages", locale);
            VentanaBienvenidaAvanzada ventana = new VentanaBienvenidaAvanzada(bundle);
            ventana.setVisible(true);
        });
    }
}
