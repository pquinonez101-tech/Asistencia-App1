package App.views;

import javax.swing.*;
import java.awt.*;

public class AsistenciaView extends JFrame {
    public JTextField txtCodigo, txtNombre, txtCarrera;
    public JButton btnRegistrar, btnLimpiar;
    public JTextArea txtAreaResultado;

    public AsistenciaView() {
        setTitle("Control y Gestión de Asistencia - Ingeniería de Sistemas y TICs");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Panel superior para entradas
        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Estudiante"));

        panelFormulario.add(new JLabel(" Código:"));
        txtCodigo = new JTextField();
        panelFormulario.add(txtCodigo);

        panelFormulario.add(new JLabel(" Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel(" Carrera:"));
        txtCarrera = new JTextField();
        panelFormulario.add(txtCarrera);

        btnRegistrar = new JButton("Registrar Asistencia");
        btnLimpiar = new JButton("Limpiar Todo");
        panelFormulario.add(btnRegistrar);
        panelFormulario.add(btnLimpiar);

        add(panelFormulario, BorderLayout.NORTH);

        // Panel central para mostrar resultados
        JPanel panelResultado = new JPanel(new BorderLayout());
        panelResultado.setBorder(BorderFactory.createTitledBorder("Estudiantes Presentes"));
        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        panelResultado.add(new JScrollPane(txtAreaResultado), BorderLayout.CENTER);

        add(panelResultado, BorderLayout.CENTER);
    }

    public void limpiarCamposFormulario() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCarrera.setText("");
    }
}
