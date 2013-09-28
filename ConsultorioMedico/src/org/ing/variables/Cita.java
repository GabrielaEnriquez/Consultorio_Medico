/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ing.variables;
import java.sql.Date;
import java.sql.Time;
/**
 *
 * @author Lupita
 */
public class Cita {
    private int cveCita;
    private String cvePaciente;
    private Date fechaCita;
    private Time horaCita;
    private String estado;

    public int getCveCita() {
        return cveCita;
    }

    public void setCveCita(int cveCita) {
        this.cveCita = cveCita;
    }

    public String getCvePaciente() {
        return cvePaciente;
    }

    public void setCvePaciente(String cvePaciente) {
        this.cvePaciente = cvePaciente;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Time getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Time horaCita) {
        this.horaCita = horaCita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
