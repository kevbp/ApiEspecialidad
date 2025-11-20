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
    
    public Especialidad buscar(Long id){
        return repo.findById(id).orElse(null);
    }
    
    public List<Especialidad> listar(){
        return repo.findAll();
    }
    
    public Especialidad actualizar(Long id, Especialidad esp){
        return repo.findById(id).map(existing -> {
            existing.setDes(esp.getDes());
            return repo.save(existing);
        }).orElse(null);
    }
    
    public void eliminar(Long id){
        repo.deleteById(id);
    }

}
