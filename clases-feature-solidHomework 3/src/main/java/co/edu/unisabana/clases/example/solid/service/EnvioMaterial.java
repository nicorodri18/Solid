package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class EnvioMaterial {

  public void enviarMaterialEstudiante(Estudiante estudiante) {
    List<IMateriales> directorioDeMateriales = new ArrayList<>();
    directorioDeMateriales.add(new MaterialesAdministracion());
    directorioDeMateriales.add(new MaterialesIndustrial());
    directorioDeMateriales.add(new MaterialesInformatica());


    for (IMateriales materiales:directorioDeMateriales){
        if (materiales.validarCarrera(estudiante)){
            Envio envio= new Envio();
            envio.material = new ArrayList<>();
            envio.material.add(materiales.MaterialesEstudiante());
            envio.saludoDirector = materiales.MensajeDirectorPrograma();
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
    }

  }
}
