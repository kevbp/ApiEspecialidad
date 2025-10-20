/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiEspecialidad;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author broncake
 */
@Service
public class Servicio {

    @Autowired
    private Repositorio repo;
    
    public Especialidad grabar(Especialidad esp){
        return repo.save(esp);
    }
    
    public Especialidad buscar(String codEsp){
        return repo.findById(codEsp).orElse(null);
    }
    
    public List<Especialidad> listar(){
        return repo.findAll();
    }
    
    public Especialidad actualizar(String codEsp, Especialidad esp){
        return repo.findById(codEsp).map(existing -> {
            existing.setDeta(esp.getDeta());
            return repo.save(existing);
        }).orElse(null);
    }
    
    public void eliminar(String codEsp){
        repo.deleteById(codEsp);
    }

}
