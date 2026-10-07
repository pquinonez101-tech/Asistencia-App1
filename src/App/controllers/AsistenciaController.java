package App.controllers;

import App.models.AsistenciaModel;
import App.models.Estudiante;
import App.views.AsistenciaView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsistenciaController implements ActionListener {
    private AsistenciaModel modelo;
    private App.controllers.AsistenciaView vista;

    public AsistenciaController(AsistenciaModel modelo, AsistenciaView vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Asociar los eventos de los botones de la vista
        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            try {
                String codigo = vista.txtCodigo.getText().trim();
                String nombre = vista.txtNombre.getText().trim();
                String carrera = vista.txtCarrera.getText().trim();

                if (codigo.isEmpty() || nombre.isEmpty() || carrera.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Por favor complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Estudiante est = new Estudiante(codigo, nombre, carrera);
                modelo.registrarAsistencia(est);

                vista.txtAreaResultado.append("Registrado: " + est.toString() + "\n");
                vista.limpiarCamposFormulario();
                JOptionPane.showMessageDialog(vista, "Asistencia registrada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(vista, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == vista.btnLimpiar) {
            modelo.limpiarAsistencia();
            vista.txtAreaResultado.setText("");
            JOptionPane.showMessageDialog(vista, "Lista de asistencia reiniciada.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
