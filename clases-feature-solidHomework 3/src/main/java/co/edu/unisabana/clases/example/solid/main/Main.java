package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", "Informatica"),
                new Estudiante("Monica", "Administracion"),
                new Estudiante("Liliana", "Industrial")
        };
        List<IVerificarMaterias> materias = new ArrayList<>();
            materias.add(new MateriasInformatica());
            materias.add(new MateriasIndustrial());
            materias.add(new MateriasAdministracion());

        verMateriasEstudiantes(listadoEstudiantes,materias);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Estudiante("Daniel", "Informatica"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes,List<IVerificarMaterias> materias) {


        for (Estudiante estudiante:estudiantes){
            for (IVerificarMaterias verMaterias:materias){
                if (verMaterias.validarCarrera(estudiante)){
                    System.out.println(verMaterias.MateriasCarrera());
                }
            }
        }

    }
}
