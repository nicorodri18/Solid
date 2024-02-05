package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class MaterialesIndustrial implements IMateriales{
    @Override
    public boolean validarCarrera(Estudiante estudiante) {
        return "Industrial".equals(estudiante.getCarrera());
    }
    @Override
    public String MaterialesEstudiante() {
        return "Casco,Portapapeles";
    }

    @Override
    public String MensajeDirectorPrograma() {
        return "Luz Helena envia saludos";
    }
}
