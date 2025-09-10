package vallegrande.edu.pe.NivelAvanzado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class ControladorBienvenida implements ActionListener {

    private final JFrame ventana;
    private final ResourceBundle bundle;

    public ControladorBienvenida(JFrame ventana, ResourceBundle bundle) {
        this.ventana = ventana;
        this.bundle = bundle;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Pedir el nombre con texto internacionalizado
        String nombre = JOptionPane.showInputDialog(
                ventana,
                bundle.getString("prompt.nameQuestion")
        );

        // Validar que no esté vacío
        if (nombre != null && !nombre.trim().isEmpty()) {
            String mensaje = String.format(bundle.getString("message.welcome"), nombre);
            JOptionPane.showMessageDialog(ventana, mensaje);
        } else {
            JOptionPane.showMessageDialog(ventana, bundle.getString("message.noName"));
        }
    }
}
