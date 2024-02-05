package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class MateriasInformatica implements IVerificarMaterias {

    @Override
    public boolean validarCarrera(Estudiante estudiante) {
        return "Informatica".equals(estudiante.getCarrera());
    }

    @Override
    public String MateriasCarrera() {
        return "Programacion, Arquitectura, Base de datos";
    }
}
