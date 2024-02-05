package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class MateriasAdministracion implements IVerificarMaterias {

    @Override
    public boolean validarCarrera(Estudiante estudiante) {
        return "Industrial".equals(estudiante.getCarrera());
    }

    @Override
    public String MateriasCarrera() {
        return "Negocios, Administracion I, Historia de la Administracion";
    }
}
