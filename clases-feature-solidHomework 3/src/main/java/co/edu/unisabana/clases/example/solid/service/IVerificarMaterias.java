package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public interface IVerificarMaterias {
    boolean validarCarrera(Estudiante estudiante);

    String MateriasCarrera();
}
