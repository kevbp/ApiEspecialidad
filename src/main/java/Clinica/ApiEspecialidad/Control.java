/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiEspecialidad;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author broncake
 */
@RestController
@RequestMapping("/especialidad")
public class Control {
    @Autowired
    private Servicio serv;
    
    @Autowired
    private RestTemplate resTem;
    
    @PostMapping("/grabar")
    public Especialidad grabar(@RequestBody Especialidad esp){
        return serv.grabar(esp);
    }
    
    @GetMapping("/buscar/{id}")
    public Especialidad buscar(@PathVariable Long id){
        return serv.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Especialidad>listar(){
        return serv.listar();
    }
    
    @PutMapping("/actualizar/{id}")
    public Especialidad actualizar(@PathVariable Long id,@RequestBody Especialidad esp){
        return serv.actualizar(id, esp);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        serv.eliminar(id);
    }
}
