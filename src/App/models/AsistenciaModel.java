package App.models;

import java.util.ArrayList;
import java.util.List;

public class AsistenciaModel {
    private List<Estudiante> listaAsistentes;

    public AsistenciaModel() {
        this.listaAsistentes = new ArrayList<>();
    }

    public void registrarAsistencia(Estudiante estudiante) {
        // Validación para evitar duplicados
        for (Estudiante e : listaAsistentes) {
            if (e.getCodigo().equals(estudiante.getCodigo())) {
                throw new IllegalArgumentException("El estudiante ya tiene asistencia registrada.");
            }
        }
        listaAsistentes.add(estudiante);
    }

    public List<Estudiante> getListaAsistentes() {
        return listaAsistentes;
    }

    public void limpiarAsistencia() {
        listaAsistentes.clear();
    }
}
