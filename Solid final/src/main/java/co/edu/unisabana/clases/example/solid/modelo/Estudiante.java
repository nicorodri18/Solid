package co.edu.unisabana.clases.example.solid.modelo;

public class Estudiante {

    public String nombre;
    public String carrera;

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

}
