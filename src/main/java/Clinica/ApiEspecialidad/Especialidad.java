/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiEspecialidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author broncake
 */
@Entity
public class Especialidad {
    @Id
    private String codEsp;
    private String deta;

    public Especialidad() {
    }

    public Especialidad(String codEsp, String deta) {
        this.codEsp = codEsp;
        this.deta = deta;
    }

    public String getCodEsp() {
        return codEsp;
    }

    public void setCodEsp(String codEsp) {
        this.codEsp = codEsp;
    }

    public String getDeta() {
        return deta;
    }

    public void setDeta(String deta) {
        this.deta = deta;
    }
    
    
}
