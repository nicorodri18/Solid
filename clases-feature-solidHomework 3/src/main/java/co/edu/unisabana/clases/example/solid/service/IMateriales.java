package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public interface IMateriales {

    boolean validarCarrera(Estudiante estudiante);

    String MaterialesEstudiante();

    String MensajeDirectorPrograma();
}
