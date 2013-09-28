/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ing.variables;

/**
 *
 * @author Lupita
 */
public class Diagnostico {
    private int cveHC;
    private int cvePaciente;
    private String diagnostico;
    private String medicamento;

    public int getCveHC() {
        return cveHC;
    }

    public void setCveHC(int cveHC) {
        this.cveHC = cveHC;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
    
    
}
