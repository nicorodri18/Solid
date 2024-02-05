package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class MaterialesInformatica implements IMateriales{
    @Override
    public boolean validarCarrera(Estudiante estudiante) {
        return "Informatica".equals(estudiante.getCarrera());
    }

    @Override
    public String MaterialesEstudiante() {
        return "Computador,Mouse";
    }

    @Override
    public String MensajeDirectorPrograma() {
        return "Jenny envia saludos";
    }
}
