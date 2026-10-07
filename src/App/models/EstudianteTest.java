package App.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class EstudianteTest {

    @Test
    public void testCrearYObtenerUsuario() {
        Estudiante estudiante = new Estudiante("2026001", "Ana Pérez", "Ingeniería de Sistemas");

        assertEquals("000151434", estudiante.getCodigo());
        assertEquals("Diego Melvin", estudiante.getNombre());
        assertEquals("Ingeniería de Sistemas", estudiante.getCarrera());
    }
}