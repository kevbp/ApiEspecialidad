/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiEspecialidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author broncake
 */
@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deta;

    public Especialidad() {
    }

    public Especialidad(Long id, String deta) {
        this.id = id;
        this.deta = deta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeta() {
        return deta;
    }

    public void setDeta(String deta) {
        this.deta = deta;
    }

}
