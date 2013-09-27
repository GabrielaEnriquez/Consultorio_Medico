/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico.SetGet;
import java.sql.Date;
/**
 *
 * @author Lupita
 */
public class Paciente {
    int cveP;
    String nombreP;
    String apellidosP;
    String direccionP;
    Date fechaNacimiento;
    String sexoP;
    String telefonoP;
    String correoP;

    public int getCveP() {
        return cveP;
    }

    public void setCveP(int cveP) {
        this.cveP = cveP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidosP() {
        return apellidosP;
    }

    public void setApellidosP(String apellidosP) {
        this.apellidosP = apellidosP;
    }

    public String getDireccionP() {
        return direccionP;
    }

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexoP() {
        return sexoP;
    }

    public void setSexoP(String sexoP) {
        this.sexoP = sexoP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

    public String getCorreoP() {
        return correoP;
    }

    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }
    
}
