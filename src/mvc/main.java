package mvc;

import App.controllers.AsistenciaController;
import App.models.AsistenciaModel;
import App.views.AsistenciaView;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AsistenciaModel modelo = new AsistenciaModel();
            AsistenciaView vista = new AsistenciaView();
            new AsistenciaController(modelo, vista);
            vista.setVisible(true);
        });
    }
}
