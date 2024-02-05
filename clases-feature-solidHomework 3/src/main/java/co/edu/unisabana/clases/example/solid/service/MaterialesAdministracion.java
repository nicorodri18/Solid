package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class MaterialesAdministracion implements IMateriales{
    @Override
    public boolean validarCarrera(Estudiante estudiante) {
        return "Administracion".equals(estudiante.getCarrera());
    }

    @Override
    public String MaterialesEstudiante() {
        return "Lapiceros,Carpeta A-Z";
    }

    @Override
    public String MensajeDirectorPrograma() {
        return "Pablo Enrique envia saludos";
    }
}
